package Test;

import org.testng.annotations.Test;

import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;
import bsh.ParseException;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class GetQuote_Part8Test extends GetQuote_Scenarios {
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();
	@Test (priority=1)
	  public void GQ84() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
         SamePricestateVerification("2pm_3pm");
	  }
	
	@Test (priority=2)
	  public void GQ85() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 //objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
       SamePricestateVerification("5pm_12am");
	  }
	
	@Test (priority=3)
	  public void GQ86() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 //objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
     SamePricestateVerification("After 3pm");
	  }
	
	
	
  @BeforeTest
  public void beforeTest() throws Exception {
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "GetQuoteModule_Part6Test");

  }

  @AfterTest
  public void afterTest() {
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
