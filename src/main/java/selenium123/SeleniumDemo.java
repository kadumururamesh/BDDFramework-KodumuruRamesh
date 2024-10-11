package selenium123;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;



public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException{
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir"+"chromedriver.exe"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.navigate().to("https://www.lambdatest.com/selenium-playground/");
		driver.findElement(By.xpath("//a[normalize-space()='Broken Image']")).click();
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		int count=0;
		for(WebElement e:image) {
			System.out.println(e.getAttribute("src"));
			String url=e.getAttribute("src");
			if(url==null || url.isBlank()) {
				System.out.println(url +"is blank");
				break;
			}
			HttpURLConnection huc=(HttpURLConnection) (new URL(url).openConnection());
			huc.setConnectTimeout(5000);
			huc.connect();
			System.out.println("------------------");
			if(huc.getResponseCode()>=400) {
				
				System.out.println("Broken image" +huc.getURL());
				System.out.println(huc.getResponseMessage());
				System.out.println(huc.getResponseCode());
				
				count=count+1;
			}else {
				System.out.println("Not Broken image" +huc.getURL());
				System.out.println(huc.getResponseMessage());
				System.out.println(huc.getResponseCode());
			}
			
		}
		System.out.println("no of broken"+count);
		/*
		WebElement ele=driver.findElement(By.xpath("//label[normalize-space()='Password']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(ele)).sendKeys("ramesh");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(ele)).sendKeys("ram");
		*/
		
		
	}

}
