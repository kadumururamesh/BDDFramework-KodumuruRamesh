package working.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumScroll {

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
		options.setCapability("device", "device12");
		options.setCapability("platformVersion","12.0");
		options.setCapability("automationName","uiautomator2");
		options.setCapability("appPackage","io.appium.android.apis");
		options.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		options.setCapability("unlockType","pattern");
		//options.setCapability("unlockType","password");
		options.setCapability("unlockKey","1478");
		
		
		
		try {
			//driver1=new ChromiumDriver(new URL("http://127.0.0.1:4723/"), options);	
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Dimension d=driver.manage().window().getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"API Demos\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		int MobileScreenHeight=d.getHeight();
		int MobileScreenWidth=d.getWidth();
		
		int MobileScreenMidPointbyHeight=(int)(MobileScreenHeight * 0.5);
		int MobileScreenMidPointbyWidth=(int)(MobileScreenWidth * 0.5);
		
		int MobileScreenEndofHeight=(int)(MobileScreenHeight*0.2);
		
		/*
		 * PointerInput finger1=new PointerInput(Kind.TOUCH, "finger1");
		 * 
		 * Sequence sequence=new Sequence(finger1, 1);
		 * 
		 * sequence.addAction(finger1.createPointerMove(Duration.ZERO,
		 * PointerInput.Origin.viewport(),
		 * MobileScreenMidPointbyWidth,MobileScreenMidPointbyHeight));
		 * sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.
		 * asArg()));
		 * sequence.addAction(finger1.createPointerMove(Duration.ofMillis(200),
		 * PointerInput.Origin.viewport(),MobileScreenMidPointbyWidth,
		 * MobileScreenEndofHeight)); sequence.addAction (new Pause (finger1,
		 * Duration.ofMillis(200)));
		 * sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.
		 * asArg())); driver.perform(Collections.singletonList(sequence));
		 */
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
		WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		/*
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration","4000"));
		
		*/
	      Point location = element.getLocation();
	         Dimension size = element.getSize();
	         Point centerOfElement = new Point(location.getX() + size.getWidth()/2,location.getY()+ size.getHeight()/2);
		
		PointerInput finger1=new PointerInput(Kind.TOUCH,"finger1");
		Sequence seq=new Sequence(finger1, 1);
		seq.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), centerOfElement));
		seq.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		seq.addAction(new Pause(finger1, Duration.ofSeconds(3)));
		seq.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Collections.singletonList(seq));
		
	
}
	
}
