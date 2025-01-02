package com.example.automation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetGreeting() {
        // Test getGreeting method
        String expected = "Hello World!";
        String actual = App.getGreeting();
        assertEquals(expected, actual, "getGreeting method failed");
    }

    @Test
    public void testWelcomeMessage() {
        // Test welcomeMessage method
        App app = new App();
        String name = "Utkarsh";
        String expected = "Hello, Utkarsh!";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "welcomeMessage method failed");
    }

    @Test
    public void testRunTests() {
        // Test runTests method by capturing the output (optional)
        App app = new App();
        app.runTests();  // If there’s no exception, the test passed
    }
}
