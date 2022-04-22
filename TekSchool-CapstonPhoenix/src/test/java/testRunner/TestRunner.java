package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},  ///laptopsAndNoteBooksFeature.feature
		glue = {"stepDefinitions", "appHooks"},tags = "@SmokeTest", stepNotifications = true, monochrome = true,
		plugin = {"json:target/cucumber.json","pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/","json:target/cucumber.json"
				})

public class TestRunner {

}
