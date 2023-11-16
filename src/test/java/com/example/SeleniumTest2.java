package com.example;

import org.testng.annotations.Test;

import com.example.Pages.Search;
import com.example.Pages.VisitPage;
import com.tests.BaseTest;

public class SeleniumTest2 extends BaseTest {

    @Test
    public void testGoogleSearch2() throws InterruptedException {
        VisitPage visit = new VisitPage(driver);
        visit.navigateTo("https://google.com");
        Thread.sleep(3000);
        Search search = new Search(driver);
        search.search("Selenium");
    }
}
