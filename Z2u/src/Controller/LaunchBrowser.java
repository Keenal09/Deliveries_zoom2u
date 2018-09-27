package Controller;

import org.openqa.selenium.chrome.ChromeDriver;

import CommonLibraries.DriverClass;
import CommonLibraries.Login;

public class LaunchBrowser extends DriverClass {
	
	Login obj1=new Login();


	public void launchbrowser() throws InterruptedException
	{
		
		 System.out.println("launching chrome browser");
		   System.setProperty("webdriver.chrome.driver",obj1.driverpath() + "/chromedriver.exe");
		   driver=new ChromeDriver();
		   Thread.sleep(5000);
		   
		
	}
}
