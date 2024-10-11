package seleniumexamples;

import java.security.DrbgParameters.Capability;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeOptionsExample {
	
	@Test
	void Example1() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--incognito")
		//options.addArguments("--hide-scrollbars");
		//options.addArguments("start-maximized");
		//options.addArguments("window-size=1920,1080");
		//options.addArguments("test-type=browser");
		//options.addArguments("disable-popup-blocking");
	    //options.addArguments("disable-default-apps");
		//options.addArguments("--disable-infobars");
		//options.addArguments("--disable-notifications");
		/*
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",
		        Collections.singletonList("enable-automation"));
		        */
		//options.addArguments("force-dark-mode");
		//options.addArguments("--start-fullscreen");
		//options.addArguments("--test-name=ramesh");
		
		options.addArguments("window-name=nidish");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		Thread.sleep(5000);
		driver.navigate().to("http://www.deadlinkcity.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

}
