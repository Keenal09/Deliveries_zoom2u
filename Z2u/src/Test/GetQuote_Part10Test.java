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

public class GetQuote_Part10Test extends GetQuote_Scenarios {
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();
	@Test (priority=1)
	  public void GQ91() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 //objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
 //SameStateBookNowbuttonredirect_BookingPage("12pm_2pm");
		 objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
		InterstatePriceVerification("NSW", "WA");
	//	InterstatePriceVerification("NSW", "SA");
		
	  }	
	@Test (priority=2)
	  public void GQ92() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	  {
		  InterstatePriceVerification("NSW", "SA");
	  
	  }
	
	
	
	
	@Test (priority=3)
	  public void GQ93() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		 //objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
//SameStateBookNowbuttonredirect_BookingPage("12pm_2pm");
		InterstatePriceVerification("VIC", "NSW");
	//	InterstatePriceVerification("VIC", "QLD");
	//	InterstatePriceVerification("VIC", "ACT");
		//InterstatePriceVerification("VIC", "WA");
		//InterstatePriceVerification("VIC", "SA");

	  }	
	@Test (priority=4)
	 public void GQ94() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("VIC", "QLD");
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
