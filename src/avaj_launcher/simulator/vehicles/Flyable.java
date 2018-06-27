package avaj_launcher.simulator.vehicles;

import avaj_launcher.simulator.WeatherTower;
import avaj_launcher.weather.Coordinates;

public interface Flyable
{
	public	void	updateConditions();
	public	void	registerTower(WeatherTower WeatherTower);
	Coordinates getCoordinates();
}
