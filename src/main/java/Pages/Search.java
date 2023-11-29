package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;

public class Search extends VisitPage {
    public Search(WebDriver driver) {
        super(driver);
    }

    public void search(String search) throws InterruptedException {

        WebElement searchBox = driver.findElement(By.id("main-search"));

        Actions actions = new Actions(driver);

        actions.sendKeys(searchBox, search).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            WebElement firstitem = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("downshift-0-item-0")));
            WebElement element = firstitem.findElement(By.className("amber-1klckcs"));

            assert element.getText().equals("London");

            element.click();

        } catch (Exception e) {
            System.out.println("Suggestion not found");
            actions.sendKeys(searchBox, Keys.ENTER).perform();

        }

       
    }
}
