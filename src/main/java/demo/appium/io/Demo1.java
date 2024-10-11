package demo.appium.io;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

    	
    	UiAutomator2Options options=new UiAutomator2Options();
    	options.setCapability("platfromName", "android");
    	options.setCapability("device", "device12");
    	options.setCapability("platformVersion","12.0");
    	options.setCapability("automationName","uiautomator2");
    	options.setCapability("appPackage","io.appium.android.apis");
    	options.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
    	
    	
    	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    	
    	driver.findElement(AppiumBy.accessibilityId("Views")).click();
    	driver.getPageSource();
    	
    	
    	 /*
    	 System.out.println(driver.getCurrentPackage());
    	 System.out.println(driver.currentActivity());
    	 driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
    	 Thread.sleep(8000);
    	 driver.executeScript("mobile: startActivity", ImmutableMap.of("intent","com.android.dialer/.main.impl.MainActivity"));
    	 System.out.println("----------------------------");
    	 
    	 System.out.println(driver.getCurrentPackage());
    	 System.out.println(driver.currentActivity());
    	 driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.dialer:id/bottom_nav_item_text\" and @text=\"Contacts\"]")).click();
    	 System.out.println("++++++++++++++++++++++++++++++++");
    	 
    	 driver.executeScript("mobile: startActivity", ImmutableMap.of("intent","io.appium.android.apis/.ApiDemos"));
    	 Thread.sleep(8000);
    	 driver.findElement(AppiumBy.accessibilityId("Custom View")).click();
    	 System.out.println(driver.getOrientation());
    	 Thread.sleep(8000);
    	 */
    	 driver.rotate(ScreenOrientation.LANDSCAPE);
    	 System.out.println(driver.getOrientation());
    	 Thread.sleep(8000);
    	 driver.rotate(ScreenOrientation.PORTRAIT);
    	 System.out.println(driver.getOrientation());
    	 System.out.println(driver.getSessionId());
    	 System.out.println(driver.getContext());
    	 System.out.println(driver.getDeviceTime());
    	 System.out.println(driver.getBatteryInfo());
    	 System.out.println(driver.getDisplayDensity());
    	 System.out.println(driver.getCapabilities());
	}
    	 
    	 
}


