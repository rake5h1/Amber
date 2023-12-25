package setup;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
    protected WebDriver driver;

    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeTest()
    public WebDriver envSetup() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            // System.setProperty("webdriver.gecko.driver",
            // "src/test/resources/geckodriver.exe");
            // System.setProperty("os.name", "Linux");

            // options.addArguments("--headless");
            // options.setCapability("browserVersion", "120");
            // options.setCapability("platformName", "Linux");

            // driver = new FirefoxDriver(options);
            try {
                driver = new RemoteWebDriver(new URL("http://35.175.178.108:4444/"), options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return driver;
    }

}
