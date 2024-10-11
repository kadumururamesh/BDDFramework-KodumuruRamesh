package demo.appium.io;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;



public class Demo3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		DesiredCapabilities cap = new DesiredCapabilities();
		//File app=new File("C:\\Users\\SWETHARAMESH\\Documents\\Automation1\\apk_folder\\android.wdio.native.app.v1.0.8.apk");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12.0");
		cap.setCapability("device", "device12");
		cap.setCapability("automationName", "UiAutomator2");
		//cap.setCapability("app",app.getAbsolutePath());
		//cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		//cap.setCapability("appPackage", "com.wdiodemoapp");
				//cap.setCapability("appActivity","com.wdiodemoapp.MainActivity");
		 
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		Thread.sleep(10000);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"Spinner\"))"));
		Thread.sleep(5000);
		//driver.findElement(AppiumBy.accessibilityId("Spinner")).click();
		//driver.sendSMS("9742624918", "hi ramesh,im sending message from simulator");
		//driver.terminateApp("io.appium.android.apis");
		
		driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().scrollable(true)).flingToBeginning(10)"));
		Thread.sleep(5000);
		driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
		
		System.out.println("completed-1");  
		
	
		driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)"));
		Thread.sleep(5000);
		 driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
		
		
		System.out.println("completed-2");  
		Thread.sleep(5000);
		 driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
		 Thread.sleep(5000);
		 driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward()"));
		 System.out.println("completed-3");  
		 Thread.sleep(5000);
		 driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).flingForward()"));
		 Thread.sleep(5000);
		 driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).flingBackward()"));
		 System.out.println("completed-4");  
		
		
	}

}
