package com.example.automation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

    @Test
    void testGetGreeting() {
        App app = new App();
        String expected = App.GREETING_MESSAGE;
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
    void testWelcomeMessageWithEmptyName() {
        App app = new App();
        String name = "";
        String expected = "Hello, !";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should handle empty names.");
    }

    @Test
    void testWelcomeMessageWithNullName() {
        App app = new App();
        String name = null;
        String expected = "Hello, null!";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should handle null names.");
    }

    @Test
    void testRunTests() {
        App app = new App();
        app.runTests(); 
    }

    
@Test
    void testMainWithTestArgument() {
        // Set up to capture console output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Define the test argument
        String[] args = {"test"};

        // Call the main method
        App.main(args);

        // Capture the console output
        String consoleOutput = outputStreamCaptor.toString().trim();

        // Assert that the console output contains the expected text
        assertTrue(consoleOutput.contains("Expected output text"), "Console output does not contain expected text.");
    }
   
    @Test
    void testMainWithoutArguments() {
        String[] args = {};
        App.main(args);
      
    }
}
