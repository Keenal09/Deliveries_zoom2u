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

public class AirInterstatePriceVerify extends GetQuote_Scenarios {
    WebElement element;
    GetQuoteLocators objGetQuote = new GetQuoteLocators();
    AddressesForEachstate objAddress = new AddressesForEachstate();
	public void AirInterstateVerification(String Shipment,String quantityvalue,String Pickupstate,String Dropoffstate,String Vehicle) throws IOException, JSONException{
		 System.out.println("GQ13:" + Shipment + ":" + " " + "started");
		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
		   InterstatePriceCalculation objPrice = new InterstatePriceCalculation();
		   
		   String Pick;
		   String Drop;
		   
		  if(Shipment.equals("Documents")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())));		   
			   driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			   }
		   if(Shipment.equals("Satchel, laptops")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())));
			   driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
			   }

		   if(Shipment.equals("Cakes, flowers, delicates")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())));
			   driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
		      
	   }

		   if(Shipment.equals("Small Box")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())));
			   driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
		       
	   }
		   if(Shipment.equals("Large Box")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())));
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
			   }else if (Dropoffstate.equalsIgnoreCase("WA")){
				   Drop = objAddress.DropWAState();
			   }else if (Dropoffstate.equalsIgnoreCase("SA")){
				   Drop = objAddress.DropSAState();
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
			   }else if (Dropoffstate.equalsIgnoreCase("WA")){
				   Drop = objAddress.DropWAState();
			   }else if (Dropoffstate.equalsIgnoreCase("SA")){
				   Drop = objAddress.DropSAState();
			   }
		    } else  if(Pickupstate.equalsIgnoreCase("QLD")) {
				   
				   Pick = objAddress.PickQLDState();
				   if (Dropoffstate.equalsIgnoreCase("NSW")){
				       Drop = objAddress.DropNSWState();
				   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
					   Drop = objAddress.DropVICState();
				   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
					   Drop = objAddress.DropACTState();
				   }else if (Dropoffstate.equalsIgnoreCase("WA")){
					   Drop = objAddress.DropWAState();
				   }else if (Dropoffstate.equalsIgnoreCase("SA")){
					   Drop = objAddress.DropSAState();
				   }
		    }else  if(Pickupstate.equalsIgnoreCase("ACT")) {
					   
					   Pick = objAddress.PickACTState();
					   if (Dropoffstate.equalsIgnoreCase("NSW")){
					       Drop = objAddress.DropNSWState();
					   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
						   Drop = objAddress.DropVICState();
					   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
						   Drop = objAddress.DropQLDState();
					   }else if (Dropoffstate.equalsIgnoreCase("WA")){
						   Drop = objAddress.DropWAState();
					   }else if (Dropoffstate.equalsIgnoreCase("SA")){
						   Drop = objAddress.DropSAState();
					   }
		    }else  if(Pickupstate.equalsIgnoreCase("WA")) {
						   
						   Pick = objAddress.PickWAState();
					   
						   if (Dropoffstate.equalsIgnoreCase("NSW")){
						       Drop = objAddress.DropNSWState();
						   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
							   Drop = objAddress.DropVICState();
						   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
							   Drop = objAddress.DropQLDState();
						   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
							   Drop = objAddress.DropACTState();
						   }else if (Dropoffstate.equalsIgnoreCase("SA")){
							   Drop = objAddress.DropSAState();
						   }
		    }else  if(Pickupstate.equalsIgnoreCase("SA")) {
							   
							   Pick = objAddress.PickSAState();
							   if (Dropoffstate.equalsIgnoreCase("NSW")){
							       Drop = objAddress.DropNSWState();
							   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
								   Drop = objAddress.DropVICState();
							   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
								   Drop = objAddress.DropQLDState();
							   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
								   Drop = objAddress.DropACTState();
							   }else if (Dropoffstate.equalsIgnoreCase("WA")){
								   Drop = objAddress.DropWAState();
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
		   
		   
		   String ActualPrice = null;
		   if(Pickupstate.equals("SA") || Pickupstate.equals("WA")){
			   if(Dropoffstate.equals("NSW") || Dropoffstate.equals("VIC") || Dropoffstate.equals("QLD")|| Dropoffstate.equals("ACT") || Dropoffstate.equals("SA") || Dropoffstate.equals("WA") ){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[2]/span")));
			   ActualPrice = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[2]/span")).getText();
			   }
		}else  if(Dropoffstate.equals("SA") || Dropoffstate.equals("WA")){
			   if(Pickupstate.equals("NSW") || Pickupstate.equals("VIC") || Pickupstate.equals("QLD")|| Pickupstate.equals("ACT") || Pickupstate.equals("SA") || Pickupstate.equals("WA")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[2]/span")));
			   ActualPrice = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[2]/span")).getText();
			   }
		}
		   else{
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[2]/span")));
			   ActualPrice = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[2]/span")).getText();
		   }
		   System.out.println("Actual Price is" + ActualPrice);
		   Assert.assertEquals(ActualPrice, "$" + Price );
		   System.out.println("GQ13:" + Shipment + ":" + " " + "completed");
	}
	
}
