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

public class GetQuote_Part16Test extends GetQuote_Scenarios {
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();
	@Test (priority=1)
	 public void GQ113() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{   
		objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");
		InterstatePriceVerification("WA", "VIC");	
		}
	
	@Test (priority=2)
	 public void GQ114() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("WA", "QLD");	
		}

	@Test (priority=3)
	 public void GQ115() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("WA", "ACT");	
		}
	
	@Test (priority=4)
	 public void GQ116() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		InterstatePriceVerification("WA", "SA");	
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
