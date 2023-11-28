package selenium.stepDefinitions;


import org.testng.annotations.Test;

import Pages.VisitPage;
import selenium.BaseTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SeleniumTest extends BaseTest {

    @Test
    @Given("I Visit Google")
    public void testGoogleSearch() throws InterruptedException {
        // Open Google
        VisitPage homepage = new VisitPage(driver);
        homepage.navigateTo("https://google.com");

    }
}
