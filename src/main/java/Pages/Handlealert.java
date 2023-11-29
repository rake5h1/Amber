package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlealert extends VisitPage {
    public Handlealert(WebDriver driver) {
        super(driver);
    }

    public void handle() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {

            WebElement popup = wait
                    .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#close > svg")));
            popup.click();
        } catch (Exception e) {
            System.out.println("No pop up");
        }
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (Exception e) {
            System.out.println("No alert");
        }

    }
}
