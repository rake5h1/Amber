
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "src/test/java/selenium/stepDefinitions"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}