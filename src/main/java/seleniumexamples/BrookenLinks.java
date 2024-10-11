package seleniumexamples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrookenLinks {
	@Test
	public void brokenLinks() {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> a=driver.findElements(By.tagName("a"));
		System.out.println(a.size());
		int i=0;
		for(WebElement links:a) {
			String url=links.getAttribute("href");
			System.out.println("---------------------------------------------");
			if(url==null || url.isBlank()) {
				System.out.println(url +" - is Null");
				
				continue;
				
			}
			if(url.contains("mailto")) {
				continue;
			}
			
			try {
				HttpURLConnection huc=(HttpURLConnection) (new URL(url).openConnection());
				huc.connect();
				huc.setConnectTimeout(5000);
				if(huc.getResponseCode()>=400) {
				
					System.out.println("Below link is broken link");
					System.out.println(huc.getURL()+"-is broken link");
					System.out.println("Request Method used-"+huc.getRequestMethod());
					System.out.println("ResponseCode"+huc.getResponseCode());
					System.out.println("Message-"+huc.getResponseMessage());
					
					
					
					
					i++;
				}else {
					System.out.println("Below link is not a broken link");
					System.out.println(huc.getURL()+"-is not a broken link");
					System.out.println("Request Method used-"+huc.getRequestMethod());
					System.out.println("ResponseCode"+huc.getResponseCode());
					System.out.println("Message-"+huc.getResponseMessage());
					
					
				}
			} catch (IOException e) {
				e.getMessage();
			}
			
			
			
		}
		System.out.println("no of broken links - "+i);
		
	}
}
