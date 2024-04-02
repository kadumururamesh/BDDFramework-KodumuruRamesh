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
			//System.out.println(url);
			System.out.println("---------------------------------------------");
			if(url==null || url.isBlank()) {
				//System.out.println(url +" - is Null");
				
				continue;
				
			}
			
			try {
				HttpURLConnection huc=(HttpURLConnection) (new URL(url).openConnection());
				huc.connect();
				huc.setConnectTimeout(5000);
				if(huc.getResponseCode()>=400) {
					System.out.println(url +"-is broken");
					i++;
				}else {
					System.out.println(url +"-is not broken");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			
			
			
		}
		System.out.println("no of broken links - "+i);
		
	}
}
