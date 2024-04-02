package seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollall {
	
	@Test
	public void scrollex() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.vogue.es/micros/tendencias-moda-anos-80/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		//scroll bottom of the page
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//top
		Thread.sleep(5000);
		jse.executeScript("window.scrollTo(0,0)");
		*/
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollTo(0,0)");
	}
	

}
