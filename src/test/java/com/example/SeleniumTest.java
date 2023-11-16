package com.example;

import org.testng.annotations.Test;
import com.example.Pages.VisitPage;
import com.examples.tests.BaseTest;
import com.example.Pages.Search;

public class SeleniumTest extends BaseTest {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Open Google
        VisitPage homepage = new VisitPage(driver);
        homepage.navigateTo("https://google.com");
    }

    @Test
    public void testGoogleSearch2() throws InterruptedException {
        // Open Google
        Search search = new Search(driver);
        search.search("Selenium");
    }

}
