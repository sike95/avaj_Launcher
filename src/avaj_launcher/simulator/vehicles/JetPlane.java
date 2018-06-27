package avaj_launcher.simulator.vehicles;

import  avaj_launcher.simulator.*;
import  avaj_launcher.weather.*;

public	class JetPlane extends Aircraft implements Flyable
{

    public JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    private	WeatherTower	weathertower;
    private String          weather;
    private Coordinates     coordinates;

	public	void			updateConditions()
    {
        coordinates = super.coordinates;
        weather = weathertower.getWeather(coordinates);

        switch (weather)
        {
            case "SUN":
                coordinates.setHeight(coordinates.getHeight() + 2);
                coordinates.setLatitude(coordinates.getLatitude() + 10);
                break;
            case "RAIN":
                coordinates.setLatitude(coordinates.getLatitude() + 5);
                break;
            case "FOG":
                coordinates.setLatitude(coordinates.getLatitude() + 1);
                break;
            case "SNOW":
                coordinates.setHeight(coordinates.getHeight() - 7);
                break;
        }
    }

	public	void			registerTower(WeatherTower weathertower)
    {
        setWeathertower(this.weathertower);
        System.out.printf("Tower says: %s#%s(%d) registered to weather to tower \n", this.type, this.name, this.id);
        weathertower.register(this);
    }

    public void setWeathertower(WeatherTower weathertower) {
        this.weathertower = weathertower;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
