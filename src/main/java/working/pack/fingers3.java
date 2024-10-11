package working.pack;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class fingers3 {
    
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

    	
    	UiAutomator2Options options=new UiAutomator2Options();
    	options.setCapability("platfromName", "android");
    	options.setCapability("device", "1032231361111553");
    	options.setCapability("platformVersion","13.0");
    	options.setCapability("automationName","uiautomator2");
    	//options.setCapability("appPackage","io.appium.android.apis");
    	//options.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
    	
    	
    	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    	
    	//Thread.sleep(2000);	
    	//driver.findElement(AppiumBy.accessibilityId("Chrome")).click();
        // Get the size of the window
        Dimension windowSize = driver.manage().window().getSize();

        // Calculate the center point of the screen
        System.out.println(windowSize.getWidth() +" - " +windowSize.getHeight());
        int centerX = windowSize.getWidth() / 2;
        int centerY = windowSize.getHeight() / 2;
        System.out.println("Center: " + centerX + "px, " + centerY + "px");
               

        // Free up any previously added input device
        //actions.resetInputState();
        

        // Define two touch pointers (fingers)
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
        PointerInput finger3 = new PointerInput(PointerInput.Kind.TOUCH, "finger3");
       // 1080 - 2400
        //Center: 540px, 1200px
        
        // Zoom In
        Sequence zoomInSequence = new Sequence(finger1, 0)
                .addAction(finger1.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX, centerY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(50)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(), centerX, centerY + 400))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        Sequence zoomInSequence2 = new Sequence(finger2, 0)
                .addAction(finger2.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX - 200, centerY))
                .addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger2, Duration.ofMillis(50)))
                .addAction(finger2.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(), centerX-200, centerY + 400))
                .addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        
        Sequence zoomInSequence3 = new Sequence(finger3, 0)
                .addAction(finger3.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX + 200, centerY))
                .addAction(finger3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger3, Duration.ofMillis(50)))
                .addAction(finger3.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(), centerX + 200, centerY + 400))
                .addAction(finger3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        
//745,1443
        List<Sequence> list = new ArrayList<Sequence>();
        list.add(zoomInSequence);
        list.add(zoomInSequence2);
        list.add(zoomInSequence3);
        System.out.println("Initial list: "+ list);
        //actions.perform(Arrays.asList(zoomInSequence, zoomInSequence2, zoomInSequence3));
        ((RemoteWebDriver) driver).perform(list);
        System.out.println("done");
       
    }
}



