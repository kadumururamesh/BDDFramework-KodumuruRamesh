package working.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class  AppiumScrollToElement<MobileElement> {
	
	PointerInput finger1;
	Sequence seq;
		
	@Test
	void longpress() throws MalformedURLException {
		
		UiAutomator2Options options=new UiAutomator2Options();
			
		options.setPlatformName("android");
		options.setPlatformVersion("12.0");
		options.setDeviceName("device12");
		options.setAutomationName("uiautomator2");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity("io.appium.android.apis.ApiDemos");
		
		URL url=new URL("http://127.0.0.1:4723");
		
		AndroidDriver driver=new AndroidDriver(url, options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		System.out.println("before click" +driver.getContext());
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))")).click();
		System.out.println("after click" +driver.getContext());
		System.out.println(driver.getContextHandles());
		driver.context("WEBVIEW_io.appium.android.apis");
		System.out.println("after click" +driver.getContext());
		//System.out.println(driver.findElement(By.xpath("io.appium.android.apis:id/wv1")).isDisplayed());
		
		
		
		
		
	}
	

}

