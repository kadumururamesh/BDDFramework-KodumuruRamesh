package seleniumexamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Headlessdriver {
	
	//@Test
	void chromeheadless() {
		System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"chromedriver.exe");
		//
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		///
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		System.out.println("---------------------------------------------");
		for(WebElement a:ele) {
			System.out.println(a.getAttribute("href"));
		}
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		Iterator<WebElement> e=ele.iterator();
		while(e.hasNext()) {
			System.out.println(e.next().getAttribute("href"));
		}
		driver.quit();
		
	}
	//@Test
	void firefoxheadless() {
		System.getProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"geckodriver.exe");
		//
		
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
		
		
		///
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		System.out.println("---------------------------------------------");
		for(WebElement a:ele) {
			System.out.println(a.getAttribute("href"));
		}
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		Iterator<WebElement> e=ele.iterator();
		while(e.hasNext()) {
			System.out.println(e.next().getAttribute("href"));
		}
		driver.quit();
		
	}
	//@Test
	void htmlheadless() {
		WebDriver driver=new HtmlUnitDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		System.out.println("---------------------------------------------");
		for(WebElement a:ele) {
			System.out.println(a.getAttribute("href"));
		}
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		Iterator<WebElement> e=ele.iterator();
		while(e.hasNext()) {
			System.out.println(e.next().getAttribute("href"));
		}
		driver.quit();
		
	}
	
	@Test
	void newchromefortesting() {
		System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.setBinary("demo-orangehrmlive//src//main//resources//chromefortesting//chrome-win64//chrome.exe");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		System.out.println("---------------------------------------------");
		for(WebElement a:ele) {
			System.out.println(a.getAttribute("href"));
		}
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		Iterator<WebElement> e=ele.iterator();
		while(e.hasNext()) {
			System.out.println(e.next().getAttribute("href"));
		}
		driver.quit();
		
	}

}
