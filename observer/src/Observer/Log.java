package Observer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

public class Log implements Observer {

    private final List<String> logEntries;
    private static final String LOG_FILE = "logs.txt";

    public Log() {
        logEntries = new LinkedList<>();
        File logFile = new File(LOG_FILE);
        try {
            if (!logFile.createNewFile()) {
                loadLogsFromFile();
            }
        } catch (IOException e) {
            System.err.println("Failed to create log file: " + e.getMessage());
        }
    }

    @Override
    public void update(LogType type, String message, Timestamp timestamp) {
        String logMessage = "[" + timestamp + "] " + type + ": " + message;

        if (logEntries.size() >= 10) {
            logEntries.removeFirst();
        }
        logEntries.add(logMessage);

        updateLogFile();
    }

    private void loadLogsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logEntries.add(line);
            }
        } catch (IOException e) {
            System.err.println("Failed to read log file: " + e.getMessage());
        }
    }

    private void updateLogFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE))) {
            for (String log : logEntries) {
                writer.write(log);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Failed to write log to file: " + e.getMessage());
        }
    }

    public void getLogs() {
        for (String log : logEntries) {
            System.out.println(log);
        }
    }
}
