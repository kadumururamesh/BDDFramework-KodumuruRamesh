package working.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumZoomout {
	
	@Test
	void appiumZoomout() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		
		options.setCapability("platformName", "android");
		 options.setCapability("device", "device12");
		 options.setCapability("platformVersion", "12.0");
		 options.setCapability("automationname", "uiautomator2");
		// options.setCapability("browserName", "Chrome");
		 //options.setCapability("fullReset", true);
		//options.setAppActivity("com.orangehrm.opensource.MainActivity");
		options.setCapability("appPackage","io.appium.android.apis");
		options.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		URL url=new URL("http://127.0.0.1:4723");
		
		AndroidDriver driver=new AndroidDriver(url, options);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.findElement(AppiumBy.accessibilityId("Chrome")).click();
		
		PointerInput finger1=new PointerInput(Kind.TOUCH, "finger1");
		Sequence seq=new Sequence(finger1, 1);
		
		Thread.sleep(30000);
		
		/*
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
					"left", 200,
				    "top", 800,
				    "width", 1000,
				    "height", 1000,
				    "percent", 0.5
				
				));
				
				*/
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		WebElement element=driver.findElement(AppiumBy.accessibilityId("WebView"));
		
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",(RemoteWebElement) element,
				"direction","down",
				"percent","1.0"
				
				));
		////
		
		
		
		///
		
	}

}
