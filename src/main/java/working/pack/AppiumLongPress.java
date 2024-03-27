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
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumLongPress {
	
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
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		
		int x=element.getRect().getX();
		int y=element.getRect().getY();
		int width=element.getRect().getWidth();
		int height=element.getRect().getHeight();
		
		Point centerofelement=new Point((int)x+width/2, (int)y+height/2);
		
		finger1=new PointerInput(Kind.TOUCH, "finger1");
		seq=new Sequence(finger1, 0);
		
		seq.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerofelement));
		seq.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		seq.addAction(new Pause(finger1, Duration.ofSeconds(2)));
		seq.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		driver.perform(Collections.singleton(seq));
		
		/*
		
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement) element).getId()
				
				));
		
		*/
		
		
		
	}
	

}
