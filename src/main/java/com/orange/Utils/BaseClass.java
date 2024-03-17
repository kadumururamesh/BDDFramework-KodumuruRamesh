package com.orange.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	private WebDriver driver=null;
	private String path=System.getProperty("user.dir");
	private String s="chrome";
	
	public WebDriver getDriver() {
		try {
			driver=setDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
	
	
	private WebDriver setDriver() {
		
		if(s.equalsIgnoreCase("Chrome")) {
			
			System.getProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			try {
				driver=new ChromeDriver();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			System.out.println("Browser - Chrome");
					
			
		}else if(s.equalsIgnoreCase("IE")){
			System.out.println("Browser - IE");
			System.getProperty("webdriver.ie.driver", s);
		}else if(s.equalsIgnoreCase("EDGE")){
			
			System.getProperty("webdriver.edge.driver", path+"msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Browser - Edge");
						
		}else if(s.equalsIgnoreCase("OPERA")){
			
			System.getProperty("webdriver.opera.driver", path+"operadriver.exe");
			System.out.println("Browser - OPERA");
		
		}else {
			
			System.getProperty("webdriver.gecko.driver", path+"geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Browser - firefox");
			driver.manage().window().maximize();
			
			
		}
		
		return this.driver;
	}

}
