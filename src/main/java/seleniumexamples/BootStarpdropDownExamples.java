package seleniumexamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BootStarpdropDownExamples {
	
	
	//a[text()='Select Product Type']
	
	@Test
	public void drag1() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--disable-notifications");
        ops.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(ops);
		driver.navigate().to("https://www.hdfcbank.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
			System.out.println("hello");
		}catch(Exception e) {
			System.out.println("hi");
		}
		
		
		
	}

}
