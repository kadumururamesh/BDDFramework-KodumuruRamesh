package seleniumexamples;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFileExample {
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	//@BeforeTest
	void setUp() {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://tus.io/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//@AfterTest
	void teardown() throws Throwable{
		Thread.sleep(5000);
		//driver.quit();
	}
	
	//@Test
	void uploadFileEx1() throws IOException, InterruptedException{
		//wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload"))).click();
		WebElement ele=driver.findElement(By.id("P0-0"));
		actions=new Actions(driver);
				actions.moveToElement(ele).click().build().perform();
				Thread.sleep(5000);
		String exepath=System.getProperty("user.dir")+"//src//main//resources//AutoIt//AutoItScripts//UploadFile.exe";
		String filepath=System.getProperty("user.dir")+"\\src\\main\\resources\\AutoIt\\AutoIt_Data\\ramesh123.png";
		System.out.println(exepath);
		System.out.println(filepath);
		Runtime.getRuntime().exec(exepath +" " +filepath);
		
	}
	@Test
	void download() throws IOException {
		String exepath=System.getProperty("user.dir")+"//src//main//resources//AutoIt//AutoItScripts//UploadFile.exe";
		Runtime.getRuntime().exec(exepath);
	}

}
