package com.example.automation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Test case for the getGreeting method
    @Test
    void testGetGreeting() {
        App app = new App();
        String expected = App.GREETING_MESSAGE;
        String actual = app.getGreeting();
        assertEquals(expected, actual, "Greeting should be 'Hello World!'");
    }

    // Test case for the welcomeMessage method with a normal name
    @Test
    void testWelcomeMessage() {
        App app = new App();
        String name = "Utkarsh";
        String expected = "Hello, Utkarsh!";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should include the user's name.");
    }

    // Test case for when the name is empty
    @Test
    void testWelcomeMessageWithEmptyName() {
        App app = new App();
        String name = "";
        String expected = "Hello, Guest!";  // Adjusted to handle empty name case
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should handle empty names and return 'Hello, Guest!'.");
    }

    // Test case for null name
    @Test
    void testWelcomeMessageWithNullName() {
        App app = new App();
        String name = null;
        String expected = "Hello, Guest!";  // Adjusted to handle null name case
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should handle null names and return 'Hello, Guest!'.");
    }

    // Test case for the runTests method (testing assertion)
    @Test
    void testRunTests() {
        App app = new App();
        app.runTests();  // Running tests directly, assuming it will either pass or fail
        // If you wanted to test the actual output, you could capture it from the logger.
    }

    // Additional test for edge cases (testing when arguments are passed)
    @Test
    void testMainWithTestArgument() {
        String[] args = {"test"};
        App.main(args);  // Running main method with "test" argument
        // The test passed if it doesn't throw an error. Further validation could be done by capturing logs.
    }

    // Additional test for main without arguments
    @Test
    void testMainWithoutArguments() {
        String[] args = {};
        App.main(args);  // Running main method without arguments
        // Further validation could be done by capturing logs if needed
    }

    // Test case for processInput method with valid input
    @Test
    void testProcessInputWithValidString() {
        String input = "Test input";
        String expected = "Processed: Test input";
        String actual = App.processInput(input);
        assertEquals(expected, actual, "The processInput method should return 'Processed: Test input' for a valid input.");
    }

    // Test case for processInput method with null input
    @Test
    void testProcessInputWithNull() {
        String input = null;
        String expected = "Input is empty!";
        String actual = App.processInput(input);
        assertEquals(expected, actual, "The processInput method should return 'Input is empty!' when input is null.");
    }

    // Test case for processInput method with empty string
    @Test
    void testProcessInputWithEmptyString() {
        String input = " ";
        String expected = "Input is empty!";
        String actual = App.processInput(input);
        assertEquals(expected, actual, "The processInput method should return 'Input is empty!' for an empty input.");
    }

    // Test case for logging a custom message
    @Test
    void testLogCustomMessage() {
        App app = new App();
        app.logCustomMessage("Test log message");
        // Log testing can be complex, but for now we assume no exceptions should be thrown
    }

    // Test case for handling edge case in processInput when input is a very long string
    @Test
    void testProcessInputWithLongString() {
        String input = "a".repeat(1000);  // Creating a long string of 1000 characters
        String expected = "Processed: " + input;
        String actual = App.processInput(input);
        assertEquals(expected, actual, "The processInput method should process long strings correctly.");
    }
}
