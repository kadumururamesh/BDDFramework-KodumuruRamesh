package com.orange.stepdefinations;





import org.apache.logging.log4j.Logger;
import org.testng.Reporter;

import com.webBrowser.orange.Utils.UserActions;
import com.webBrowser.orange.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage loginpage=new LoginPage();
	
	UserActions action=new UserActions();
	
	
	@BeforeAll
	
	public static void beforeall()
	{
		System.out.println("BeforeAll step");
		
		//UserActions.IntializeDriver();
		Reporter.log("Driver intialized successfully");
		
	}
	
	@BeforeStep
	public void beforestep() {
		System.out.println("------------------------------- Before step annonations--------------------");
	}
	
	
	
	

	@Given("Load Object Repo for Web Application")
	public void load_object_repo_for_web_application() {
		try {
			
		}catch(Exception e) {
			e.getMessage();
		}
	}



	
	@Given("Navigate to Orange website")
	public void Navigate_to_Orange_website() {
		try {
			UserActions.IntializeDriver();
			loginpage.Open_Orange_Website();
			//log.debug("ramesh..............");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@When("Verify that Orange.com Page is opened")
	public void orange_com_page_is_opened() {
		try {
			loginpage.Verify_page_title();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@And("Enter valid username")
	public void enter_valid_username() {
		try {
			loginpage.enter_valid_useranme();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		
	@And("Enter Invalid username")
	public void enter_Invalid_username() {
		try {
			loginpage.enter_Invalid_useranme();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	@And("Enter valid Password")
	public void enter_valid_password() {
		try {
			loginpage.enter_valid_password();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@And("Enter Invalid Password")
	public void enter_invalid_password() {
		try {
			loginpage.enter_Invalid_password();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

	@And("Click on the Login Button")
	public void click_on_the_login_button() {
		try {
			loginpage.Click_on_Login_Button();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Then("Verify user able to view the Orange.com Home page")
	public void verify_user_able_to_view_the_orange_com_home_page() {
		try {
			String title=loginpage.Verify_page_title();
			
			System.out.println("title Ramesh1- " +title);
			action.close_browser();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Then("Verify user not able to view the Orange.com Home page")
	public void verify_user_not_able_to_view_the_orange_com_home_page() {
		try {
			String title=loginpage.Verify_page_title();
			System.out.println("title Ramesh2- " +title);
			action.close_browser();
						
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
