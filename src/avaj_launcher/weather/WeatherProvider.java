package avaj_launcher.weather;

public class WeatherProvider {

    private static WeatherProvider weatherProvider = new WeatherProvider();
    private static String weather;

    private WeatherProvider() {

    }

    public static WeatherProvider getWeatherProvider() {
        return weatherProvider;
    }

    public static String getWeather(Coordinates coordinates) {


        int myNum = (coordinates.getHeight() + coordinates.getLatitude() + coordinates.getLogitude()) % 4;

        switch (myNum) {
            case 0:
                weather = "RAIN";
                break;
            case 1:
                weather = "SUN";
                break;
            case 2:
                weather = "FOG";
                break;
            case 3:
                weather = "SNOW";
                break;

        }
        return weather;
    }
}
