package com.example.automation;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // If "test" argument is passed, run the embedded test
        if (args.length > 0 && "test".equals(args[0])) {
            runTests();  // This can now be called because runTests is static
        }
    }

    // Test method embedded within the App class
    private static void runTests() {  // Make runTests static
        String expectedOutput = "Hello World!";
        String actualOutput = getGreeting();
        // Test assertion logic
        if (!expectedOutput.equals(actualOutput)) {
            throw new AssertionError("Test failed: Output mismatch!");
        } else {
            System.out.println("Test passed: Output matches.");
        }
    }

    // Method that we are testing
    public static String getGreeting() {  // Keep getGreeting static for now
        return "Hello World!";
    }

    // The method tested in LoginAutomationTest.java
    public String welcomeMessage(String name) {
        return "Hello, " + name + "!";
    }
}
