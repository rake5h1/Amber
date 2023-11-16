package com.example.Pages;

import org.openqa.selenium.WebDriver;

public class VisitPage {
    WebDriver driver;

    public VisitPage(WebDriver driver) {
        this.driver = driver;
    }

    // Common methods shared across pages
    public void navigateTo(String url) throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        assert driver.getTitle().equals("Google");
    }
}
