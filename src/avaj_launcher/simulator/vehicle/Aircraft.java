package avaj_launcher.simulator.vehicle;

public class Aircraft 
{
	protected 	long			id;
	protected	String			name;
	protected	Coordinates		coordinates;
	

	private		long			idCounter;
	private	long    nextId()
    {

        return 1;
    }

	protected       Aircraft(String name, Coordinates coordinates)
    {
        this.name = name;
        this.coordinates = coordinates;
    }

}
