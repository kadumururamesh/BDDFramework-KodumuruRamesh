package seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertsExample {
	
	@Test
	public void alertex() throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("https://www.flipkart.com/");
		
		//Modal dialogs
		
		driver.navigate().to("https://testpages.eviltester.com/styled/alerts/fake-alert-test.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("fakealert")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dialog-ok")).click();
		
		
		
		
		/*
		//Confirmation/information Alerts-----------
		driver.get("https://testpages.eviltester.com/styled/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alerttest")).click();
		
		driver.findElement(By.id("alertexamples")).click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(2000);
		alert.dismiss();
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);
		alert.sendKeys(Keys.chord(Keys.CLEAR, "ramesh"));
		alert.sendKeys("ramesh");
		Thread.sleep(2000);
		alert.accept();
		/*
		alert.accept();
		alert.dismiss();
		alert.sendKeys(null);
		alert.getText();
		*/
		
		/*
		 //Auth-popups----------------------------------
		driver.manage().window().maximize();
		
		String username="authorized";
		String password="password001";
		String ipaddress="testpages.eviltester.com/styled/auth/basic-auth-results.html";
		char c='@';
		
		String address="https://".concat(username).concat(":").concat(password).concat("@").concat(ipaddress);
		System.out.println(address);
		//driver.navigate().to(ipaddress);
		
		driver.navigate().to("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-results.html");
			
		*/
		
		//push notifications
			
	}
	
	//@Test
		public void selex() {
			System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.modlily.com");
			driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='accept_agree_accept']"))).click();
				System.out.println("user able to click on the Accept Button");
			}catch(Exception e){
				System.out.println("Accept Button not displayed");
				
			}
			
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onesignal-slidedown-cancel-button']"))).click();
				System.out.println("user able to click on the later Button");
			}catch(Exception e) {
				System.out.println("later Button not displayed");
			}
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='KEEP BROWSING']"))).click();
				System.out.println("user able to click on the 'KEEP BROWSING' Button");
			}catch(Exception e) {
				System.out.println("'KEEP BROWSING' Button not displayed");
			}
				
		}
		
		@Test
		public void selex1() {
			System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www2.hm.com/");
			driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onetrust-accept-btn-handler']"))).click();
				System.out.println("user able to click on the accept all button");
			}catch(Exception e) {
				System.out.println("accept all button not displayed");
			}
			
		}

}
