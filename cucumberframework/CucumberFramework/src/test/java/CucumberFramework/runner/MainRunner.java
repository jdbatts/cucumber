package CucumberFramework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/CucumberFramework/featureFiles"}, // path to featureFile package
		glue = {"CucumberFramework.steps"}, // path to steps package
		monochrome =  true, // if false then the output is not human readable
		tags = {},
		plugin =  {"pretty", "html:target/cucumber","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class MainRunner {
	
}
