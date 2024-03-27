package com.mobile.orange.pages;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.mobile.orange.Utils.IntializeAppiumServer;

import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.chromium.ChromiumDriver;

public class Sample1 extends IntializeAppiumServer{
	
	@BeforeTest
	void AppiumSetup() throws InterruptedException {
		//IntializeAppiumServer.startAppiumServer();
		//Thread.sleep(10000);
		
		
	}
	
	@AfterTest	
	void teardown() throws InterruptedException {
		//IntializeAppiumServer.stopAppiumServer();
	}
	@Test
	void test() throws InterruptedException {
		//ChromiumDriver driver1=null;
		AndroidDriver driver=null;
		UiAutomator2Options options=new UiAutomator2Options();
		options.setCapability("platfromName", "android");
		options.setCapability("device", "Device13");
		options.setCapability("platformVersion","13.0");
		options.setCapability("automationName","uiautomator2");
		//options.setCapability("appPackage","io.appium.android.apis");
		//options.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//options.setCapability("noReset", true);
		/*
		 * // options.setCapability("platformName", "android");
		 * options.setCapability("device", "Device13");
		 * options.setCapability("platformVersion", "13.0.0");
		 * options.setCapability("automationname", "uiautomator2");
		 * options.setCapability("browserName", "Chrome");
		 * //options.setCapability("fullReset", true);
		 */		
		//
		
		
		try {
			//driver1=new ChromiumDriver(new URL("http://127.0.0.1:4723/"), options);	
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Dimension d=driver.manage().window().getSize();
			System.out.println(d.getHeight());
			System.out.println(d.getWidth());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Thread.sleep(20000);
		//driver1.get("https://www.google.co.in/");
		//driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"API Demos\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		
		//android.widget.TextView[@content-desc="Custom"]
		WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Buttons\"]"));
		
		/*boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 5.0,
			    "speed",5000
			));*/
		
		/*boolean canScrollMore;
		do {
		canScrollMore=(Boolean)((JavascriptExecutor)driver).executeScript("mobile:scrollGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
				"direction","down",
				"percent",1,
				"speed",9000));
		}while(canScrollMore);*/
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; HashMap<String, Double>
		 * swipeObject = new HashMap<String, Double>(); swipeObject.put(“startX”, 0.01);
		 * swipeObject.put(“startY”, 0.5); swipeObject.put(“endX”, 0.9);
		 * swipeObject.put(“endY”, 0.6); swipeObject.put(“duration”, 3.0);
		 * js.executeScript(“mobile: swipe”, swipeObject);
		 */
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "left",
			    "percent", 0.75
			));
		
	}
	
	

}
