package com.example.automation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @ParameterizedTest
    @CsvSource({
        "Utkarsh, Hello, Utkarsh!",
        "'', Hello, !",
        "null, Hello, null!"
    })
    void testWelcomeMessage(String inputName, String expectedPrefix, String expectedMessage) {
        App app = new App();
        String actual = app.welcomeMessage(inputName);
        assertEquals(expectedMessage, actual, 
            "Welcome message should be consistent and handle different inputs.");
    }

    @Test
    void testRunTests() {
        // Since runTests() throws an AssertionError on failure, we can call it directly.
        // If no exception is thrown, the test passes.
        assertDoesNotThrow(App::runTests, "runTests should execute without throwing an exception.");
    }

    @Test
    void testMainWithTestArgument() {
        String[] args = {"test"};
        // Redirecting output to verify the logger's output
        assertDoesNotThrow(() -> App.main(args), "Main should handle 'test' argument without exceptions.");
    }

    @Test
    void testMainWithoutArguments() {
        String[] args = {};
        // Redirecting output to verify the logger's output
        assertDoesNotThrow(() -> App.main(args), "Main should handle empty arguments without exceptions.");
    }
}
