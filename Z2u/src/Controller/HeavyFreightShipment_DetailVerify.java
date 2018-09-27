package Controller;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;



public class HeavyFreightShipment_DetailVerify extends LaunchBrowser_inCrossBrowser {

	WebElement element;
	public void Heavyfreightshipment(String SubShipment, int containervalue) throws InterruptedException{
		
		

		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[8]/div")));
	     driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[8]/div")).click();
	     
		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[3]")));
	     
		 if(SubShipment.equals("Building Materials")){
			 
			 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[3]")).click();
		 }
		 else if(SubShipment.equals("General Truck Shipments")){
			 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[4]/div")).click();
		 }
		 else if(SubShipment.equals("Pallets")){
			 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[5]")).click();
		 }
		 else if(SubShipment.equals("Machinery")){
			 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[6]")).click();
 }
		 else if(SubShipment.equals("Vehicles")){
			 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[7]")).click();
 }
		 else if(SubShipment.equals("Container")){
			 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[8]")).click();
 }
		 else if(SubShipment.equals("Full Truck Load")){
			 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[9]")).click();
 }
		if(SubShipment.equals("Building Materials") || SubShipment.equals("General Truck Shipments") || SubShipment.equals("Pallets") || SubShipment.equals("Machinery") || SubShipment.equals("Vehicles")){
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).sendKeys("1223456");
		String PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("value");
		System.out.println("Purchase order number is =" + PurchaseOrderNumber);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/input")).sendKeys("12");
        String Quantityvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/input")).getAttribute("value");
        System.out.println("Quantity value is" + Quantityvalue);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/span/input")).sendKeys("12");
        String Lengthvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/span/input")).getAttribute("value");
        System.out.println("Length value is" + Lengthvalue);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/span/input")).sendKeys("16");
        String Widthvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/span/input")).getAttribute("value");
        System.out.println("Width value is" + Widthvalue);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/span/input")).sendKeys("16");
        String Heightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/span/input")).getAttribute("value");
        System.out.println("Height value is" + Heightvalue);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[5]/span/input")).sendKeys("16");
        String ItemWeightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[5]/span/input")).getAttribute("value");
        System.out.println("Item weight value is" + ItemWeightvalue);
        String TotalWeightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[6]/span/input")).getAttribute("value");
        System.out.println("Total Weight value is" + TotalWeightvalue);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).sendKeys("Freight Match");
        String FreightTitlevalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).getAttribute("value");
        System.out.println("Freight Title value is" + FreightTitlevalue);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).sendKeys("13");
        String Freightmoneyvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).getAttribute("value");
        System.out.println("Freight money value is" + Freightmoneyvalue);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).sendKeys("Building material shipment selected");
        String Describeshipment = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).getAttribute("value");
        System.out.println("Shipment Description" + Describeshipment);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).sendKeys("Building material should be kept properly...");
        String DeliveryInstruction = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).getAttribute("value");
        System.out.println("Shipment Description" + DeliveryInstruction);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).sendKeys("Sydney new south wales australia");
        String Pickupsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).getAttribute("value");
        System.out.println("Pickup suburb is" + Pickupsuburb);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).sendKeys("Greenacre new south wales australia");
        String Dropoffsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).getAttribute("value");
        System.out.println("Dropoff suburb is" + Dropoffsuburb);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[2]/label")).click();
        String PickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[1]/div/input")).getAttribute("value");
        System.out.println("Pickup Date is" + PickupDate);
        String DropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[1]/div/input")).getAttribute("value");
        System.out.println("Dropoff Date is" + DropoffDate);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.ENTER);
         

        element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[2]/td[2]/span")));

        String Statusvalue = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[2]/td[2]/span")).getText();
        System.out.println("Status value is" + Statusvalue);
        Assert.assertEquals(Statusvalue, "Active");
        
        String BidRequestType = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[3]/td[2]")).getText();
        System.out.println("Bid Request type is" + BidRequestType);
        Assert.assertEquals(BidRequestType, "Heavy Freight");
        
        String BidCategory = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[4]/td[2]")).getText();
        System.out.println("Bid Request Category is" + BidCategory);
        if(SubShipment.equals("General Truck Shipments")){
        	Assert.assertEquals(BidCategory, "Truck Shipments");
        }
        else
        	Assert.assertEquals(BidCategory, SubShipment);
        String FreightValue = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[5]/td[2]")).getText();
        System.out.println("Freight value is" + FreightValue);
        Assert.assertEquals(FreightValue, "$" +Freightmoneyvalue);
        
        String PickAddress = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[6]/td[2]")).getText();
        System.out.println("Pickup address is" + PickAddress);
        Assert.assertEquals(PickAddress,Pickupsuburb);
        
        String DropAddress = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[7]/td[2]")).getText();
        System.out.println("Drop off address is" + DropAddress);
        Assert.assertEquals(DropAddress,Dropoffsuburb);
        
        String Notes = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[10]/td[2]")).getText();
        System.out.println("Drop off notes is" + Notes);
        Assert.assertEquals(Notes,Describeshipment);
        
        String freightTitle = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[2]/div")).getText();
        System.out.println("Freight Title is" + freightTitle);
        Assert.assertEquals(freightTitle,FreightTitlevalue);
        
        String BydefaultText = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[3]/div/div")).getText();
        System.out.println("By default text is" + BydefaultText);
        Assert.assertEquals(BydefaultText,"You currently have 0 bids for your delivery");
        
        
		}
		
		if(SubShipment.equals("Container")){
			
			org.openqa.selenium.support.ui.Select containersize = new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/select")));
			containersize.selectByIndex(containervalue);
			WebElement Containeroption =containersize.getFirstSelectedOption();
			String Containersizeoption = Containeroption.getText();
			
			System.out.println("Container size value is" + Containersizeoption);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).sendKeys("1223456");
			String PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("value");
			System.out.println("Purchase order number is =" + PurchaseOrderNumber);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/input")).sendKeys("12");
	        String Quantityvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/input")).getAttribute("value");
	        System.out.println("Quantity value is" + Quantityvalue);
	        //driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/span/input")).sendKeys("12");
	        String Lengthvalue = driver.findElement(By.xpath("//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/span/input")).getAttribute("value");
	        System.out.println("Length value is" + Lengthvalue);
	        //driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/span/input")).sendKeys("16");
	        String Widthvalue = driver.findElement(By.xpath("//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/span/input")).getAttribute("value");
	        System.out.println("Width value is" + Widthvalue);
	        //driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/span/input")).sendKeys("16");
	        String Heightvalue = driver.findElement(By.xpath("//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[5]/span/input")).getAttribute("value");
	        System.out.println("Height value is" + Heightvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[6]/span/input")).sendKeys("16");
	        String ItemWeightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[6]/span/input")).getAttribute("value");
	        System.out.println("Item weight value is" + ItemWeightvalue);
	        String TotalWeightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[7]/span/input")).getAttribute("value");
	        System.out.println("Total Weight value is" + TotalWeightvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).sendKeys("Freight Match");
	        String FreightTitlevalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).getAttribute("value");
	        System.out.println("Freight Title value is" + FreightTitlevalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).sendKeys("13");
	        String Freightmoneyvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).getAttribute("value");
	        System.out.println("Freight money value is" + Freightmoneyvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).sendKeys("Building material shipment selected");
	        String Describeshipment = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).getAttribute("value");
	        System.out.println("Shipment Description" + Describeshipment);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).sendKeys("Building material should be kept properly...");
	        String DeliveryInstruction = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).getAttribute("value");
	        System.out.println("Shipment Description" + DeliveryInstruction);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).sendKeys("Sydney new south wales australia");
	        String Pickupsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).getAttribute("value");
	        System.out.println("Pickup suburb is" + Pickupsuburb);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).sendKeys("Greenacre new south wales australia");
	        String Dropoffsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).getAttribute("value");
	        System.out.println("Dropoff suburb is" + Dropoffsuburb);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[2]/label")).click();
	        String PickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[1]/div/input")).getAttribute("value");
	        System.out.println("Pickup Date is" + PickupDate);
	        String DropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[1]/div/input")).getAttribute("value");
	        System.out.println("Dropoff Date is" + DropoffDate);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.TAB);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.ENTER);
	         

	        element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='content']/div/div/div/div[1]/div/div[1]/div[2]")));

	        String Statusvalue = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[2]/td[2]/span")).getText();
	        System.out.println("Status value is" + Statusvalue);
	        Assert.assertEquals(Statusvalue, "Active");
	        
	        String BidRequestType = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[3]/td[2]")).getText();
	        System.out.println("Bid Request type is" + BidRequestType);
	        Assert.assertEquals(BidRequestType, "Heavy Freight");
	        
	        String BidCategory = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[4]/td[2]")).getText();
	        System.out.println("Bid Request Category is" + BidCategory);
	        Assert.assertEquals(BidCategory, SubShipment);
	        String FreightValue = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[5]/td[2]")).getText();
	        System.out.println("Freight value is" + FreightValue);
	        Assert.assertEquals(FreightValue, "$" +Freightmoneyvalue);
	        
	        String PickAddress = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[6]/td[2]")).getText();
	        System.out.println("Pickup address is" + PickAddress);
	        Assert.assertEquals(PickAddress,Pickupsuburb);
	        
	        String DropAddress = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[7]/td[2]")).getText();
	        System.out.println("Drop off address is" + DropAddress);
	        Assert.assertEquals(DropAddress,Dropoffsuburb);
	        
	        String Notes = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[10]/td[2]")).getText();
	        System.out.println("Drop off notes is" + Notes);
	        Assert.assertEquals(Notes,Describeshipment);
	        
	        String freightTitle = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[2]/div")).getText();
	        System.out.println("Freight Title is" + freightTitle);
	        Assert.assertEquals(freightTitle,FreightTitlevalue);
	        
	        String BydefaultText = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[3]/div/div")).getText();
	        System.out.println("By default text is" + BydefaultText);
	        Assert.assertEquals(BydefaultText,"You currently have 0 bids for your delivery");
	        
		}
		
		if(SubShipment.equals("Full Truck Load")){
			
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).sendKeys("1223456");
			String PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("value");
			System.out.println("Purchase order number is =" + PurchaseOrderNumber);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[2]/input")).sendKeys("Test Milind");
	        String TestContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[2]/input")).getAttribute("value");
	        System.out.println("TestContact is" + TestContact);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[3]/input")).sendKeys("milind.k@gmail.com");
	        String Pickupemail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[3]/input")).getAttribute("value");
	        System.out.println("Pickup Email is" + Pickupemail);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[4]/input")).sendKeys("1234567890");
	        String Pickupphonenumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[4]/input")).getAttribute("value");
	        System.out.println("Pickup phone number is" + Pickupphonenumber);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[1]/div/input")).sendKeys("unit 1");
	        String Pickupunitnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[1]/div/input")).getAttribute("value");
	        System.out.println("Pickup unit number is" + Pickupunitnumber); 
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[2]/div/input")).sendKeys("45");
	        String PickupStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[2]/div/input")).getAttribute("value");
	        System.out.println("Pickup street number is" + PickupStreetnumber); 
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[6]/input")).sendKeys("Clarence St Sydney NSW australia");
	        String PickupStreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[6]/input")).getAttribute("value");
	        System.out.println("Pickup street name is" + PickupStreetname); 
	        driver.findElement(By.xpath(".//*[@id='pickup_notes']")).sendKeys("Pickup notes");
	        String Pickupnotes = driver.findElement(By.xpath(".//*[@id='pickup_notes']")).getAttribute("value");
	        System.out.println("Pickup notes is" + Pickupnotes); 
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[2]/input")).sendKeys("Test Arjun");
	        String TestDropoffContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[2]/input")).getAttribute("value");
	        System.out.println("Dropoff Contact name is" + TestDropoffContact);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[3]/input")).sendKeys("milind@gmail.com");
	        String TestDropoffemail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[3]/input")).getAttribute("value");
	        System.out.println("Dropoff email is" + TestDropoffemail);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[4]/input")).sendKeys("1234678");
	        String DropoffPhonenumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[4]/input")).getAttribute("value");
	        System.out.println("Dropoff phone number is" + DropoffPhonenumber);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[1]/div/input")).sendKeys("Dropoff unit 2");
	        String Dropoffunitnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[1]/div/input")).getAttribute("value");
	        System.out.println("Dropoff unit number is" + Dropoffunitnumber);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[2]/div/input")).sendKeys("23");
	        String DropoffStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[2]/div/input")).getAttribute("value");
	        System.out.println("Dropoff street number is" + DropoffStreetnumber);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[6]/input")).sendKeys("wentworth st greenacre nsw australia");
	        String DropoffStreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[6]/input")).getAttribute("value");
	        System.out.println("Dropoff street name is" + DropoffStreetname);
	        driver.findElement(By.xpath(".//*[@id='drop_notes']")).sendKeys("Drop notes");
	        String Dropoffnotes = driver.findElement(By.xpath(".//*[@id='drop_notes']")).getAttribute("value");
	        System.out.println("Dropoff notes is" + Dropoffnotes);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[1]/div/textarea")).sendKeys("Description of the bid request");
	        String Description = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[1]/div/textarea")).getAttribute("value");
	        System.out.println("Description is" + Description);
	        String PickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[7]/div[2]/div[1]/div/input")).getAttribute("value");
	        System.out.println("Pickup Date is" + PickupDate);
	        String DropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[8]/div[2]/div[1]/div/input")).getAttribute("value");
	        System.out.println("Dropoff Date is" + DropoffDate);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.TAB);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.ENTER);
	        element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[2]/td[2]/span")));

	        String Statusvalue = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[2]/td[2]/span")).getText();
	        System.out.println("Status value is" + Statusvalue);
	        Assert.assertEquals(Statusvalue, "Active");
	        
	        String BidRequestType = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[3]/td[2]")).getText();
	        System.out.println("Bid Request type is" + BidRequestType);
	        Assert.assertEquals(BidRequestType, "Heavy Freight");
	        
	        String BidCategory = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[4]/td[2]")).getText();
	        System.out.println("Bid Request Category is" + BidCategory);
	        Assert.assertEquals(BidCategory, "Full Truck Load");
	       
	        
	        String PickAddress = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[5]/td[2]")).getText();
	        System.out.println("Pickup address is" + PickAddress);
	        Assert.assertEquals(PickAddress,Pickupunitnumber + "," + " " + PickupStreetnumber + " " + PickupStreetname);
	        
	        String DropAddress = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[6]/td[2]")).getText();
	        System.out.println("Drop off address is" + DropAddress);
	        Assert.assertEquals(DropAddress,Dropoffunitnumber + "," + " " + DropoffStreetnumber + " " + DropoffStreetname);
	        
	        String Notes = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[9]/td[2]")).getText();
	        System.out.println("Drop off notes is" + Notes);
	        Assert.assertEquals(Notes,Description);
	        
	       
	        
	        String BydefaultText = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[3]/div/div")).getText();
	        System.out.println("By default text is" + BydefaultText);
	        Assert.assertEquals(BydefaultText,"You currently have 0 bids for your delivery");
	        

		}
		
		 
	}
}
