package avaj_launcher.simulator;

import avaj_launcher.weather.Coordinates;

public class Logger {

    private static int  altitude;
    private static boolean  check;

    private static String getMessage(Coordinates coordinates, String weather)
    {
        altitude = coordinates.getHeight();
        if (coordinates.getHeight() == 100)
        {

        }
//        switch (altitude)
//        {
//            case 100:
//                System.out.println();
//                break;
//            case 75:
//                System.out.println();
//                break;
//            case 50:
//                System.out.println();
//                break;
//            case 25:
//                System.out.println();
//                break;
//            case 0:
//                System.out.println();
//                break;
//        }
        if (altitude == 100)
        {
            System.out.println("I am so High");
        }
        else if (altitude < 100 && altitude >= 75)
        {
            System.out.println(" I will touch the sky");
        }
        else if (altitude < 75 && altitude >= 50)
        {
            System.out.println("I am gliding ");
        }
        else if (altitude < 50 && altitude >= 25)
        {
            System.out.println();
        }
        else if (altitude < 25 && altitude > 0)
        {
            System.out.println();
        }
        else if(altitude == 0)
            System.out.println();

        return "";
    }
}
