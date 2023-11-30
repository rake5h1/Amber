package stepDefinition;

import org.openqa.selenium.WebDriver;
import Pages.BonusTask;
import Pages.VisitPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setup.BaseTest;

public class Second {
    protected WebDriver driver;
    BaseTest base;

    @Before()
    public void setUp() {

        base = new BaseTest(driver);
        driver = base.envSetup();

    }

    // }
    @Given("Visit Amber")
    public void visit() throws InterruptedException {
        VisitPage visit = new VisitPage(driver);
        visit.navigateTo();
    }

    @When("Click on Search bar")
    public void click_on_search_bar() {
        BonusTask bonus = new BonusTask(driver);
        bonus.bonustask();
    }

    @Then("Iterate over the counties tab")
    @And("Verify list of popular cities is different for all countries and no city is repeated or mentioned in more than 1 country tab.Ignore All section")

    public void iterate_over_the_counties_tab() {
        BonusTask bonus = new BonusTask(driver);
        bonus.iterate();
    }

    @After()
    public void tearDown() {
        driver.quit();
    }
}
