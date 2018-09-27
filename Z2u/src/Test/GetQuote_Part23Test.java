package Test;

import org.testng.annotations.Test;

import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class GetQuote_Part23Test extends GetQuote_Scenarios {
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();

  @Test (priority=1)
  public void GQ141() throws IOException, JSONException, InterruptedException {
	  
	  objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");
	  SameStateBookNowbuttonredirect_BookingPage("12am_8am");
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
