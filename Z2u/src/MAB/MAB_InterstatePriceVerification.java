package MAB;

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
import CommonLibraries.MAB_Addressforeachstate;
import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import RequiredClassesfor_EachModule.InterstatePriceCalculation;

public class MAB_InterstatePriceVerification extends MAB_Scenarios{
	
	WebElement element;
    MakeaBookingLocator objMAB = new MakeaBookingLocator();
    MAB_Addressforeachstate objAddress = new MAB_Addressforeachstate();
	public void AirInterstateVerification(String Shipment,String quantityvalue,String Pickupstate,String Dropoffstate,String Vehicle) throws IOException, JSONException{
		 System.out.println("MAB:" + Shipment + ":" + " " + "started");
		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.MAB_DocumentshipmentLocator())));
		   MAB_InterstatePricecalculation objPrice = new MAB_InterstatePricecalculation();
		   
		   String Pick;
		   String Drop;
		   
		  if(Shipment.equals("Documents")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())));		   
			   driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			   }
		   if(Shipment.equals("Satchel, laptops")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			  
			   }

		   if(Shipment.equals("Cakes, flowers, delicates")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			  
		      
	   }

		   if(Shipment.equals("Small Box")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			  
		       
	   }
		   if(Shipment.equals("Large Box")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			   
		       
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
		   
		   driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).sendKeys(Keys.TAB);
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='form-group']/input[@name='weight']")));
		   WebElement element1 = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='weight']"));
		    ((JavascriptExecutor) driver).executeScript(
		            "arguments[0].scrollIntoView();", element1);
		   driver.findElement(By.xpath("//div[@class='form-group']/input[@name='weight']")).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath("//div[@class='form-group']/input[@name='weight']")).sendKeys("1");
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='form-group']/input[@name='weight']")));
		   String weight = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='weight']")).getAttribute("value");
		   int InWeight = Integer.parseInt(weight);
		   
		  
		   int Price = objPrice.pricealculated(Shipment, Vehicle, InWeight);
		   driver.findElement(By.xpath("//div[@class='page-footer']/button[@type='submit']")).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath("//div[@class='page-footer']/button[@type='submit']")).sendKeys(Keys.ENTER);
		   
		   
		   String ActualPrice = null;
		   if(Pickupstate.equals("SA") || Pickupstate.equals("WA")){
			   if(Dropoffstate.equals("NSW") || Dropoffstate.equals("VIC") || Dropoffstate.equals("QLD")|| Dropoffstate.equals("ACT") || Dropoffstate.equals("SA") || Dropoffstate.equals("WA") ){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='page-width']/div[10]/div[1]/div[2]/span")));
			   ActualPrice = driver.findElement(By.xpath("//div[@class='page-width']/div[10]/div[1]/div[2]/span")).getText();
			   }
		}else  if(Dropoffstate.equals("SA") || Dropoffstate.equals("WA")){
			   if(Pickupstate.equals("NSW") || Pickupstate.equals("VIC") || Pickupstate.equals("QLD")|| Pickupstate.equals("ACT") || Pickupstate.equals("SA") || Pickupstate.equals("WA")){
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='page-width']/div[10]/div[1]/div[2]/span")));
			   ActualPrice = driver.findElement(By.xpath("//div[@class='page-width']/div[10]/div[1]/div[2]/span")).getText();
			   }
		}
		   else{
			   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='page-width']/div[10]/div[1]/div[2]/span")));
			   ActualPrice = driver.findElement(By.xpath("//div[@class='page-width']/div[10]/div[2]/div[2]/span")).getText();
		   }
		   System.out.println("Actual Price is" + ActualPrice);
		   Assert.assertEquals(ActualPrice, "$" + Price );
		   System.out.println("MAB:" + Shipment + ":" + " " + "completed");
	}


}
