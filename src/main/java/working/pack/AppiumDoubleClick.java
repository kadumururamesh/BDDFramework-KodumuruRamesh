package working.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumDoubleClick {
	
	PointerInput finger1;
	Sequence seq;
	
	
	@Test
	void doubleClick() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "anadroid");
		cap.setCapability("platfromVersion", "12.0");
		cap.setCapability("deviceName", "device12");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),cap);
		
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Controls")).click();
		
		driver.findElement(AppiumBy.accessibilityId("1. Light Theme")).click();
		/*
		driver.findElement(AppiumBy.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")).click();
		*/
		
		WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]"));
		int x=element.getRect().getX();
		int y=element.getRect().getY();
		int width=element.getRect().getWidth();
		int heigth=element.getRect().getHeight();
		
		Point Centerofelement=new Point((int)x+width/2,(int)y+heigth/2);
		/*
		finger1=new PointerInput(Kind.TOUCH, "finger1");
		seq=new Sequence(finger1, 1);
		
		seq.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), Centerofelement));
		seq.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		seq.addAction(new Pause(finger1,Duration.ofMillis(200)));
		seq.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		seq.addAction(new Pause(finger1,Duration.ofMillis(200)));
		seq.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		seq.addAction(new Pause(finger1,Duration.ofMillis(200)));
		seq.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		driver.perform(Collections.singleton(seq));
		
		*/
		
		/*
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement) element).getId()
				));
				
				*/
		
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
				"x",x,
				"y",y
				
				));
				
				
		
		
		
		
		
		
	}

}
