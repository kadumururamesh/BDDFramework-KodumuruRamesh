package com.orange.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HomeSteps {

	@Before
	
	public void before1(Scenario scenario) {
		System.out.println("******************Started Execution for " +scenario.getName()+"************************");
	}
	
	
}
