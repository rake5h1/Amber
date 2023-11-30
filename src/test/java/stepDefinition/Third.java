package stepDefinition;

import org.openqa.selenium.WebDriver;

import Pages.Login;
import Pages.VisitPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import setup.BaseTest;

public class Third {
    protected WebDriver driver;
    BaseTest base;

    @Before()

    public void setUp() {
        base = new BaseTest(driver);
        driver = base.envSetup();

    }

    @Given("Visit Amber for Task 3")
    public void visit() throws InterruptedException {
        VisitPage visit = new VisitPage(driver);
        visit.navigateTo();
    }

    @Then("Login using Gmail {string} and {string}")
    public void login(String Email, String Password) {
        Login login = new Login(driver);
        login.click_login(Email, Password);
    }

    @After()
    public void tearDown() {
        driver.quit();
    }
}
