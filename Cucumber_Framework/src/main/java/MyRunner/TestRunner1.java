package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\User\\workspace\\Cucumber_Framework\\src\\main\\java\\Features"
		,glue={"StepDefinations"})
public class TestRunner1 {

}
