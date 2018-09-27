package Test;

import org.testng.annotations.Test;

import Controller.LaunchBrowser_inCrossBrowser;
import Controller.RegistrationScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Registration_test extends RegistrationScenarios{
  @Test (priority=1)
  public void R1() throws InterruptedException {
	  
	  RedirecttoRegisterpage();
  }
  
  @Test (priority=2)
  public void R2() throws InterruptedException{
	  
	  RegisterwithoutCompanyName("Test","Customer1",1234567890,"123456","123456");
	  
  }
  
  @Test (priority=3)
  public void R3() throws InterruptedException{
	  
	  RegistrationFailedwithoutFields();
  }
  
  @Test (priority=4)
  public void R4() throws InterruptedException {
	  
	  AlreadyRegisteredValidationcheck("Milind", "Kale", 1234567890, "ffr1@gmail.com", "1234560", "1234560");
  }
  
  @Test (priority=5)
  public void R5() throws InterruptedException{
	  
	  PwdConfirmPwdMissmatchValid("Test", "Customer1", 1234567890, "Monlia4eeenn6e3k@gmail.com", "123456", "1234567");
  }
  
  @Test (priority=6)
  public void R6() throws InterruptedException{
	  OnClickloginhere();
  }
  
  @Test (priority=7)
  public void R7() throws InterruptedException {
	  RedirecttoRegisterpage();
	  Placeholderverify();
  }

  @Test (priority=8)
  public void R8() throws InterruptedException{
	  
	  TermsandConditionslink();
  }
  
  @Test (priority=9)
  public void R9() throws InterruptedException{
	  
	  VerifyProfilewithCompanynameRegistered("Test","Customer","Zoom2u",1234567890,"123456","123456");
	
  }
  
   
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	      LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "RegistrationModule_Test");
		 //LaunchBrowser_inCrossBrowser.OpenBrowser("Firefox", "56*64", "Windows 8.1", "RegistrationModule_Test");
		 //LaunchBrowser_inCro ssBrowser.OpenBrowser("Internet Explorer", "11", "Windows 7 64-bit", "RegistrationModule_Test");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(10000);
	  LaunchBrowser_inCrossBrowser.driverclose();
  }

}
