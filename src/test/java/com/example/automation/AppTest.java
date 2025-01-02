package com.example.automation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGetGreeting() {
        App app = new App();
        assertEquals("Hello World!", app.getGreeting(), "The greeting message should be 'Hello World!'");
    }

    @Test
    public void testWelcomeMessageWithName() {
        App app = new App();
        String result = app.welcomeMessage("John");
        assertEquals("Hello, John!", result, "The welcome message should correctly greet the user by name");
    }

    @Test
    public void testWelcomeMessageWithEmptyName() {
        App app = new App();
        String result = app.welcomeMessage("");
        assertEquals("Hello, !", result, "The welcome message should correctly handle empty name input");
    }

    @Test
    public void testWelcomeMessageWithNullName() {
        App app = new App();
        String result = app.welcomeMessage(null);
        assertEquals("Hello, null!", result, "The welcome message should handle null input gracefully");
    }

    @Test
    public void testMainMethodWithoutTestArgument() {
        // Simulate running the main method with no arguments
        String[] args = {};
        App.main(args);
        // There won't be an assertion here, but you can verify if the application runs successfully without errors
    }

    @Test
    public void testMainMethodWithTestArgument() {
        // Simulate running the main method with "test" argument
        String[] args = {"test"};
        App.main(args);
        // The test will run, but you can assert based on expected behavior in the console output or logs
    }

    @Test
    public void testRunTests() {
        App app = new App();
        app.runTests(); // Testing the private method by calling it through the public interface
    }
}
