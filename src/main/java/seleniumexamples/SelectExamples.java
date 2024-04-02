package seleniumexamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectExamples {
	@Test
	public void sel1() throws Throwable {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		
		WebElement ele=driver.findElement(By.xpath("//select[@id='first']"));
		Select select=new Select(ele);
		List<WebElement> a=select.getOptions();
		System.out.println(select.isMultiple());
		Thread.sleep(2000);
		for(WebElement e:a) {
			System.out.println(e.getText());
		}
		
		Iterator<WebElement> itr=a.iterator();
		Thread.sleep(2000);
		while(itr.hasNext()) {;
		System.out.println(itr.next().getText());
		}
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("Yahoo");
		Thread.sleep(2000);
		select.selectByVisibleText("Iphone");
		
	}
	
	
	
	
	
	//button[@id='onetrust-accept-btn-handler']

}
