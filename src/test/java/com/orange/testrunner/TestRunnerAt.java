package com.orange.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/FeaturesFiles/one.feature",
		glue= {"com.orange.stepdefinations"},
		//monochrome=true,
		//plugin= {"pretty","json:target/report.json"},
		//dryRun=true
		plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//dryRun=true
		//tags= ("@smoke and @three")
		
		)

public class TestRunnerAt {

    
}