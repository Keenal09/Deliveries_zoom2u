package Controller;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.AddressesForEachstate;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.MenuLocators;
import CommonLibraries.URL_Staging;
import DeliveriesMessages.GetQuoteDefaultMessages;
import RequiredClassesfor_EachModule.ETA;
import RequiredClassesfor_EachModule.ETADateandTime;
import RequiredClassesfor_EachModule.ExtraLargeService;
import RequiredClassesfor_EachModule.SameStateCalculation;
import RequiredClassesfor_EachModule.SpeedCalculation;
import RequiredClassesfor_EachModule.TimeCalculation;

public class ETA_RoadInterstateTime extends LaunchBrowser_inCrossBrowser  {
 
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	URL_Staging objurl = new URL_Staging();
	GetQuoteDefaultMessages objDefaultMessages = new GetQuoteDefaultMessages();
	ETA objETA = new ETA();
	ETADateandTime objETATime = new ETADateandTime();
	SameStateCalculation ObjSameDay = new SameStateCalculation();
	SpeedCalculation objspeed = new SpeedCalculation();
	TimeCalculation pickupTime = new TimeCalculation();
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	MenuLocators objMenu = new MenuLocators();
	 ExtraLargeService objExtralarge = new ExtraLargeService();
	 AddressesForEachstate objAddress = new AddressesForEachstate();
	 WebElement element;
	 public void ETAInterstateVerify(String Shipment,String Date, String PickupTime,String Pickupstate, String Dropoffstate,String Weight) throws ParseException, InterruptedException {
		 System.out.println("GQ17:" + Shipment + ":" + " " + "with" + " " + Date + ":" + " " + Pickupstate + " " + "and" + Dropoffstate + " " + "started");
		 element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));

			if(Shipment.equals("Documents")){
	      	  driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).click();
	      	  }
	      	  if(Shipment.equals("Satchel, laptops")){
	          	  driver.findElement(By.xpath(objGetQuote.LaptopsShipmentLocator())).click();
	          	  }
	      	  if(Shipment.equals("Small box")){
	          	  driver.findElement(By.xpath(objGetQuote.SmallBoxShipmentLocator())).click();
	          	  }
	      	  if(Shipment.equals("Cakes, flowers, delicates")){
	          	  driver.findElement(By.xpath(objGetQuote.CakesandFlowersShipmentLocator())).click();
	          	  }
	      	  if(Shipment.equals("Large Box")){
	          	  driver.findElement(By.xpath(objGetQuote.LargeBoxShipmentLocator())).click();
	          	  }
	      	element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupaddresstextfieldLocator())));

	      	if(Pickupstate.equalsIgnoreCase("NSW")) {
				   
				   objAddress.PickNSWState();
				   if (Dropoffstate.equalsIgnoreCase("VIC")){
				       objAddress.DropVICState();
				   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
					   objAddress.DropQLDState();
				   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
					   objAddress.DropACTState();
				   }
			    }
	       else if(Pickupstate.equalsIgnoreCase("VIC")) {
				   
				   objAddress.PickVICState();
				   if (Dropoffstate.equalsIgnoreCase("NSW")){
				       objAddress.DropNSWState();
				   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
					   objAddress.DropQLDState();
				   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
					   objAddress.DropACTState();
				   }
			    } else  if(Pickupstate.equalsIgnoreCase("QLD")) {
					   
					   objAddress.PickQLDState();
					   if (Dropoffstate.equalsIgnoreCase("NSW")){
					       objAddress.DropNSWState();
					   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
						   objAddress.DropVICState();
					   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
						   objAddress.DropACTState();
					   }
			    }else  if(Pickupstate.equalsIgnoreCase("ACT")) {
						   
						   objAddress.PickACTState();
						   if (Dropoffstate.equalsIgnoreCase("NSW")){
						       objAddress.DropNSWState();
						   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
							   objAddress.DropVICState();
						   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
							   objAddress.DropQLDState();
						   }
			    }
	      	 driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Keys.TAB);
	      	element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")));

			   WebElement element1 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input"));
			    ((JavascriptExecutor) driver).executeScript(
			            "arguments[0].scrollIntoView();", element1);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys(Keys.TAB);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys(Weight);
	      	driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Keys.TAB);
	      	
	      	  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).clear();	  
	      	  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Date);
	      	  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Keys.ENTER);
	      	  String date = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).getAttribute("value");
	      	  System.out.println("date is=" + date);
	  	  
	        //Not current date 
	  	  String cdate = objETA.ETACurrentDate();
	  	  String NextDay = objETA.ETANextDate();
	  	  String Day = objETA.ETADay(date);
	  	  String CurrentNextDay = objETATime.ETADate(date);
	  	  String Next2NextDay = objETA.ETAnext2nextDay(date);
	  	  String NexxtDay = objETA.ETANextDay(date);
	  	  String Days2fromDate = objETA.ETA2DaysfromtheDate(date);
	  	  String Days3fromDate = objETA.ETA3DaysfromtheDate(date);
	  	  
	  	if(PickupTime.equals("12am_12pm")){
	  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
	  		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));

	  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("9:00am");
	  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
	  	  }
	  	  else if(PickupTime.equals("After 12pm")){
	  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
	  		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
	  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("1:00pm");
	  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
	  	  }
	  	element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")));
	  	    if(PickupTime.equals("12am_12pm")){
	  	    	if((Pickupstate.equals("QLD") && Dropoffstate.equals("NSW")) || (Pickupstate.equals("QLD") && Dropoffstate.equals("ACT")) || (Pickupstate.equalsIgnoreCase("NSW") && Dropoffstate.equalsIgnoreCase("QLD")) || (Pickupstate.equalsIgnoreCase("NSW") && Dropoffstate.equalsIgnoreCase("ACT")) || (Pickupstate.equalsIgnoreCase("NSW") && Dropoffstate.equalsIgnoreCase("VIC")) || (Pickupstate.equalsIgnoreCase("ACT") && Dropoffstate.equalsIgnoreCase("NSW")) || (Pickupstate.equalsIgnoreCase("ACT") && Dropoffstate.equalsIgnoreCase("VIC")) || (Pickupstate.equalsIgnoreCase("VIC") && Dropoffstate.equalsIgnoreCase("NSW")) || (Pickupstate.equalsIgnoreCase("VIC") && Dropoffstate.equalsIgnoreCase("ACT"))){
	  	    		String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
	  	        	if(date.equals(cdate) && (Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday"))){
	  	        		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (!Next2NextDay.equalsIgnoreCase("Saturday") || !Next2NextDay.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm tomorrow");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) && (Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday") && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday")))){
	  	        		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) &&  (Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday") && (Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday")))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) &&  (!Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") && (!Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday")))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Next2NextDay.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if((!Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday")) && ((!Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday")))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Next2NextDay.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday")){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday")){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else{
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Next2NextDay.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        		
	  	        }else if(Pickupstate.equals("QLD") && Dropoffstate.equals("VIC") || (Pickupstate.equalsIgnoreCase("ACT") && Dropoffstate.equalsIgnoreCase("QLD")) || (Pickupstate.equalsIgnoreCase("VIC") && Dropoffstate.equalsIgnoreCase("QLD")))
	  	        {
	  	        	String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
	  	        	if(date.equals(cdate) && (Day.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Saturday")) && (Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Sunday"))){
	  	        		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days2fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && Days2fromDate.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) && (Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday") && (!Next2NextDay.equalsIgnoreCase("Sunday") && Days2fromDate.equalsIgnoreCase("Sunday")))){
	  	        		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) &&  (!Next2NextDay.equalsIgnoreCase("Saturday") && Days2fromDate.equalsIgnoreCase("Saturday") || (!Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("sunday")))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) &&  (!Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") && (!Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday")) && (!Days2fromDate.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Sunday")))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days2fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if((!Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday")) && ((!Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday")) && ((!Days2fromDate.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Sunday"))))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days2fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(Day.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday")){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(Next2NextDay.equalsIgnoreCase("Saturday") && Days2fromDate.equalsIgnoreCase("Sunday")){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(Next2NextDay.equalsIgnoreCase("Sunday") && Days2fromDate.equalsIgnoreCase("monday")){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else{
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days2fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        		
	  	        }
	  	    }else if(PickupTime.equalsIgnoreCase("After 12pm"))
	  	    {
	  	    	if((Pickupstate.equals("QLD") && Dropoffstate.equals("NSW")) || (Pickupstate.equals("QLD") && Dropoffstate.equals("ACT")) || (Pickupstate.equalsIgnoreCase("NSW") && Dropoffstate.equalsIgnoreCase("QLD")) || (Pickupstate.equalsIgnoreCase("NSW") && Dropoffstate.equalsIgnoreCase("ACT")) || (Pickupstate.equalsIgnoreCase("NSW") && Dropoffstate.equalsIgnoreCase("VIC")) || (Pickupstate.equalsIgnoreCase("ACT") && Dropoffstate.equalsIgnoreCase("NSW")) || (Pickupstate.equalsIgnoreCase("ACT") && Dropoffstate.equalsIgnoreCase("VIC")) || (Pickupstate.equalsIgnoreCase("VIC") && Dropoffstate.equalsIgnoreCase("NSW")) || (Pickupstate.equalsIgnoreCase("VIC") && Dropoffstate.equalsIgnoreCase("ACT"))){
	  	    		
	  	    		String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
	  	    		if(date.equals(cdate) && (Day.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Saturday")) && (Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Sunday"))){
	  	        		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days2fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && Days2fromDate.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) && (Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday") && (!Next2NextDay.equalsIgnoreCase("Sunday") && Days2fromDate.equalsIgnoreCase("Sunday")))){
	  	        		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) &&  (!Next2NextDay.equalsIgnoreCase("Saturday") && Days2fromDate.equalsIgnoreCase("Saturday") || (!Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("sunday")))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(date.equals(NextDay) &&  (!Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") && (!Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday")) && (!Days2fromDate.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Sunday")))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days2fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if((!Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday")) && ((!Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday")) && ((!Days2fromDate.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Sunday"))))){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days2fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(Day.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday")){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(Next2NextDay.equalsIgnoreCase("Saturday") && Days2fromDate.equalsIgnoreCase("Sunday")){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else if(Days2fromDate.equalsIgnoreCase("Saturday") || Days2fromDate.equalsIgnoreCase("Sunday")){
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	        	else{
	  	        		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days2fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	              	 System.out.println("First ETA text is=" + FirstETAText);
	  	        	}
	  	    	}else if((Pickupstate.equalsIgnoreCase("QLD") && Dropoffstate.equals("VIC")) || (Pickupstate.equalsIgnoreCase("VIC") && Dropoffstate.equalsIgnoreCase("QLD"))){
	  	    		String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
	  	    			if(date.equals(cdate) && (Day.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Saturday")) && (Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Sunday"))){
	  	    				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm thursday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	  	    				System.out.println("First ETA text is=" + FirstETAText);
	  	        	}else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && Days2fromDate.equalsIgnoreCase("Sunday"))){
  	    				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm tuesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
  	    				System.out.println("First ETA text is=" + FirstETAText);
  	        	} else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && Days2fromDate.equalsIgnoreCase("Saturday") && !Days3fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday") && Days3fromDate.equalsIgnoreCase("Sunday"))){
	    				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	    				System.out.println("First ETA text is=" + FirstETAText);
	        	}else if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday") && Days3fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday") && !Days3fromDate.equalsIgnoreCase("Sunday"))){
    				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    				System.out.println("First ETA text is=" + FirstETAText);
        	}
  	        	else if(date.equals(NextDay) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
    				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days3fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    				System.out.println("First ETA text is=" + FirstETAText);
        	} else if(date.equals(NextDay) && (Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm thursday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
				System.out.println("First ETA text is=" + FirstETAText);
    	} 
        	else if(date.equals(NextDay) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm thursday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
				System.out.println("First ETA text is=" + FirstETAText);
    	} 
        	else if(date.equals(NextDay) && (!Day.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && Days2fromDate.equalsIgnoreCase("Sunday"))){
				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
				System.out.println("First ETA text is=" + FirstETAText);
    	} 
        	else if(date.equals(NextDay) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && !Days2fromDate.equalsIgnoreCase("Sunday"))){
				Assert.assertEquals(FirstETAText, "Delivered by 5:00pm monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
				System.out.println("First ETA text is=" + FirstETAText);
    	} else if(date.equals(NextDay) && (!Day.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Saturday")) && (!Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Sunday") && Days2fromDate.equalsIgnoreCase("Sunday"))){
			Assert.assertEquals(FirstETAText, "Delivered by 5:00pm monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
			System.out.println("First ETA text is=" + FirstETAText);
	} else if((!Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday")) && ((!Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday")) && ((!Days2fromDate.equalsIgnoreCase("Saturday") && !Days2fromDate.equalsIgnoreCase("Sunday")) && (!Days3fromDate.equalsIgnoreCase("Saturday") && !Days3fromDate.equalsIgnoreCase("Sunday"))))){
  		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days3fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
       	 System.out.println("First ETA text is=" + FirstETAText);
 	}
	 else if(Day.equalsIgnoreCase("Saturday")){
	  		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	       	 System.out.println("First ETA text is=" + FirstETAText);
	 	}
	 else if(Next2NextDay.equalsIgnoreCase("Saturday")){
	  		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	       	 System.out.println("First ETA text is=" + FirstETAText);
	 	}
	 else if(Days2fromDate.equalsIgnoreCase("Saturday")){
	  		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	       	 System.out.println("First ETA text is=" + FirstETAText);
	 	}
	 else if(Days3fromDate.equalsIgnoreCase("Saturday") || Days3fromDate.equalsIgnoreCase("Sunday")){
	  		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "monday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	       	 System.out.println("First ETA text is=" + FirstETAText);
	 	}
	 else if(Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Sunday")){
	  		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	       	 System.out.println("First ETA text is=" + FirstETAText);
	 	}
	 else if(Days2fromDate.equalsIgnoreCase("Sunday")){
	  		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "wednesday");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	       	 System.out.println("First ETA text is=" + FirstETAText);
	 	}
	 else {
	  		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Days3fromDate.toLowerCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	       	 System.out.println("First ETA text is=" + FirstETAText);
	 	}
	  	    	}
	  	    }
	  	    
	  	  System.out.println("GQ17:" + Shipment + ":" + " " + "with" + " " + Date + ":" + " " + Pickupstate + " " + "and" + Dropoffstate + " " + "started");
	 }
}

