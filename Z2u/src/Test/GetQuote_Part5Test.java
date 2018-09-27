package Test;

import org.testng.annotations.Test;

import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class GetQuote_Part5Test extends GetQuote_Scenarios {
	
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();
	@Test (priority=1)
	  public void GQ66() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");
			ETADeliveryTimeVerify("Small box", "12am_8am");

	  }
	
	@Test (priority=2)
	  public void GQ67() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Small box", "8am_12pm");

	  }

	
	@Test (priority=3)
	  public void GQ68() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Small box", "12pm_2pm");

	  }

	
	@Test (priority=4)
	  public void GQ69() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Small box", "2pm_5pm");

	  }
	
	@Test (priority=5)
	  public void GQ70() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Small box", "5pm_12am");

	  }
	
	@Test (priority=6)
	  public void GQ71() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Cakes, flowers, delicates", "12am_8am");

	  }
	
	@Test (priority=7)
	  public void GQ72() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Cakes, flowers, delicates", "8am_12pm");

	  }

	
	@Test (priority=8)
	  public void GQ73() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Cakes, flowers, delicates", "12pm_2pm");

	  }

	
	@Test (priority=9)
	  public void GQ74() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Cakes, flowers, delicates", "2pm_5pm");

	  }
	
	
/*
	
	@Test (priority=10)
	  public void GQ78() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Cakes, flowers, delicates", "5pm_12am");

	  }

*/
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "GetQuoteModule_Part2Test");

  }

  @AfterTest
  public void afterTest() {
	  
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
