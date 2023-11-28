package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

public class VisitPage {
    WebDriver driver;

    public VisitPage(WebDriver driver) {
        this.driver = driver;
    }

    // Common methods shared across pages

    public void navigateTo(String url) throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Accept all']"))).click();
        } catch (Exception e) {
            System.out.println(e);
        }
        Reporter.log("Browser Opened and navigated to " + url);
        assert driver.getTitle().equals("Google");
    }
}
