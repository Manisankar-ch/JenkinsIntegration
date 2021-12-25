package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
		glue= {"stepDefinition"},
		tags= {"@tagLogin"},
		plugin= {"pretty","json:target/cucumber-reports/cucumber.json"}
		
		
		
		)

public class Runner {

}
