package com.web.orange.Utils;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.web.orange.Utils.WebDriverFactory;




public class UserActions extends WebDriverFactory{
	
	public WebDriver driver;
	
	private void IntializeDriver() {
		try {
			driver=getDriver();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void openURL(String url) {
		IntializeDriver();
		try {
			driver.navigate().to(url);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void EditBox_SendKeys(String element,String value) {
		try {
			driver.findElement(By.name(element)).sendKeys(value);
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public void ClickOnButton(String element) {
		driver.findElement(By.xpath(element)).click();
		
	}
	
	public void Staticwait() {
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String verify_title() {
		//System.out.println(driver.getTitle());
		
		return driver.getTitle();
		
		
	}
	
	public void close_browser() {
		driver.close();
	}
	
	public void Quit_Browser() {
		driver.quit();
		
	}
	
	

}
