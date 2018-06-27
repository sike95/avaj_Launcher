package avaj_launcher.simulator.vehicles;

import avaj_launcher.weather.Coordinates;

public abstract class Aircraft
{
	protected 	long			id;
	protected	String			name;
	protected	Coordinates		coordinates;
	protected   String          type;

	private     static long     idCounter = 0;

    private	long    nextId()
    {
        this.id = ++idCounter;
        return 1;
    }

	protected       Aircraft(String name, Coordinates coordinates)
    {
        nextId();
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
