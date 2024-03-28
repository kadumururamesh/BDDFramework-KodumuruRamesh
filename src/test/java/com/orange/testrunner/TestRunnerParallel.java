package com.orange.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

////import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/FeaturesFiles",
		glue= {"com.orange.stepdefinations"},
		//monochrome=true,
		plugin= {"pretty","json:target/cucumber_reports/jsonreport.json",
				"pretty","json:target/cucumber_reports/XMLreport.xml",
				"pretty","html:target/cucumber_reports/HTMLreport.html",
				"timeline:target/cucumber_report"}
		//plugin= {"pretty","json:target/report.json"},
		//dryRun=true
		//plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//dryRun=true
		//tags= ("@smoke and @three")
		
		)

public class  TestRunnerParallel extends AbstractTestNGCucumberTests{

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
