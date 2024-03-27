package com.orange.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Onestep {
	
	@Given("login Scene one")
	public void login_scene_one() {
	    System.out.println("Given Step-1");
	    
	}

	@Then("login Message Scene one")
	public void login_message_scene_one() {
	     System.out.println("Then Step-1");
	    
	}

	@Given("login Scene two")
	public void login_scene_two() {
	     System.out.println("Given Step-2");
	    
	}

	@Then("login Message Scene two")
	public void login_message_scene_two() {
	     System.out.println("Then Step-2");
	    
	}

	@Given("login Scene three")
	public void login_scene_three() {
	     System.out.println("Given Step-3");
	    
	}

	@Then("login Message Scene three")
	public void login_message_scene_three() {
	     System.out.println("Then Step-3");
	    
	}

	@Given("login Scene four")
	public void login_scene_four() {
	     System.out.println("Given Step-4");
	    
	}

	@Then("login Message Scene four")
	public void login_message_scene_four() {
	     System.out.println("Then Step-4");
	    
	}

	@Given("login Scene five")
	public void login_scene_five() {
	     System.out.println("Given Step-5");
	    
	}

	@Then("login Message Scene five")
	public void login_message_scene_five() {
	     System.out.println("Then Step-5");
	    
	}


}
