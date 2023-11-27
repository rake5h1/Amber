package com.example;

import org.testng.annotations.Test;
import com.example.Pages.VisitPage;
import com.tests.BaseTest;

public class SeleniumTest extends BaseTest {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Open Google
        VisitPage homepage = new VisitPage(driver);
        homepage.navigateTo("https://google.com");

    }
}
