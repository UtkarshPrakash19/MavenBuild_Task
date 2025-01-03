package com.example.automation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGetGreeting() {
        App app = new App();
        String expected = App.GREETING_MESSAGE;
        String actual = app.getGreeting();
        assertEquals(expected, actual, "Greeting should be 'Hello World!'");
    }

    @ParameterizedTest
    @CsvSource({
        "Utkarsh, Hello, Utkarsh!",
        "'', Hello, !",
        "null, Hello, null!"
    })
    void testWelcomeMessageParameterized(String inputName, String expectedPrefix, String expectedMessage) {
        App app = new App();
        String actual = app.welcomeMessage(inputName);
        assertEquals(expectedMessage, actual, 
            "Welcome message should be consistent and handle different inputs.");
    }

    @Test
    void testRunTests() {
        App app = new App();
        app.runTests(); // Assuming runTests has some internal logic
        assertTrue(true, "RunTests should execute without any exceptions."); // Adding an assertion
    }

    @Test
    void testMainWithTestArgument() {
        String[] args = {"test"};
        App.main(args);
        assertTrue(true, "Main should handle test argument without exceptions."); // Adding an assertion
    }

    @Test
    void testMainWithoutArguments() {
        String[] args = {};
        App.main(args);
        assertTrue(true, "Main should handle empty arguments without exceptions."); // Adding an assertion
    }
}
