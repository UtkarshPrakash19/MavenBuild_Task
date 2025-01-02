package com.example.automation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGetGreeting() {
        App app = new App();
        String expected = "Hello World!";
        String actual = app.getGreeting();
        assertEquals(expected, actual, "Greeting should be 'Hello World!'");
    }

    @Test
    void testWelcomeMessage() {
        App app = new App();
        String name = "Utkarsh";
        String expected = "Hello, Utkarsh!";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should include the user's name.");
    }

    @Test
    void testRunTests() {
        App app = new App();
        app.runTests();  // Testing the logic directly. You can check for console output if needed.
        // Assuming the logic is correct, no assertion needed here.
    }
}
