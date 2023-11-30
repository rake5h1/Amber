
# Java-Maven-Selenium-Cucumber Project

This is a simple project to visit a website and perform simple automation task 



## Prerequisites

1.Java(https://Java.com)

2.Maven(https://maven.apache.org/)

3.Firefox Browser(https://www.mozilla.org/en-US/)

4.Gecko Driver(https://github.com/mozilla/geckodriver/releases)

Download and Install Prerequisites.
Download and Extract Gecko Driver.
## Project Structure

Here we are using Cucumber (BDD) with Selenium in a Maven Project

Neccessary dependencies are Included in pom.xml file

### Cucumber Setup

Cucumber Runner file is located at:
```
/test/java/runner/Runner.java
```

```

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/features", glue = "stepDefinition", plugin = { "pretty",
        "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports/Cucumber.html" })
public class Runner extends AbstractTestNGCucumberTests {
}

```

Features file are located at:

```
src/test/features

```

StepDefinitions are located at:

```
src/test/java/stepDefinition

```


testng.xml is Configured to Run Cucumber Tests.

```
 <test name="Test1">
        <classes>
            <class name="runner.Runner" />
        </classes>
</test>
```


## Run Test

### Clone Git repository
```
git clone https://github.com/rake5h1/Amber

```

Download and Extract GeckoDriver.

### SetUp WebDriver

```
FirefoxOptions options = new FirefoxOptions();
        options.addArguments("webdriver.gecko.driver", "path/to/geckodriver");
        driver = new FirefoxDriver(options);
```

Pass on GeckoDriver Path in

```
/src/test/java/stepDefiniton/SeleniumTest.java

```

### Run

```
mvn clean install

```

### Reports

Cucumber Reports are located at 

```
/target/cucumber-reports

```

TestNg Reports are located at

```
/target/surefire-reports/index.html

```








## Reports

Cucumber Reports are generated at

```
/target/cucumber-reports/

```