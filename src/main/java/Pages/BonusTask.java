package Pages;

import java.util.List;
import java.util.HashSet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class BonusTask extends VisitPage {

    public BonusTask(WebDriver driver) {
        super(driver);
    }

    public void bonustask() {
        try {
            WebElement searchBox = driver.findElement(By.cssSelector("input#main-search"));

            Actions actions = new Actions(driver);

            actions.sendKeys(searchBox, Keys.ENTER).perform();
            // List<WebElement> search = driver
            // .findElements(By.cssSelector("button.amber-UnstyledButton-root.amber-Tabs-tab.amber-1sjyw3z"));
            // for (WebElement element : search) {
            // if (element != null) {
            // // System.out.println("Element found" + element.getText());
            // element.click();
            // // System.out.println(search.size());
            // List<WebElement> cities =
            // driver.findElements(By.cssSelector("div.amber-Tabs-panel.amber-qyby9e >
            // .amber-1avyp1d > .amber-1z0x9lj >.amber-Text-root.amber-1mirppv"));

            // //System.out.println(cities.size());

            // HashSet<String> citySet = new HashSet<String>();
            // for (WebElement city : cities) {
            // citySet.add(city.getText());
            // }

            // assert citySet.size() == cities.size() : "Duplicate cities found";
            // //System.out.println(citySet.size());
            // // System.out.println(citySet.size());

            // } else {
            // System.out.println("Element not found");
            // }

            // }

        } catch (Exception e) {
            System.out.println("Search bar not found");
        }

    }

    public void iterate() {
        List<WebElement> search = driver
                .findElements(By.cssSelector("button.amber-UnstyledButton-root.amber-Tabs-tab.amber-1sjyw3z"));
        for (WebElement element : search) {
            if (element != null) {
                // System.out.println("Element found" + element.getText());
                element.click();
                // System.out.println(search.size());
                List<WebElement> cities = driver.findElements(By.cssSelector(
                        "div.amber-Tabs-panel.amber-qyby9e > .amber-1avyp1d > .amber-1z0x9lj >.amber-Text-root.amber-1mirppv"));

                // System.out.println(cities.size());

                HashSet<String> citySet = new HashSet<String>();
                for (WebElement city : cities) {
                    citySet.add(city.getText());
                }

                assert citySet.size() == cities.size() : "Duplicate cities found";
                // System.out.println(citySet.size());
                // System.out.println(citySet.size());

            } else {
                System.out.println("Element not found");
            }

        }
    }

}
