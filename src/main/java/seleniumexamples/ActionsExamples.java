package seleniumexamples;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsExamples {
	
	@Test
	public void mouseexamples() throws IOException, InterruptedException {
		System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//img[@alt='Fashion']"))).perform();
		Thread.sleep(5000);
		actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Kids']"))).perform();
		
		
	}

}
