package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils {
static Robot robot;
	
	public static boolean isElementPresentCSSSelector(String cssSelector, WebDriver driver) {
		boolean present;

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		present = driver.findElements( By.cssSelector(cssSelector) ).size() != 0;
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		return present;
	}
	
	public static void keyEnter() throws AWTException{
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
		
	
}
