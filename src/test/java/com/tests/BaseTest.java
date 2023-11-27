package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        // Create a new instance of the EdgeDriver
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        // try {
        // driver = new RemoteWebDriver(
        // new java.net.URL("https://" + username + ":" + accesskey +
        // browserstackgridurl), capabilities);
        // } catch (java.net.MalformedURLException e) {
        // System.out.println("Invalid grid URL");
        // }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
        Thread.sleep(3000);

    }

}