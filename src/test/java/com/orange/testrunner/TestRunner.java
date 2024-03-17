package com.orange.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/FeaturesFiles",
		glue= {"com.orange.stepdefinations"},
		//monochrome=true,
		plugin= {"pretty","json:target/report.json"}
		//dryRun=true
		
		)

public class TestRunner {

}
