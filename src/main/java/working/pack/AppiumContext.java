package working.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumContext {
	
	@Test
	void appiumcontext() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		
		options.setDeviceName("device12");
		options.setPlatformName("android");
		options.setPlatformVersion("12.0");
		options.setAutomationName("uiautomator2");
		options.setAppPackage("com.orangehrm.opensource");
		options.setAppActivity("com.orangehrm.opensource.MainActivity");
		
		URL url=new URL("http://127.0.0.1:4723");
		
		AndroidDriver driver=new AndroidDriver(url, options);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(AppiumBy.className("android.widget.EditText")).clear();
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("https://opensource-demo.orangehrmlive.com/web/index.php");
		System.out.println(driver.getContext());
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CONTINUE\"]")).click();
		
		Thread.sleep(20000);
		System.out.println(driver.getContext());
		
		
		
	}

}
