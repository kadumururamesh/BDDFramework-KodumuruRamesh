package com.orange.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

public class TwoSteps {
	
	@After
	public void after1() {
		System.out.println("******************im from After annonations************************");
	}
	
	@AfterStep
	public void afterstep() {
		System.out.println("------------------------------- After step annonations--------------------");
	}

}
