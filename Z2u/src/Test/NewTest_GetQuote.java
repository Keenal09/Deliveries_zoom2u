package Test;

import org.testng.annotations.Test;

import Controller.ETAInterstateTime;
import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class NewTest_GetQuote extends GetQuote_Scenarios {
	
	 @Test (priority = 1)
	  public void C1() throws InterruptedException, IOException, JSONException {
		  
		  VerifyAvailablemenuOptioninHamburgerandGetquotepage_GetQuote("farji123@gmail.com", "123456");
	  }
	  
	  
	  @Test (priority = 2)
	  public void C2() throws Exception{
    	  //ETAInterstateTime objETAInterState = new ETAInterstateTime();

		  //AbletogetquoteWithSameState("Cakes, flowers, delicates","12-Jan-2018", "5pm_12am");
		    //SamePricestateVerification("Satchel, laptops", "Bike", "2", "After 5pm");
		  //SameStateBookNowbuttonredirect_BookingPage("Satchel, laptops", "11", "After 5pm");
		  //GetQuote_ExtraLargedetailsVerify("General Van Shipments");
		  //InterstatePriceVerification("QLD","WA","2", "Small Box", "1", "Car");
		  //RoadInterstatePriceVerification("VIC","ACT", "12", "Large Box", "3", "Van");
		  //ETAVerifyInterstate("Satchel, laptops", "14-Feb-2018", "5pm_12am", "NSW", "WA","12");
		  //ETAVerifyRoadInterstate("Satchel, laptops", "20-Feb-2018", "After 12pm", "NSW", "VIC","12");
		  //HeavyFreightsubshipmentVerification("Container", 3);
		  //GetQuote_URLHeavyFreightBidRequest("Building Materials");
		  //InterstateRedirectVerification("NSW", "SA", "12", "Documents", "6", "Bike");
		  //RoadInterstateRedirectVerification("NSW", "ACT", "12", "Documents", "6");
		  //DirectDrive_PriceandETAVerify("NSW", "ACT", "12", "Documents", "6");
		  //DirectDrive_RedirectVerification("ACT", "NSW", "12", "Documents", "12");
		  //GetQuote_ValidationTextVerify_ExceptLargeitems();
		  //Placeholder_GetquoteLargeItems("Full Truck Load");
		  //InterstateRedirectVerification("NSW", "ACT", "12", "Documents", "4", "Bike");
		  //ETADeliveryTimeVerify("Documents", "20-Feb-2018", "5pm_12am");
		  //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");
		  //InterstateRedirectVerification("NSW", "ACT", "12", "Documents", "4", "Car"); 
		  //ETAVerifyInterstate("Documents", "20-Feb-2018", "5pm_12am", "NSW", "ACT", "12");
		  //InterstatePriceVerification("NSW", "VIC", "12", "Documents", "4", "Car");
		  //RoadInterstatePriceVerification("NSW", "VIC", "12", "Documents", "4", "Car");
		  //ETAVerifyRoadInterstate("Documents", "19-Feb-2018", "5pm_12am", "NSW", "ACT", "12");
		  //RoadInterstateRedirectVerification("NSW", "VIC", "12", "Documents", "12");
		  //DirectDrive_PriceandETAVerify("NSW", "ACT", "12", "Documents", "5");
		  //DirectDrive_RedirectVerification("NSW", "ACT", "12", "Documents", "6");
		  //GetQuote_URLExtraLargeBidRequest("General Van Shipments");
		  //GetQuote_ExtraLargedetailsVerify("General Van Shipments");
		  //GetQuote_URLHeavyFreightBidRequest("Building Materials");
		  //HeavyFreightsubshipmentVerification("Building Material", 1);
		  //OnclickonAddbtnQuantityincreases();
		  //ETADeliveryTimeVerify("Documents", "27-Feb-2018", "12am_8am");
		  //AddItemverification_HeavyFreightItems("Pallets");
		     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	  
		  //AddItemverification_HeavyFreightItems("Building Materials");
		  //ETADeliveryTimeVerify("Documents", "8am_12pm");
		  //ETADeliveryTimeVerify("Documents", "8am_12pm");
		  //SamePricestateVerification("12am_8am");
		  //SameStateBookNowbuttonredirect_BookingPage("12pm_2pm");
		  //InterstatePriceVerification("NSW", "WA");
		  //InterstatePriceVerification("WA", "NSW");	
			//InterstatePriceVerification("WA", "SA");	
			//RoadInterstatePriceVerification("NSW", "QLD");	
			//RoadInterstatePriceVerification("ACT", "VIC");	
		  //RoadInterstatePriceVerification("QLD", "VIC");
    	  //objETAInterState.ETAInterstateVerify("Cakes, flowers, delicates", "01-Apr-2018", "5pm_12am", "SA", "WA", "12");
 		// ETAVerifyRoadInterstate();
		 // DirectDrive_RedirectVerification();
		  //RoadInterstateRedirectVerification();
		 // SameStateBookNowbuttonredirect_BookingPage("12am_8am");
		  //GetQuote_URLExtraLargeBidRequest("General Van Shipments");

		  //GetQuote_URLHeavyFreightBidRequest("Full Truck Load");
		  UIEnabledVerification();



	  }
	  
	/* 
	  @Test (priority=3)
	  public void C21() throws Exception{
	  	  
	    //GetQuote_URLExtraLargeBidRequest("General Van Shipments");
	    AddItemverification_HeavyFreightItems("General Truck Shipments");
	  }
	 
	  @Test (priority=4)
	  public void C22() throws Exception{
	  	  
	    //GetQuote_ExtraLargedetailsVerify("General Van Shipments");
		  AddItemverification_HeavyFreightItems("Pallets");
	  }

	  @Test (priority=5)
	  public void C26() throws Exception{
	  	  
	    //GetQuote_URLHeavyFreightBidRequest("Building Materials");
		  AddItemverification_HeavyFreightItems("Machinery");
	  }

	  @Test (priority=6)
	  public void C27() throws Exception{
	  	  
	    //HeavyFreightsubshipmentVerification("Building Materials", 1);
		  AddItemverification_HeavyFreightItems("Vehicles");
	  }
	  
	  @Test (priority=7)
	  public void C28() throws Exception{
	  	  
	    //HeavyFreightsubshipmentVerification("Building Materials", 1);
		  //AddItemverification_HeavyFreightItems("Container");
	  }
	  
	  @Test (priority=8)
	  public void C29() throws Exception{
	  	  
	    //HeavyFreightsubshipmentVerification("Building Materials", 1);
		  //AddItemverification_HeavyFreightItems("Full Truck Load");
	  }
    */
	  
	  @BeforeTest
	  public void beforeTest() throws Exception {
		  
		   LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "GetQuoteModule_Test");
		   //LaunchBrowser_inCrossBrowser.OpenBrowser("Firefox", "56*64", "Windows 8.1", "RegistrationModule_Test");
		   //LaunchBrowser_inCro ssBrowser.OpenBrowser("Internet Explorer", "11", "Windows 7 64-bit", "RegistrationModule_Test");
		   }

	  @AfterTest
	  public void afterTest() {
		  
		
		  LaunchBrowser_inCrossBrowser.driverclose();
	  }

}
