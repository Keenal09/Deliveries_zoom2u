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

public class LabelsVerificationforBidRequest_GetQuote extends LaunchBrowser_inCrossBrowser{
	
  GetQuoteLocators objGetQuote = new GetQuoteLocators();
  WebElement element;
 
	public void LabelVerification_BidRequest(String Shipment) throws InterruptedException{
		
		
		
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
			
			String LabelPickup = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[1]")).getText();
		    System.out.println("Pickup label is =" + LabelPickup);
		    Assert.assertEquals(LabelPickup, "Pick-up location*");
		    
		    String LabelDrop = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[1]")).getText();
		    System.out.println("Dropoff label is =" + LabelDrop);
		    Assert.assertEquals(LabelDrop, "Drop-off location*");
		    
		    String LabelDescription = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div/label")).getText();
		    System.out.println("Dropoff label is =" + LabelDescription);
		    Assert.assertEquals(LabelDescription, "Description");
		    
		    String LabelImages = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div/label")).getText();
		    System.out.println("label images is =" + LabelImages);
		    Assert.assertEquals(LabelImages, "Image of Freight (.png, .jpg or .pdf)");
		    
		    String LabelParcelPickup = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[1]")).getText();
		    System.out.println("label Parcel  is =" + LabelParcelPickup);
		    Assert.assertEquals(LabelParcelPickup, "Parcel available after");
		    
		    String LabelParcelPickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/div[1]/label")).getText();
		    System.out.println("label Parcel Date  is =" + LabelParcelPickupDate);
		    Assert.assertEquals(LabelParcelPickupDate, "Date");
		    
		    String LabelParcelPickupTime = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/div[2]/label")).getText();
		    System.out.println("label Parcel Time  is =" + LabelParcelPickupTime);
		    Assert.assertEquals(LabelParcelPickupTime, "Time");
		    
		    String LabelParcelDrop = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[7]/div[1]")).getText();
		    System.out.println("label Parcel Drop  is =" + LabelParcelDrop);
		    Assert.assertEquals(LabelParcelDrop, "Required before");
		    
		    String LabelParcelDropDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[7]/div[2]/div[1]/label")).getText();
		    System.out.println("label Parcel Date  is =" + LabelParcelDropDate);
		    Assert.assertEquals(LabelParcelDropDate, "Date");
		    
		    String LabelParcelDropTime = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[7]/div[2]/div[2]/label")).getText();
		    System.out.println("label Parcel Time  is =" + LabelParcelPickupTime);
		    Assert.assertEquals(LabelParcelDropTime, "Time");
	
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
				      
				      String LabelPurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]")).getText();
				      System.out.println("label Purchase order number  is =" + LabelPurchaseOrderNumber);
					  Assert.assertEquals(LabelPurchaseOrderNumber, "Purchase order number"); 
					  
					  String LabelQuantity = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/label")).getText();
					  System.out.println("label quantity  is =" + LabelQuantity);
					  Assert.assertEquals(LabelQuantity, "Quantity*"); 
					  
					  String LabelLength = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/label")).getText();
					  System.out.println("label length  is =" + LabelLength);
					  Assert.assertEquals(LabelLength, "Length*"); 
					  
					  String LabelWidth = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/label")).getText();
					  System.out.println("label width  is =" + LabelWidth);
					  Assert.assertEquals(LabelWidth, "Width*"); 
					  
					  String LabelHeight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/label")).getText();
					  System.out.println("label Height  is =" + LabelHeight);
					  Assert.assertEquals(LabelHeight, "Height*"); 
					  
					  String LabelItemWeight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[5]/label")).getText();
					  System.out.println("label Item weight  is =" + LabelItemWeight);
					  Assert.assertEquals(LabelItemWeight, "Item Weight*"); 
					  
					  String LabelTotalWeight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[6]/label")).getText();
					  System.out.println("label Total weight  is =" + LabelTotalWeight);
					  Assert.assertEquals(LabelTotalWeight, "Total Weight*");
					  
					  String LabelAddItem = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div/a")).getText();
					  System.out.println("label Add Item is =" + LabelAddItem);
					  Assert.assertEquals(LabelAddItem, "+ Add Item");
					  
					  String LabelFreightTitle = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/label")).getText();
					  System.out.println("label Freight Title is =" + LabelFreightTitle);
					  Assert.assertEquals(LabelFreightTitle, "Freight Title* :");
					  
					  String LabelFreightValue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/label")).getText();
					  System.out.println("label Freight value is =" + LabelFreightValue);
					  Assert.assertEquals(LabelFreightValue, "What is the freight value?*");
					  
					  String LabelDescribeShipment = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/label")).getText();
					  System.out.println("label Describe shipment is =" + LabelDescribeShipment);
					  Assert.assertEquals(LabelDescribeShipment, "Describe Shipment :");
					  
					  String LabelDeliveryInstruction = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/label")).getText();
					  System.out.println("label Delivery Instruction is =" + LabelDeliveryInstruction);
					  Assert.assertEquals(LabelDeliveryInstruction, "Delivery Instructions");
					  
					  String LabelImageFreight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[9]/div/label")).getText();
					  System.out.println("label Image freight is =" + LabelImageFreight);
					  Assert.assertEquals(LabelImageFreight, "Image of Freight (.png, .jpg or .pdf)");
					  
					  String LabelPickup = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[1]")).getText();
					  System.out.println("label Pickup is =" + LabelPickup);
					  Assert.assertEquals(LabelPickup, "Pick-up location*");
					  
					  String LabelDrop = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[1]")).getText();
					  System.out.println("label Dropoff is =" + LabelDrop);
					  Assert.assertEquals(LabelDrop, "Drop-off location*");
					  
					  String LabelPickLoadingFacilities = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/span")).getText();
					  System.out.println("label loading facilities is =" + LabelPickLoadingFacilities);
					  Assert.assertEquals(LabelPickLoadingFacilities, "What loading facilities will be available? *");
					  
					  String LabelPickLoadingFacoption = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[2]/label")).getText();
					  System.out.println("label loading facility 1st option is =" + LabelPickLoadingFacoption);
					  Assert.assertEquals(LabelPickLoadingFacoption, "Forklift");
					  
					  String LabelPickLoadingFac2option = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[3]/label")).getText();
					  System.out.println("label loading facility 2nd option is =" + LabelPickLoadingFac2option);
					  Assert.assertEquals(LabelPickLoadingFac2option, "Crane");
					  
					  String LabelPickLoadingFac3option = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[4]/label")).getText();
					  System.out.println("label loading facility 3rd option is =" + LabelPickLoadingFac3option);
					  Assert.assertEquals(LabelPickLoadingFac3option, "None");
					  
					  String LabelDropLoadingFacilities = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/span")).getText();
					  System.out.println("label loading facilities is =" + LabelDropLoadingFacilities);
					  Assert.assertEquals(LabelDropLoadingFacilities, "What loading facilities will be available? *");
					  
					  String LabelDropLoadingFacoption = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[2]/label")).getText();
					  System.out.println("label loading facility 1st option is =" + LabelDropLoadingFacoption);
					  Assert.assertEquals(LabelDropLoadingFacoption, "Forklift");
					  
					  String LabelDropLoadingFac2option = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[3]/label")).getText();
					  System.out.println("label loading facility 2nd option is =" + LabelDropLoadingFac2option);
					  Assert.assertEquals(LabelDropLoadingFac2option, "Crane");
					  
					  String LabelDropLoadingFac3option = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[4]/label")).getText();
					  System.out.println("label loading facility 3rd option is =" + LabelDropLoadingFac3option);
					  Assert.assertEquals(LabelDropLoadingFac3option, "None");
					  
					  String Labelpicknotes = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[5]/div/span")).getText();
					  System.out.println("label pickup notes is =" + Labelpicknotes);
					  Assert.assertEquals(Labelpicknotes, "Notes/Other :");
					  
					  String LabelDropnotes = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[5]/div/span")).getText();
					  System.out.println("label drop notes is =" + LabelDropnotes);
					  Assert.assertEquals(LabelDropnotes, "Notes/Other :");
					  
					  String TypePickLoadingFacoption = driver.findElement(By.id("pickup_forklift")).getAttribute("type");
					  System.out.println("label loading facility 1st option is =" + TypePickLoadingFacoption);
					  Assert.assertEquals(TypePickLoadingFacoption, "radio");
					  
					  String TypePickLoadingFac2option = driver.findElement(By.id("pickup_crane")).getAttribute("type");
					  System.out.println("label loading facility 2nd option is =" + TypePickLoadingFac2option);
					  Assert.assertEquals(TypePickLoadingFac2option, "radio");
					  
					  String TypePickLoadingFac3option = driver.findElement(By.id("pickup_none")).getAttribute("type");
					  System.out.println("label loading facility 3rd option is =" + TypePickLoadingFac3option);
					  Assert.assertEquals(TypePickLoadingFac3option, "radio");
					  
					  String TypeDropLoadingFacoption = driver.findElement(By.id("drop_forklift")).getAttribute("type");
					  System.out.println("label loading facility 1st option is =" + TypeDropLoadingFacoption);
					  Assert.assertEquals(TypeDropLoadingFacoption, "radio");
					  
					  String TypeDropLoadingFac2option = driver.findElement(By.id("drop_crane")).getAttribute("type");
					  System.out.println("label loading facility 2nd option is =" + TypeDropLoadingFac2option);
					  Assert.assertEquals(TypeDropLoadingFac2option, "radio");
					  
					  String TypeDropLoadingFac3option = driver.findElement(By.id("drop_none")).getAttribute("type");
					  System.out.println("label loading facility 3rd option is =" + TypeDropLoadingFac3option);
					  Assert.assertEquals(TypeDropLoadingFac3option, "radio");
					  
					  boolean SelectedPickLoadingFacoption = driver.findElement(By.id("pickup_forklift")).isSelected();
					  System.out.println("label loading facility 1st option is =" + SelectedPickLoadingFacoption);
					  Assert.assertEquals(SelectedPickLoadingFacoption, false);
					  
					  boolean SelectedPickLoadingFac2option = driver.findElement(By.id("pickup_crane")).isSelected();
					  System.out.println("label loading facility 2nd option is =" + SelectedPickLoadingFac2option);
					  Assert.assertEquals(SelectedPickLoadingFac2option, false);
					  
					  boolean SelectedPickLoadingFac3option = driver.findElement(By.id("pickup_none")).isSelected();
					  System.out.println("label loading facility 3rd option is =" + SelectedPickLoadingFac3option);
					  Assert.assertEquals(SelectedPickLoadingFac3option, true);
					  
					  boolean SelectedDropLoadingFacoption = driver.findElement(By.id("drop_forklift")).isSelected();
					  System.out.println("label loading facility 1st option is =" + SelectedDropLoadingFacoption);
					  Assert.assertEquals(SelectedDropLoadingFacoption, false);
					  
					  boolean SelectedDropLoadingFac2option = driver.findElement(By.id("drop_crane")).isSelected();
					  System.out.println("label loading facility 2nd option is =" + SelectedDropLoadingFac2option);
					  Assert.assertEquals(SelectedDropLoadingFac2option, false);
					  
					  boolean SelectedDropLoadingFac3option = driver.findElement(By.id("drop_none")).isSelected();
					  System.out.println("label loading facility 3rd option is =" + SelectedDropLoadingFac3option);
					  Assert.assertEquals(SelectedDropLoadingFac3option, true);
					  
					  String LabelPickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[1]")).getText();
					  System.out.println("label Pick up date is =" + LabelPickupDate);
					  Assert.assertEquals(LabelPickupDate, "When should the freight be picked up? *");
					  
					  String LabelDropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[1]")).getText();
					  System.out.println("label Drop off date is =" + LabelDropoffDate);
					  Assert.assertEquals(LabelDropoffDate, "When should the freight be dropped off? *");
					  
					  String var = "Is this flexible? *" + "\n" +"No Yes";
					  String LabelPickFlexible = driver.findElement(By.className("col-md-4")).getText();
					  System.out.println("label pick Flexible is =" + LabelPickFlexible);
					  Assert.assertEquals(LabelPickFlexible, var);

					  String LabelDropFlexible = driver.findElement(By.className("col-md-4")).getText();
					  System.out.println("label Drop Flexible is =" + LabelDropFlexible);
					  Assert.assertEquals(LabelDropFlexible, var);
					  
					  String PickYesFlexible = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[2]/div/label[2]")).getText();
					  System.out.println("Pick yes flexible" + PickYesFlexible);
					  Assert.assertEquals(PickYesFlexible, "Yes");
					  
					  String PickNoFlexible = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[2]/div/label[1]")).getText();
					  System.out.println("Pick no flexible" + PickNoFlexible);
					  Assert.assertEquals(PickNoFlexible, "No");
					  
					  String DropYesFlexible = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[2]/div/label[2]")).getText();
					  System.out.println("Drop yes flexible" + DropYesFlexible);
					  Assert.assertEquals(DropYesFlexible, "Yes");
					  
					  String DropNoFlexible = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[2]/div/label[1]")).getText();
					  System.out.println("Drop no flexible" + DropNoFlexible);
					  Assert.assertEquals(DropNoFlexible, "No");
         }else if(Shipment.equals("Container")) {
        	 
        	 driver.findElement(By.xpath(objGetQuote.Container_LargeItemLocator())).click();
        	 String LabelPurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]")).getText();
		      System.out.println("label Purchase order number  is =" + LabelPurchaseOrderNumber);
			  Assert.assertEquals(LabelPurchaseOrderNumber, "Purchase order number"); 
			  
			  String ContainerSizelabel = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/label")).getText();
			  System.out.println("Container Size is" + ContainerSizelabel);
			  Assert.assertEquals(ContainerSizelabel, "Container Size*");
			  
			  String LabelQuantity = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/label")).getText();
			  System.out.println("label quantity  is =" + LabelQuantity);
			  Assert.assertEquals(LabelQuantity, "Quantity*"); 
			  
			  String LabelLength = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/label")).getText();
			  System.out.println("label length  is =" + LabelLength);
			  Assert.assertEquals(LabelLength, "Length*"); 
			  
			  String LabelWidth = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/label")).getText();
			  System.out.println("label width  is =" + LabelWidth);
			  Assert.assertEquals(LabelWidth, "Width*"); 
			  
			  String LabelHeight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[5]/label")).getText();
			  System.out.println("label Height  is =" + LabelHeight);
			  Assert.assertEquals(LabelHeight, "Height*"); 
			  
			  String LabelItemWeight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[6]/label")).getText();
			  System.out.println("label Item weight  is =" + LabelItemWeight);
			  Assert.assertEquals(LabelItemWeight, "Item Weight*"); 
			  
			  String LabelTotalWeight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[7]/label")).getText();
			  System.out.println("label Total weight  is =" + LabelTotalWeight);
			  Assert.assertEquals(LabelTotalWeight, "Total Weight*");
			  
			  String LabelAddItem = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div/a")).getText();
			  System.out.println("label Add Item is =" + LabelAddItem);
			  Assert.assertEquals(LabelAddItem, "+ Add Item");
			  
			  String LabelFreightTitle = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/label")).getText();
			  System.out.println("label Freight Title is =" + LabelFreightTitle);
			  Assert.assertEquals(LabelFreightTitle, "Freight Title* :");
			  
			  String LabelFreightValue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/label")).getText();
			  System.out.println("label Freight value is =" + LabelFreightValue);
			  Assert.assertEquals(LabelFreightValue, "What is the freight value?*");
			  
			  String LabelContainerrent = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[3]/label")).getText();
			  System.out.println("Label container rent" + LabelContainerrent);
			  Assert.assertEquals(LabelContainerrent, "I will need to rent a container :");
			  
			  String LabelContainermsg = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[3]/p")).getText();
			  System.out.println("Label container msg" + LabelContainermsg);
			  Assert.assertEquals(LabelContainermsg, "(Leave this blank if you will provide your own)");
			  
			  String Containerradiobtn = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[3]/div/span")).getText();
			  System.out.println("Label container radio btn" + Containerradiobtn);
			  Assert.assertEquals(Containerradiobtn, "Yes, I will need a container provided please.");
	          
			  boolean Containerradiobtnbydefault = driver.findElement(By.id("checkbox")).isSelected();
			  System.out.println("Container radio btn by default is" + Containerradiobtnbydefault);
			  Assert.assertEquals(Containerradiobtnbydefault, false);
			  
			  JavascriptExecutor js = ((JavascriptExecutor) driver);
			  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			  driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).sendKeys(Keys.TAB);
			                                                                        
			  driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[3]/div/label")).click();
			  
			  element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[3]/div/label")));

			  boolean LabelContainerradiobtn = driver.findElement(By.id("checkbox")).isSelected();
			  System.out.println("Container radio btn by default is" + LabelContainerradiobtn);
			  Assert.assertEquals(LabelContainerradiobtn, true);
			  
			  
			  
			  String LabelDescribeShipment = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/label")).getText();
			  System.out.println("label Describe shipment is =" + LabelDescribeShipment);
			  Assert.assertEquals(LabelDescribeShipment, "Describe Shipment :");
			  
			  String LabelDeliveryInstruction = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/label")).getText();
			  System.out.println("label Delivery Instruction is =" + LabelDeliveryInstruction);
			  Assert.assertEquals(LabelDeliveryInstruction, "Delivery Instructions");
			  
			  String LabelImageFreight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[9]/div[1]/label")).getText();
			  System.out.println("label Image freight is =" + LabelImageFreight);
			  Assert.assertEquals(LabelImageFreight, "Image of Freight (.png, .jpg or .pdf)");
			  
			  String LabelSecuritynumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[9]/div[2]/label")).getText();
			  System.out.println("label security number is =" + LabelSecuritynumber);
			  Assert.assertEquals(LabelSecuritynumber, "Maritime Security ID Card Number");
			  
			  String LabelPickup = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[1]")).getText();
			  System.out.println("label Pickup is =" + LabelPickup);
			  Assert.assertEquals(LabelPickup, "Pick-up location*");
			  
			  String LabelDrop = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[1]")).getText();
			  System.out.println("label Dropoff is =" + LabelDrop);
			  Assert.assertEquals(LabelDrop, "Drop-off location*");
			  
			  String LabelPickLoadingFacilities = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/span")).getText();
			  System.out.println("label loading facilities is =" + LabelPickLoadingFacilities);
			  Assert.assertEquals(LabelPickLoadingFacilities, "What loading facilities will be available? *");
			  
			  String LabelPickLoadingFacoption = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[2]/label")).getText();
			  System.out.println("label loading facility 1st option is =" + LabelPickLoadingFacoption);
			  Assert.assertEquals(LabelPickLoadingFacoption, "Forklift");
			  
			  String LabelPickLoadingFac2option = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[3]/label")).getText();
			  System.out.println("label loading facility 2nd option is =" + LabelPickLoadingFac2option);
			  Assert.assertEquals(LabelPickLoadingFac2option, "Crane");
			  
			  String LabelPickLoadingFac3option = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[4]/label")).getText();
			  System.out.println("label loading facility 3rd option is =" + LabelPickLoadingFac3option);
			  Assert.assertEquals(LabelPickLoadingFac3option, "None");
			  
			  String LabelDropLoadingFacilities = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/span")).getText();
			  System.out.println("label loading facilities is =" + LabelDropLoadingFacilities);
			  Assert.assertEquals(LabelDropLoadingFacilities, "What loading facilities will be available? *");
			  
			  String LabelDropLoadingFacoption = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[2]/label")).getText();
			  System.out.println("label loading facility 1st option is =" + LabelDropLoadingFacoption);
			  Assert.assertEquals(LabelDropLoadingFacoption, "Forklift");
			  
			  String LabelDropLoadingFac2option = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[3]/label")).getText();
			  System.out.println("label loading facility 2nd option is =" + LabelDropLoadingFac2option);
			  Assert.assertEquals(LabelDropLoadingFac2option, "Crane");
			  
			  String LabelDropLoadingFac3option = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[4]/label")).getText();
			  System.out.println("label loading facility 3rd option is =" + LabelDropLoadingFac3option);
			  Assert.assertEquals(LabelDropLoadingFac3option, "None");
			  
			  String Labelpicknotes = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[5]/div/span")).getText();
			  System.out.println("label pickup notes is =" + Labelpicknotes);
			  Assert.assertEquals(Labelpicknotes, "Notes/Other :");
			  
			  String LabelDropnotes = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[5]/div/span")).getText();
			  System.out.println("label drop notes is =" + LabelDropnotes);
			  Assert.assertEquals(LabelDropnotes, "Notes/Other :");
			  
			  String TypePickLoadingFacoption = driver.findElement(By.id("pickup_forklift")).getAttribute("type");
			  System.out.println("label loading facility 1st option is =" + TypePickLoadingFacoption);
			  Assert.assertEquals(TypePickLoadingFacoption, "radio");
			  
			  String TypePickLoadingFac2option = driver.findElement(By.id("pickup_crane")).getAttribute("type");
			  System.out.println("label loading facility 2nd option is =" + TypePickLoadingFac2option);
			  Assert.assertEquals(TypePickLoadingFac2option, "radio");
			  
			  String TypePickLoadingFac3option = driver.findElement(By.id("pickup_none")).getAttribute("type");
			  System.out.println("label loading facility 3rd option is =" + TypePickLoadingFac3option);
			  Assert.assertEquals(TypePickLoadingFac3option, "radio");
			  
			  String TypeDropLoadingFacoption = driver.findElement(By.id("drop_forklift")).getAttribute("type");
			  System.out.println("label loading facility 1st option is =" + TypeDropLoadingFacoption);
			  Assert.assertEquals(TypeDropLoadingFacoption, "radio");
			  
			  String TypeDropLoadingFac2option = driver.findElement(By.id("drop_crane")).getAttribute("type");
			  System.out.println("label loading facility 2nd option is =" + TypeDropLoadingFac2option);
			  Assert.assertEquals(TypeDropLoadingFac2option, "radio");
			  
			  String TypeDropLoadingFac3option = driver.findElement(By.id("drop_none")).getAttribute("type");
			  System.out.println("label loading facility 3rd option is =" + TypeDropLoadingFac3option);
			  Assert.assertEquals(TypeDropLoadingFac3option, "radio");
			  
			  boolean SelectedPickLoadingFacoption = driver.findElement(By.id("pickup_forklift")).isSelected();
			  System.out.println("label loading facility 1st option is =" + SelectedPickLoadingFacoption);
			  Assert.assertEquals(SelectedPickLoadingFacoption, false);
			  
			  boolean SelectedPickLoadingFac2option = driver.findElement(By.id("pickup_crane")).isSelected();
			  System.out.println("label loading facility 2nd option is =" + SelectedPickLoadingFac2option);
			  Assert.assertEquals(SelectedPickLoadingFac2option, false);
			  
			  boolean SelectedPickLoadingFac3option = driver.findElement(By.id("pickup_none")).isSelected();
			  System.out.println("label loading facility 3rd option is =" + SelectedPickLoadingFac3option);
			  Assert.assertEquals(SelectedPickLoadingFac3option, true);
			  
			  boolean SelectedDropLoadingFacoption = driver.findElement(By.id("drop_forklift")).isSelected();
			  System.out.println("label loading facility 1st option is =" + SelectedDropLoadingFacoption);
			  Assert.assertEquals(SelectedDropLoadingFacoption, false);
			  
			  boolean SelectedDropLoadingFac2option = driver.findElement(By.id("drop_crane")).isSelected();
			  System.out.println("label loading facility 2nd option is =" + SelectedDropLoadingFac2option);
			  Assert.assertEquals(SelectedDropLoadingFac2option, false);
			  
			  boolean SelectedDropLoadingFac3option = driver.findElement(By.id("drop_none")).isSelected();
			  System.out.println("label loading facility 3rd option is =" + SelectedDropLoadingFac3option);
			  Assert.assertEquals(SelectedDropLoadingFac3option, true);
			  
			  String LabelPickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[1]")).getText();
			  System.out.println("label Pick up date is =" + LabelPickupDate);
			  Assert.assertEquals(LabelPickupDate, "When should the freight be picked up? *");
			  
			  String LabelDropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[1]")).getText();
			  System.out.println("label Drop off date is =" + LabelDropoffDate);
			  Assert.assertEquals(LabelDropoffDate, "When should the freight be dropped off? *");
			  
			  String var = "Is this flexible? *" + "\n" +"No Yes";
			  String LabelPickFlexible = driver.findElement(By.className("col-md-4")).getText();
			  System.out.println("label pick Flexible is =" + LabelPickFlexible);
			  Assert.assertEquals(LabelPickFlexible, var);

			  String LabelDropFlexible = driver.findElement(By.className("col-md-4")).getText();
			  System.out.println("label Drop Flexible is =" + LabelDropFlexible);
			  Assert.assertEquals(LabelDropFlexible, var);
			  
			  String PickYesFlexible = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[2]/div/label[2]")).getText();
			  System.out.println("Pick yes flexible" + PickYesFlexible);
			  Assert.assertEquals(PickYesFlexible, "Yes");
			  
			  String PickNoFlexible = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[2]/div/label[1]")).getText();
			  System.out.println("Pick no flexible" + PickNoFlexible);
			  Assert.assertEquals(PickNoFlexible, "No");
			  
			  String DropYesFlexible = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[2]/div/label[2]")).getText();
			  System.out.println("Drop yes flexible" + DropYesFlexible);
			  Assert.assertEquals(DropYesFlexible, "Yes");
			  
			  String DropNoFlexible = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[2]/div/label[1]")).getText();
			  System.out.println("Drop no flexible" + DropNoFlexible);
			  Assert.assertEquals(DropNoFlexible, "No");

         
         
         }else if(Shipment.equals("Full Truck Load")) {
        	 
        	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FullTruckLoad_LargeItemLocator())));
        	 driver.findElement(By.xpath(objGetQuote.FullTruckLoad_LargeItemLocator())).click();
             String LabelPurchaseordernumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]")).getText();
             System.out.println("Purchase order number is" + LabelPurchaseordernumber);
             Assert.assertEquals(LabelPurchaseordernumber, "Purchase order number");
              
              String LabelPickup = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[1]")).getText();
			  System.out.println("label Pickup is =" + LabelPickup);
			  Assert.assertEquals(LabelPickup, "Pick-up location*");
			  
			  String LabelDrop = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[1]")).getText();
			  System.out.println("label Dropoff is =" + LabelDrop);
			  Assert.assertEquals(LabelDrop, "Drop-off location*");
			  
			  String LabelDescription = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[1]/div/label")).getText();
			  System.out.println("Dropoff label is =" + LabelDescription);
			  Assert.assertEquals(LabelDescription, "Description");
			  
			  String LabelImageFreight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[3]/div/label")).getText();
			  System.out.println("Dropoff label images is =" + LabelImageFreight);
			  Assert.assertEquals(LabelImageFreight, "Image of Freight (.png, .jpg or .pdf)");
			    
			  String Labelparcelpickup = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[7]/div[1]")).getText();
			  System.out.println("Parcel pickup label  is =" + Labelparcelpickup);
			  Assert.assertEquals(Labelparcelpickup, "Parcel available after");
			  
			  String Labelparcelpickupdate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[7]/div[2]/div[1]/label")).getText();
			  System.out.println("Parcel pickup date is =" + Labelparcelpickupdate);
			  Assert.assertEquals(Labelparcelpickupdate, "Date");
			  
			  String Labelparceldrop = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[8]/div[1]")).getText();
			  System.out.println("Parcel drop is =" + Labelparceldrop);
			  Assert.assertEquals(Labelparceldrop, "Required before");
			  
			  String Labelparceldropdate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[8]/div[2]/div[1]/label")).getText();
			  System.out.println("Parcel drop is =" + Labelparceldropdate);
			  Assert.assertEquals(Labelparceldropdate, "Date");
         }
	}
}
