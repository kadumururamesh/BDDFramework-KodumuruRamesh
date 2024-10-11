package working.pack;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Edition046_W3C_Keys {

    //private String APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.8.0/TheApp-v1.8.0.apk";
    private String APP = "C:\\Users\\SWETHARAMESH\\Downloads\\TheApp-v1.8.0.apk";
    private By loginScreen = AppiumBy.accessibilityId("Login Screen");
    private By username = AppiumBy.accessibilityId("username");

    private AppiumDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "device12");
        caps.setCapability("automationName", "UiAutomator2");

        caps.setCapability("app", APP);
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterTest
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ign) {}
    }

    @Test
    public void testSendKeysAction() {
        wait.until(ExpectedConditions.presenceOfElementLocated(loginScreen)).click();
        WebElement usernameField = driver.findElement(username);
        usernameField.click();
        Actions a = new Actions(driver);
        a.sendKeys("foo");
        a.perform();
        Assert.assertEquals("foo", usernameField.getText());
    }

    @Test
    public void testLowLevelKeys() {
        wait.until(ExpectedConditions.presenceOfElementLocated(loginScreen)).click();
        WebElement usernameField = driver.findElement(username);
        usernameField.click();

        KeyInput keyboard = new KeyInput("keyboard");
        Sequence sendKeys = new Sequence(keyboard, 0);

        sendKeys.addAction(keyboard.createKeyDown(Keys.SHIFT.getCodePoint()));
        sendKeys.addAction(keyboard.createKeyDown("f".codePointAt(0)));
        sendKeys.addAction(keyboard.createKeyUp("f".codePointAt(0)));
        sendKeys.addAction(keyboard.createKeyUp(Keys.SHIFT.getCodePoint()));

        sendKeys.addAction(keyboard.createKeyDown("o".codePointAt(0)));
        sendKeys.addAction(keyboard.createKeyUp("o".codePointAt(0)));

        sendKeys.addAction(keyboard.createKeyDown("o".codePointAt(0)));
        sendKeys.addAction(keyboard.createKeyUp("o".codePointAt(0)));

        driver.perform(Arrays.asList(sendKeys));

        Assert.assertEquals("Foo", usernameField.getText());
    }

}
