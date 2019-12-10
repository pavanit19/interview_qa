package active.admin.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "testcaseFeatures"
		,glue={"stepDefinitions"}
		)
 
public class TestRunner {
 
}
