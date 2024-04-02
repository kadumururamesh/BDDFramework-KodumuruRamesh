package seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Draganddropexample {
	
	@Test
	public void drag1() {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"))));
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='The peaks of High Tatras']")));
		
		Actions action=new Actions(driver);
		WebElement source,target;
		source=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		target=driver.findElement(By.xpath("//div[@id='trash']"));
		action.dragAndDrop(source,target).perform();
		action.release();
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='On top of Kozi kopka']")));
		source=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));		
				action.clickAndHold(source).moveToElement(target).build().perform();
				action.release();
		
	}
}


