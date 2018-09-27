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

public class GetQuote_Part6Test extends GetQuote_Scenarios{
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();
	
	@Test (priority=1)
	  public void GQ75() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		   objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");
			ETADeliveryTimeVerify("Cakes, flowers, delicates", "5pm_12am");

	  }
	
	@Test (priority=2)
	  public void GQ76() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		   
			ETADeliveryTimeVerify("Large Box", "12am_8am");

	  }
	
	@Test (priority=3)
	  public void GQ77() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Large Box", "8am_12pm");

	  }

	
	@Test (priority=4)
	  public void GQ78() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Large Box", "12pm_2pm");

	  }

	
	@Test (priority=5)
	  public void GQ79() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Large Box", "2pm_5pm");

	  }
	
	@Test (priority=6)
	  public void GQ80() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Large Box", "5pm_12am");

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
