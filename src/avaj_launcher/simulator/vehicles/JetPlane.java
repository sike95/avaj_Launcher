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
    private String          message;

	public	void			updateConditions()
    {
        coordinates = super.coordinates;
        weather = weathertower.getWeather(coordinates);

        switch (weather)
        {
            case "SUN":
                coordinates.setHeight(coordinates.getHeight() + 2);
                coordinates.setLatitude(coordinates.getLatitude() + 10);
                message = String.format("%s#%s(%d): It is Really Hot. Better speed up. \n",
                        this.type, this.name, this.id);
                break;
            case "RAIN":
                coordinates.setLatitude(coordinates.getLatitude() + 5);
                message = String.format("%s#%s(%d):  It's raining. Better watch out for lightings. \n",
                        this.type, this.name, this.id);
                break;
            case "FOG":
                coordinates.setLatitude(coordinates.getLatitude() + 1);
                message = String.format("%s#%s(%d):  It's Foggy as hell. Well flying blind never killed anyone. \n",
                        this.type, this.name, this.id);
                break;
            case "SNOW":
                coordinates.setHeight(coordinates.getHeight() - 7);
                message = String.format("%s#%s(%d):  It's snowing. We're gonna crash. \n",
                        this.type, this.name, this.id);
                break;
        }
    }

	public	void			registerTower(WeatherTower weathertower)
    {
        setWeathertower(weathertower);
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
