package Test;

import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;
import bsh.ParseException;

public class GetQuote_Part9Test extends GetQuote_Scenarios {
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();
	@Test (priority=1)
	  public void GQ87() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
       SamePricestateVerification("After 5pm");
       
	  }	
	
	@Test (priority=2)
	  public void GQ88() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 //objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
     //SameStateBookNowbuttonredirect_BookingPage("12pm_2pm");
		InterstatePriceVerification("NSW", "VIC");
	  }	
	

	@Test (priority=3)
	  public void GQ89() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 //objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
     //SameStateBookNowbuttonredirect_BookingPage("12pm_2pm");
		InterstatePriceVerification("NSW", "QLD");
	  }	
	
	@Test (priority=4)
	  public void GQ90() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 //objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
   //SameStateBookNowbuttonredirect_BookingPage("12pm_2pm");
		InterstatePriceVerification("NSW", "ACT");
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
