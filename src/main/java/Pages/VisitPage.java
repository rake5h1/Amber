package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VisitPage {
    WebDriver driver;

    public VisitPage(WebDriver driver) {
        this.driver = driver;
    }

    // Common methods shared across pages

    public void navigateTo() throws InterruptedException {
        driver.get("https://amberstudent.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Handlealert handlealert = new Handlealert(driver);
        handlealert.handle();
        wait.until(ExpectedConditions.titleContains("Discover the Best Student Accommodation and Housing | Amber"));

    }
}
