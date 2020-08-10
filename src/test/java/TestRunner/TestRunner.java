package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/get3.feature",
glue="Step_Definition", plugin = {/*"pretty","html:target/cucumber-reports",
		"json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:output/html-report"*/},
		monochrome=true, dryRun = false,tags= {"@Valid_value_Post_Operation"})
public class TestRunner
{
}