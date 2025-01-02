package com.example.automation;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Call method directly from main for testing purposes
        if (args.length > 0 && "test".equals(args[0])) {
            runTests();
        }
    }

    // Method that we are testing
    public static String getGreeting() {
        return "Hello World!";
    }

    // The method tested in LoginAutomationTest.java
    public String welcomeMessage(String name) {
        return "Hello, " + name + "!";
    }

    // Method for running the tests
    public void runTests() {
        // Test getGreeting
        String expectedOutput = "Hello World!";
        String actualOutput = getGreeting();
        if (!expectedOutput.equals(actualOutput)) {
            throw new AssertionError("Test failed: Output mismatch!");
        }
        
        // Test welcomeMessage
        String name = "Utkarsh";
        String expectedMessage = "Hello, " + name + "!";
        String actualMessage = welcomeMessage(name);
        if (!expectedMessage.equals(actualMessage)) {
            throw new AssertionError("Test failed: Welcome message mismatch!");
        }

        // Test passed
        System.out.println("Test passed: Output matches.");
    }
}
