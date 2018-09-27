package RequiredClassesfor_EachModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import Controller.LaunchBrowser_inCrossBrowser;

public class Placeholdersforbidrequest extends LaunchBrowser_inCrossBrowser{
 
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	WebElement element;
	public void Placeholdersforbidrequest(String Shipment) throws InterruptedException{
		 //WebDriverWait wait = new WebDriverWait(driver, 20);
		 
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.LargeItemsShipmentLocator())));
		driver.findElement(By.xpath(objGetQuote.LargeItemsShipmentLocator())).click();
		if(Shipment.equals("General Van") || Shipment.equals("Furniture")){
			element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.GeneralVanSubshipment_LargeItemLocator())));
			if(Shipment.equals("General Van")){
				
				driver.findElement(By.xpath(objGetQuote.GeneralVanSubshipment_LargeItemLocator())).click();
			}
			else if(Shipment.equals("Furniture")){
				driver.findElement(By.xpath(objGetQuote.Furniture_LargeItemLocator())).click();
			}
			//WebElement scrollArea = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[2]/input"));
			//JavascriptExecutor js = (JavascriptExecutor) driver; 
			//js.executeScript("arguments[0].scrollTop = arguments[1];",scrollArea, 250); 	
			//element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[2]/input")));
			String Pickupcontactname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[2]/input")).getAttribute("placeholder");
			System.out.println("Pickup contact name is" + Pickupcontactname);
		    Assert.assertEquals(Pickupcontactname, "Contact name & business*");
			String PickupEmail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[3]/input")).getAttribute("placeholder");
			System.out.println("Pickup email is" + PickupEmail);
		    Assert.assertEquals(PickupEmail, "Email address");
		    String PickupContactNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[4]/input")).getAttribute("placeholder");
			System.out.println("Pickup contact number is" + PickupContactNumber);
		    Assert.assertEquals(PickupContactNumber, "Contact number*");
		    String Pickupunitnum = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[1]/div/input")).getAttribute("placeholder");
			System.out.println("Pickup unit is" + Pickupunitnum);
		    Assert.assertEquals(Pickupunitnum, "Unit/suite number");
		    String PickupStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[2]/div/input")).getAttribute("placeholder");
			System.out.println("Pickup street number is" + PickupStreetnumber);
		    Assert.assertEquals(PickupStreetnumber, "Street number");
		    String PickupStreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[6]/input")).getAttribute("placeholder");
			System.out.println("Pickup street name is" + PickupStreetname);
		    Assert.assertEquals(PickupStreetname, "Street and Suburb*");
		    String Pickupnotes = driver.findElement(By.xpath(".//*[@id='pickup_notes']")).getAttribute("placeholder");
			System.out.println("Pickup notes is" + Pickupnotes);
		    Assert.assertEquals(Pickupnotes, "Any special delivery instructions");
		    String DropoffContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[2]/input")).getAttribute("placeholder");
			System.out.println("Dropoff contact is" + DropoffContact);
		    Assert.assertEquals(DropoffContact, "Contact name & business.*");
		    String DropoffEmail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[3]/input")).getAttribute("placeholder");
			System.out.println("Dropoff email is" + DropoffEmail);
		    Assert.assertEquals(DropoffEmail, "Email address");
		    String Dropoffcontactnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[4]/input")).getAttribute("placeholder");
			System.out.println("Dropoff contact number is" + Dropoffcontactnumber);
		    Assert.assertEquals(Dropoffcontactnumber, "Contact number*");
		    String DropoffUnitNum = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[1]/div/input")).getAttribute("placeholder");
			System.out.println("Dropoff unit number is" + DropoffUnitNum);
		    Assert.assertEquals(DropoffUnitNum, "Unit/suite number");
		    String DropoffStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[2]/div/input")).getAttribute("placeholder");
			System.out.println("Dropoff street number is" + DropoffStreetnumber);
		    Assert.assertEquals(DropoffStreetnumber, "Street number");
		    String DropoffStreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[6]/input")).getAttribute("placeholder");
			System.out.println("Dropoff street name is" + DropoffStreetname);
		    Assert.assertEquals(DropoffStreetname, "Street and Suburb*");
		    String Dropoffnotes = driver.findElement(By.xpath(".//*[@id='drop_notes']")).getAttribute("placeholder");
			System.out.println("Dropoff notes is" + Dropoffnotes);
		    Assert.assertEquals(Dropoffnotes, "Any special delivery instructions");
		    String Description = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div/textarea")).getAttribute("placeholder");
			System.out.println("Description is" + Description);
		    Assert.assertEquals(Description, "Heavy & Bulk Building material that need extra assistance");
		    
		   }else if(Shipment.equals("Building Materials") || Shipment.equals("General Truck Shipments") || Shipment.equals("Pallets") ||Shipment.equals("Machinery") || Shipment.equals("Vehicles") ) {
			   element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.BuildingMaterials_LargeItemLocator())));
			      if(Shipment.equals("Building Materials")) {
			    	  
			    	  driver.findElement(By.xpath(objGetQuote.BuildingMaterials_LargeItemLocator())).click();
			      }else if(Shipment.equals("General Truck Shipments")) {
			    	  
			    	  driver.findElement(By.xpath(objGetQuote.GeneralTruckShipments_LargeItemLocator())).click();
			      }else if(Shipment.equals("Pallets")) {
			    	  driver.findElement(By.xpath(objGetQuote.Pallets_LargeItemLocator())).click();
			      }else if(Shipment.equals("Machinery")) {
			    	  
			    	  driver.findElement(By.xpath(objGetQuote.Machinery_LargeItemLocator())).click();
			      }else if(Shipment.equals("Vehicles")){
			    	  driver.findElement(By.xpath(objGetQuote.Vehicles_LargeItemLocator())).click();
			      }
			      
			      String PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("placeholder");
			      System.out.println("Purchase order number is=" + PurchaseOrderNumber);
			      Assert.assertEquals(PurchaseOrderNumber, "Optional");
			      String FreightTitle = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).getAttribute("placeholder");
			      System.out.println("Freight title is" + FreightTitle);
			      Assert.assertEquals(FreightTitle, "eg. Bulk Building Material*");
			      String FreightValue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).getAttribute("placeholder");
			      System.out.println("Freight value is" + FreightValue);
			      Assert.assertEquals(FreightValue, "$");
			      String Description  = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).getAttribute("placeholder");
			      System.out.println("Description is"+ Description);
			      Assert.assertEquals(Description, "Heavy & Bulk Building material that need extra assistance");
			      String DeliverInstruction = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).getAttribute("placeholder");
			      System.out.println("Delivery Instruction is" + DeliverInstruction);
			      Assert.assertEquals(DeliverInstruction, "Any special delivery instructions");
			      String Pickupsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).getAttribute("placeholder");
			      System.out.println("pickup suburb is" + Pickupsuburb);
			      Assert.assertEquals(Pickupsuburb, "Suburb*");
			      String Dropoffsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).getAttribute("placeholder");
			      System.out.println("Drop off suburb is =" + Dropoffsuburb);
			      Assert.assertEquals(Dropoffsuburb, "Suburb*");
		         } else if(Shipment.equals("Container")) {
		        	 
		        	 driver.findElement(By.xpath(objGetQuote.Container_LargeItemLocator())).click();
		        	 String PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("placeholder");
				      System.out.println("Purchase order number is=" + PurchaseOrderNumber);
				      Assert.assertEquals(PurchaseOrderNumber, "Optional");
				      String FreightTitle = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).getAttribute("placeholder");
				      System.out.println("Freight title is" + FreightTitle);
				      Assert.assertEquals(FreightTitle, "eg. Bulk Building Material*");
				      String FreightValue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).getAttribute("placeholder");
				      System.out.println("Freight value is" + FreightValue);
				      Assert.assertEquals(FreightValue, "$");
				      String Description  = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).getAttribute("placeholder");
				      System.out.println("Description is"+ Description);
				      Assert.assertEquals(Description, "Heavy & Bulk Building material that need extra assistance");
				      String DeliverInstruction = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).getAttribute("placeholder");
				      System.out.println("Delivery Instruction is" + DeliverInstruction);
				      Assert.assertEquals(DeliverInstruction, "Any special delivery instructions");
				      String Pickupsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).getAttribute("placeholder");
				      System.out.println("pickup suburb is" + Pickupsuburb);
				      Assert.assertEquals(Pickupsuburb, "Suburb*");
				      String Dropoffsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).getAttribute("placeholder");
				      System.out.println("Drop off suburb is =" + Dropoffsuburb);
				      Assert.assertEquals(Dropoffsuburb, "Suburb*");
		        	 
		         }else if(Shipment.equals("Full Truck Load")) {
		        	 
		        	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FullTruckLoad_LargeItemLocator())));
		        	 driver.findElement(By.xpath(objGetQuote.FullTruckLoad_LargeItemLocator())).click();
		        	 String PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("placeholder");
				      System.out.println("Purchase order number is=" + PurchaseOrderNumber);
				      Assert.assertEquals(PurchaseOrderNumber, "Optional");
		        	 String Pickupcontactname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[2]/input")).getAttribute("placeholder");
		 			System.out.println("Pickup contact name is" + Pickupcontactname);
		 		    Assert.assertEquals(Pickupcontactname, "Contact name & business*");
		 			String PickupEmail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[3]/input")).getAttribute("placeholder");
		 			System.out.println("Pickup email is" + PickupEmail);
		 		    Assert.assertEquals(PickupEmail, "Email address");
		 		    String PickupContactNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[4]/input")).getAttribute("placeholder");
		 			System.out.println("Pickup contact number is" + PickupContactNumber);
		 		    Assert.assertEquals(PickupContactNumber, "Contact number*");
		 		    String Pickupunitnum = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[1]/div/input")).getAttribute("placeholder");
		 			System.out.println("Pickup unit is" + Pickupunitnum);
		 		    Assert.assertEquals(Pickupunitnum, "Unit/suite number");
		 		    String PickupStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[2]/div/input")).getAttribute("placeholder");
		 			System.out.println("Pickup street number is" + PickupStreetnumber);
		 		    Assert.assertEquals(PickupStreetnumber, "Street number");
		 		    String PickupStreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[6]/input")).getAttribute("placeholder");
		 			System.out.println("Pickup street name is" + PickupStreetname);
		 		    Assert.assertEquals(PickupStreetname, "Street and Suburb*");
		 		    String Pickupnotes = driver.findElement(By.xpath(".//*[@id='pickup_notes']")).getAttribute("placeholder");
		 			System.out.println("Pickup notes is" + Pickupnotes);
		 		    Assert.assertEquals(Pickupnotes, "Any special delivery instructions");
		 		    String DropoffContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[2]/input")).getAttribute("placeholder");
		 			System.out.println("Dropoff contact is" + DropoffContact);
		 		    Assert.assertEquals(DropoffContact, "Contact name & business.*");
		 		    String DropoffEmail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[3]/input")).getAttribute("placeholder");
		 			System.out.println("Dropoff email is" + DropoffEmail);
		 		    Assert.assertEquals(DropoffEmail, "Email address");
		 		    String Dropoffcontactnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[4]/input")).getAttribute("placeholder");
		 			System.out.println("Dropoff contact number is" + Dropoffcontactnumber);
		 		    Assert.assertEquals(Dropoffcontactnumber, "Contact number*");
		 		    String DropoffUnitNum = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[1]/div/input")).getAttribute("placeholder");
		 			System.out.println("Dropoff unit number is" + DropoffUnitNum);
		 		    Assert.assertEquals(DropoffUnitNum, "Unit/suite number");
		 		    String DropoffStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[2]/div/input")).getAttribute("placeholder");
		 			System.out.println("Dropoff street number is" + DropoffStreetnumber);
		 		    Assert.assertEquals(DropoffStreetnumber, "Street number");
		 		    String DropoffStreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[6]/input")).getAttribute("placeholder");
		 			System.out.println("Dropoff street name is" + DropoffStreetname);
		 		    Assert.assertEquals(DropoffStreetname, "Street and Suburb*");
		 		    String Dropoffnotes = driver.findElement(By.xpath(".//*[@id='drop_notes']")).getAttribute("placeholder");
		 			System.out.println("Dropoff notes is" + Dropoffnotes);
		 		    Assert.assertEquals(Dropoffnotes, "Any special delivery instructions");
		 		    String Description = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[1]/div/textarea")).getAttribute("placeholder");
		 			System.out.println("Description is" + Description);
		 		    Assert.assertEquals(Description, "Heavy & Bulk Building material that need extra assistance");
                    
		        	 
		         }
		            driver.navigate().refresh();
	} 
}
