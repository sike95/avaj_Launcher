package avaj_launcher.simulator.vehicles;

import avaj_launcher.weather.Coordinates;

public	class AircraftFactory
{
	public static Flyable newAircraft(String type, String name, int logitude, int latitude, int height)
	{
	    Flyable newFlyable = null;
        Coordinates coordinates = new Coordinates(logitude,latitude, height);

        switch (type) {

            case "Baloon":
                newFlyable = new Baloon(name, coordinates);
                ((Baloon) newFlyable).setType(type);
                break;

            case "Helicopter":
                newFlyable = new Helicopter(name, coordinates);
                ((Helicopter) newFlyable).setType(type);
                break;
            case "JetPlane":
                newFlyable = new JetPlane(name, coordinates);
                ((JetPlane) newFlyable).setType(type);
                break;
        }

        return  newFlyable;
	}
}
