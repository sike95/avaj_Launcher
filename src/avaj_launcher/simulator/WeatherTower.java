package avaj_launcher.simulator;

import avaj_launcher.weather.Coordinates;
import avaj_launcher.weather.WeatherProvider;

public class WeatherTower extends Tower
{
    private static String weather; // I added this variable it is not part of the UML design it will be returned in getWeather()

	public void    changeWeather()
	{
	    //TOdo call update conditions
        //weather = WeatherProvider.getWeather();
	    //TODO:: changes weather conditions and sets a string from Weather Provider
		super.conditionsChanged();

	}

	public String getWeather(Coordinates coordinates)
	{
	    //TODO:: Returns Weather Rain, Sun, Snow or Fog
		weather = WeatherProvider.getWeather();
	    return weather;
	}
}
