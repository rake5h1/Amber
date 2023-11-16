package com.examples.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to the EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "//usr/local//bin//msedgedriver");
        // Create a new instance of the EdgeDriver
        driver = new EdgeDriver();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}