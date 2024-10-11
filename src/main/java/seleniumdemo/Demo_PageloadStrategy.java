package seleniumdemo;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Demo_PageloadStrategy {
	@Test
	void example1() {
		ChromeOptions options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		 
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.amazon.in/");		
		boolean b=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		
		System.out.println(b);
		
			}

}