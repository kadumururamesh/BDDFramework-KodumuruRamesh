package com.mobile.orange.pages;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.orange.Utils.IntializeAppiumServer;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.chromium.ChromiumDriver;

public class Sample1 extends IntializeAppiumServer{
	
	@BeforeTest
	void AppiumSetup() throws InterruptedException {
		IntializeAppiumServer.startAppiumServer();
		Thread.sleep(10000);
		
		
	}
	
	@AfterTest	
	void teardown() throws InterruptedException {
		IntializeAppiumServer.stopAppiumServer();
	}
	@Test
	void test() throws InterruptedException {
		ChromiumDriver driver1=null;
		UiAutomator2Options options=new UiAutomator2Options();
		//options.setCapability("platfromName", "android");
		//options.setCapability("device", "Device13");
		//options.setCapability("platformVersion","13.0");
		//options.setCapability("automationName","uiautomator2");
		//options.setCapability("appPackage","io.appium.android.apis");
		//options.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//options.setCapability("noReset", true);
		//
		options.setCapability("platformName", "android");
		options.setCapability("device", "Device13");
		options.setCapability("platformVersion", "13.0.0");
		options.setCapability("automationname", "uiautomator2");
		options.setCapability("browserName", "Chrome");
		//options.setCapability("fullReset", true);
		
		//
		
		
		try {
			driver1=new ChromiumDriver(new URL("http://127.0.0.1:4723/"), options);		
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Thread.sleep(20000);
		//driver1.get("https://www.google.co.in/");
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
	}
	
	

}
