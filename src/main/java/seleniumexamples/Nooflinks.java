package seleniumexamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nooflinks {
	
	@Test
	public void linksex() {
		
		System.getProperty("webdriver.chrome.driver", System.getProperty("chromedriver.exe"));
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testpages.eviltester.com/styled/refresh");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		while(links.size()!=0) {
			if(links.contains("Hover Test Page"))
				System.out.println("found one link");
			
		}
		
		
		
		
		
		
	}

}
