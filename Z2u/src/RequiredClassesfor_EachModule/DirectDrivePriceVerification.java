package RequiredClassesfor_EachModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.AddressesForEachstate;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import Controller.LaunchBrowser_inCrossBrowser;

public class DirectDrivePriceVerification extends LaunchBrowser_inCrossBrowser {
	
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	AddressesForEachstate objAddress = new AddressesForEachstate();
    WebElement element;
	public void DirectDrivePriceVerify(String Pickupstate,String Dropoffstate, String Weight,String Shipment,String quantityvalue) throws InterruptedException{
		
		System.out.println("GQ19:" + Shipment + ":" + " " + "with" + Pickupstate + " " + "and" + Dropoffstate + " " + "started");
		   String Pick;
		   String Drop;
		   
		  
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));

		   if(Shipment.equals("Documents")){
			   			   
			   driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			   }
		   if(Shipment.equals("Satchel, laptops")){
			   
			   driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
			   }

		   if(Shipment.equals("Cakes, flowers, delicates")){
	   
			   driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
		      
	   }

		   if(Shipment.equals("Small Box")){
	   
			   driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
		       
	   }
		   if(Shipment.equals("Large Box")){
			   
			   driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			   
		       
	   }   
        if(Pickupstate.equalsIgnoreCase("NSW")) {
			   
			   Pick = objAddress.PickNSWState();
			   if (Dropoffstate.equalsIgnoreCase("ACT")){
			       Drop = objAddress.DropACTState();
			   }
		    }
        else  if(Pickupstate.equalsIgnoreCase("ACT")) {
					   
					   Pick = objAddress.PickACTState();
					   if (Dropoffstate.equalsIgnoreCase("NSW")){
					       Drop = objAddress.DropNSWState();
					   }			  
					  }
		   
		   driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Keys.TAB);
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")));

		   WebElement element1 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input"));
		    ((JavascriptExecutor) driver).executeScript(
		            "arguments[0].scrollIntoView();", element1);
		   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys(Weight);
		   String weight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).getAttribute("value");
		   int InWeight = Integer.parseInt(weight);
		   
		   driver.findElement(By.xpath(objGetQuote.Getquotebtn())).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath(objGetQuote.Getquotebtn())).sendKeys(Keys.ENTER);
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[3]/div[2]/span")));

		   String ActualPrice;
		   ActualPrice = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[3]/div[2]/span")).getText();
		   System.out.println("Actual Price is=" + ActualPrice);
		   Assert.assertEquals(ActualPrice, "$400");
		   String ETA_DirectDrive = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[3]/div[1]")).getText();
		   System.out.println("Actual ETA is=" + ETA_DirectDrive);
		   Assert.assertEquals(ETA_DirectDrive, "Deliver ASAP");
		    
		   System.out.println("GQ19:" + Shipment + ":" + " " + "with" + " " + Pickupstate + " " + "and" + Dropoffstate + " " + "completed");
	}
}
