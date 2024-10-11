package demo.appium.io;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Demo2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		DesiredCapabilities cap = new DesiredCapabilities();
		//File app=new File("C:\\Users\\SWETHARAMESH\\Documents\\Automation1\\apk_folder\\android.wdio.native.app.v1.0.8.apk");
		//cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability("device", "device11");
		cap.setCapability("automationName", "UiAutomator2");
		//cap.setCapability("app",app.getAbsolutePath());
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		//cap.setCapability("appPackage", "com.wdiodemoapp");
		//cap.setCapability("appActivity","com.wdiodemoapp.MainActivity");
		 
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(20000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(10000);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(10000);
		driver.pressKey(new KeyEvent(AndroidKey.CAMERA));
		/*
		driver.startRecordingScreen(new AndroidStartScreenRecordingOptions()
				.withVideoSize("1280x720")
				.withTimeLimit(Duration.ofSeconds(200)));
		Thread.sleep(10000);
		//driver.get("https://www.google.com/");
	
		//driver.stopRecordingScreen();
		String video =driver.stopRecordingScreen();
        byte[] decode = Base64.getDecoder().decode(video);
        FileUtils.writeByteArrayToFile(new File("androidclip.mp4"), decode);
		
		//driver.removeApp("com.wdiodemoapp");
		//Thread.sleep(10000);
		//System.out.println(driver.isAppInstalled("com.wdiodemoapp"));
		
		
		//driver.installApp((System.getProperty("user.dir")+"/APKs/android.wdio.native.app.v1.0.8.apk"));
		//Thread.sleep(10000);
		//System.out.println(driver.isAppInstalled("com.wdiodemoapp"));
		 * 
		 */
		
	}

}
