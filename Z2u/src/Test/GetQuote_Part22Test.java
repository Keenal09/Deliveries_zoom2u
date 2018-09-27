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

public class GetQuote_Part22Test extends GetQuote_Scenarios{
  
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();

	@Test (priority=1)
	 public void GQ139() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		  //SameStateBookNowbuttonredirect_BookingPage("12am_8am");
		objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	
		GetQuote_URLHeavyFreightBidRequest("Container");
		GetQuote_URLHeavyFreightBidRequest("Full Truck Load");
		}
		
	@Test (priority=2)
	 public void GQ140() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		  //SameStateBookNowbuttonredirect_BookingPage("12am_8am");
		HeavyFreightsubshipmentVerification("Building Materials",1);
		HeavyFreightsubshipmentVerification("General Truck Shipments",1);
		HeavyFreightsubshipmentVerification("Pallets",1);
		HeavyFreightsubshipmentVerification("Machinery",1);
		HeavyFreightsubshipmentVerification("Vehicles",1);
		HeavyFreightsubshipmentVerification("Container",1);
		HeavyFreightsubshipmentVerification("Container",2);
		HeavyFreightsubshipmentVerification("Container",3);
		HeavyFreightsubshipmentVerification("Container",4);
		HeavyFreightsubshipmentVerification("Full Truck Load",1);

			}
	
	@Test (priority=3)
	public void GQ125() throws Exception{
	
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
