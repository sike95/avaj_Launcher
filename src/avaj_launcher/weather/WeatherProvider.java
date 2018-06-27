package avaj_launcher.weather;
import java.util.Random;


public class WeatherProvider {

    private static WeatherProvider weatherProvider; // TODO: Unclear of what to to with this please revisit : it will instaniate itself to recreate a weather provider instance
    private static String          weather;

    private WeatherProvider() {

        Random rand = new Random();

        int  randNum = rand.nextInt(4) + 1;

        switch (randNum)
        {
            case 1:
                weather = "RAIN";
                break;
            case 2:
                weather = "SUN";
                break;
            case 3:
                weather = "FOG";
                break;
            case 4:
                weather = "SNOW";
                break;
        }

    }

    public static WeatherProvider getWeatherProvider() {
        return weatherProvider;
    }
    public static String getWeather() {
        return weather;
    }
}
