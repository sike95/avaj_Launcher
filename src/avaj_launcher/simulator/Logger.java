package avaj_launcher.simulator;

import java.util.List;
import java.util.ArrayList;
import java.util.Formatter;

public class Logger {

    private static List<String> loggerOutput = new ArrayList<String>();
    private Formatter newFile;
    private static Logger myLogger = new Logger();


    private Logger()
    {

    }

    public void logMessage(String message)
    {
        loggerOutput.add(message);
    }

    private void openFile()
    {
        try {
            newFile = new Formatter("simulation.txt");
        }
        catch (Exception e)
        {
            System.out.println("Error: could not create file");
        }
    }

    private void addRecords()
    {
        for (String record: loggerOutput) {
            newFile.format(record);
        }
    }

    private void closeFile()
    {
        newFile.close();
    }

    public static Logger getInstance()
    {
        return myLogger;
    }

    public void writeToFile()
    {
            openFile();
            addRecords();
            closeFile();
    }

}