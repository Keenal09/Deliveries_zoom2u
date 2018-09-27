package Test;

import org.testng.annotations.Test;

import Controller.LaunchBrowser_inCrossBrowser;
import Controller.MAB_Scenarios;
import MAB.Add_item_verification_heavyfreight;
import MAB_JsonService.Samestate_Service;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class RoughNewTest_MAB extends MAB_Scenarios{
  @Test (priority = 1)
  public void f() throws IOException, JSONException, InterruptedException {
	  MAB_AvailableOption("farji123@gmail.com", "123456");

  }
  
  @Test (priority = 2)
  public void f1() throws IOException, JSONException, InterruptedException {
	  //Defaultplaceholderslabels_Verification();
     //PlaceholdersandLabelsDefault_ForLargeItems();
	  
	 // DetailsgetfromMyLocation_onMAB();
	  AddItemFor_Heavyfreight();
	  //PlaceholdersDefault_ForLargeItems();
	 // Images_ForLargeItems();
	
	  //Samestate_Service objservice = new Samestate_Service();
	  
	  //objservice.SamestateBooking();
	  //SamestatePriceverification("12am_8am");
	  //driver.navigate().refresh();
	 // SamestatePriceverification("8am_12pm");
      //driver.navigate().refresh(); 
      //SamestatePriceverification("12pm_2pm");
     // driver.navigate().refresh();
	 // SamestatePriceverification("2pm_3pm");
     // driver.navigate().refresh(); 

	  //SamestatePriceverification("5pm_12am");
	 // driver.navigate().refresh();
	//  SamestatePriceverification("After 3pm");
	 // driver.navigate().refresh();
	// SamestatePriceverification("After 5pm");

  }
  
  @Test (priority = 3)
  public void f2() throws IOException, JSONException, InterruptedException {
	 // MAB_AvailableOption("farji123@gmail.com", "123456");
	 // SamestatePriceverification("12am_8am");
	 // Validation_ForHF();
	  Validation_ForDefaultMAB();


  }

  @Test (priority = 4)
  public void f3() throws IOException, JSONException, InterruptedException, ParseException {
	 // MAB_AvailableOption("farji123@gmail.com", "123456");
	  //SamestatePriceverification("12am_8am");
	  //ETAVerificationfor_SameState("Documents", "12am_8am");
	 // Validation_ForShipmentsOverlimits();
	  Validation_ForHF();


  }

 
  @Test (priority = 5)
  public void f4() throws IOException, JSONException, InterruptedException {
	  //Defaultplaceholderslabels_Verification();
     //PlaceholdersandLabelsDefault_ForLargeItems();
	  
	  //SamestatebookingCreate();
	  
	  //SamestatePriceverification();
	  Validation_ForShipmentsOverlimits();

  }


  
  @BeforeTest
  public void beforeTest() throws Exception {
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "MABTest");

  }

  @AfterTest
  public void afterTest() {
	  
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
