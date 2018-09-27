package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.URL_Staging;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.URL_Staging;
import Controller.MAB_Scenarios;

public class DefaultPlaceholders_ForLargeItems extends MAB_Scenarios {
	
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	WebElement element;
	
	public void Verifyplaceholders_forheavyfreight(String Shipmenttype)
	{

		System.out.println(".................................................................................................");
		System.out.println("MAB10:Placeholder verification for HF method started......");
		driver.findElement(By.xpath(objMAB.MAB_LargeItemsshipmentLocator())).click();
		
		     
		if (Shipmenttype.equals("GeneralVansShipment")||Shipmenttype.equals("Furniture"))
		{ 
		  		if (Shipmenttype.equals("GeneralVansShipment"))
		  		{	
		  			
		  		System.out.println("Verify the place holders for GeneralVansShipment....");
		  		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_GeneralVanShipmentLocator())));
		  		driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralVanShipmentLocator())).click();
		  		}
		  		
		  		else if (Shipmenttype.equals("Furniture"))
		  		{	
		  		System.out.println("Verify the place holders for Furniture....");
		  		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_FurnitureShipmentLocator())));
		  		driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_FurnitureShipmentLocator())).click();
		  		}	
		  			
		  		  // Pickup details 
		  		  String placeholder_pickupcontactname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[1]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for pickup contactname is " + placeholder_pickupcontactname);
		  		  Assert.assertEquals(placeholder_pickupcontactname, "Contact name*");
		  		  
		  		  String placeholder_pickupemail = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[2]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup email is" + placeholder_pickupemail);
		  		  Assert.assertEquals(placeholder_pickupemail, "Email address");
		  		  
		  		  String placeholder_pickupconatctnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[3]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup contact number is" + placeholder_pickupconatctnumber);
		  		  Assert.assertEquals(placeholder_pickupconatctnumber, "Contact number*");
		  		 
		  		  String placeholder_pickupunitnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[4]/div[1]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup unit number is" + placeholder_pickupunitnumber);
		  		  Assert.assertEquals(placeholder_pickupunitnumber, "Unit/suite number");
		  		  
		  		  String placeholder_pickupstreetnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup street number is" + placeholder_pickupstreetnumber);
		  		  Assert.assertEquals(placeholder_pickupstreetnumber, "Street number");
		  		  
		  		  String placeholder_pickupstreetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup streetname is" + placeholder_pickupstreetname);
		  		  Assert.assertEquals(placeholder_pickupstreetname, "Street name*");
		  		  
		  		  String placeholder_pickupinstruction = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[6]/textarea")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup instruction is" + placeholder_pickupinstruction);
		  		  Assert.assertEquals(placeholder_pickupinstruction, "Any special delivery instructions");
		  		  
		  		  
		  		  // Drop details
		  		  
		  		  String placeholder_dropoffcontactname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[1]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for pickup contactname is " + placeholder_dropoffcontactname);
		  		  Assert.assertEquals(placeholder_dropoffcontactname, "Contact name*");
		  		  
		  		  String placeholder_dropoffemail = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[2]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup email is" + placeholder_dropoffemail);
		  		  Assert.assertEquals(placeholder_dropoffemail, "Email address");
		  		  
		  		  String placeholder_dropoffconatctnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[3]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup contact number is" + placeholder_dropoffconatctnumber);
		  		  Assert.assertEquals(placeholder_dropoffconatctnumber, "Contact number*");
		  		 
		  		  String placeholder_dropoffunitnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[4]/div[1]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup unit number is" + placeholder_dropoffunitnumber);
		  		  Assert.assertEquals(placeholder_dropoffunitnumber, "Unit/suite number");
		  		  
		  		  String placeholder_dropoffstreetnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup street number is" + placeholder_dropoffstreetnumber);
		  		  Assert.assertEquals(placeholder_dropoffstreetnumber, "Street number");
		  		  
		  		  String placeholder_dropoffstreetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[5]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup streetname is" + placeholder_dropoffstreetname);
		  		  Assert.assertEquals(placeholder_dropoffstreetname, "Street name*");
		  		  
		  		  String placeholder_dropoffinstruction = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[6]/textarea")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup instruction is" + placeholder_dropoffinstruction);
		  		  Assert.assertEquals(placeholder_dropoffinstruction	, "Any special delivery instructions");
		  		  
		  		  
		  		  
		  		  String placeholder_description = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div[1]/div/textarea")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup instruction is" + placeholder_description);
		  		  Assert.assertEquals(placeholder_description	, "Heavy & Bulk Building material that need extra assistance");
		  	 
	  		}
	  		
	  		
	  		if (Shipmenttype.equals("BuildingMaterials")||Shipmenttype.equals("GeneralTruckShipments")||Shipmenttype.equals("Pallets")||Shipmenttype.equals("Machinery")||Shipmenttype.equals("Vehicles")||Shipmenttype.equals("Container"))
	  		{
	  			
	  			if (Shipmenttype.equals("BuildingMaterials"))
	  			{
	  				 System.out.println("Verify the place holders for BuildingMaterials....");
	  				 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_BuildingMaterialsShipmentLocator())));
	  				 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_BuildingMaterialsShipmentLocator())).click();
	  			}
	  			else if (Shipmenttype.equals("GeneralTruckShipments")) 
	  			{	
	  			 System.out.println("Verify the place holders for GeneralTruckShipments....");
	  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_GeneralTruckShipmentLocator())));
	  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralTruckShipmentLocator())).click();
	  			} 
	  			
	  			else if (Shipmenttype.equals("Pallets")) 
	  			{		
	  				 System.out.println("Verify the place holders for Pallets....");
	  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_PalletsShipmentLocator())));
	  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_PalletsShipmentLocator())).click();
	  			} 
	  		
	  			else if (Shipmenttype.equals("Machinery")) 
	  			{	
	  				 System.out.println("Verify the place holders for Machinery....");
	  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_MachineryShipmentLocator())));
	  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_MachineryShipmentLocator())).click();
	  			} 
	  		
	  			else if (Shipmenttype.equals("Vehicles")) 
	  			{	
	  			 System.out.println("Verify the place holders for Vehicles....");
	  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_VehiclesShipmentLocator())));
	  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_VehiclesShipmentLocator())).click();
	  			} 
	  			
	  			else if (Shipmenttype.equals("Container")) 
	  			{	
	  				System.out.println("Verify the place holders for Container....");
	  				element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_ContainerShipmentLocator())));
	  				driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_ContainerShipmentLocator())).click();
	  			} 
	  			  String purchaseordernumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for purchaseordernumber is " + purchaseordernumber);
		  		  Assert.assertEquals(purchaseordernumber, "Optional");
		  		  
		  		  
		  		  String FreightTitle = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[5]/div[1]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for FreightTitle is " + FreightTitle);
		  		  Assert.assertEquals(FreightTitle, "eg. Bulk Building Material");
		  		 
		  		  String freightvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[5]/div[2]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for freightvalue is " + freightvalue);
		  		  Assert.assertEquals(freightvalue, "$");
		  		  
		  		  
		  		  String DescribeShipment = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for DescribeShipment is " + DescribeShipment);
		  		  Assert.assertEquals(DescribeShipment, "Heavy & Bulk Building material that need extra assistance");
		  		  
		  		  
		  		  String DeliveryInstructions = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for DeliveryInstructions is " + DeliveryInstructions);
		  		  Assert.assertEquals(DeliveryInstructions, "Any special delivery instructions");
		  		  
	  			
	  			 // Pickup details 
		  		  String placeholder_pickupcontactname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for pickup contactname is " + placeholder_pickupcontactname);
		  		  Assert.assertEquals(placeholder_pickupcontactname, "Contact name & business*");
		  		  
		  		  String placeholder_pickupemail = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup email is " + placeholder_pickupemail);
		  		  Assert.assertEquals(placeholder_pickupemail, "Email address");
		  		  
		  		  String placeholder_pickupconatctnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[1]/div[4]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup contact number is " + placeholder_pickupconatctnumber);
		  		  Assert.assertEquals(placeholder_pickupconatctnumber, "Contact number*");
		  		 
		  		  String placeholder_pickupunitnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[1]/div[5]/div[1]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup unit number is " + placeholder_pickupunitnumber);
		  		  Assert.assertEquals(placeholder_pickupunitnumber, "Unit/suite number");
		  		  
		  		  String placeholder_pickupstreetnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[1]/div[5]/div[2]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup street number is " + placeholder_pickupstreetnumber);
		  		  Assert.assertEquals(placeholder_pickupstreetnumber, "Street number");
		  		  
		  		  String placeholder_pickupstreetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[1]/div[6]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup streetname is " + placeholder_pickupstreetname);
		  		  Assert.assertEquals(placeholder_pickupstreetname, "Street name*");
		  		  
		  		  
		  		  // Drop details
		  		  String placeholder_dropoffcontactname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for pickup contactname is " + placeholder_dropoffcontactname);
		  		  Assert.assertEquals(placeholder_dropoffcontactname, "Contact name & business.*");
		  		  
		  		  String placeholder_dropoffemail = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup email is" + placeholder_dropoffemail);
		  		  Assert.assertEquals(placeholder_dropoffemail, "Email address");
		  		  
		  		  String placeholder_dropoffconatctnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[3]/div[4]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup contact number is" + placeholder_dropoffconatctnumber);
		  		  Assert.assertEquals(placeholder_dropoffconatctnumber, "Contact number*");
		  		 
		  		  String placeholder_dropoffunitnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[3]/div[5]/div[1]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup unit number is" + placeholder_dropoffunitnumber);
		  		  Assert.assertEquals(placeholder_dropoffunitnumber, "Unit/suite number");
		  		  
		  		  String placeholder_dropoffstreetnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[3]/div[5]/div[2]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup street number is" + placeholder_dropoffstreetnumber);
		  		  Assert.assertEquals(placeholder_dropoffstreetnumber, "Street number");
		  		  
		  		  String placeholder_dropoffstreetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div/div[3]/div[6]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup streetname is" + placeholder_dropoffstreetname);
		  		  Assert.assertEquals(placeholder_dropoffstreetname, "Street name*");
	  			
	  		}
				 /*
			  	System.out.println("GQ8:Labels and Placeholder verification method completed....");
			  	System.out.println(".................................................................................................");*/
	  		
	  		if (Shipmenttype.equals("Fulltruckload"))
	  		{
	  			 System.out.println("Verify the place holders for Fulltruckload....");
	  			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_FullTruckLoadShipmentLocator())));
	  			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_FullTruckLoadShipmentLocator())).click();
	  			
	  			 String purchaseordernumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("placeholder");
		  		 System.out.println("The placeholder for pickup streetname is" + purchaseordernumber);
		  		 Assert.assertEquals(purchaseordernumber, "Optional");
	  			 
		  		
		  		  // Pickup details 
		  		  String placeholder_pickupcontactname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[1]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for pickup contactname is " + placeholder_pickupcontactname);
		  		  Assert.assertEquals(placeholder_pickupcontactname, "Contact name*");
		  		  
		  		  String placeholder_pickupemail = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[2]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup email is " + placeholder_pickupemail);
		  		  Assert.assertEquals(placeholder_pickupemail, "Email address");
		  		  
		  		  String placeholder_pickupconatctnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[3]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup contact number is " + placeholder_pickupconatctnumber);
		  		  Assert.assertEquals(placeholder_pickupconatctnumber, "Contact number*");
		  		 
		  		  String placeholder_pickupunitnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[4]/div[1]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup unit number is " + placeholder_pickupunitnumber);
		  		  Assert.assertEquals(placeholder_pickupunitnumber, "Unit/suite number");
		  		  
		  		  String placeholder_pickupstreetnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup street number is " + placeholder_pickupstreetnumber);
		  		  Assert.assertEquals(placeholder_pickupstreetnumber, "Street number");
		  		  
		  		  String placeholder_pickupstreetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[5]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup streetname is " + placeholder_pickupstreetname);
		  		  Assert.assertEquals(placeholder_pickupstreetname, "Street name*");
		  		  
		  		  String placeholder_pickupinstruction = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div/div[2]/div[1]/div[6]/textarea")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup instruction is " + placeholder_pickupinstruction);
		  		  Assert.assertEquals(placeholder_pickupinstruction, "Any special delivery instructions");
		  		  
		  		  
		  		  // Drop details
		  		  String placeholder_dropoffcontactname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[1]/input")).getAttribute("placeholder");	
		  		  System.out.println("The placeholder for pickup contactname is " + placeholder_dropoffcontactname);
		  		  Assert.assertEquals(placeholder_dropoffcontactname, "Contact name*");
		  		  
		  		  String placeholder_dropoffemail = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[2]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup email is " + placeholder_dropoffemail);
		  		  Assert.assertEquals(placeholder_dropoffemail, "Email address");
		  		  
		  		  String placeholder_dropoffconatctnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[3]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup contact number is " + placeholder_dropoffconatctnumber);
		  		  Assert.assertEquals(placeholder_dropoffconatctnumber, "Contact number*");
		  		 
		  		  String placeholder_dropoffunitnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[4]/div[1]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup unit number is " + placeholder_dropoffunitnumber);
		  		  Assert.assertEquals(placeholder_dropoffunitnumber, "Unit/suite number");
		  		  
		  		  String placeholder_dropoffstreetnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup street number is " + placeholder_dropoffstreetnumber);
		  		  Assert.assertEquals(placeholder_dropoffstreetnumber, "Street number");
		  		  
		  		  String placeholder_dropoffstreetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[5]/input")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup streetname is " + placeholder_dropoffstreetname);
		  		  Assert.assertEquals(placeholder_dropoffstreetname, "Street name*");
		  		  
		  		  String placeholder_dropoffinstruction = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[6]/textarea")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup instruction is " + placeholder_dropoffinstruction);
		  		  Assert.assertEquals(placeholder_dropoffinstruction, "Any special delivery instructions");
		  		  		  
		  		  String placeholder_description = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[7]/div[1]/div/textarea")).getAttribute("placeholder");
		  		  System.out.println("The placeholder for pickup instruction is " + placeholder_description);
		  		  Assert.assertEquals(placeholder_description, "Heavy & Bulk Building material that need extra assistance");	 
	  			 
	  		}
	
	
	
	}
	
	
			

}
