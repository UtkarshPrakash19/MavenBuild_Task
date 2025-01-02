package com.example.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAutomationTest {

    @Test
    public void testLogin() {
        // Set up WebDriver for Firefox
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\utka2\\Downloads\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to the Sauce Demo login page
            driver.get("https://www.saucedemo.com");

            // Locate the username and password fields
            WebElement usernameField = driver.findElement(By.id("user-name"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("login-button"));

            // Perform login using provided test credentials
            usernameField.sendKeys("standard_user");
            passwordField.sendKeys("secret_sauce");
            loginButton.click();

            // Validate successful login by checking the page title or a unique element
            WebElement inventoryPageTitle = driver.findElement(By.className("title"));
            String expectedTitle = "PRODUCTS";
            String actualTitle = inventoryPageTitle.getText();

            // Use case-insensitive comparison to validate title
            assertEquals(expectedTitle.toLowerCase(), actualTitle.toLowerCase(), "Login test failed: Title mismatch.");

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
