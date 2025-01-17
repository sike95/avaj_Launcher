package avaj_launcher.simulator;

import avaj_launcher.simulator.vehicles.AircraftFactory;
import avaj_launcher.simulator.vehicles.Flyable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Simulator {

    private static WeatherTower weatherTower;
    private static List<Flyable> flyables = new ArrayList<Flyable>();

    public static void main(String [] arg) throws InterruptedException
    {
        if (arg.length != 1)
        {
            throw new IllegalArgumentException("Exactly 1 parameters required: " +
                    "Please parse the name of a text file that will contain the scenario that needs to be simulated.");
        }

        String file = arg[0];

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            line = br.readLine();

            if (line != null) {

                int numberOfSimulations = Integer.parseInt(line.split(" ")[0]);

                if (numberOfSimulations < 0) {
                    System.out.println("Invalid number of simulations: " + numberOfSimulations);
                    System.exit(1);
                }

                while ((line = br.readLine()) != null) {
                    Flyable flyable = AircraftFactory.newAircraft(line.split(" ")[0], line.split(" ")[1],
                            Integer.parseInt(line.split(" ")[2]),
                            Integer.parseInt(line.split(" ")[3]), Integer.parseInt(line.split(" ")[4]));
                    System.out.println(line);
                    flyables.add(flyable);
                }
                weatherTower = new WeatherTower();
                for (Flyable item : flyables) {
                    item.registerTower(weatherTower);
                }

                for (int i = 0; i < numberOfSimulations; i++) {
                    weatherTower.changeWeather();
                }
            }
            Logger.getInstance().writeToFile();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not find file: " + arg[0]);
        }
        catch(IOException e)
        {
            System.out.println("There was an error while reading from file : " + arg[0]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Specify simulation file");
        }
    }

}
