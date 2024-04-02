package seleniumexamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScreenshotExamples {
	
	@Test
	public void screen() throws IOException {
		
		System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.co.in/");
		File destfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(destfile, new File("Screenshots/ramesh.png"));
		FileHandler.copy(destfile, new File("Screenshots/ramesh123.png"));
		
		destfile=driver.findElement(By.xpath("//img[@alt='Google']")).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(destfile, new File("Screenshots/element.png"));
		
		destfile=((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(destfile, new File("Screenshots/fullscreen.png"));
		
	}
	
}
