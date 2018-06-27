package avaj_launcher.simulator;

import avaj_launcher.weather.Coordinates;
import avaj_launcher.weather.WeatherProvider;

public class WeatherTower extends Tower
{
    private String weather; // I added this variable it is not part of the UML design it will be returned in getWeather()
    private Coordinates coordinates;

	public void    changeWeather()
	{
	    //TOdo call update conditions
        //weather = WeatherProvider.getWeather();
	    //TODO:: changes weather conditions and sets a string from Weather Provider
		super.conditionsChanged();
	}

	public String getWeather(Coordinates coordinates)
	{

	    //System.out.println("ser");
	    //TODO:: Returns Weather Rain, Sun, Snow or Fog
		this.weather = WeatherProvider.getWeather();
	    return this.weather;
	}
}
