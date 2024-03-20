package working.pack;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orange.Utils.LoadObjectRepoWeb;

public class Sample {
	
	
	
	   
	   

		static WebDriver driver=null;
		
		//final static Logger log=Logger.getLogger(Sample.class);
		
		@BeforeTest 
		  static void launchChrome() { 
			LoadObjectRepoWeb.getLocators();
			
		System.getProperty("weddriver.chrome.driver",System.getProperty("user.dir")+"chromedriver.exe");
		  driver=new ChromeDriver(); 
		 System.out.println("Able to lanch the broswer"); //this.driver=driver;
		  }
		  
		 
		  
		  
		  
		  @Test
		 
		  static void test1() throws Throwable {
			  By username=LoadObjectRepoWeb.references.get("LoginPage Username_EditBox");
			   By password=LoadObjectRepoWeb.references.get("LoginPage Password_EditBox");
			   By login=LoadObjectRepoWeb.references.get("LoginPage Login_Button");
		  //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  driver.findElement(username).sendKeys("Admin");
		  driver.findElement(password).sendKeys("admin123"); 
		  driver.findElement(login).click();
		  //log.info(driver.getClass()); 
		  if (driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed())
		  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		  
		  Actions act=new Actions(driver);
		  act.clickAndHold(driver.findElement(By.xpath( "//p[@class='oxd-userdropdown-name']"))).moveToElement(driver.findElement(By.
		  xpath("//a[@href='/web/index.php/help/support']"))).click().build().perform()
		  ;
		  
		  //driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin"); //------------------------------------
		  
		  
		   }
		 
		

	

}
