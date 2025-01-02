package com.example.automation;

import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static final String GREETING_MESSAGE = "Hello World!";

    // Constructor to inject dependencies for testing purposes
    public App(Logger logger) {
        this.logger = logger;
    }

    // Default constructor (needed for creating instance in main method)
    public App() {}

    public static void main(String[] args) {
        // Log the greeting message when the application starts
        logger.info(GREETING_MESSAGE);
        
        // If "test" argument is passed, run the embedded test
        if (args.length > 0 && "test".equals(args[0])) {
            runTests();
        }
    }

    // Run tests to validate that expected outputs match
    public static void runTests() {
        String expectedOutput = GREETING_MESSAGE;
        String actualOutput = getGreeting();
        
        // Test assertion logic
        if (!expectedOutput.equals(actualOutput)) {
            logger.severe("Test failed: Output mismatch!");
            throw new AssertionError("Test failed: Output mismatch!");
        } else {
            logger.info("Test passed: Output matches.");
        }
    }

    // Return the greeting message to be tested
    public static String getGreeting() {
        return GREETING_MESSAGE;
    }

    // The method tested in LoginAutomationTest.java
    public String welcomeMessage(String name) {
        if (name == null || name.trim().isEmpty()) {
            logger.warning("Received an empty or null name.");
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }

    // This could be used for logging with a customized message
    public void logCustomMessage(String message) {
        logger.info(message);
    }

    // Adding more functionality for testability (for coverage)
    public static String processInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Input is empty!";
        }
        return "Processed: " + input;
    }
}
