package RequiredClassesfor_EachModule;

import java.io.IOException;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.AddressesForEachstate;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import Controller.GetQuote_Scenarios;

public class RoadInterstate_Price extends GetQuote_Scenarios{
	WebElement element;
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	AddressesForEachstate objAddress = new AddressesForEachstate();
	
	public void VerificationofRI(String Shipment,String quantityvalue,String Pickupstate,String Dropoffstate,String Vehicle) throws IOException, JSONException{
		System.out.println("GQ16:" + Shipment + ":" + " " + "with" + quantityvalue + " " + "started");
		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
		  RoadInterstatePriceCalculation objPrice = new RoadInterstatePriceCalculation();
		   
		   String Pick;
		   String Drop;
		   
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())));
		   
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
			   if (Dropoffstate.equalsIgnoreCase("VIC")){
			       Drop = objAddress.DropVICState();
			   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
				   Drop = objAddress.DropQLDState();
			   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
				   Drop = objAddress.DropACTState();
			   }
		    }
       else if(Pickupstate.equalsIgnoreCase("VIC")) {
			   
			   Pick = objAddress.PickVICState();
			   if (Dropoffstate.equalsIgnoreCase("NSW")){
			       Drop = objAddress.DropNSWState();
			   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
				   Drop = objAddress.DropQLDState();
			   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
				   Drop = objAddress.DropACTState();
			   }
		    } else  if(Pickupstate.equalsIgnoreCase("QLD")) {
				   
				   Pick = objAddress.PickQLDState();
				   if (Dropoffstate.equalsIgnoreCase("NSW")){
				       Drop = objAddress.DropNSWState();
				   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
					   Drop = objAddress.DropVICState();
				   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
					   Drop = objAddress.DropACTState();
				   }
		    }else if(Pickupstate.equalsIgnoreCase("ACT")) {
					   
					   Pick = objAddress.PickACTState();
					   if (Dropoffstate.equalsIgnoreCase("NSW")){
					       Drop = objAddress.DropNSWState();
					   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
						   Drop = objAddress.DropVICState();
					   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
						   Drop = objAddress.DropQLDState();
					   }
		    }
       
       driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Keys.TAB);
       element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")));
		   WebElement element1 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input"));
		    ((JavascriptExecutor) driver).executeScript(
		            "arguments[0].scrollIntoView();", element1);
		   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys("12");
		   String weight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).getAttribute("value");
		   int InWeight = Integer.parseInt(weight);
		   
		   int Price = objPrice.pricealculated(Shipment, Vehicle, InWeight);
		   driver.findElement(By.xpath(objGetQuote.Getquotebtn())).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath(objGetQuote.Getquotebtn())).sendKeys(Keys.ENTER);
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[2]/span")));
		   String ActualPrice;
		   ActualPrice = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[2]/span")).getText();
		   
		  
		   System.out.println("Actual Price is" + ActualPrice);
		   Assert.assertEquals(ActualPrice, "$" + Price );
		   System.out.println("GQ16:" + Shipment + ":" + " " + "with" + quantityvalue + " " + "completed");
	}

}
