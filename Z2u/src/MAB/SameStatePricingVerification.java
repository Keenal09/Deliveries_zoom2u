package MAB;

import java.io.IOException;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import RequiredClassesfor_EachModule.SameStateCalculation;
import RequiredClassesfor_EachModule.SpeedCalculation;
import RequiredClassesfor_EachModule.TimeCalculation;

public class SameStatePricingVerification extends MAB_Scenarios {
	
	WebElement element;
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	SpeedCalculation objspeed = new SpeedCalculation();
	MAB_SamestateCalculation ObjSameDay = new MAB_SamestateCalculation();
	MAB_TimeCalculation pickupTime = new MAB_TimeCalculation();


	   int SameDayBookingPrice, ThreehourBookingPrice, VIPBookingPrice;


	
	public void samestate_Pricing(String Shipment,String Vehicle, String quantityvalue, String PickupTime) throws JSONException, IOException, InterruptedException{
		System.out.println(".................................................................................................");
		System.out.println("MAB21:Same state Pricing for" + " " + Shipment + " " + Vehicle + " " + " " + "and their" + PickupTime + " " +"method started......");

		WebElement element = driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator()));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element); 

		if(Shipment.equals("Documents")){
		     element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_DocumentshipmentLocator())));

			   driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).clear();
		      driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).clear();
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
		      driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
		      
		     
			   }
		 
		   if(Shipment.equals("Satchel, laptops")){
			     //element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_LaptopshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).sendKeys("0");
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).clear();  
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			   //driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
		      // driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
	
		      
			   }

		   if(Shipment.equals("Cakes, flowers, delicates")){
			     //element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_FlowersshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).sendKeys("0");
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			// driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
		   // driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
	
		     
	   }

		   if(Shipment.equals("Small Box")){
			    // element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SmallBoxshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).sendKeys("0");
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			  // driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).clear();
			   //driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).clear();
			  // driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
			   //driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
	
		      
	   }
		   if(Shipment.equals("Large Box")){
			   // element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_LargeBoxshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).sendKeys("0");
			   //driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).sendKeys("3");
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			// driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
		   // driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
	
		      
	   }
            
	    	  String DeliveryOption1 = objspeed.DeliveryOption1();
			   String DeliveryOption2 = objspeed.DeliveryOption2();
			   String DeliveryOption3 = objspeed.DeliveryOption3();
			   String DeliveryOption4 = objspeed.DeliveryOption4();
			   
			   if(Shipment.equals("Cakes, flowers, delicates")  && (DeliveryOption1.equals("3 hour") || DeliveryOption2.equals("3 hour") || DeliveryOption3.equals("3 hour") || DeliveryOption4.equals("VIP"))) {
				   
				   if(PickupTime.equals("12am_8am") || PickupTime.equals("8am_12pm") || PickupTime.equals("After 5pm")){
					   pickupTime.TimeBetween(PickupTime);
					   
					     element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())));
					    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())));
					   ThreehourBookingPrice = (int) ObjSameDay.ThreehourCalculation(Shipment, Vehicle);
				       System.out.println("3 hour Price Calculation is =" + ThreehourBookingPrice);
				       if(PickupTime.equals("After 5pm")){
			               VIPBookingPrice = (int) ObjSameDay.VIPCalculationAfter3pm(Shipment, Vehicle);
			               System.out.println("VIP Price Calculation is =" + VIPBookingPrice); 
			               }
			               else{
			            	   VIPBookingPrice = (int) ObjSameDay.VIPCalculation(Shipment, Vehicle);
			    		       System.out.println("VIP Price Calculation is =" + VIPBookingPrice); 
			               }
				       
				    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())));
				    String ThreehourPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())).getText();
			       String VIPPriceValue1 = driver.findElement(By.xpath(objMAB.BookingPage_SecondPriceDeliveryoptionLocator())).getText();
	            Assert.assertEquals(ThreehourPriceValue, "$" + ThreehourBookingPrice );
			       Assert.assertEquals(VIPPriceValue1, "$" + VIPBookingPrice);
			     
				   }
				   
				   if(PickupTime.equals("12pm_2pm") || PickupTime.equals("2pm_3pm") || PickupTime.equals("After 3pm") ) {
					   
					   pickupTime.TimeBetween(PickupTime);
					   Thread.sleep(10000);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())));
					    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())));
					   ThreehourBookingPrice = (int) ObjSameDay.ThreehourCalculation(Shipment, Vehicle);
				       System.out.println("3 hour Price Calculation is =" + ThreehourBookingPrice);
				       if(PickupTime.equals("After 3pm")){
			               VIPBookingPrice = (int) ObjSameDay.VIPCalculationAfter3pm(Shipment, Vehicle);
			               System.out.println("VIP Price Calculation is =" + VIPBookingPrice); 
			               }
			               else{
			            	   VIPBookingPrice = (int) ObjSameDay.VIPCalculation(Shipment, Vehicle);
			    		       System.out.println("VIP Price Calculation is =" + VIPBookingPrice); 
			               }
				      
				    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())));
				    String ThreehourPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())).getText();
			       String ThreehourPriceValue1 = driver.findElement(By.xpath(objMAB.BookingPage_SecondPriceDeliveryoptionLocator())).getText();
			       String VIPPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_ThirdPriceDeliveryoptionLocator())).getText();
	            Assert.assertEquals(ThreehourPriceValue, "$" + ThreehourBookingPrice );
			       Assert.assertEquals(ThreehourPriceValue1, "$" + ThreehourBookingPrice);
			       Assert.assertEquals(VIPPriceValue, "$" + VIPBookingPrice);
					   
				   }
			   }
			   else {
				   
				   if(PickupTime.equals("12am_8am") || PickupTime.equals("8am_12pm") || PickupTime.equals("After 5pm")){
					   pickupTime.TimeBetween(PickupTime);
					   
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())));
					    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())));
					    SameDayBookingPrice = (int) ObjSameDay.SameDayCalculation(Shipment, Vehicle);
					    System.out.println(" Same Day Price Calculation is =" + SameDayBookingPrice);
					    ThreehourBookingPrice = (int) ObjSameDay.ThreehourCalculation(Shipment, Vehicle);
				       System.out.println("3 hour Price Calculation is =" + ThreehourBookingPrice);
				       if(PickupTime.equals("After 5pm")){
			               VIPBookingPrice = (int) ObjSameDay.VIPCalculationAfter3pm(Shipment, Vehicle);
			               System.out.println("VIP Price Calculation is =" + VIPBookingPrice); 
			               }
			               else{
			            	   VIPBookingPrice = (int) ObjSameDay.VIPCalculation(Shipment, Vehicle);
			    		       System.out.println("VIP Price Calculation is =" + VIPBookingPrice); 
			               }
				       
				    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())));
				       
				    String SameDayPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())).getText();
				    System.out.println(" Same Day Actual Calculation is =" + SameDayPriceValue);
			       String SameDayPriceValue1 = driver.findElement(By.xpath(objMAB.BookingPage_SecondPriceDeliveryoptionLocator())).getText();
			       System.out.println(" Same Day Actual Calculation is =" + SameDayPriceValue1);
			       String ThreehourPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_ThirdPriceDeliveryoptionLocator())).getText();
			       System.out.println(" Three hour Actual Price Calculation is =" + ThreehourPriceValue);
			       String VIPPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_FourthPriceDeliveryoptionLocator())).getText();
			       System.out.println(" VIP Actual Price Calculation is =" + VIPPriceValue);
	            Assert.assertEquals(SameDayPriceValue, "$" + SameDayBookingPrice );
			       Assert.assertEquals(SameDayPriceValue1, "$" + SameDayBookingPrice);
			       Assert.assertEquals(ThreehourPriceValue, "$" + ThreehourBookingPrice );
			       Assert.assertEquals(VIPPriceValue, "$" + VIPBookingPrice);
			     
				   }
				   
				   if(PickupTime.equals("12pm_2pm") || PickupTime.equals("2pm_3pm") || PickupTime.equals("After 3pm") ) {
					   
					   pickupTime.TimeBetween(PickupTime);
					   //Thread.sleep(10000);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())));
					    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())));
					    SameDayBookingPrice = (int) ObjSameDay.SameDayCalculation(Shipment, Vehicle);
					    System.out.println(" Same Day Price Calculation is =" + SameDayBookingPrice);
					    ThreehourBookingPrice = (int) ObjSameDay.ThreehourCalculation(Shipment, Vehicle);
				       System.out.println("3 hour Price Calculation is =" + ThreehourBookingPrice);
				       if(PickupTime.equals("After 3pm")){
			               VIPBookingPrice = (int) ObjSameDay.VIPCalculationAfter3pm(Shipment, Vehicle);
			               System.out.println("VIP Price Calculation is =" + VIPBookingPrice); 
			               }
			               else{
			            	   VIPBookingPrice = (int) ObjSameDay.VIPCalculation(Shipment, Vehicle);
			    		       System.out.println("VIP Price Calculation is =" + VIPBookingPrice); 
			               }
				       
				       element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())));
				       String SameDayPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())).getText();
				       System.out.println(" Same Day Actual Calculation is =" + SameDayPriceValue);
				    String ThreehourPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_SecondPriceDeliveryoptionLocator())).getText();
				    System.out.println(" Three hour Actual Calculation is =" + ThreehourPriceValue);
			       String ThreehourPriceValue1 = driver.findElement(By.xpath(objMAB.BookingPage_ThirdPriceDeliveryoptionLocator())).getText();
			       System.out.println(" Three hour Actual Calculation is =" + ThreehourPriceValue1);
			       String VIPPriceValue = driver.findElement(By.xpath(objMAB.BookingPage_FourthPriceDeliveryoptionLocator())).getText();
			       System.out.println(" VIP Actual Calculation is =" + VIPPriceValue);
			       Assert.assertEquals(SameDayPriceValue, "$" + SameDayBookingPrice );
	            Assert.assertEquals(ThreehourPriceValue, "$" + ThreehourBookingPrice );
			       Assert.assertEquals(ThreehourPriceValue1, "$" + ThreehourBookingPrice);
			       Assert.assertEquals(VIPPriceValue, "$" + VIPBookingPrice);
					   
				   }
			   }

		
		
	System.out.println("MAB21:Same state Pricing for" + " " + Shipment + " " + Vehicle + " " + " " + "and their" + PickupTime + " " +"method completed......");
	System.out.println(".................................................................................................");

	}

}
