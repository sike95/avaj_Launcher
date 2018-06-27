package avaj_launcher.simulator.vehicles;

import avaj_launcher.simulator.WeatherTower;
import avaj_launcher.weather.Coordinates;

public interface Flyable
{
	void            updateConditions();
	void            registerTower(WeatherTower WeatherTower);
	Coordinates     getCoordinates();
    String          getType();
    String          getName();
    long            getID();

}
