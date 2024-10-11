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

public class Zoominout {
    
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

    	
    	UiAutomator2Options options=new UiAutomator2Options();
    	options.setCapability("platfromName", "android");
    	options.setCapability("device", "device12");
    	options.setCapability("platformVersion","12.0");
    	options.setCapability("automationName","uiautomator2");
    	options.setCapability("appPackage", "com.google.android.apps.maps");
    	options.setCapability("appActivity", "com.google.android.maps.MapsActivity");
    	options.setCapability("intentAction", "android.intent.action.VIEW");
        //caps.setCapability("optionalIntentArguments", "-d geo:46.457398,-119.407305");
    	options.setCapability("optionalIntentArguments", "-d geo:12.9719,77.5937");
    	
    	
    	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    	
    	
    	Thread.sleep(20000);	
    	//driver.findElement(AppiumBy.accessibilityId("Chrome")).click();
        // Get the size of the window
        Dimension windowSize = driver.manage().window().getSize();
        
        // Calculate the center point of the screen
        int centerX = windowSize.getWidth() / 2;
        int centerY = windowSize.getHeight() / 2;
        System.out.println("Center: " + centerX + "px, " + centerY + "px");
        // Create an instance of Actions class
        

        // Free up any previously added input device
        //actions.resetInputState();
        

        // Define two touch pointers (fingers)
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
        
        
        // Zoom In
        Sequence zoomInSequence = new Sequence(finger1, 0)
                .addAction(finger1.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX - 100, centerY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(50)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(), centerX - 500, centerY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        Sequence zoomInSequence2 = new Sequence(finger2, 0)
                .addAction(finger2.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX + 100, centerY))
                .addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger2, Duration.ofMillis(50)))
                .addAction(finger2.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(), centerX + 500, centerY))
                .addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        List<Sequence> list = new ArrayList<Sequence>();
        list.add(zoomInSequence);
        list.add(zoomInSequence2);
        System.out.println("Initial list: "+ list);
        // actions.perform(Arrays.asList(zoomInSequence, zoomInSequence2));
        ((RemoteWebDriver) driver).perform(list);
        //driver..performMultiTouchAction(zoomInSequence, zoomInSequence2)
        System.out.println("hello ramesh");
        Thread.sleep(5000);

        // Zoom Out
        Sequence zoomOutSequence = new Sequence(finger1, 0)
                .addAction(finger1.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX - 500, centerY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(50)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(), centerX - 100, centerY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        Sequence zoomOutSequence2 = new Sequence(finger2, 0)
                .addAction(finger2.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX + 500, centerY))
                .addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger2, Duration.ofMillis(50)))
                .addAction(finger2.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(), centerX + 100, centerY))
                .addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        List<Sequence> list1 = new ArrayList<Sequence>();
        list1.add(zoomOutSequence);
        list1.add(zoomOutSequence2);
        System.out.println("Initial list1: "+ list1);
        
        ((RemoteWebDriver) driver).perform(list1);
    }
}


