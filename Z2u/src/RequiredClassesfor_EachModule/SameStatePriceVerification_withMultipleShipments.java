package RequiredClassesfor_EachModule;

import java.io.IOException;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import CommonLibraries.GetQuoteLocators;
import Controller.LaunchBrowser_inCrossBrowser;

public class SameStatePriceVerification_withMultipleShipments extends LaunchBrowser_inCrossBrowser {
	
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	SpeedCalculation objspeed = new SpeedCalculation();
	TimeCalculation pickupTime = new TimeCalculation();
	SameStateCalculation ObjSameDay = new SameStateCalculation();

	
	public void SamePricestateVerification_WithMultipleShipments(String Shipment, String Vehicle, String quantityvalue1, String quantityvalue2, String PickupTime) throws InterruptedException, JSONException, IOException {
		 
		 Thread.sleep(10000); 
		   
		   int SameDayBookingPrice, ThreehourBookingPrice, VIPBookingPrice;
		   
		   
		   if(Shipment.equalsIgnoreCase("Documents & Satchel, laptops")){
			   
			   driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).sendKeys(quantityvalue1);
		       driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).sendKeys(quantityvalue2);
		   }
		   String DeliveryOption1 = objspeed.DeliveryOption1();
		   String DeliveryOption2 = objspeed.DeliveryOption2();
		   String DeliveryOption3 = objspeed.DeliveryOption3();
		   String DeliveryOption4 = objspeed.DeliveryOption4();
		 
		   if(Shipment.equals("Cakes, flowers, delicates & any shipment")  && (DeliveryOption1.equals("3 hour") || DeliveryOption2.equals("3 hour") || DeliveryOption3.equals("3 hour") || DeliveryOption4.equals("VIP"))) {
			   
			   if(PickupTime.equals("12am_8am") || PickupTime.equals("8am_12pm") || PickupTime.equals("After 5pm")){
				   pickupTime.TimeBetween(PickupTime);
					 Thread.sleep(10000);
				    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
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
			       Thread.sleep(10000);
			    String ThreehourPriceValue = driver.findElement(By.xpath(objGetQuote.FirstPriceLocators())).getText();
		       String VIPPriceValue1 = driver.findElement(By.xpath(objGetQuote.SecondPriceLocators())).getText();
              Assert.assertEquals(ThreehourPriceValue, "$" + ThreehourBookingPrice );
		       Assert.assertEquals(VIPPriceValue1, "$" + VIPBookingPrice);
		     
			   }
			   
			   if(PickupTime.equals("12pm_2pm") || PickupTime.equals("2pm_5pm") || PickupTime.equals("After 3pm") ) {
				   
				   pickupTime.TimeBetween(PickupTime);
					 Thread.sleep(10000);
				    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
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
			       Thread.sleep(10000);
			    String ThreehourPriceValue = driver.findElement(By.xpath(objGetQuote.FirstPriceLocators())).getText();
		       String ThreehourPriceValue1 = driver.findElement(By.xpath(objGetQuote.SecondPriceLocators())).getText();
		       String VIPPriceValue = driver.findElement(By.xpath(objGetQuote.ThirdPriceLocators())).getText();
              Assert.assertEquals(ThreehourPriceValue, "$" + ThreehourBookingPrice );
		       Assert.assertEquals(ThreehourPriceValue1, "$" + ThreehourBookingPrice);
		       Assert.assertEquals(VIPPriceValue, "$" + VIPBookingPrice);
				   
			   }
		   }
		   else {
			   
			   if(PickupTime.equals("12am_8am") || PickupTime.equals("8am_12pm") || PickupTime.equals("After 5pm")){
				   pickupTime.TimeBetween(PickupTime);
					 Thread.sleep(10000);
				    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
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
			       Thread.sleep(10000);
			       
			    String SameDayPriceValue = driver.findElement(By.xpath(objGetQuote.FirstPriceLocators())).getText();
			    System.out.println(" Same Day Actual Calculation is =" + SameDayPriceValue);
		       String SameDayPriceValue1 = driver.findElement(By.xpath(objGetQuote.SecondPriceLocators())).getText();
		       System.out.println(" Same Day Actual Calculation is =" + SameDayPriceValue1);
		       String ThreehourPriceValue = driver.findElement(By.xpath(objGetQuote.ThirdPriceLocators())).getText();
		       System.out.println(" Three hour Actual Price Calculation is =" + ThreehourPriceValue);
		       String VIPPriceValue = driver.findElement(By.xpath(objGetQuote.FourthPriceLocators())).getText();
		       System.out.println(" VIP Actual Price Calculation is =" + VIPPriceValue);
              Assert.assertEquals(SameDayPriceValue, "$" + SameDayBookingPrice );
		       Assert.assertEquals(SameDayPriceValue1, "$" + SameDayBookingPrice);
		       Assert.assertEquals(ThreehourPriceValue, "$" + ThreehourBookingPrice );
		       Assert.assertEquals(VIPPriceValue, "$" + VIPBookingPrice);
		     
			   }
			   
			   if(PickupTime.equals("12pm_2pm") || PickupTime.equals("2pm_5pm") || PickupTime.equals("After 3pm") ) {
				   
				   pickupTime.TimeBetween(PickupTime);
					 Thread.sleep(10000);
				    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
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
			       Thread.sleep(10000);
			       String SameDayPriceValue = driver.findElement(By.xpath(objGetQuote.FirstPriceLocators())).getText();
			       System.out.println(" Same Day Actual Calculation is =" + SameDayPriceValue);
			    String ThreehourPriceValue = driver.findElement(By.xpath(objGetQuote.SecondPriceLocators())).getText();
			    System.out.println(" Three hour Actual Calculation is =" + ThreehourPriceValue);
		       String ThreehourPriceValue1 = driver.findElement(By.xpath(objGetQuote.ThirdPriceLocators())).getText();
		       System.out.println(" Three hour Actual Calculation is =" + ThreehourPriceValue1);
		       String VIPPriceValue = driver.findElement(By.xpath(objGetQuote.FourthPriceLocators())).getText();
		       System.out.println(" VIP Actual Calculation is =" + VIPPriceValue);
		       Assert.assertEquals(SameDayPriceValue, "$" + SameDayBookingPrice );
              Assert.assertEquals(ThreehourPriceValue, "$" + ThreehourBookingPrice );
		       Assert.assertEquals(ThreehourPriceValue1, "$" + ThreehourBookingPrice);
		       Assert.assertEquals(VIPPriceValue, "$" + VIPBookingPrice);
				   
			   }
		   }
	 }

}
