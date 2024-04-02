package working.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Dimension;
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
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;


public class AppiumClick {
	
	PointerInput finger1=null;
	Sequence seq=null;
	
	@Test
	void setupCap() throws MalformedURLException {
	
	
	
	UiAutomator2Options options=new UiAutomator2Options();
	options.setCapability("platfromName", "android");
	options.setCapability("device", "device12");
	options.setCapability("platformVersion","12.0");
	options.setCapability("automationName","uiautomator2");
	options.setCapability("appPackage","io.appium.android.apis");
	options.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	
	
	AndroidDriver anddriver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	
	//anddriver.findElement(AppiumBy.accessibilityId("Views")).click();
	
	WebElement ele=anddriver.findElement(AppiumBy.accessibilityId("Views"));
	
	int x=ele.getRect().getX();
	int y=ele.getRect().getY();
	int width=ele.getRect().getWidth();
	int height=ele.getRect().getHeight();
	System.out.println(x +"-"+y+"-"+width+"-"+height);
	
	
	Point centerOfElement=new Point((int)(x+width/2),(int)(y+height/2));
	
	System.out.println(centerOfElement);
	
	finger1=new PointerInput(Kind.TOUCH, "finger1");
	
	seq=new Sequence(finger1, 1);
	seq.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement));
	seq.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	seq.addAction(new Pause(finger1, Duration.ofMillis(200)));
	seq.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	
	anddriver.perform(Collections.singleton(seq));
	
	
	/*
	
	((JavascriptExecutor) anddriver).executeScript("mobile: clickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) ele).getId()
		));
		
		*/
	
	/*
	((JavascriptExecutor) anddriver).executeScript("mobile: clickGesture", ImmutableMap.of(
			"x",(int)(x+width/2),
			"y",(int)(y+height/2)
		));
		
		*/
	
	



	
	
	
	
	}

}
