package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import Pages.Search;
import Pages.VisitPage;
import Pages.Filter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;

public class SeleniumTest {

    protected WebDriver driver;

  

    @Before()
    public void setUp() {

        // Create a new instance of the EdgeDriver
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("webdriver.gecko.driver", "path/to/geckodriver");
        driver = new FirefoxDriver(options);

    }

    // }
    @Given("Visit Amber Home Page")
    public void visit() throws InterruptedException {
        VisitPage visit = new VisitPage(driver);
        visit.navigateTo();
    }

    @When("Search for accommodation in London")
    public void search() throws InterruptedException {
        Search search = new Search(driver);
        search.search("London");
    }

    @Then("Filter search results for Room Type Private Room and Sharing Private Bathroom")
    public void filter() throws InterruptedException {
        Filter filtersearch = new Filter(driver);
        filtersearch.filter();
    }

    @And("Open the second search result in a new tab")
    public void open() throws InterruptedException {
        Filter filtersearch = new Filter(driver);
        filtersearch.newtab();
    }

    @And("Switch to the tab and assert the title and location of the property")
    public void asserttitle() throws InterruptedException {
        Filter filtersearch = new Filter(driver);
        filtersearch.verify();
    }

    @After()
    public void tearDown() throws InterruptedException {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }

    }
}