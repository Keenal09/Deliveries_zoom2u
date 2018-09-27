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

public class GetQuote_Part3Test extends GetQuote_Scenarios {
 
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();

	  @Test (priority=1)
	  public void GQ38() throws InterruptedException, ParseException, JSONException, IOException{
		 // LaunchBrowser_inCrossBrowser.Newsession(); 
	    //GetQuote_URLHeavyFreightBidRequest("Building Materials");
			objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");
			AbletogetquoteWithSameState("Satchel, laptops", "12pm_2pm");

	  }

	  @Test (priority=6)
	  public void GQ39() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Satchel, laptops", "2pm_5pm");

	  }
	  
	  @Test (priority=11)
	  public void GQ40() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Satchel, laptops", "5pm_12am");

	  }

	  
	  @Test (priority=2)
	  public void GQ41() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Small box", "12am_8am");

	  }

	  
	  @Test (priority=7)
	  public void GQ42() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  //AbletogetquoteWithSameState("Satchel, laptops", "2pm_5pm");
		  AbletogetquoteWithSameState("Small box", "8am_12pm");
	  }

	  
	  @Test (priority=12)
	  public void GQ43() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  //AbletogetquoteWithSameState("Satchel, laptops", "2pm_5pm");
		  AbletogetquoteWithSameState("Small box", "12pm_2pm");
	  }

	  
	  @Test (priority=17)
	  public void GQ44() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Small box", "2pm_5pm");
	  }

	  
	  @Test (priority=22)
	  public void GQ45() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Small box", "5pm_12am");
	  }

	  
	  @Test (priority=3)
	  public void GQ46() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "12am_8am");

	  }
	  
	  @Test (priority=8)
	  public void GQ47() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "8am_12pm");

	  }

	  @Test (priority=13)
	  public void GQ48() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "12pm_2pm");

	  }

	  @Test (priority=18)
	  public void GQ49() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "2pm_5pm");

	  }

	  @Test (priority=23)
	  public void GQ50() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "5pm_12am");

	  }

	  @Test (priority=4)
	  public void GQ51() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Large Box", "12am_8am");

	  }

	  @Test (priority=9)
	  public void GQ52() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Large Box", "8am_12pm");

	  }

	  @Test (priority=14)
	  public void GQ53() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Large Box", "12pm_2pm");

	  }

	  @Test (priority=19)
	  public void GQ54() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Large Box", "2pm_5pm");

	  }
	  
	  @Test (priority=24)
	  public void GQ55() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Large Box", "5pm_12am");

	  }

  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "GetQuoteModule_Part2Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
