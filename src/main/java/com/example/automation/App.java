package com.example.automation;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    // Define constant for greeting message
    private static final String GREETING_MESSAGE = "Hello World!";
    // Logger for better logging
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        // Use logger instead of System.out
        logger.log(Level.INFO, GREETING_MESSAGE);

        // If "test" argument is passed, run the embedded test
        if (args.length > 0 && "test".equals(args[0])) {
            runTests();
        }
    }

    public static void runTests() {
        String expectedOutput = GREETING_MESSAGE;
        String actualOutput = getGreeting();
        
        // Test assertion logic
        if (!expectedOutput.equals(actualOutput)) {
            throw new AssertionError("Test failed: Output mismatch!");
        } else {
            logger.log(Level.INFO, "Test passed: Output matches.");
        }
    }

    public static String getGreeting() {
        return GREETING_MESSAGE;
    }

    public String welcomeMessage(String name) {
        return "Hello, " + name + "!";
    }
}
