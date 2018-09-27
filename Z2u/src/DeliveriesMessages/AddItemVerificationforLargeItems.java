package DeliveriesMessages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CommonLibraries.GetQuoteLocators;
import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;

public class AddItemVerificationforLargeItems extends LaunchBrowser_inCrossBrowser{
	
	
	GetQuoteLocators objGetQuote = new GetQuoteLocators();	
	public void additem(String Shipmenttype) throws Exception 
	{
		if (Shipmenttype.equals("BuildingMaterials")) 
		{
			System.out.println("Creating 1st heavyfreight bid, shipement type- building materials");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[3]/div/div[3]/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("orderNumber")).sendKeys("test125");	
			driver.findElement(By.name("quantity")).sendKeys("8");
			Thread.sleep(1000);
			driver.findElement(By.name("length")).sendKeys("8");
			Thread.sleep(1000);
			driver.findElement(By.name("width")).sendKeys("8");
			Thread.sleep(1000);
			driver.findElement(By.name("height")).sendKeys("8");
			driver.findElement(By.name("weight")).sendKeys("8");
			Thread.sleep(1000);
			//	Duplicate the row
			WebElement duplicaterow = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[7]/img"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", duplicaterow);
			Thread.sleep(10000);
			
			//Click on add button
			Thread.sleep(10000);
			WebElement additem = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[4]/div/a[@class='btn add-item-btn button-sm pull-left']"));
			JavascriptExecutor executor2 = (JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();", additem);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[1]/input")).sendKeys("10");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[2]/span/input")).sendKeys("10");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[3]/span/input")).sendKeys("10");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[4]/span/input")).sendKeys("10");
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[5]/span/input")).sendKeys("10");
			
			//Duplicate row 3rd
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[7]/img")).click();
			Thread.sleep(1000);
			
			/* If the above code doesnt work, use this
			WebElement additemruplicate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[7]/img"));
			JavascriptExecutor executor3 = (JavascriptExecutor)driver;
			executor3.executeScript("arguments[0].click();", additemruplicate);
			Thread.sleep(1000); */
			
			
			//Remove last row
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[8]")).click();
			Thread.sleep(1000);
			
			
			/*//Delete the last row
			WebElement deleterow = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[4]/div[8][@class='col-md-1 col-action delete-dimensions ng-scope']"));
			JavascriptExecutor executor4 = (JavascriptExecutor)driver;
			executor4.executeScript("arguments[0].click();", deleterow);
			Thread.sleep(1000);*/
			
		
			Thread.sleep(1000);
	
		driver.findElement(By.name("title")).sendKeys("Title it is- Building material");
		Thread.sleep(10000);
		driver.findElement(By.name("freight_value")).sendKeys("25");
		Thread.sleep(1000);
		driver.findElement(By.name("pick_street")).sendKeys("George Street, The Rocks NSW, Australia");
		Thread.sleep(1000);	
		WebElement element = driver.findElement(By.name("drop_street"));
		element.sendKeys("Clarence Street, Sydney NSW, Australia");
		Thread.sleep(1000);
		element.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		String ordernumber = driver.findElement(By.name("orderNumber")).getAttribute("value");
		System.out.println("Entered order number is - " +ordernumber);
		
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
		String quantity2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[1]/input")).getAttribute("value");
		System.out.println("Entered quantity in secondrow is - " +quantity2);
		String length2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[2]/span/input")).getAttribute("value");
		System.out.println("Entered length in secondrow is - " +length2);
		String width2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[3]/span/input")).getAttribute("value");
		System.out.println("Entered width in secondrow is - " +width2);
		String height2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[4]/span/input")).getAttribute("value");
		System.out.println("Entered height in secondrow is - " +height2);
		String weight2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[5]/span/input")).getAttribute("value");
		System.out.println("Entered weight in secondrow is - " +weight2);
		
		
		// Data in the third row
		String quantity3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[1]/input")).getAttribute("value");
		System.out.println("Entered quantity in thirdrow is - " +quantity3);
		String length3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[2]/span/input")).getAttribute("value");
		System.out.println("Entered length in thirdrow is - " +length3);
		String width3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[3]/span/input")).getAttribute("value");
		System.out.println("Entered width in thirdrow is - " +width3);
		String height3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[4]/span/input")).getAttribute("value");
		System.out.println("Entered height in thirdrow is - " +height3);
		String weight3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[5]/span/input")).getAttribute("value");
		System.out.println("Entered weight in thirdrow is - " +weight3);
		
		
		String title = driver.findElement(By.name("title")).getAttribute("value");
		System.out.println("Entered title is - " +title);
		String freightvalue = driver.findElement(By.name("freight_value")).getAttribute("value");
		System.out.println("Entered freightvalue is - " +freightvalue);
		String pickup_address = driver.findElement(By.name("pick_street")).getAttribute("value");
		System.out.println("Entered pickup_address is - " +pickup_address);	
		String drop_address = driver.findElement(By.name("drop_street")).getAttribute("value");
		System.out.println("Entered Drop_address is - " +drop_address);	
		
		driver.findElement(By.xpath("//div[2]/div/button")).click();
		Thread.sleep(10000);

		}
		else if (Shipmenttype.equals("Container")) 
		{
			System.out.println("Creating 2nd heavyfreight bid, shipement type- conatiner");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[8]/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("orderNumber")).sendKeys("test125");	
				Thread.sleep(1000);
				Select containersize = new Select(driver.findElement(By.name("ContainerSize")));
				//Select containersize = new Select(driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/select")));
				containersize.selectByVisibleText("20ft (6.06m x 2.44m x 2.59m)");
			
				driver.findElement(By.name("quantity")).sendKeys("8");
				Thread.sleep(1000);
				
				driver.findElement(By.name("weight")).sendKeys("8");
				Thread.sleep(1000);
				//	Duplicate the row
				WebElement duplicaterow = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[8]/img"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", duplicaterow);
				Thread.sleep(10000);
				
				//Click on add button
				Thread.sleep(10000);
				WebElement additem = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[4]/div/a[@class='btn add-item-btn button-sm pull-left']"));
				JavascriptExecutor executor2 = (JavascriptExecutor)driver;
				executor2.executeScript("arguments[0].click();", additem);
				Thread.sleep(1000);
				
				Select containersize3 = new Select(driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[1]/select")));
				containersize3.selectByVisibleText("40ft (12.19m x 2.44m x 2.59m)");
				
				driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[2]/input")).sendKeys("10");
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[6]/span/input")).sendKeys("10");
				
				//Duplicate row 3rd
				driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[8]/img")).click();
				Thread.sleep(1000);
				
				/* If the above code doesnt work, use this
				WebElement additemruplicate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[7]/img"));
				JavascriptExecutor executor3 = (JavascriptExecutor)driver;
				executor3.executeScript("arguments[0].click();", additemruplicate);
				Thread.sleep(1000); */
				
				
				//Remove last row
				driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[9]")).click();
				Thread.sleep(1000);
				
				
				/*//Delete the last row
				WebElement deleterow = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[4]/div[8][@class='col-md-1 col-action delete-dimensions ng-scope']"));
				JavascriptExecutor executor4 = (JavascriptExecutor)driver;
				executor4.executeScript("arguments[0].click();", deleterow);
				Thread.sleep(1000);*/
				
			
				Thread.sleep(1000);
		
			driver.findElement(By.name("title")).sendKeys("Title it is- Building material");
			Thread.sleep(10000);
			driver.findElement(By.name("freight_value")).sendKeys("25");
			Thread.sleep(1000);
			driver.findElement(By.name("pick_street")).sendKeys("George Street, The Rocks NSW, Australia");
			Thread.sleep(1000);	
			WebElement element = driver.findElement(By.name("drop_street"));
			element.sendKeys("Clarence Street, Sydney NSW, Australia");
			Thread.sleep(1000);
			element.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			
			String ordernumber = driver.findElement(By.name("orderNumber")).getAttribute("value");
			System.out.println("Entered order number is - " +ordernumber);
			
			// Data in the first row
			
			String ContainerSize = driver.findElement(By.name("ContainerSize")).getAttribute("value");
			System.out.println("Entered quantity in firstrow is - " +ContainerSize);
		
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
			String containersize2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[1]/select")).getAttribute("value");
			System.out.println("Entered quantity in secondrow is - " +containersize2);
			
			
			String quantity2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[2]/input")).getAttribute("value");
			System.out.println("Entered quantity in secondrow is - " +quantity2);
			String length2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[3]/span/input")).getAttribute("value");
			System.out.println("Entered length in secondrow is - " +length2);
			String width2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[4]/span/input")).getAttribute("value");
			System.out.println("Entered width in secondrow is - " +width2);
			String height2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[5]/span/input")).getAttribute("value");
			System.out.println("Entered height in secondrow is - " +height2);
			String weight2 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[2]/div[6]/span/input")).getAttribute("value");
			System.out.println("Entered weight in secondrow is - " +weight2);
			
			
			// Data in the third row
			String containersize31 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[1]/select")).getAttribute("value");
			System.out.println("Entered quantity in secondrow is - " +containersize31);
			
			
			String quantity3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[2]/input")).getAttribute("value");
			System.out.println("Entered quantity in thirdrow is - " +quantity3);
			String length3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[3]/span/input")).getAttribute("value");
			System.out.println("Entered length in thirdrow is - " +length3);
			String width3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[4]/span/input")).getAttribute("value");
			System.out.println("Entered width in thirdrow is - " +width3);
			String height3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[5]/span/input")).getAttribute("value");
			System.out.println("Entered height in thirdrow is - " +height3);
			String weight3 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[3]/div[6]/span/input")).getAttribute("value");
			System.out.println("Entered weight in thirdrow is - " +weight3);
			
			
			String title = driver.findElement(By.name("title")).getAttribute("value");
			System.out.println("Entered title is - " +title);
			String freightvalue = driver.findElement(By.name("freight_value")).getAttribute("value");
			System.out.println("Entered freightvalue is - " +freightvalue);
			String pickup_address = driver.findElement(By.name("pick_street")).getAttribute("value");
			System.out.println("Entered pickup_address is - " +pickup_address);	
			String drop_address = driver.findElement(By.name("drop_street")).getAttribute("value");
			System.out.println("Entered Drop_address is - " +drop_address);	
			
			driver.findElement(By.xpath("//div[2]/div/button")).click();
			Thread.sleep(10000);
	
		}	
		
		driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
        Thread.sleep(5000);
	
	}

}
