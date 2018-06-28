package avaj_launcher.weather;

import java.util.Random;

public class WeatherProvider {

    private static WeatherProvider weatherProvider = new WeatherProvider();
    private static String weather;

    private WeatherProvider() {

    }

    public static WeatherProvider getWeatherProvider() {
        return weatherProvider;
    }

    public static String getWeather(Coordinates coordinates) {

        Random rand = new Random();
        int  weatherNum = rand.nextInt(4) + 1;
        int myNum = (coordinates.getHeight() + coordinates.getLatitude() + coordinates.getLogitude()) % 4;


        switch (weatherNum) {
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
        return weather;
    }
}
