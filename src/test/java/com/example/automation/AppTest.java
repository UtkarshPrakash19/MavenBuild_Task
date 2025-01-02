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

    // Test case for the welcomeMessage method
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
        String expected = "Hello, !";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should handle empty names.");
    }

    // Test case for null name
    @Test
    void testWelcomeMessageWithNullName() {
        App app = new App();
        String name = null;
        String expected = "Hello, null!";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should handle null names.");
    }

    // Test case for the runTests method
    @Test
    void testRunTests() {
        App app = new App();
        app.runTests();  // Testing the logic directly, assuming it prints to the log
        // If you wanted to test the actual output, you could capture it from the logger.
    }

    // Additional test for edge cases (for example, testing when arguments are passed)
    @Test
    void testMainWithTestArgument() {
        String[] args = {"test"};
        App.main(args);
        // The test passed if it doesn't throw an error. Further validation could be done by capturing logs.
    }

    // Additional test for main without arguments
    @Test
    void testMainWithoutArguments() {
        String[] args = {};
        App.main(args);
        // Again, validation can be done by capturing logs if needed
    }
}
