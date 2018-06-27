package avaj_launcher.simulator;

import avaj_launcher.simulator.vehicles.Flyable;

import java.util.ArrayList;
import java.util.List;

public	class Tower
{
//	private	Flyable	observers; //TODO: List of objects in the sky : Create a list
	private static List<Flyable> observers = new ArrayList<Flyable>();
	private static List<Flyable> landed = new ArrayList<>();

	protected	void	conditionsChanged()
	{
		//TODO log changes in conditions : adds new changes that were generated to the  Object
        for (Flyable flyable : observers) {
            flyable.updateConditions();
            if(flyable.getCoordinates().getHeight() <= 0)
                landed.add(flyable);
        }
        for (Flyable flyable: landed) {
            unregister(flyable);
        }
	}


	public	void		register(Flyable flyable)
	{
		//TODO register how many objects are currently in the sky
        observers.add(flyable);
	}

	public	void		unregister(Flyable flyable)
	{
		// TODO register how many object have landed and remove them from the list
        observers.remove(flyable);
	}
}
