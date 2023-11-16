package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the EdgeDriver executable
        // try {
        // System.setProperty("webdriver.edge.driver", "/usr/local/bin/msedgedriver");
        // } finally {
        // System.setProperty("webdriver.edge.driver",
        // "/src/Resources/msedgedriver.exe");
        // }

        // Create a new instance of the EdgeDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
        Thread.sleep(5000);
    }
}