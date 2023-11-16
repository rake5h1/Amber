package com.examples.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to the EdgeDriver executable
        System.setProperty("webdriver.chrome.driver", "//usr/local//bin//chromedriver");
        // Create a new instance of the EdgeDriver
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}