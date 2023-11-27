package com.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.DataProvider;

public class BaseTest {

    protected WebDriver driver;
    protected RemoteWebDriver remoteWebDriver;
    String username = System.getenv("USERNAME");
    String accesskey = System.getenv("ACCESS_KEY");
    String gridURL = "@hub.lambdatest.com/wd/hub";
    String browserstackgridurl = "@hub-cloud.browserstack.com/wd/hub";

    @BeforeTest()
    public void setUp() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        // capabilities.setCapability("browserName", browserName);
        // capabilities.setCapability("version", browserVersion);
        // capabilities.setCapability("platform", platform);

        // Create a new instance of the EdgeDriver
        // FirefoxOptions options = new FirefoxOptions();
        // options.addArguments("--headless");
        // driver = new FirefoxDriver(options);
        try {
            driver = new RemoteWebDriver(
                    new java.net.URL("https://" + username + ":" + accesskey + browserstackgridurl), capabilities);
        } catch (java.net.MalformedURLException e) {
            System.out.println("Invalid grid URL");
        }
    }

    // @DataProvider(name = "Set_Environment", parallel = true)
    // public Object[][] getData() {

    // Object[][] Browser_Property = new Object[][] {

    // // { Platform.WIN10, "chrome", "latest" },
    // //{ Platform.WIN10, "firefox", "latest" },
    // { Platform.MAC, "safari", "latest" }
    // };
    // return Browser_Property;

    // }

    @AfterTest
    public void tearDown() throws InterruptedException {
        // Close the browser
        if (driver != null) {
            driver.close();
        }

    }

}