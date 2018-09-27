package Test;

import org.testng.annotations.Test;

import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class GetQuote_Part2test extends GetQuote_Scenarios {
	
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();
   
	@Test (priority = 1)
	  public void GQ() throws InterruptedException, IOException, JSONException {
		  //deliveries portal credentials
		  //VerifyAvailablemenuOptioninHamburgerandGetquotepage_GetQuote(Email, Password);
		  //LaunchBrowser_inCrossBrowser.Newsession();
		  //VerifyAvailablemenuOptioninHamburgerandGetquotepage_GetQuote("farji123@gmail.com", "123456");
		objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");
	  }
	
	@Test (priority=2)
	  public void GQ29() throws Exception{
		 // LaunchBrowser_inCrossBrowser.Newsession();
	     //InterstatePriceVerification("NSW", "VIC", "12", "Documents", "4", "Car");	 
		 //AddItemverification_HeavyFreightItems("Pallets");
		//UIEnabledVerification();
		HeavyfreightImageselection();
			  }
	 
	 /* @Test (priority=10)
	  public void GQ30() throws Exception{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	    // ETAVerifyInterstate("Documents", "05-May-2018", "5pm_12am", "NSW", "ACT", "12");  
		  //AddItemverification_HeavyFreightItems("Machinery");
		  UIEnabledVerification();
	  }
	  */
	  /*
	  @Test (priority=4)
	  public void GQ32() throws Exception{
		 // LaunchBrowser_inCrossBrowser.Newsession();
	     //InterstateRedirectVerification("NSW", "VIC", "12", "Documents", "4", "Car"); 
		  //AddItemverification_HeavyFreightItems("Vehicles");
	  }
	 */
	  @Test (priority=3)
	  public void GQ31() throws InterruptedException, ParseException, JSONException, IOException{
		 // LaunchBrowser_inCrossBrowser.Newsession();
	     //RoadInterstatePriceVerification("NSW", "VIC", "12", "Documents", "4", "Car"); 
		 // objGetQuoteeopen.GetQuotedirectlyopen();
		  AbletogetquoteWithSameState("Documents", "12am_8am");
	  }
	  
	  @Test (priority=4)
	  public void GQ32() throws InterruptedException, ParseException, JSONException, IOException{
		  //LaunchBrowser_inCrossBrowser.Newsession();
	     //ETAVerifyRoadInterstate("Documents", "05-May-2018", "5pm_12am", "NSW", "ACT", "12"); 
	     AbletogetquoteWithSameState("Documents", "8am_12pm");
	  }
	  
	  @Test (priority=5)
	  public void GQ33() throws InterruptedException, ParseException, JSONException, IOException{
		 // LaunchBrowser_inCrossBrowser.Newsession();
	    //RoadInterstateRedirectVerification("NSW", "VIC", "12", "Documents", "12"); 
		     AbletogetquoteWithSameState("Documents", "12pm_2pm");

	  }

	  @Test (priority=6)
	  public void GQ34() throws InterruptedException, ParseException, JSONException, IOException{
		  //LaunchBrowser_inCrossBrowser.Newsession();
	   // DirectDrive_PriceandETAVerify("NSW", "ACT", "12", "Documents", "5"); 
		  AbletogetquoteWithSameState("Documents", "2pm_5pm");
	  }
	  
	  @Test (priority=7)
	  public void GQ35() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession();
	    //DirectDrive_RedirectVerification("NSW","ACT", "12", "Documents", "6");
		  AbletogetquoteWithSameState("Documents", "5pm_12am");
	  }
	  
	  @Test (priority=8)
	  public void GQ36() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession();  
	   // GetQuote_URLExtraLargeBidRequest("General Van Shipments");
		  AbletogetquoteWithSameState("Satchel, laptops", "12am_8am");
	  }
	  
	  @Test (priority=9)
	  public void GQ37() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	    //GetQuote_ExtraLargedetailsVerify("General Van Shipments");
		  AbletogetquoteWithSameState("Satchel, laptops", "8am_12pm");

	  }

	/*
	  @Test (priority=19)
	  public void GQ48() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "12am_8am");

	  }

	  @Test (priority=19)
	  public void GQ48() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "12am_8am");

	  }

	  @Test (priority=19)
	  public void GQ48() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "12am_8am");

	  }

	  @Test (priority=19)
	  public void GQ48() throws InterruptedException, ParseException, JSONException, IOException{
		//  LaunchBrowser_inCrossBrowser.Newsession(); 
	   // HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AbletogetquoteWithSameState("Cakes, flowers, delicates", "12am_8am");

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
