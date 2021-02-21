package tests;

import java.net.URL;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	
	AppiumDriver<MobileElement> driver;
	public static final String appHomePage = "com.lalamove.techchallenge:id/action_bar_root";
	public static final String SwipeElementReference = "//*[@class='android.view.ViewGroup'][5]";
	public static final String ElementDescription= "//*[@resource-id='com.lalamove.techchallenge:id/textView_description']";
	public String topElementDescription;
	
	public void LaunchApp(){
		
		DesiredCapabilities capabilities = new DesiredCapabilities();		
		try{
			capabilities.setCapability("platformVersion", "10"); 
			capabilities.setCapability("deviceName","emulator-5554");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("appPackage", "com.lalamove.techchallenge");
			capabilities.setCapability("appActivity",".app.MainActivity");
			capabilities.setCapability("noReset","true");
			capabilities.setCapability("app", "C:\\Users\\Vnameit\\eclipse-workspace\\mobileAutomation\\src\\test\\resources\\appSource\\app-tech-android-challenge-20180918.apk");
			driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public void swipeDown(int pixelsToSwipe) {
		try {
			Point value = null;
			value = driver.findElement(By.xpath(SwipeElementReference)).getLocation();
			int x = value.x;
			int y = value.y;
			int y1 = value.y+pixelsToSwipe;
			swipe(x,y1,x,y);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void swipeUp(int pixelsToSwipe) {
		try {
			Point value = null;
			value = driver.findElement(By.xpath(SwipeElementReference)).getLocation();
			int x = value.x;
			int y = value.y;
			int y1 = value.y+pixelsToSwipe;
			swipe(x, y, x, y1);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void swipe(int fromX,int fromY,int toX,int toY) {	 
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(fromX,fromY))
		.waitAction(new WaitOptions().withDuration(Duration.ofMillis(3000)))
		.moveTo(PointOption.point(toX, toY))
		.release()
		.perform();
	}
	
	public void verifyHomePage() { 
		boolean elempresent = driver.findElement(By.id(appHomePage)).isDisplayed();
		Assert.assertTrue(elempresent);
	    topElementDescription = driver.findElement(By.xpath(ElementDescription)).getText();
	}
	
	public void verifyDeliveryDescriptionAfterSwipeDown() { 
		String elementDescriptionAfterSwipeDown = driver.findElement(By.xpath(ElementDescription)).getText();
		Assert.assertNotEquals(topElementDescription,elementDescriptionAfterSwipeDown);
	}
	
	public void verifyDeliveryDescriptionAfterSwipeUp() { 
		String elementDescriptionAfterSwipeUp = driver.findElement(By.xpath(ElementDescription)).getText();
		Assert.assertEquals(topElementDescription,elementDescriptionAfterSwipeUp);
	}

}
