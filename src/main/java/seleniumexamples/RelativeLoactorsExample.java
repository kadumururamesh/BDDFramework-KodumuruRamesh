package seleniumexamples;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RelativeLoactorsExample {
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
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Time']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Attendance']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Punch In/Out']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-clock oxd-time-input--clock']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text']"));
		
		for(int i=0;i<=10;i++) {
			try {
				//ele=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text']"));
				driver.findElement(RelativeLocator.with(By.tagName("i")).above(ele)).click();
			}catch(Exception e) {
				
				driver.findElement(By.xpath("//i[@class='oxd-icon bi-clock oxd-time-input--clock']")).click();
				ele=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text']"));
				driver.findElement(RelativeLocator.with(By.tagName("i")).above(ele)).click();
			}
		
		//Thread.sleep(3000);
		}
		for(int i=10;i>=0;i--) {
			driver.findElement(RelativeLocator.with(By.tagName("i")).below(ele)).click();
			//Thread.sleep(3000);
			}
		
		
	}

}
