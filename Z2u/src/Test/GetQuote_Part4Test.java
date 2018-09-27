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

public class GetQuote_Part4Test extends GetQuote_Scenarios {
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();
 
	  @Test (priority=1)
	  public void GQ() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");
  
	  }
	  
	  @Test (priority=2)
	  public void GQ56() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Documents", "12am_8am");
  
	  }

	  @Test (priority=3)
	  public void GQ57() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Documents", "8am_12pm");
  
	  }
	  
	  @Test (priority=4)
	  public void GQ58() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Documents", "12pm_2pm");
  
	  }
	  
	  @Test (priority=5)
	  public void GQ59() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Documents", "2pm_5pm");
  
	  }
	  
	  @Test (priority=6)
	  public void GQ60() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Documents", "5pm_12am");
  
	  }
	  
	  @Test (priority=7)
	  public void GQ61() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Satchel, laptops", "12am_8am");
  
	  }

	  
	  @Test (priority=8)
	  public void GQ62() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Satchel, laptops", "8am_12pm");
  
	  }
	  @Test (priority=9)
	  public void GQ63() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Satchel, laptops", "12pm_2pm");
  
	  }

	  @Test (priority=10)
	  public void GQ64() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Satchel, laptops", "2pm_5pm");
  
	  }

	  @Test (priority=11)
	  public void GQ65() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
			ETADeliveryTimeVerify("Satchel, laptops", "5pm_12am");
  
	  }



	  
	  



	
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "GetQuoteModule_Part4Test");

  }

  @AfterTest
  public void afterTest() {
	  
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
