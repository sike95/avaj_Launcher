package avaj_launcher.simulator.vehicles;

import  avaj_launcher.simulator.*;
import  avaj_launcher.weather.*;

public  class Baloon extends Aircraft implements Flyable
{

    public Baloon(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    private WeatherTower    weathertower;
    private String           weather;
    private Coordinates     coordinates;

    public  void            updateConditions()
    {
        coordinates = super.coordinates;
        weather = weathertower.getWeather(coordinates);

        switch (weather)
        {
            case "SUN":
                coordinates.setHeight(coordinates.getHeight() + 4);
                coordinates.setLogitude(coordinates.getLogitude() + 10);
                break;
            case "RAIN":
                coordinates.setHeight(coordinates.getHeight() - 5);
                break;
            case "FOG":
                coordinates.setHeight(coordinates.getHeight() - 3);
                break;
            case "SNOW":
                coordinates.setHeight(coordinates.getHeight() - 15);
                break;
        }
    }
    public  void            registerTower(WeatherTower weathertower)
    {
            setWeathertower(this.weathertower);
            System.out.printf("Tower says: %s#%s(%d) registered to weather to tower \n", this.type, this.name, this.id);
            weathertower.register(this);
    }

    public void setWeathertower(WeatherTower weathertower) {

        this.weathertower = weathertower;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
