package avaj_launcher.simulator;

import avaj_launcher.weather.Coordinates;
import avaj_launcher.weather.WeatherProvider;

public class WeatherTower extends Tower
{
    private String weather;

	public void    changeWeather()
	{
		super.conditionsChanged();
	}

	public String getWeather(Coordinates coordinates)
	{
		this.weather = WeatherProvider.getWeatherProvider().getWeather(coordinates);
	    return this.weather;
	}
}
