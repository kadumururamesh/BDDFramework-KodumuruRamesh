package seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Changingelements {
	@Test
	public void changing() {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testpages.eviltester.com/styled/refresh");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String s=driver.findElement(By.xpath("//h1[contains(text(),'Refresh Page Test :')]")).getText();
		System.out.println(s);
		driver.findElement(By.id("button")).click();
		s=driver.findElement(By.xpath("//h1[contains(text(),'Refresh Page Test :')]")).getText();
		System.out.println(s);
		
		
	}
}
