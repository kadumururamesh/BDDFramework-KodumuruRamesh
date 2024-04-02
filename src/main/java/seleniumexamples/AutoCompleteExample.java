package seleniumexamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoCompleteExample {
	
	//@Test
	void example1() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='tags']"));
		searchBox.sendKeys("r");
		String text;
		
		for(int i=0;i<=10;i++) {

			//this will select the first option
			searchBox.sendKeys(Keys.ARROW_DOWN);

			//this will get the value of first option
			text = searchBox.getAttribute("value");
			System.out.println(text);

			//this will compare the text we want in suggestion box
			if (text.equals("JavaScript")) {
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
		}
		
		
		//driver.quit();
	}
	
		
	//@Test
	void example2() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("r");
		String text;
		
		for(int i=0;i<=10;i++) {
		
			//this will select the first option
			searchBox.sendKeys(Keys.ARROW_DOWN);

			//this will get the value of first option
			text = searchBox.getAttribute("value");
			System.out.println(text);

			//this will compare the text we want in suggestion box
			if (text.equals("realme123")) {
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
		}
		
		
		//driver.quit();
	}
	
	@Test
		void example3() throws InterruptedException {
			System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
			
			WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
			searchBox.sendKeys("r");
			String text;
			
			List<WebElement> ele=driver.findElements(By.xpath("//*[@class='col-12-12 _1MRYA1 _38UFBk']"));
			System.out.println(ele.size());
			
			for(int i=0;i<=10;i++) {
			
				//this will select the first option
				searchBox.sendKeys(Keys.ARROW_DOWN);

				//this will get the value of first option
				text = searchBox.getAttribute("value");
				System.out.println(text);

				//this will compare the text we want in suggestion box
				if (text.equals("realme")) {
					searchBox.sendKeys(Keys.ENTER);
					break;
				}
				Thread.sleep(3000);
			}
			
			
			//driver.quit();
		}
		
	

}
