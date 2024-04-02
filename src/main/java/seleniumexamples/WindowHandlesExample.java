package seleniumexamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class WindowHandlesExample  {
	@Test
	public void win() throws InterruptedException {
		int i=1;
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HashMap<String,String> noofwins=new HashMap<>();
		String parentwinddowhandle=driver.getWindowHandle();
		noofwins.put("parentwinddowhandle",parentwinddowhandle);
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.xpath(" //a[contains(text(),'Blogger')]")).click();
		Set<String> wins=driver.getWindowHandles();
		Iterator<String> itr=wins.iterator();
		Thread.sleep(5000);
		while(itr.hasNext()) {
			String childhandle=itr.next();
			if(parentwinddowhandle.equalsIgnoreCase(childhandle)){
				System.out.println("it is parent handle");
			}else {
				noofwins.put("ChildHandle"+i, childhandle);
				
				i++;
			}
		}
		System.out.println(i +" - "+noofwins);	
		
		String window1=driver.switchTo().window(noofwins.get("ChildHandle1")).getTitle();
		String window2=driver.switchTo().window(noofwins.get("ChildHandle2")).getTitle();
		System.out.println(window1);
		System.out.println(window2);
		
		driver.switchTo().window(noofwins.get("ChildHandle1"));
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(5000);
		driver.switchTo().window(parentwinddowhandle);
		Thread.sleep(5000);
		driver.findElement(By.xpath(" //input[@name='q']")).sendKeys("ramesh");
		driver.switchTo().window(noofwins.get("ChildHandle2"));
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
		System.out.println(x);
		driver.switchTo().window(parentwinddowhandle);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']")).sendKeys("im back");
		///
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		///
		
		//driver.quit();
		
	}

}
