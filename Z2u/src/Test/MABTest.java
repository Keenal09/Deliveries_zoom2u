package Test;

import org.testng.annotations.Test;

import Controller.LaunchBrowser_inCrossBrowser;
import Controller.MAB_Scenarios;


import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class MABTest extends MAB_Scenarios {
	
  @Test (priority = 1)
  public void MAB1() throws IOException, JSONException, InterruptedException {
	  
	  MAB_AvailableOption("farji123@gmail.com", "123456");
	  
  }
  /*
  @Test (priority = 2)
  public void MAB2() throws IOException, JSONException, InterruptedException {
	  
	  VerifyShipmentsandtextBydefault();
	  
  }
  
  @Test (priority = 3)
  public void MAB4() throws IOException, JSONException, InterruptedException {
	  
	  DefaultShipmentIs_Zero();
	  
  }
  
  @Test (priority = 4)
  public void MAB5() throws IOException, JSONException, InterruptedException {
	  
	  OnclickonPlusbtn_QuantityIncreases();
	  
  }
  
  @Test (priority = 5)
  public void MAB6() throws IOException, JSONException, InterruptedException {
	  
	  OnclickonMinusbtn_Quantitydecreases();
	  
  }
  
  @Test (priority = 6)
  public void MAB7() throws IOException, JSONException, InterruptedException {
	  
	  OnSingleClick_Quantitywillbeone();
	  
  }
  
  @Test (priority = 7)
  public void MAB8(){
	  
	  Defaultplaceholderslabels_Verification();
  }
  
  
  @Test (priority = 8)
  public void MAB9(){
	  
	  LabelsDefault_ForLargeItems();
  }
  
  @Test (priority = 9)
  public void MAB10(){
	  
	  PlaceholdersDefault_ForLargeItems();
  }

  @Test (priority = 10)
  public void MAB16(){
	  
	  DetailsgetfromMyLocation_onMAB();

  }
  
  @Test (priority = 11)
  public void MAB11() throws JSONException, IOException, InterruptedException{
	  
	  //SamestatePriceverification("12am_8am");
	  AddItemFor_Heavyfreight();

  }
  
  @Test (priority = 12)
  public void MAB13() throws JSONException, IOException, InterruptedException, ParseException{
	  
	  Validation_ForDefaultMAB();

  }
 
  @Test (priority = 13)
  public void MAB14() throws JSONException, IOException, InterruptedException, ParseException{
	  
	  Validation_ForHF();

  }

  @Test (priority = 14)
  public void MAB15() throws JSONException, IOException, InterruptedException, ParseException{
	  
	  Validation_ForShipmentsOverlimits();

  }

  @Test (priority = 15)
  public void MAB3() throws JSONException, IOException, InterruptedException, ParseException{
	  
	 SubshipmentMessages_ForLargeItems();

  }

  @Test (priority = 16)
  public void MAB12() throws JSONException, IOException, InterruptedException, ParseException{
	  
	Images_ForLargeItems();

  } 
  */
@Test (priority = 2)
  public void MAB18() throws JSONException, IOException, InterruptedException, ParseException{
	  
	Createsuggestaprice();
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
