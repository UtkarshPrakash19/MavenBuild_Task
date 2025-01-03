package com.example.automation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("provideMainArguments")
    void testMain(String[] args, boolean expectedOutput) {
        try {
            App.main(args);
            assertTrue(expectedOutput, "Main should handle provided arguments without exceptions.");
        } catch (Exception e) {
            fail("Main threw an unexpected exception: " + e.getMessage());
        }
    }

    private static Stream<Arguments> provideMainArguments() {
        return Stream.of(
            Arguments.of(new String[]{"test"}, true),
            Arguments.of(new String[]{}, true)
        );
    }

    @Test
    void testRunTests() {
        App app = new App();
        // Capture any exceptions thrown during the test execution
        try {
            app.runTests();
            assertTrue(true, "RunTests should execute without any exceptions.");
        } catch (AssertionError e) {
            fail("RunTests failed: " + e.getMessage());
        }
    }
}
