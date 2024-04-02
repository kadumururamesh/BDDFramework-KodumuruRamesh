package seleniumexamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class WaitExamples {
	@Test
	public void impliwaitex() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/index.html");
		driver.findElement(By.linkText("Redirect (JavaScript) Test Page")).click();
		driver.findElement(By.xpath("//button[text()='Click to be transported in 5 seconds']")).click();
		String s=driver.findElement(By.xpath("//div[@id='countdown-render']/p")).getText();
		System.out.println(s);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='goback']"))).click();
		
	}
	
	//@Test
	public void fluentwaitex() {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/index.html");
		driver.findElement(By.linkText("Redirect (JavaScript) Test Page")).click();
		driver.findElement(By.xpath("//button[text()='Click to be transported in 5 seconds']")).click();
		
		Wait wait=new FluentWait<>(driver)
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(NoSuchElementException.class);
		
		wait.until(
				d -> {
				driver.findElement(By.xpath("//button[@id='goback']")).click();
	          return true;
	        });
		
	}

}
