package CommonLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Controller.LaunchBrowser_inCrossBrowser;

public class Driverwaitclass extends LaunchBrowser_inCrossBrowser {
 
	
	public static WebDriverWait Driverwait(){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait;
	}
}
