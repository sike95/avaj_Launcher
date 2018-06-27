package avaj_launcher.simulator;

import java.util.List;
import java.util.ArrayList;
import java.util.Formatter;

public class Logger {

    private static List<String> loggerOutput = new ArrayList<String>();
    private Formatter newFile;

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

    public void writeToFile()
    {
            openFile();
            addRecords();
            closeFile();
    }

}