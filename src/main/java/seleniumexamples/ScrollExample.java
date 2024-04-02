package seleniumexamples;

import java.awt.Window;
import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class ScrollExample {
	@Test
	public void scrollex() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		//driver.findElement(By.id("alert1")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('ta1').value='ramesh';");
		//js.executeScript("arguments[0].click();", driver.findElement(By.id("alert1")));
		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//button[normalize-space()='Check this']")));
		//window.scrollTo({ left: 0, top: document.body.scrollHeight, behavior: "smooth" });
		//arguments[0].scrollIntoView();
		//js.executeScript("document.getElementById('myBtn').scrollIntoView();");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}

}
