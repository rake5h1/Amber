package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends VisitPage {
    public Login(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void click_login(String Email, String Password) {
        // System.out.println(driver.getWindowHandle());
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("button.amber-UnstyledButton-root.amber-Button-root.amber-kwnb4g"))).click();
        wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.amber-lqk3v2 > div.google-login-js")))
                .click();
        Set<String> handled = driver.getWindowHandles();
        String winHandle = driver.getWindowHandle();
        // System.out.println(winHandle);
        // System.out.println(winHandle);
        for (String handle : handled) {
            if (!handle.equals(winHandle)) {

                driver.switchTo().window(handle);
                break;
            }

        }
        System.out.println(driver.getWindowHandle());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            WebElement email_field = driver
                    .findElement(
                            By.cssSelector("div.aCsJod.oJeWuf > div.aXBtI.Wic03c > div.Xb9hP > input#identifierId"));
            email_field.click();
            email_field.sendKeys(Email);
            email_field.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Email Field not found");
        }

        // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#identifierNext
        // > div > button > span")))
        // .click();
        // driver.findElement(By.cssSelector("#identifierNext > div > button >
        // span")).click();
        try {
            WebElement password_field = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")));
            // .findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP
            // > input"));
            password_field.click();
            password_field.sendKeys(Password);
        } catch (Exception e) {
            System.out.println("Password Field not found");
        }

    }
}
