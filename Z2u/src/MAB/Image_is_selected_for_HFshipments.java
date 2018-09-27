package MAB;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
public class Image_is_selected_for_HFshipments extends MAB_Scenarios {
	
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	WebElement element;
	public void verifyImages_ForHF(String Shipmenttype) 
	{
		System.out.println(".................................................................................................");
		System.out.println("MAB12:Image verification for HF shipments method started......");
  		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_LargeItemsshipmentLocator())));
		driver.findElement(By.xpath(objMAB.MAB_LargeItemsshipmentLocator())).click();
	     
		if (Shipmenttype.equals("GeneralVansShipment")||Shipmenttype.equals("Furniture")||Shipmenttype.equals("BuildingMaterials")||Shipmenttype.equals("GeneralTruckShipments")||Shipmenttype.equals("Pallets")||Shipmenttype.equals("Machinery")||Shipmenttype.equals("Vehicles")||Shipmenttype.equals("Container"))
		{ 
			if (Shipmenttype.equals("GeneralVansShipment"))
	  		{	
	  		System.out.println("Verify the images for GeneralVansShipment....");
	  		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_GeneralVanShipmentLocator())));
	  		driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralVanShipmentLocator())).click();
	  		}
	  		
	  		else if (Shipmenttype.equals("Furniture"))
	  		{	
		  		System.out.println("Verify the images for Furniture....");
		  		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_FurnitureShipmentLocator())));
		  		driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_FurnitureShipmentLocator())).click();
	  		}	
	  		else if (Shipmenttype.equals("BuildingMaterials"))
	  		{
	  			System.out.println("Verify the images for BuildingMaterials....");
  				element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_BuildingMaterialsShipmentLocator())));
  				driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_BuildingMaterialsShipmentLocator())).click();
	  		}
			
	  		else if (Shipmenttype.equals("GeneralTruckShipments")) 
  			{	
  			 System.out.println("Verify the images for GeneralTruckShipments....");
  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_GeneralTruckShipmentLocator())));
  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralTruckShipmentLocator())).click();
  			} 
  			
  			else if (Shipmenttype.equals("Pallets")) 
  			{		
  				 System.out.println("Verify the images for Pallets....");
  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_PalletsShipmentLocator())));
  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_PalletsShipmentLocator())).click();
  			} 
  		
  			else if (Shipmenttype.equals("Machinery")) 
  			{	
  				 System.out.println("Verify the images for Machinery....");
  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_MachineryShipmentLocator())));
  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_MachineryShipmentLocator())).click();
  			} 
  		
  			else if (Shipmenttype.equals("Vehicles")) 
  			{	
  			 System.out.println("Verify the images for Vehicles....");
  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_VehiclesShipmentLocator())));
  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_VehiclesShipmentLocator())).click();
  			} 
			
  			else if(Shipmenttype.equals("Container")) 
			{	
  			 System.out.println("Verify the images for Container....");
			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_ContainerShipmentLocator())));
			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_ContainerShipmentLocator())).click();	
			}		
			// Upload images
			// driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-1']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Desert.jpg");
			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-2']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Jellyfish.jpg");
			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-3']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-4']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Lighthouse.jpg");
			//driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-5']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			
			//Verify that all images are visible
			String Image1 = driver.findElement(By.xpath(".//*[@id='image-holder-1']")).getAttribute("src");
				if(Image1.equals("content/images/booking/graphic-photo@2x.png"))
				{
					 System.out.println("First Image is not visible.");
				}
				else
			    {
			         System.out.println("First Image is visible.");
			    }
				
				
				
				String Image2 = driver.findElement(By.xpath(".//*[@id='image-holder-2']")).getAttribute("src");
				
				
				if(Image2.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
				{
					 System.out.println("second Image is not visible.");
				}
				else
			    {
			         System.out.println("second Image is visible.");
			    }
			
				String Image3 = driver.findElement(By.xpath(".//*[@id='image-holder-3']")).getAttribute("src");
				
				
				if(Image3.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
				{
					 System.out.println("Third Image is not visible.");
				}
				else
			    {
			         System.out.println("Third Image is visible.");
			    }
				String Image4 = driver.findElement(By.xpath(".//*[@id='image-holder-4']")).getAttribute("src");
				
				
				if(Image4.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
				{
					 System.out.println("Fourth Image is not visible.");
				}
				else
			    {
			         System.out.println("Fourth Image is visible.");
			    }
				String Image5 = driver.findElement(By.xpath(".//*[@id='image-holder-5']")).getAttribute("src");
				
				
				if(Image5.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
				{
					 System.out.println("Fifth Image is not visible.");
				}
				else
			    {
			         System.out.println("Fifth Image is visible.");
			    }	
			
		}
		else if(Shipmenttype.equals("Fulltruckload")) 
		{	
 			 System.out.println("Verify the images for Fulltruckload....");
 			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_FullTruckLoadShipmentLocator())));
 			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_FullTruckLoadShipmentLocator())).click();
 			 
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div/div[2]/input")).sendKeys("ABC123456");
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[1]/input")).sendKeys("test pick");
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[3]/input")).sendKeys("78458585");
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[5]/input")).sendKeys("123 George Street, The Rocks NSW, Australia");
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[1]/input")).sendKeys(Keys.TAB);
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[1]/input")).sendKeys("test drop");
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[3]/input")).sendKeys("784585");
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[5]/input")).sendKeys("45 Clarence Street, Sydney NSW, Australia");
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[6]/textarea")).sendKeys(Keys.TAB);
 			 driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[7]/div[1]/div/textarea")).sendKeys("test notes");
 			 
 			
 			// Upload images
 			// driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
 			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-1']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Desert.jpg");
 			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-2']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Jellyfish.jpg");
 			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-3']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
 			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-4']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Lighthouse.jpg");
 			//driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-5']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg");
 			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 			//Verify that all images are visible
 			String Image1 = driver.findElement(By.xpath(".//*[@id='image-holder-1']")).getAttribute("src");
 				if(Image1.equals("content/images/booking/graphic-photo@2x.png"))
 				{
 					 System.out.println("First Image is not visible.");
 				}
 				else
 			    {
 			         System.out.println("First Image is visible.");
 			    }
 				
 				
 				
 				String Image2 = driver.findElement(By.xpath(".//*[@id='image-holder-2']")).getAttribute("src");
 				
 				
 				if(Image2.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
 				{
 					 System.out.println("second Image is not visible.");
 				}
 				else
 			    {
 			         System.out.println("second Image is visible.");
 			    }
 			
 				String Image3 = driver.findElement(By.xpath(".//*[@id='image-holder-3']")).getAttribute("src");
 				
 				
 				if(Image3.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
 				{
 					 System.out.println("Third Image is not visible.");
 				}
 				else
 			    {
 			         System.out.println("Third Image is visible.");
 			    }
 				String Image4 = driver.findElement(By.xpath(".//*[@id='image-holder-4']")).getAttribute("src");
 				
 				
 				if(Image4.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
 				{
 					 System.out.println("Fourth Image is not visible.");
 				}
 				else
 			    {
 			         System.out.println("Fourth Image is visible.");
 			    }
 				String Image5 = driver.findElement(By.xpath(".//*[@id='image-holder-5']")).getAttribute("src");
 				
 				
 				if(Image5.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
 				{
 					 System.out.println("Fifth Image is not visible.");
 				}
 				else
 			    {
 			         System.out.println("Fifth Image is visible.");
 			    }
 				
 				WebElement elem = driver.findElement(By.cssSelector("span.accept-terms.ng-scope"));

 				driver.executeScript(
 				    "(arguments[0].click(),':before')"
 				    , elem);

 				
 			//	element.findElement(By.name("terms")).click();
 				
 				//driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[12]/div/div/div/label/span")).click();
 				driver.findElement(By.xpath(".//*[@id='bookingForm']/div[2]/button")).click();
 				
 				element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='courier-offers-text']")));
 	 	        String bidpage = driver.findElement(By.xpath("//div[@class='courier-offers-text'][contains(text(),'Our driver community will be')]")).getText();
 	 	        System.out.println("bid page is=" + bidpage);
 				Assert.assertEquals(bidpage, "Our driver community will be" + "\n" + "bidding on your work shortly.");
 				driver.findElement(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())).click();
		} 
		
		
	}

}
