package avaj_launcher.simulator.vehicles;

import  avaj_launcher.simulator.*;
import  avaj_launcher.weather.*;

public  class Helicopter extends Aircraft implements Flyable
{

    private WeatherTower    weathertower;
    private String          weather;
    private Coordinates     coordinates;
    private String          message;

    public Helicopter(String name, Coordinates coordinates)
    {

        super(name, coordinates);
    }


    public  void            updateConditions()
    {
        coordinates = super.coordinates;
        weather = weathertower.getWeather(coordinates);


        switch (weather)
        {
            case "SUN":
                coordinates.setHeight(coordinates.getHeight() + 2);
                coordinates.setLogitude(coordinates.getLogitude() + 10);
                message = String.format("%s#%s(%d):  This is hot I am sweating my B#$&ls off. \n",
                        this.type, this.name, this.id);
                break;
            case "RAIN":
                coordinates.setLogitude(coordinates.getLogitude() + 5);
                message = String.format("%s#%s(%d): Its really wet. I am soaked \n",
                        this.type, this.name, this.id);
                break;
            case "FOG":
                coordinates.setLogitude(coordinates.getLogitude() + 1);
                message = String.format("%s#%s(%d): It is really hard to see with all this fog !!!. \n",
                        this.type, this.name, this.id);
                break;
            case "SNOW":
                coordinates.setHeight(coordinates.getHeight() - 12);
                message = String.format("%s#%s(%d): : My rotor is going to freeze! \n",
                        this.type, this.name, this.id);
                break;
        }
        Logger.getInstance().logMessage(message);
    }

    public  void            registerTower(WeatherTower weathertower)
    {
        setWeathertower(weathertower);
        message = String.format("Tower says: %s#%s(%d) registered to weather to tower \n",
                this.type, this.name, this.id);
        Logger.getInstance().logMessage(message);
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
    public String       getType(){return type;}
    public String       getName(){return name;}
    public long         getID(){return id;}
}
