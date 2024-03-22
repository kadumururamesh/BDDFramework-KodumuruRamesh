package com.orange.stepdefinations;





import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.webBrowser.orange.Utils.UserActions;
import com.webBrowser.orange.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage loginpage=new LoginPage();
	UserActions Action=new UserActions();
	
	
	Logger log = LogManager.getLogger("LoginSteps");
	String title;
	
	

	@Given("Load Object Repo for Web Application")
	public void load_object_repo_for_web_application() {
		try {
			
		}catch(Exception e) {
			e.getMessage();
		}
	}



	
	@Given("Open the Orange.com page")
	public void open_the_orange_com_page() {
		try {
			loginpage.Open_Orange_Website();
			log.debug("ramesh..............");
			
			
		}catch(Exception e) {
			
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
			
		}
	}

	@And("Enter Valid Password")
	public void enter_valid_password() {
		try {
			loginpage.enter_valid_password();
		}catch(Exception e) {
			
		}
		
	}

	@And("Click on the Login Button")
	public void click_on_the_login_button() {
		try {
			loginpage.Click_on_Login_Button();
		}catch(Exception e) {
			
		}
		
	}

	@Then("Verify user able to view the Orange.com Home page")
	public void verify_user_able_to_view_the_orange_com_home_page() {
		try {
			loginpage.Verify_page_title();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Before
	public void before_step() {
		System.out.println("This before one");
	}
	
	@After
	public void after_step() {
		System.out.println("This After one");
	}

}
