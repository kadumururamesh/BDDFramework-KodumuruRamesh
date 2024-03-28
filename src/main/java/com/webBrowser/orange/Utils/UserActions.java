package com.webBrowser.orange.Utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.webBrowser.orange.Utils.WebDriverFactory;




public class UserActions extends WebDriverFactory{
	
	public static WebDriver driver=null;
	
	public static void IntializeDriver() {
		try {
			driver=getDriver();
			System.out.println(driver.getClass());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void openURL(String url) {
		
		try {
			driver.navigate().to(url);
			System.out.println(url);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void EditBox_SendKeys(String element,String value) {
		try {
			driver.findElement(By.name(element)).sendKeys(value);
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public static void ClickOnButton(String element) {
		driver.findElement(By.xpath(element)).click();
		
	}
	
	public static void Staticwait() {
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static String verify_title() {
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
