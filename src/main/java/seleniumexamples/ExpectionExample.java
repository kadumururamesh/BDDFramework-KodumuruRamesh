package seleniumexamples;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExpectionExample {	

@Test
void test() throws InterruptedException, IOException {
	WebDriver driver1,driver=null;
	System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
	//WebDriver driver=new FirefoxDriver(); - NoSuchSessionExpection
	driver1=new ChromeDriver();
	driver1.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//---InvalidArgumentException
	driver.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(8000);
	driver1.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	
	//driver.close(); //- NoSuchSessionExpection - invalid session id
	//driver.quit();//- Session ID is null. Using WebDriver after calling quit()?
	driver1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	

}
}
