package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Filter extends VisitPage {
    public Filter(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void filter() throws InterruptedException {

        wait.until(ExpectedConditions.titleIs("Student Housing London | 22700+ Rooms | Amber"));
        Thread.sleep(5000);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
                ".amber-UnstyledButton-root.amber-Button-root.amber-17a4rn7:nth-child(5)")));
        element.click();

        WebElement privateroom = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='private_room']")));
        privateroom.click();
        WebElement privatebathroom = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='private_bathroom']")));
        privatebathroom.click();
      
    }

    public void newtab() throws InterruptedException {
        String currhandle = driver.getWindowHandle();
        String url = driver.getCurrentUrl();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript(String.format("window.open('%s','_blank')", url));

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currhandle)) {
                driver.switchTo().window(handle);

                break;
            }
        }

        Thread.sleep(5000);

        if (driver.getTitle().contains("Student Housing London |")) {
            boolean titlecontains = true;
            assert titlecontains;

        } else {
            boolean titlecontains = false;
            assert titlecontains;
        }
    }

    public void verify() {
        List<WebElement> linkElements = driver
                .findElements(By.cssSelector("h2.amber-Text-root.amber-Title-root.amber-5elmvi"));
        for (WebElement element2 : linkElements) {
            String title = element2.getText();
            System.out.println(title);
            assert title.contains("London");
        }
    }

}
