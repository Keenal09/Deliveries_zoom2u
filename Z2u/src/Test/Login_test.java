package Test;

import org.testng.annotations.Test;

import CommonLibraries.DriverClass;
import Controller.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Login_test extends LaunchBrowser_inCrossBrowser {
   LaunchBrowser_inCrossBrowser obj1=new LaunchBrowser_inCrossBrowser();
   static Loginscenarios obj2=new Loginscenarios();
   
   @Test (priority=2)
  public static void L1() throws InterruptedException{
    
	 obj2.loginwithvalidcredentials("ffr1@gmail.com","123456");
	
	}
	
	@Test (priority=3)
	public static void L4() throws InterruptedException{
		obj2.loginwithinvalidcredentials("miiind@gmail.com", "1234567");
	}
	
	@Test (priority=4)
	public static void L5() throws InterruptedException{
		obj2.loginwithoutcredentials();
	}
	
	@Test (priority=5)
	public static void L2() throws InterruptedException{
		
		obj2.loginwithinvalidpassword("milind.moodi_0099@gmail.com", "123456789");
	}
	
	@Test (priority=6)
	public static void L3() throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("Login with invalid username and valid pwd 3rd test case starting.........");
		obj2.loginwithinvalidcredentials("milindff@gmail.com", "123456");
		System.out.println("Login with invalid username and valid pwd 3rd test case completed");
		System.out.println("...........................................................................................................");
	}
	
	@Test (priority=7)
	public static void L6() throws InterruptedException{
		obj2.MaskedPwdfield();
		
	}
	
	@Test (priority=8)
    public static void L7() throws InterruptedException{
		obj2.redirectTosameloginurlOnRefresh();
	}
	
	@Test (priority=1)
	public static void L8() throws InterruptedException 
	{
		obj2.focusonloginsection();
	}
	
	@Test (priority=9)
	public static void L9() throws InterruptedException 
	{
		obj2.verifydisableaccounttext("testdisable@gmail.com", "123456");
	}
	
	
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	 LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "LoginModule_Test");
	 //LaunchBrowser_inCrossBrowser.OpenBrowser("Firefox", "55*64", "Windows 7 64-bit", "LoginModule_Test");
	 //LaunchBrowser_inCrossBrowser.OpenBrowser("Internet Explorer", "11", "Windows 7 64-bit", "LoginModule_Test");
	  
	  
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  
	  LaunchBrowser_inCrossBrowser.driverclose();
  }


 
}
