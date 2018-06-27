package avaj_launcher.weather;

public class	Coordinates
{
	private	int		logitude;
	private	int		latitude;
	private int		height;

    public int getLogitude() {
        return logitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }

    public void setLogitude(int logitude) {
        this.logitude = logitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Coordinates(int logitude, int latitude, int height) {
        this.logitude = logitude;
        this.latitude = latitude;
        this.height = height;
    }
}
