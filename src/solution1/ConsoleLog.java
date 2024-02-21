package solution1;

import java.io.IOException;
import java.util.logging.*;

public class ConsoleLog {
    static Logger logger = Logger.getLogger(Logger.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            ConsoleHandler consoleHandler = new ConsoleHandler();

            fileHandler.setFormatter(new SimpleFormatter());
            consoleHandler.setLevel(Level.ALL);

            logger.addHandler(consoleHandler);
            logger.addHandler(fileHandler);

            logger.setLevel(Level.ALL);

            logger.fine("Severe msg");
        } catch (IOException e) {
            logger.severe(e.getMessage());
        }
    }
}