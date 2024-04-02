package seleniumexamples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CookieExample {
	@Test
	void cookex() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		System.out.println(driver.manage().getCookieNamed("s_vnum"));
		Set<Cookie> c=driver.manage().getCookies();
		System.out.println(c.size());
		for(Cookie e:c) {
			System.out.println("-------------------------------------------");
			
			
			System.out.println("Domain--"+e.getDomain());
			System.out.println("Expiry--"+e.getExpiry());
			System.out.println("Name--"+e.getName());
			System.out.println("Path--"+e.getPath());
			System.out.println("SameSite--"+e.getSameSite());
			System.out.println("Value--"+e.getValue());
			System.out.println("Secure--"+e.isSecure());
					
		}
		
		Thread.sleep(10000);
		driver.manage().deleteCookieNamed("csm-hit");
		Set<Cookie> c1=driver.manage().getCookies();
		System.out.println(c1.size());
		for(Cookie e1:c1) {
			System.out.println("-------------------------------------------");
			
			
			System.out.println("Domain--"+e1.getDomain());
			System.out.println("Expiry--"+e1.getExpiry());
			System.out.println("Name--"+e1.getName());
			System.out.println("Path--"+e1.getPath());
			System.out.println("SameSite--"+e1.getSameSite());
			System.out.println("Value--"+e1.getValue());
			System.out.println("Secure--"+e1.isSecure());
					
		}
		Thread.sleep(10000);
		driver.manage().deleteAllCookies();
		Set<Cookie> c11=driver.manage().getCookies();
		System.out.println("after delete all" +c11.size());
		for(Cookie e11:c11) {
			System.out.println("-------------------------------------------");
			
			
			System.out.println("Domain--"+e11.getDomain());
			System.out.println("Expiry--"+e11.getExpiry());
			System.out.println("Name--"+e11.getName());
			System.out.println("Path--"+e11.getPath());
			System.out.println("SameSite--"+e11.getSameSite());
			System.out.println("Value--"+e11.getValue());
			System.out.println("Secure--"+e11.isSecure());
			
					
		}
		Cookie name=new Cookie("csm-hit","tb:s-YHVTMZ09FR7AFYVVKVA7|1712036673193&t:1712036673992&adb:adblk_no");
		driver.manage().addCookie(name);
		Set<Cookie> c111=driver.manage().getCookies();
		System.out.println("after delete all" +c111.size());
		for(Cookie e111:c111) {
			System.out.println("-------------------------------------------");
			
			
			System.out.println("Domain--"+e111.getDomain());
			System.out.println("Expiry--"+e111.getExpiry());
			System.out.println("Name--"+e111.getName());
			System.out.println("Path--"+e111.getPath());
			System.out.println("SameSite--"+e111.getSameSite());
			System.out.println("Value--"+e111.getValue());
			System.out.println("Secure--"+e111.isSecure());
			
					
		}
		
	}

}
