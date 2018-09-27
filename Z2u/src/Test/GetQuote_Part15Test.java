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

public class GetQuote_Part15Test extends GetQuote_Scenarios {
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();

	@Test (priority=1)
	 public void GQ110() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		 objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	

		InterstatePriceVerification("SA", "QLD");	
		}
	
	@Test (priority=2)
	 public void GQ111() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("SA", "ACT");	
		}
	
	@Test (priority=3)
	 public void GQ112() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("SA", "WA");	
		}
	
	@Test (priority=4)
	 public void GQ113() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("WA", "NSW");	
		}
	/*
	@Test (priority=5)
	 public void GQ113() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("WA", "VIC");	
		}
	
	@Test (priority=6)
	 public void GQ114() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("WA", "QLD");	
		}
	*/
  @BeforeTest
  public void beforeTest() throws Exception {
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "GetQuoteModule_Part6Test");

  }

  @AfterTest
  public void afterTest() {
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
