package avaj_launcher.simulator.vehicles;

import  avaj_launcher.simulator.*;
import  avaj_launcher.weather.*;

public  class Helicopter extends Aircraft implements Flyable
{

    public Helicopter(String name, Coordinates coordinates)
    {

        super(name, coordinates);
    }

    private WeatherTower    weathertower;
    private String          weather;
    private Coordinates     coordinates;

    public  void            updateConditions()
    {
        coordinates = super.coordinates;
        weather = weathertower.getWeather(coordinates);

        switch (weather)
        {
            case "SUN":
                coordinates.setHeight(coordinates.getHeight() + 2);
                coordinates.setLogitude(coordinates.getLogitude() + 10);
                break;
            case "RAIN":
                coordinates.setLogitude(coordinates.getLogitude() + 5);
                break;
            case "FOG":
                coordinates.setLogitude(coordinates.getLogitude() + 1);
                break;
            case "SNOW":
                coordinates.setHeight(coordinates.getHeight() - 12);
                break;
        }
    }

    public  void            registerTower(WeatherTower weathertower)
    {
        setWeathertower(weathertower);
        System.out.printf("Tower says: %s#%s(%d) registered to weather to tower \n", this.type, this.name, this.id);
        weathertower.register(this);
    }

    public void setWeathertower(WeatherTower weathertower)
    {
        this.weathertower = weathertower;
    }

    @Override
    public Coordinates getCoordinates() {
        return coordinates;
    }
}
