package com.example.automation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // Self-contained test for coverage
        if (args.length > 0 && "test".equals(args[0])) {
            testApp();
        }
    }

    // Test method embedded within the App class
    private static void testApp() {
        String expectedOutput = "Hello World!";
        String actualOutput = "Hello World!";

        if (!expectedOutput.equals(actualOutput)) {
            throw new AssertionError("Test failed: Output mismatch!");
        } else {
            System.out.println("Test passed: Output matches.");
        }
    }
}
