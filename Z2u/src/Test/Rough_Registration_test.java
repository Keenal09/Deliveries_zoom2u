package Test;

import org.testng.annotations.Test;

import Controller.LaunchBrowser_inCrossBrowser;
import Controller.RegistrationScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Rough_Registration_test extends RegistrationScenarios{
	@Test (priority=1)
	  public void R1() throws InterruptedException {
		  
		  RedirecttoRegisterpage();
	  }
	
	@Test (priority=2)
	  public void R2() throws InterruptedException{
		  
		  RegisterwithoutCompanyName("Milind","kale",1234567890,"123456","123456");
		  
	  }
	
	
	
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "RegistrationModule_Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  LaunchBrowser_inCrossBrowser.driverclose();
  }

}
