package seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionsExample1 {
	
	@Test
	public void ex1() {
			
	System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.tesco.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	Actions action=new Actions(driver);
	
	driver.findElement(By.xpath("//span[@class='styled__Text-sc-1xbujuz-1 eGUWOR beans-link__text' and text()='Groceries']")).click();
	
	action.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Shop groceries']"))).click().perform();
	action.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'/groceries/en-GB/shop/frozen-food?include-children=true')]//span[contains(@class,'hidden-small-medium')]//span[contains(@class,'menu__icon icon-chevron_right-light_div')]"))).click().perform();
	action.moveToElement(driver.findElement(By.xpath("//a[@class='menu__link menu__link--department menu__link--active menu__link--current-parent']//span[@class='menu__icon icon-chevron_right-white']"))).click().perform();
	action.click(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/header[1]/div[1]/div[3]/nav[1]/ul[1]/li[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]")));
	
	
	}
}
