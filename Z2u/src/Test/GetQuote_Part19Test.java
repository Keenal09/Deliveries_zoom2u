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

public class GetQuote_Part19Test extends GetQuote_Scenarios {
  
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();

	@Test (priority=1)
	 public void GQ126() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		 objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	

		 RoadInterstatePriceVerification("QLD", "ACT");
		}
	
	@Test (priority=2)
	 public void GQ127() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		RoadInterstatePriceVerification("ACT", "NSW");		}
	
	@Test (priority=3)
	 public void GQ128() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		RoadInterstatePriceVerification("ACT", "VIC");		}
	
	@Test (priority=4)
	 public void GQ129() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		RoadInterstatePriceVerification("ACT", "QLD");		
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
