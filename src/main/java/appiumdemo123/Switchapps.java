package appiumdemo123;

import java.net.MalformedURLException;
import java.net.URL;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Switchapps{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.out.println("hello nidish");
		
		UiAutomator2Options cap=new UiAutomator2Options();
		cap.setCapability("platformName", "android");
		cap.setCapability("deviceName", "device12");
		cap.setCapability("automationName","UIAutomator2");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		System.out.println(driver.getCurrentPackage());
		System.out.println(driver.currentActivity());
		System.out.println("completed1");
		
		driver.executeScript("mobile:startActivity",ImmutableMap.of("intent","com.fastaguser/com.fastaguser.newui.InteractiveActivity"));
		System.out.println(driver.getCurrentPackage());
		System.out.println(driver.currentActivity());
		System.out.println("completed2");
		Thread.sleep(10000);
		
		driver.executeScript("mobile:startActivity", ImmutableMap.of("intent","io.appium.android.apis/io.appium.android.apis.ApiDemos"));
		System.out.println(driver.getCurrentPackage());
		System.out.println(driver.currentActivity());
		System.out.println("completed3");	
		
	}
}
