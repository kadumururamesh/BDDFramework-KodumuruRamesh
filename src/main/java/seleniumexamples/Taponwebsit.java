package seleniumexamples;

import java.time.Duration;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class Taponwebsit {
	
	@Test
	public void tap() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://peaknfilm.com/project/tableaux/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(10000);
		WebElement element=driver.findElement(By.xpath("//img[@class='no-lazy'][1]"));
		int height=element.getRect().getHeight();
		int width=element.getRect().getWidth();
		int x=element.getRect().getX();
		int y=element.getRect().getY();
		System.out.println(width +" - "+height);
		System.out.println(width/2 +" - "+height/2);
		
		Point centerOfElement=new Point((int)(x+width/2),(int)(y+height/2));
		
		
		PointerInput finger1=new PointerInput(Kind.TOUCH, "finger1");
				
		Sequence seq=new Sequence(finger1, 0);
		seq.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), centerOfElement));
		seq.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		seq.addAction(new Pause(finger1, Duration.ofMillis(200)));
		seq.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		/*
		Actions act=new Actions(driver);
		Collection<Sequence> ss=act.getSequences();
		((RemoteWebDriver) driver).perform(act.getSequences());
		*/
		((RemoteWebDriver) driver).perform(Collections.singleton(seq));
		
		
	}
}
