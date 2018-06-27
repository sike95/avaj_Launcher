package avaj_launcher.simulator.vehicles;

import  avaj_launcher.simulator.*;
import  avaj_launcher.weather.*;

public  class Baloon extends Aircraft implements Flyable
{
    private WeatherTower    weathertower;
    private String           weather;
    private String          message;

    public Baloon(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public  void            updateConditions()
    {
        coordinates = super.coordinates;
        this.weather = weathertower.getWeather(coordinates);
        switch (weather)
        {
            case "SUN":
                coordinates.setHeight(coordinates.getHeight() + 4);
                coordinates.setLogitude(coordinates.getLogitude() + 10);
                message = String.format("%s#%s(%d):   Let's enjoy the good weather and take some pics. \n",
                        this.type, this.name, this.id);
                break;
            case "RAIN":
                coordinates.setHeight(coordinates.getHeight() - 5);
                message = String.format("%s#%s(%d):   Damn you rain! You messed up my baloon. \n",
                        this.type, this.name, this.id);
                break;
            case "FOG":
                coordinates.setHeight(coordinates.getHeight() - 3);
                message = String.format("%s#%s(%d):  This is hot I am sweating my B#$&ls off. \n",
                        this.type, this.name, this.id);
                break;
            case "SNOW":
                coordinates.setHeight(coordinates.getHeight() - 15);
                message = String.format("%s#%s(%d):  It's snowing. We are crazy to be up here in the first place. \n",
                        this.type, this.name, this.id);
                break;
        }
    }

    public void setWeathertower(WeatherTower weathertower) {

        this.weathertower = weathertower;
    }

    public  void            registerTower(WeatherTower weathertower)
    {
            setWeathertower(weathertower);
            System.out.printf("Tower says: %s#%s(%d) registered to weather to tower \n", this.type, this.name, this.id);
            weathertower.register(this);
    }



    public Coordinates getCoordinates() {
        return coordinates;
    }
}
