package Test;

import org.testng.annotations.Test;

import Controller.ForgotPwd_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ForgotPwd_test extends ForgotPwd_Scenarios {
	
  @Test (priority=1)
  public void FP1() {
	  
	  RedirecttoForgotPwdURL();
  }
  
  @Test (priority=2)
  public void FP2() throws InterruptedException{
	  VerifyResetPwdMessagewith_RegisteredEmail("testcustomerstaging@gmail.com");
  }
  
  @Test (priority=3)
  public void FP3(){
	  
	  Loginherebtn_ForgotPwd();
  }
  
  @Test (priority=4)
  public void FP4() throws InterruptedException{
	  
	  InvalidEmail_VerifyMessage("dfddd@gmaf.com");
  }
  
  @Test (priority=5)
  public void FP5(){
	  
	  Cancelbtnworking_ForgotPwd();
  }
  
  @Test (priority=6)
  public void FP6() throws InterruptedException{
	  WithoutEmailVerifyMessage_ForgotPwd("sfsfdsf");
  }
  
  @Test (priority=7)
  public void FP7(){
	  
	  ForgotYourPasswordlinkTextVerify();
  }
  
  @Test (priority=8)
  public void FP8() throws InterruptedException{
	  
	  AvailableTextOn_ForgotPwd();
  }
  
  @Test (priority=9)
  public void FP9() throws InterruptedException{
	  
	  VerifyZoom2uImageandredirection_ForgotPwd();
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit","ForgotPassword_Test");
		 //LaunchBrowser_inCrossBrowser.OpenBrowser("Firefox", "56*64", "Windows 8.1","ForgotPassword_Test");
		 //LaunchBrowser_inCro ssBrowser.OpenBrowser("Internet Explorer", "11", "Windows 7 64-bit","ForgotPassword_Test");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
