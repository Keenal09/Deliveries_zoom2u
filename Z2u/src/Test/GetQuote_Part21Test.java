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

public class GetQuote_Part21Test extends GetQuote_Scenarios {
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();

	@Test (priority=1)
	 public void GQ134() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		 objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	

		  RoadInterstateRedirectVerification();
		}
	
	@Test (priority=2)
	 public void GQ135() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		  InterstateRedirectVerification();
		}
	
	
	@Test (priority=3)
	 public void GQ136() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		 // SameStateBookNowbuttonredirect_BookingPage("8am_12pm");
		GetQuote_URLExtraLargeBidRequest("General Van Shipments");
		GetQuote_URLExtraLargeBidRequest("Furniture");
		}
 
	@Test (priority=4)
	 public void GQ137() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		 // SameStateBookNowbuttonredirect_BookingPage("12pm_2pm");
		GetQuote_ExtraLargedetailsVerify("General Van Shipments");
		GetQuote_ExtraLargedetailsVerify("Furniture");
		}
	
	@Test (priority=5)
	 public void GQ138() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		 // SameStateBookNowbuttonredirect_BookingPage("12pm_2pm");
		GetQuote_URLHeavyFreightBidRequest("Building Materials");
		GetQuote_URLHeavyFreightBidRequest("General Truck Shipments");
		GetQuote_URLHeavyFreightBidRequest("Pallets");
		GetQuote_URLHeavyFreightBidRequest("Machinery");
		GetQuote_URLHeavyFreightBidRequest("Vehicles");
		//GetQuote_URLHeavyFreightBidRequest("Container");
		//GetQuote_URLHeavyFreightBidRequest("Full Truck Load");
		
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
