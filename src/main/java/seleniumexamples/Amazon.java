package seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void aa() {
	
	System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//WebDriver driver=new InternetExplorerDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
	//Actions actions=new Actions(driver);
	//WebElement ele=driver.findElement(By.xpath("//option[text()='Alexa Skills']"));
	//actions.click(ele).perform();
	
	
	}
	
}
