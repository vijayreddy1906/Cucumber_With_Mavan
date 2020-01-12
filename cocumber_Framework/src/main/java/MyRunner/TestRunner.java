package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features//Login"
		,glue={"stepDefinations"}
		
		//format={"pretty","html:test-output"}
		
		)
public class TestRunner {

}
