package Test;

import org.testng.annotations.Test;

import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;
import RequiredClassesfor_EachModule.SpeedCalculation;

import org.testng.annotations.BeforeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.omg.CORBA.NameValuePair;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.apache.http.HttpResponse;

public class GetQuote_test extends GetQuote_Scenarios {
GetQuote_Scenarios objG=new GetQuote_Scenarios();
  @Test (priority = 1)
  public void GQ1() throws InterruptedException, IOException, JSONException {
	  //deliveries portal credentials
	  //VerifyAvailablemenuOptioninHamburgerandGetquotepage_GetQuote(Email, Password);
	  //LaunchBrowser_inCrossBrowser.Newsession();
	  VerifyAvailablemenuOptioninHamburgerandGetquotepage_GetQuote("farji123@gmail.com", "123456");
  }
  
   
  @Test (priority = 2)
  public void GQ2() throws InterruptedException, ParseException, IOException, JSONException{
	  //Default shipment text verification
	  //LaunchBrowser_inCrossBrowser.Newsession(); 
	  VerifyShipmentsandtextBydefault();
  }
  
  @Test (priority = 3)
  public void GQ3() throws InterruptedException{
	  //Sub shipment for large item verification.
	  //LaunchBrowser_inCrossBrowser.Newsession();
	  VerifySubshipmentstextforLargeItems();
  }
  
 @Test (priority=4)
  public void GQ4() throws InterruptedException{
  	 //Default quantity of shipment is 0 
	 //LaunchBrowser_inCrossBrowser.Newsession();
  	  DefaultquantityOfShipment_Zero();
    }
  
  @Test (priority=5)
  public void GQ5() throws InterruptedException{
  	  //On click on + button quantity increases.
	  //LaunchBrowser_inCrossBrowser.Newsession();
  	  OnclickonAddbtnQuantityincreases();
    }
  
  @Test (priority=6)
  public void GQ6() throws InterruptedException{
  	  //On click on - button quantity decreases.
	  //LaunchBrowser_inCrossBrowser.Newsession();
  	  OnclickonMinusbtnQuantitydecreases();
    }
  
  @Test (priority=7)
  public void GQ7() throws InterruptedException{
	  
	  //On Single Click Shipment quantity should increase to one.
	 // LaunchBrowser_inCrossBrowser.Newsession();
  	  OnsingleClickShipment_QuantitybeOne();
    }
  
  @Test (priority=8)
  public void GQ8() throws InterruptedException{
  	  //Labels and placeholders verification on get quote page.
	  //LaunchBrowser_inCrossBrowser.Newsession();
  	  Verifytextlabelsandplaceholders_PickupandDropoff();
    }
  
  @Test (priority=9)
  public void GQ23() throws InterruptedException{
  	  //Get quote validation text verify except large item shipment
	  //LaunchBrowser_inCrossBrowser.Newsession();
  	  GetQuote_ValidationTextVerify_ExceptLargeitems();
    }
  
  @Test (priority=10)
  public void GQ24() throws InterruptedException{
	  //LaunchBrowser_inCrossBrowser.Newsession();
  //Placeholder verification for get quote large items.
   Placeholder_GetquoteLargeItems("General Van");
     //Placeholder_GetquoteLargeItems("Furniture");
	//Placeholder_GetquoteLargeItems("Building Materials");
	//Placeholder_GetquoteLargeItems("General Truck Shipments");
	//Placeholder_GetquoteLargeItems("Pallets");
	//Placeholder_GetquoteLargeItems("Machinery");
	//Placeholder_GetquoteLargeItems("Vehicles");
	//Placeholder_GetquoteLargeItems("Full Truck Load");
	//Placeholder_GetquoteLargeItems("Container");
   }
  
  @Test (priority=11)
  public void GQ25() throws InterruptedException{
	  //LaunchBrowser_inCrossBrowser.Newsession();
  	  //Label_GetquoteLargeItems("General Van");
  	//Label_GetquoteLargeItems("Furniture");
  	//Label_GetquoteLargeItems("Building Materials");
  	//Label_GetquoteLargeItems("General Truck Shipments");
  	//Label_GetquoteLargeItems("Pallets");
  	//Label_GetquoteLargeItems("Machinery");
  	//Label_GetquoteLargeItems("Vehicles");
  	//Label_GetquoteLargeItems("Full Truck Load");
  	//Label_GetquoteLargeItems("Container");
	  Placeholder_GetquoteLargeItems("Furniture");
    }
  
  @Test (priority=12)
  public void GQ9() throws InterruptedException{
	//  LaunchBrowser_inCrossBrowser.Newsession();
	  //AbletogetquoteWithSameState(Shipments except large item, Current date, next date or future dates, Time duration);
	  //Use these four time duration 12am_8am, 8am_12pm, 12pm_2pm and 2pm_5pm.
	 // AbletogetquoteWithSameState("Documents", "05-May-2018", "12am_8am");
  	//AbletogetquoteWithSameState("Satchel, laptops", "22-Feb-2018", "8am_12pm");
  	//AbletogetquoteWithSameState("Small box", "23-Feb-2018", "12pm_2pm");
  	//AbletogetquoteWithSameState("Cakes, flowers, delicates", "23-Feb-2018", "2pm_5pm");
  	//AbletogetquoteWithSameState("Large Box", "24-Feb-2018", "5pm_12am");
	  Placeholder_GetquoteLargeItems("Building Materials");
  	

    }
  
  @Test (priority=13)
  public void GQ10() throws InterruptedException, ParseException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
	//ETADeliveryTimeVerify(Shipments except large item, Current date, next date or future dates, Time duration);
	  //Use these four time duration 12am_8am, 8am_12pm, 12pm_2pm and 2pm_5pm.
	 // ETADeliveryTimeVerify("Documents", "05-May-2018", "12am_8am");
  	//ETADeliveryTimeVerify("Satchel, laptops", "22-Feb-2018", "8am_12pm");
  	//ETADeliveryTimeVerify("Small box", "23-Feb-2018", "12pm_2pm");
  	//ETADeliveryTimeVerify("Cakes, flowers, delicates", "23-Feb-2018", "2pm_5pm");
  	//ETADeliveryTimeVerify("Large Box", "24-Feb-2018", "5pm_12am");
	  Placeholder_GetquoteLargeItems("General Truck Shipments");
  	  
    }

  @Test (priority=14)
  public void GQ11() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
	  //SamePricestateVerification(Shipmentname, Vehicle, quantityvalue, Timeduration);
     //SamePricestateVerification("Documents", "Bike", "2", "12am_8am");	
     //SamePricestateVerification("Satchel, laptops", "Bike", "2", "8am_12pm");
     //SamePricestateVerification("Cakes, flowers, delicates", "Car", "2", "12pm_2pm");
     //SamePricestateVerification("Small Box", "Van", "2", "2pm_5pm");
     //SamePricestateVerification("Large Box", "Bike", "2", "5pm_12am");
	  Placeholder_GetquoteLargeItems("Pallets");
      }
  
  @Test (priority=15)
  public void GQ12() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Placeholder_GetquoteLargeItems("Machinery");
  }
  
    
  @Test (priority=16)
  public void GQ13() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Placeholder_GetquoteLargeItems("Vehicles");
  }

  @Test (priority=17)
  public void GQ14() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Placeholder_GetquoteLargeItems("Full Truck Load");
  }

  @Test (priority=18)
  public void GQ15() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Placeholder_GetquoteLargeItems("Container");
  }

  @Test (priority=19)
  public void GQ16() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("General Van");
  }
  @Test (priority=20)
  public void GQ17() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("Furniture");
  }
  @Test (priority=21)
  public void GQ18() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("Building Materials");
  }
  @Test (priority=22)
  public void GQ19() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("Pallets");
  }
  @Test (priority=23)
  public void GQ20() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("Machinery");  
	  }
  
  @Test (priority=24)
  public void GQ21() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("Vehicles");  
	  }
  
  @Test (priority=25)
  public void GQ22() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("General Truck Shipments");  
	  }
  
  @Test (priority=26)
  public void GQ26() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("Full Truck Load");
  }
  @Test (priority=27)
  public void GQ27() throws InterruptedException, ParseException, JSONException, IOException{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  Label_GetquoteLargeItems("Container");  
	  
  }
  
  @Test (priority=28)
  public void GQ28() throws Exception{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  //Label_GetquoteLargeItems("Container");  
	  //AddItemverification_HeavyFreightItems("Building Materials");
	  //AddItemverification_HeavyFreightItems();
	  //objG = new GetQuote_Scenarios();
	  driver.navigate().refresh();
	  AddItemverify_HeavyFreightItems();


	  
  }
  
  @Test (priority=29)
  public void GQ29() throws Exception{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  //Label_GetquoteLargeItems("Container");  
	    //AddItemverification_HeavyFreightItems("General Truck Shipments");
	  
	  //HeavyfreightImageselection();

	  
  }
  /*
  @Test (priority=31)
  public void GQ33() throws Exception{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  //Label_GetquoteLargeItems("Container");  
	  AddItemverification_HeavyFreightItems("Pallets");

  }
  
  @Test (priority=32)
  public void GQ34() throws Exception{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	  //Label_GetquoteLargeItems("Container");  
	  AddItemverification_HeavyFreightItems("Machinery");

	  
  }
  
  @Test (priority=33)
  public void GQ35() throws Exception{
	 // LaunchBrowser_inCrossBrowser.Newsession();
     //SameStateBookNowbuttonredirect_BookingPage("Documents", "3", "After 5pm");	
	 // Label_GetquoteLargeItems("Container");  
	  AddItemverification_HeavyFreightItems("Vehicles");

  }
  */
@BeforeTest 
  public void beforeTest() throws Exception  {
	  
	   LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "GetQuoteModule_Test");
	   //LaunchBrowser_inCrossBrowser.OpenBrowser("Firefox", "56*64", "Windows 8.1", "RegistrationModule_Test");
	   //LaunchBrowser_inCro ssBrowser.OpenBrowser("Internet Explorer", "11", "Windows 7 64-bit", "RegistrationModule_Test");
	   }

  @AfterTest 
  public void afterTest() {
	  
	
	  LaunchBrowser_inCrossBrowser.driverclose();
  }

}
