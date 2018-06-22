package avaj_launcher.simulator.vehicle;

public  class Baloon extends Aircraft, implements Flyable
{

    Baloon(String name, Coordinates coordinates);
    private WeatherTower    weathertower;

    public  void            updateConditions();
    public  void            registerTower(WeatherTower weathertower);
}
