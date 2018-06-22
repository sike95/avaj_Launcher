package avaj_launcher.simulator.vehicle;

public	class JetPlane extends Aircraft, implements Flyable
{
	
	JetPlane(String	name, Coordinates coordinates);
	private	WeatherTower	weathertower;

	public	void			updateConditions();
	public	void			registerTower(WeatherTower weathertower);
}
