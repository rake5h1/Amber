

import org.testng.annotations.Test;

import Pages.VisitPage;

public class SeleniumTest extends BaseTest {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Open Google
        VisitPage homepage = new VisitPage(driver);
        homepage.navigateTo("https://google.com");

    }
}
