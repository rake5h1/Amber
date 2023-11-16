package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the EdgeDriver executable
        try {
            System.setProperty("webdriver.edge.driver", "/usr/local/bin/msedgedriver");
        } finally {
            System.setProperty("webdriver.edge.driver", "src\\Resources\\msedgedriver.exe");
        }
        // Create a new instance of the EdgeDriver
        driver = new EdgeDriver();
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