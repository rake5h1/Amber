package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    protected WebDriver driver;

    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver envSetup() {
        if (driver == null) {
            FirefoxOptions options = new FirefoxOptions();
            System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
            //options.addArguments("--headless");

            driver = new FirefoxDriver(options);
        }

        return driver;
    }

   
}
