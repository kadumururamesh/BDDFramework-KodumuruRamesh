package seleniumexamples;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoExamples {
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@BeforeTest
	void setup() {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	void test() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']")).click();
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement ele=driver.findElement(By.xpath("//div[@class='orangehrm-buzz-post-body-picture']"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);
		
		Thread.sleep(5000);
	ele.click();
	
	String s=driver.findElement(By.xpath("//img[@alt='background']")).getAttribute("src");
		
		System.out.println(s);
		Thread.sleep(5000);
		String downloadexefilepath=System.getProperty("user.dir")+"//src//main//resources//AutoIt//AutoItScripts//DownloadFilewithargs.exe";
		String filepath=System.getProperty("user.dir")+"\\src\\main\\resources\\AutoIt\\File_Download\\9.png";
		String urllink="https://Admin:admin123@opensource-demo.orangehrmlive.com/web/index.php/buzz/photo/9";
		System.out.println("url"+s);
		System.out.println(urllink);
		Runtime.getRuntime().exec(downloadexefilepath +" "+urllink+" "+filepath);
		
		
		
		
	}
}
