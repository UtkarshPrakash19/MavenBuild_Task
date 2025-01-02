package com.example.automation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    private final App app = new App();

    @Test
    void testGetGreeting() {
        String expected = "Hello World!";
        String actual = app.getGreeting();
        assertEquals(expected, actual, "Greeting should be 'Hello World!'");
    }

    @Test
    void testWelcomeMessage() {
        String name = "John";
        String expected = "Hello, John!";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should be correctly formatted.");
    }
}
