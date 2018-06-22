package avaj_launcher.simulator.vehicle;

import avaj_launcher.simulator.WeatherTower;

public interface Flyable
{
	public	void	updateConditions();
	public	void	registerTower(WeatherTower WeatherTower);
}
