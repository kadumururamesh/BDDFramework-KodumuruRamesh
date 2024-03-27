package com.webBrowser.orange.pages;

import java.net.URL;

import org.testng.Assert;

import com.webBrowser.orange.Utils.UserActions;


public class LoginPage {
	
	UserActions Action=new UserActions();
	String title;
	
	
	public String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public void Open_Orange_Website() {
		Action.openURL(url);
		
		
	}
	
	public void enter_valid_useranme() {
		Action.EditBox_SendKeys("username", "Admin");	
		
	}
	
	public void enter_valid_password() {
		Action.EditBox_SendKeys("password", "admin123");
	}
	
	////
	
	public void enter_Invalid_useranme() {
		Action.EditBox_SendKeys("username", "invalidusername");	
		
	}
	
	public void enter_Invalid_password() {
		Action.EditBox_SendKeys("password", "invlaidpassword");
	}
	
	////
	
	public void Click_on_Login_Button() {
		Action.ClickOnButton(" //body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
	}
	
	public String Verify_page_title() {
		try {
			return title=Action.verify_title();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	

}
