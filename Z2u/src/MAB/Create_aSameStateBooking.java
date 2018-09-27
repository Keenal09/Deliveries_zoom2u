package MAB;

import java.io.IOException;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import MAB_JsonService.Samestate_Service;

public class Create_aSameStateBooking extends MAB_Scenarios {
	
	WebElement element;
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	Samestate_Service objservice = new Samestate_Service();
	public void SameStateBooking_create(String Shipment) throws InterruptedException, JSONException, IOException{
		
		 if(Shipment.equals("Documents")){
	    	  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_DocumentshipmentLocator())));
	    	  driver.findElement(By.xpath(objMAB.MAB_DocumentshipmentLocator())).click();
	    	  }
	    	  if(Shipment.equals("Satchel, laptops")){
	    	      element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_LaptopshipmentLocator())));
	        	  driver.findElement(By.xpath(objMAB.MAB_LaptopshipmentLocator())).click();
	        	  }
	    	  if(Shipment.equals("Small box")){
	    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SmallBoxshipmentLocator())));
	        	  driver.findElement(By.xpath(objMAB.MAB_SmallBoxshipmentLocator())).click();
	        	  }
	    	  if(Shipment.equals("Cakes, flowers, delicates")){
	    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_FlowersshipmentLocator())));
	        	  driver.findElement(By.xpath(objMAB.MAB_FlowersshipmentLocator())).click();
	        	  }
	    	  if(Shipment.equals("Large Box")){
	    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_LargeBoxshipmentLocator())));
	        	  driver.findElement(By.xpath(objMAB.MAB_LargeBoxshipmentLocator())).click();
	        	  }
	    	  
	    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[9]/div[1]/button")).click();
	    
  	  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'I accept the customer')]")));

	    driver.findElement(By.xpath("//span[contains(text(), 'I accept the customer')]")).click();
	    
	    
	    long bookingref =objservice.Bookingref();
		long newbookingref = bookingref + 1;
	  	  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[2]/button")));

		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[2]/button")).click();
		
		
		String bookingvalue = driver.findElement(By.xpath("//span[@class='text-normal ng-binding']")).getText();
		String Bookingnumbertext = driver.findElement(By.xpath("//div[@class='panel booking-number-box']")).getText();
		String currenturl = driver.getCurrentUrl();
		
		
		Assert.assertEquals(Bookingnumbertext, "Your booking number" + "\n" + "Z"  + newbookingref );
		Assert.assertEquals(currenturl, "https://deliveries-staging.zoom2u.com/#/thankyou");
		
		
		
		
		
		
	}

}
