package com.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Search extends VisitPage {
    public Search(WebDriver driver) {
        super(driver);
    }

    public void search(String search) throws InterruptedException {
        navigateTo("https://google.com");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q"))).sendKeys(search);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
        Thread.sleep(3000);

    }
}
