package com.orange.pages;

import com.orange.Utils.UserActions;
import java.net.URL;

import org.testng.Assert;
import org.apache.log4j.Logger;

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
	
	public void Click_on_Login_Button() {
		Action.ClickOnButton(" //body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
	}
	
	public void Verify_page_title() {
		try {
			title=Action.verify_title();
			Assert.assertEquals("OrangeHRM", title);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
