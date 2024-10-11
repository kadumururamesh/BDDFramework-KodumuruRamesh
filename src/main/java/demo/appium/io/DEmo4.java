package demo.appium.io;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class DEmo4 {
	private static final Duration TIMEOUT = Duration.ofMinutes(5);
	private static final Duration POLLING_INTERVAL = Duration.ofSeconds(10);
	public static void main(String[] args) throws InterruptedException, IOException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "12.0");
	cap.setCapability("device", "device12");
	cap.setCapability("automationName", "UiAutomator2");
	//cap.setCapability("appPackage", "io.appium.android.apis");
	//cap.setCapability("appActivity","io.appium.android.apis.ApiDemos"); 
	
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.sendSMS("9742624918","Your OTP for DummyApp:1234");
Thread.sleep(5000);

String otpPattern = "Your OTP for DummyApp:(\\\\\\\\d+)";

String data = String.valueOf(driver.executeScript("mobile: listSms",ImmutableMap.of("max",1)));
System.out.println(data);
Matcher matcher = Pattern.compile(otpPattern).matcher(data);

     
System.out.println(matcher.group(data));
    
 



	}	
}
	
	