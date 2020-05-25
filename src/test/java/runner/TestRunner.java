package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"steps"},
        monochrome=true,
        plugin= {"html:target/cucumber-html-report",

                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
                //"com.aventstack.extentreports.cucumber4.adapter.ExtentCucumberAdapter:"

        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
