package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.URL_Staging;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class Add_item_verification_heavyfreight extends MAB_Scenarios {
	URL_Staging objurl = new URL_Staging();
	WebElement element;
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	MABDefaultMessages objDefaultMessages = new MABDefaultMessages();
	  
	 public void Additem_verification_HF(String Shipmenttype) throws InterruptedException
	 {
		if (Shipmenttype.equals("BuildingMaterials")||Shipmenttype.equals("GeneralTruckShipments")||Shipmenttype.equals("Pallets")||Shipmenttype.equals("Machinery")||Shipmenttype.equals("Vehicles"))
		{ 
			
		System.out.println(".................................................................................................");
		System.out.println("MAB11: Verify the add item verification for heavy freight bid request....");
		driver.findElement(By.xpath(objMAB.MAB_LargeItemsshipmentLocator())).click();
		 
		if (Shipmenttype.equals("BuildingMaterials")) 
		{	
		 System.out.println("Verify the add item verification for BuildingMaterials....");
		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_BuildingMaterialsShipmentLocator())));
		 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_BuildingMaterialsShipmentLocator())).click();
		} 
	
		else if (Shipmenttype.equals("GeneralTruckShipments")) 
		{	
		 System.out.println("Verify the add item verification for GeneralTruckShipments....");
		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_GeneralTruckShipmentLocator())));
		 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralTruckShipmentLocator())).click();
		} 
		
		else if (Shipmenttype.equals("Pallets")) 
		{		
			 System.out.println("Verify the add item verification for Pallets....");
		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_PalletsShipmentLocator())));
		 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_PalletsShipmentLocator())).click();
		} 
	
		else if (Shipmenttype.equals("Machinery")) 
		{	
			 System.out.println("Verify the add item verification for Machinery....");
		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_MachineryShipmentLocator())));
		 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_MachineryShipmentLocator())).click();
		} 
	
		else if (Shipmenttype.equals("Vehicles")) 
		{	
			 System.out.println("Verify the add item verification for Vehicles....");
		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_VehiclesShipmentLocator())));
		 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_VehiclesShipmentLocator())).click();
		} 
	
		driver.findElement(By.name("quantity")).sendKeys("8");
		driver.findElement(By.name("length")).sendKeys("8");
		driver.findElement(By.name("width")).sendKeys("8");
		driver.findElement(By.name("height")).sendKeys("8");
		driver.findElement(By.name("weight")).sendKeys("8");
		
		//	Duplicate the row
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[7]/img")));
		WebElement duplicaterow = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[7]/img"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", duplicaterow);
		
		//Click on add button	
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[4]/div/a[@class='btn add-item-btn button-sm pull-left']")));
		WebElement additem = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[4]/div/a[@class='btn add-item-btn button-sm pull-left']"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", additem);
		
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[1]/input")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[2]/span/input")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[3]/span/input")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[4]/span/input")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[5]/span/input")).sendKeys("10");
		
		// Data in the first row
		String quantity = driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println("Entered quantity in firstrow is - " +quantity);
		String length = driver.findElement(By.name("length")).getAttribute("value");
		System.out.println("Entered length in firstrow is - " +length);
		String width = driver.findElement(By.name("width")).getAttribute("value");
		System.out.println("Entered width in firstrow is - " +width);
		String height = driver.findElement(By.name("height")).getAttribute("value");
		System.out.println("Entered height in firstrow is - " +height);
		String weight = driver.findElement(By.name("weight")).getAttribute("value");
		System.out.println("Entered weight in firstrow is - " +weight);
		
		// Data in the second row
		String quantity2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[1]/input")).getAttribute("value");
		System.out.println("Entered quantity in secondrow is - " +quantity2);
		String length2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[2]/span/input")).getAttribute("value");
		System.out.println("Entered length in secondrow is - " +length2);
		String width2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[3]/span/input")).getAttribute("value");
		System.out.println("Entered width in secondrow is - " +width2);
		String height2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[4]/span/input")).getAttribute("value");
		System.out.println("Entered height in secondrow is - " +height2);
		String weight2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[5]/span/input")).getAttribute("value");
		System.out.println("Entered weight in secondrow is - " +weight2);
		
		// Data in the third row
		String quantity3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[1]/input")).getAttribute("value");
		System.out.println("Entered quantity in thirdrow is - " +quantity3);
		String length3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[2]/span/input")).getAttribute("value");
		System.out.println("Entered length in thirdrow is - " +length3);
		String width3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[3]/span/input")).getAttribute("value");
		System.out.println("Entered width in thirdrow is - " +width3);
		String height3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[4]/span/input")).getAttribute("value");
		System.out.println("Entered height in thirdrow is - " +height3);
		String weight3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[5]/span/input")).getAttribute("value");
		System.out.println("Entered weight in thirdrow is - " +weight3);
		
		
		//Remove last two rows
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[8]")).click();
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[8]")).click();
		System.out.println(".....................................................................................................");
		} 
	
		
		if(Shipmenttype.equals("Container"))
		{
			System.out.println(".................................................................................................");
			System.out.println("MAB11: Verify the add item verification for heavy freight bid request....");
			 driver.findElement(By.xpath(objMAB.MAB_LargeItemsshipmentLocator())).click();
				 
			 System.out.println("Verify the add item verification for Container....");
			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_ContainerShipmentLocator())));
			 driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_ContainerShipmentLocator())).click();
			 
			 
				driver.findElement(By.name("orderNumber")).sendKeys("test125");	
				Select containersize = new Select(driver.findElement(By.name("ContainerSize")));
				containersize.selectByVisibleText("20ft (6.06m x 2.44m x 2.59m)");
				driver.findElement(By.name("quantity")).sendKeys("8");
				driver.findElement(By.name("weight")).sendKeys("8");
				
				//	Duplicate the row
				element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[8]/img")));
				WebElement duplicaterow = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[8]/img"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", duplicaterow);
				
				//Click on add button
				element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[4]/div/a[@class='btn add-item-btn button-sm pull-left']")));
				WebElement additem = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[4]/div/a[@class='btn add-item-btn button-sm pull-left']"));
				JavascriptExecutor executor2 = (JavascriptExecutor)driver;
				executor2.executeScript("arguments[0].click();", additem);
				
				Select containersize3 = new Select(driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[1]/select")));
				containersize3.selectByVisibleText("40ft (12.19m x 2.44m x 2.59m)");
				driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[2]/input")).sendKeys("10");
				driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[6]/span/input")).sendKeys("10");
				
				//get data from the first row
				String ContainerSize = driver.findElement(By.name("ContainerSize")).getAttribute("value");
				System.out.println("Entered container size in firstrow is - " +ContainerSize);
				String quantity = driver.findElement(By.name("quantity")).getAttribute("value");
				System.out.println("Entered quantity in firstrow is - " +quantity);
				String length = driver.findElement(By.name("length")).getAttribute("value");
				System.out.println("Entered length in firstrow is - " +length);
				String width = driver.findElement(By.name("width")).getAttribute("value");
				System.out.println("Entered width in firstrow is - " +width);
				String height = driver.findElement(By.name("height")).getAttribute("value");
				System.out.println("Entered height in firstrow is - " +height);
				String weight = driver.findElement(By.name("weight")).getAttribute("value");
				System.out.println("Entered weight in firstrow is - " +weight);
				String Total_weight= driver.findElement(By.name("total_weight")).getAttribute("value");
				System.out.println("Total weight of the firstrow is - " +Total_weight);
				
				// Data in the second row
				String containersize2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[1]/select")).getAttribute("value");
				System.out.println("Entered container size in secondrow is - " +containersize2);
				String quantity2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[2]/input")).getAttribute("value");
				System.out.println("Entered quantity in secondrow is - " +quantity2);
				String length2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[3]/span/input")).getAttribute("value");
				System.out.println("Entered length in secondrow is - " +length2);
				String width2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[4]/span/input")).getAttribute("value");
				System.out.println("Entered width in secondrow is - " +width2);
				String height2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[5]/span/input")).getAttribute("value");
				System.out.println("Entered height in secondrow is - " +height2);
				String weight2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[6]/span/input")).getAttribute("value");
				System.out.println("Entered weight in secondrow is - " +weight2);
				String Total_weight2= driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[7]/span/input")).getAttribute("value");
				System.out.println("Total weight of the secondrow is - " +Total_weight2);
			
				// Data in the third row
				String containersize31 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[1]/select")).getAttribute("value");
				System.out.println("Entered container size in secondrow is - " +containersize31);
				String quantity3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[2]/input")).getAttribute("value");
				System.out.println("Entered quantity in thirdrow is - " +quantity3);
				String length3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[3]/span/input")).getAttribute("value");
				System.out.println("Entered length in thirdrow is - " +length3);
				String width3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[4]/span/input")).getAttribute("value");
				System.out.println("Entered width in thirdrow is - " +width3);
				String height3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[5]/span/input")).getAttribute("value");
				System.out.println("Entered height in thirdrow is - " +height3);
				String weight3 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[6]/span/input")).getAttribute("value");
				System.out.println("Entered weight in thirdrow is - " +weight3);
				String Total_weight3= driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[7]/span/input")).getAttribute("value");
				System.out.println("Total weight of the thirdrow is - " +Total_weight3);
			
					
				//Remove both the rows
				driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[3]/div[9]")).click();
				driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[2]/div[9]")).click();
			
			//Insert data to create bid
			driver.findElement(By.name("title")).sendKeys("Title it is- container");
			driver.findElement(By.name("freight_value")).sendKeys("25");
			driver.findElement(By.name("pick_customerName")).sendKeys("Test pick");
		//	driver.findElement(By.name("pick_customerName")).sendKeys(Keys.TAB);
			//element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("pick_mobile")));
			driver.findElement(By.name("pick_mobile")).sendKeys("5849858");
			driver.findElement(By.name("pick_street")).sendKeys("George Street, The Rocks NSW, Australia");
			
			 
			driver.findElement(By.name("drop_customerName")).sendKeys("test Drop");
			//element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("pick_mobile")));
			//driver.findElement(By.name("drop_customerName")).sendKeys(Keys.TAB);
			driver.findElement(By.name("drop_mobile")).sendKeys("55485");
			WebElement element = driver.findElement(By.name("drop_street"));
			element.sendKeys("Clarence Street, Sydney NSW, Australia");
			element.sendKeys(Keys.TAB);
 
			
			String ordernumber = driver.findElement(By.name("orderNumber")).getAttribute("value");
			System.out.println("Entered order number is - " +ordernumber);
			String title = driver.findElement(By.name("title")).getAttribute("value");
			System.out.println("Entered title is - " +title);
			String freightvalue = driver.findElement(By.name("freight_value")).getAttribute("value");
			System.out.println("Entered freightvalue is - " +freightvalue);
			String pickup_address = driver.findElement(By.name("pick_street")).getAttribute("value");
			System.out.println("Entered pickup_address is - " +pickup_address);	
			String drop_address = driver.findElement(By.name("drop_street")).getAttribute("value");
			System.out.println("Entered Drop_address is - " +drop_address);	
		
			//element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[10]/div/div/div/label/input[@name='terms']")));
			//WebElement drive =driver.findElement(By.cssSelector("span.accept-terms.ng-scope::before"));
		      //drive.sendKeys(Keys.ENTER);	
			//driver.findElement(By.xpath("//a[contains(text(),'terms and conditions')]/preceding::before")).click(); 
			WebElement elem = driver.findElement(By.cssSelector("span.accept-terms.ng-scope"));

			driver.executeScript(
			    "(arguments[0].click(),':before')"
			    , elem);
			//System.out.println("value is="+pseudo_content);
			//Actions action = new Actions(driver);
			//action.moveToElement(driver.findElement(By.cssSelector("span.accept-terms.ng-scope:before"))).click().build().perform();
			//WebElement switchLabel = driver.findElement(By.xpath("'your xpath/id/Css/etc here"));
			//String pseudo = ;
			//System.out.println(pseudo);
			//JavascriptExecutor executor = (JavascriptExecutor)driver;
			//executor.executeScript("arguments[0].click();", switchLabel);
            //Thread.sleep(10000);
 	        driver.findElement(By.xpath("//div[@class='page-footer']/button")).click();		
			element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='courier-offers-text']")));
 	        String bidpage = driver.findElement(By.xpath("//div[@class='courier-offers-text'][contains(text(),'Our driver community will be')]")).getText();
 	        System.out.println("bid page is=" + bidpage);
			Assert.assertEquals(bidpage, "Our driver community will be" + "\n" + "bidding on your work shortly.");
			driver.findElement(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())).click();
			System.out.println("MAB11: Completed Verify the add item verification for heavy freight bid request");
			System.out.println(".....................................................................................................");
			//element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='content']/div/div/div/div[1]/div/div[1]/div[2]")));
			 
		}
		
		
		
	 }
	
}
