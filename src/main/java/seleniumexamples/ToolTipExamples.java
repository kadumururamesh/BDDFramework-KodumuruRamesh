package seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ToolTipExamples {
	
	@Test
	public void tool1() {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/tooltip/#Forms%20Based");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//li[text()='Forms Based']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		String a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname"))).getAttribute("title");
		
		
		System.out.println(a);
	}

}
