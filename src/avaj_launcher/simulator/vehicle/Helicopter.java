package avaj_launcher.simulator.vehicle;

public  class Helicopter extends Aircraft, implements Flyable
{

    Helicopter(String name, Coordinates coordinates);
    private WeatherTower    weathertower;

    public  void            updateConditions();
    public  void            registerTower(WeatherTower weathertower);
}
