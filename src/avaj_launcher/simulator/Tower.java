package avaj_launcher.simulator;

import avaj_launcher.simulator.vehicles.Flyable;
import java.util.ArrayList;
import java.util.List;

public	class Tower
{
	private static List<Flyable> observers = new ArrayList<Flyable>();
	private static List<Flyable> landed = new ArrayList<>();
    Logger myLogger =       new Logger();

	protected	void	conditionsChanged()
	{
        for (Flyable flyable : observers) {
            flyable.updateConditions();
            if(flyable.getCoordinates().getHeight() <= 0) {
                landed.add(flyable);
                myLogger.logMessage(String.format("%s#%s(%d) has landed \n",
                        flyable.getType(), flyable.getName(), flyable.getID()));
            }
        }
        for (Flyable flyable: landed) {
            unregister(flyable);
        }
	}

	public	void		register(Flyable flyable)
	{
        observers.add(flyable);
	}

	public	void		unregister(Flyable flyable)
	{
        observers.remove(flyable);
	}
}
