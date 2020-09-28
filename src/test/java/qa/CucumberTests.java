import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/qa/features"},
                 glue = {"qa/stepdefinitions"},
                 plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber",
                "pretty", "json:target/cucumber-reports/Cucumber.json"}
)

public class CucumberTests extends AbstractTestNGCucumberTests {
}
