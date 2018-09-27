package Controller;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

public class ETAInterstateTime extends LaunchBrowser_inCrossBrowser {
	
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
		System.out.println("GQ14:" + Shipment + ":" + " " + "with" + " " + Date + ":" + " " + Pickupstate + " " + "and" + Dropoffstate + " " + "started");
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
			   }else if (Dropoffstate.equalsIgnoreCase("WA")){
				   objAddress.DropWAState();
			   }else if (Dropoffstate.equalsIgnoreCase("SA")){
				   objAddress.DropSAState();
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
			   }else if (Dropoffstate.equalsIgnoreCase("WA")){
				   objAddress.DropWAState();
			   }else if (Dropoffstate.equalsIgnoreCase("SA")){
				   objAddress.DropSAState();
			   }
		    } else  if(Pickupstate.equalsIgnoreCase("QLD")) {
				   
				   objAddress.PickQLDState();
				   if (Dropoffstate.equalsIgnoreCase("NSW")){
				       objAddress.DropNSWState();
				   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
					   objAddress.DropVICState();
				   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
					   objAddress.DropACTState();
				   }else if (Dropoffstate.equalsIgnoreCase("WA")){
					   objAddress.DropWAState();
				   }else if (Dropoffstate.equalsIgnoreCase("SA")){
					   objAddress.DropSAState();
				   }
		    }else  if(Pickupstate.equalsIgnoreCase("ACT")) {
					   
					   objAddress.PickACTState();
					   if (Dropoffstate.equalsIgnoreCase("NSW")){
					       objAddress.DropNSWState();
					   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
						   objAddress.DropVICState();
					   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
						   objAddress.DropQLDState();
					   }else if (Dropoffstate.equalsIgnoreCase("WA")){
						   objAddress.DropWAState();
					   }else if (Dropoffstate.equalsIgnoreCase("SA")){
						   objAddress.DropSAState();
					   }
		    }else  if(Pickupstate.equalsIgnoreCase("WA")) {
						   
						   objAddress.PickWAState();
					   
						   if (Dropoffstate.equalsIgnoreCase("NSW")){
						       objAddress.DropNSWState();
						   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
							   objAddress.DropVICState();
						   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
							   objAddress.DropQLDState();
						   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
							   objAddress.DropACTState();
						   }else if (Dropoffstate.equalsIgnoreCase("SA")){
							   objAddress.DropSAState();
						   }
		    }else  if(Pickupstate.equalsIgnoreCase("SA")) {
							   
							   objAddress.PickSAState();
							   if (Dropoffstate.equalsIgnoreCase("NSW")){
							       objAddress.DropNSWState();
							   }else if (Dropoffstate.equalsIgnoreCase("VIC")){
								   objAddress.DropVICState();
							   }else if (Dropoffstate.equalsIgnoreCase("QLD")){
								  objAddress.DropQLDState();
							   }else if (Dropoffstate.equalsIgnoreCase("ACT")){
								  objAddress.DropACTState();
							   }else if (Dropoffstate.equalsIgnoreCase("WA")){
								   objAddress.DropWAState();
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
  	  
        //getTime() returns the current date in default time zone
        
        

  	  if(PickupTime.equals("12am_8am")){
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
  		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));

  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("1:00am");
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
  	  }
  	  else if(PickupTime.equals("8am_11am")){
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
  		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("10:00am");
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
  	  }
  	  else if(PickupTime.equals("11am_2pm")){
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
  		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("11:05am");
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
  	  }
  	  else if(PickupTime.equals("2pm_5pm")){
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
  		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("3:00pm");
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
  	  }
  	  else if(PickupTime.equals("5pm_12am")){
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
  		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("8:00pm");
  		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
  	  }
  	  
  	  String pickupTime = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");
  	  System.out.println("Pickup Time is=" + pickupTime);
  	  String output1 = objETATime.ETATime(pickupTime); 	     	 // SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
  	  //Date dt1=format1.parse(output);
  	  //DateFormat format2=new SimpleDateFormat("EEEE"); 
  	  //String finalDay=format2.format(dt1);
  	  //GetQuote_Scenarios.System.out.println(finalDay);
  	  
  	  
  	  //DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
  	  //String date1= dateFormat.format(Date);
  	  //System.out.println("The date is =" + date1);
  	element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.PickupaddresstextfieldLocator())));
  	  
               if(PickupTime.equals("12am_8am")){
            	   if(Pickupstate.equals("NSW") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("VIC") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("QLD") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("ACT") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Dropoffstate.equals("NSW") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("VIC") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("QLD") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("ACT") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) ){
            		   //driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionLocator())).sendKeys(Keys.TAB); 
        	   
        	   //driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[1]")).sendKeys(Keys.TAB);
            		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[1]")));
            		   String SecondETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[1]")).getText();
              if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
              	 
              	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm today");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
              	 System.out.println("Second ETA text is=" + SecondETAText);
              	 
              	 }
              	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday"))){
              		 
              		 
                  	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + "monday");
                  	 System.out.println("Second ETA text is=" + SecondETAText);
                  	}
              	 else if(date.equalsIgnoreCase(NextDay) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
              		 
              		Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + "tomorrow");
              		System.out.println("Second ETA text is=" + SecondETAText);
               }
              	 else{
              		Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + Day.toLowerCase());
              		System.out.println("Second ETA text is=" + SecondETAText);
              	 }
           }else 
           {
        	   String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
        	   if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
                	 
                	 Assert.assertEquals(FirstETAText, "Delivered by 8:30pm today");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                	 System.out.println("Second ETA text is=" + FirstETAText);
                	 
                	 }
                	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday"))){
                		 
                		 
                    	 Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + "monday");
                    	 System.out.println("Second ETA text is=" + FirstETAText);
                    	}
                	 else if(date.equalsIgnoreCase(NextDay) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
                		 
                		Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + "tomorrow");
                		System.out.println("Second ETA text is=" + FirstETAText);
                 }
                	 else{
                		Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + Day.toLowerCase());
                		System.out.println("Second ETA text is=" + FirstETAText);
                	 }
             }
               }
           
               if(PickupTime.equals("8am_11am")){
            	   if(Pickupstate.equals("NSW") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("VIC") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("QLD") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("ACT") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Dropoffstate.equals("NSW") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("VIC") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("QLD") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("ACT") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) ){
            		   String SecondETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[1]")).getText();
                    	 if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
                          	 
                          	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm today");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                          	 System.out.println("Second ETA text is=" + SecondETAText);
                          	 
                          	 }
                          	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday"))){
                          		 
                          		 
                              	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + "monday");
                              	 System.out.println("Second ETA text is=" + SecondETAText);
                              	}
                          	 else if(date.equalsIgnoreCase(NextDay) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
                          		 
                          		Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + "tomorrow");
                          		System.out.println("Second ETA text is=" + SecondETAText);
                           }
                          	 else{
                          		Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + Day.toLowerCase());
                          		System.out.println("Second ETA text is=" + SecondETAText);
                          	 }
                       }else 
                       {
                    	   String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
                    	   if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
                            	 
                            	 Assert.assertEquals(FirstETAText, "Delivered by 8:30pm today");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                            	 System.out.println("Second ETA text is=" + FirstETAText);
                            	 
                            	 }
                            	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday"))){
                            		 
                            		 
                                	 Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + "monday");
                                	 System.out.println("Second ETA text is=" + FirstETAText);
                                	}
                            	 else if(date.equalsIgnoreCase(NextDay) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
                            		 
                            		Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + "tomorrow");
                            		System.out.println("Second ETA text is=" + FirstETAText);
                             }
                            	 else{
                            		Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + Day.toLowerCase());
                            		System.out.println("Second ETA text is=" + FirstETAText);
                            	 }
                         }
               }
  		   if(PickupTime.equals("11am_2pm")){
  			   
  			 if(Pickupstate.equals("NSW") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("VIC") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("QLD") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("ACT") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Dropoffstate.equals("NSW") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("VIC") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("QLD") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("ACT") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) ){
  				 String SecondETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[1]")).getText();
              	if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
                	 
                	 Assert.assertEquals(SecondETAText, "Delivered by 11:00am tomorrow");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                	 System.out.println("Second ETA text is=" + SecondETAText);
                	 
                	 }
                	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (NexxtDay.equalsIgnoreCase("Saturday") || NexxtDay.equalsIgnoreCase("Sunday"))){
                		 
                		 
                    	 Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                    	 System.out.println("Second ETA text is=" + SecondETAText);
                    	}
                	 else if(date.equalsIgnoreCase(NextDay) && (!NexxtDay.equalsIgnoreCase("Saturday") || !NexxtDay.equalsIgnoreCase("Sunday"))){
                		 
                		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + CurrentNextDay.toLowerCase());
                		System.out.println("Second ETA text is=" + SecondETAText);
                 }
                	 else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") ){
                		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + Next2NextDay.toLowerCase());
                		System.out.println("Second ETA text is=" + SecondETAText);
                	 }
                	 else if(!date.equals(cdate) && !date.equals(NextDay) && Day.equalsIgnoreCase("Saturday") && Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
                 		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                 		System.out.println("Second ETA text is=" + SecondETAText);
                 	 }
                	else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
                 		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                 		System.out.println("Second ETA text is=" + SecondETAText);
                 	 }
                	 else if(NextDay.equalsIgnoreCase("Saturday") || NextDay.equalsIgnoreCase("Sunday") || Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday")){
                		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                		System.out.println("Second ETA text is=" + SecondETAText);
                	 }
                	 else
                		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + Day.toLowerCase());
         				System.out.println("Second ETA text is=" + SecondETAText);
             }else 
             {
            	 String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
          	 if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
            	 
            	 Assert.assertEquals(FirstETAText, "Delivered by 11:00am tomorrow");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
            	 System.out.println("Second ETA text is=" + FirstETAText);
            	 
            	 }
            	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (NexxtDay.equalsIgnoreCase("Saturday") || NexxtDay.equalsIgnoreCase("Sunday"))){
            		 
            		 
                	 Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
                	 System.out.println("Second ETA text is=" + FirstETAText);
                	}
            	 else if(date.equalsIgnoreCase(NextDay) && (!NexxtDay.equalsIgnoreCase("Saturday") || !NexxtDay.equalsIgnoreCase("Sunday"))){
            		 
            		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + CurrentNextDay.toLowerCase());
            		System.out.println("Second ETA text is=" + FirstETAText);
             }
            	 else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") ){
            		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + Next2NextDay.toLowerCase());
            		System.out.println("Second ETA text is=" + FirstETAText);
            	 }
            	 else if(!date.equals(cdate) && !date.equals(NextDay) && Day.equalsIgnoreCase("Saturday") && Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
             		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
             		System.out.println("Second ETA text is=" + FirstETAText);
             	 }
            	else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
             		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
             		System.out.println("Second ETA text is=" + FirstETAText);
             	 }
            	 else if(NextDay.equalsIgnoreCase("Saturday") || NextDay.equalsIgnoreCase("Sunday") || Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday")){
            		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
            		System.out.println("Second ETA text is=" + FirstETAText);
            	 }
            	 else
            		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + Day.toLowerCase());
     				System.out.println("Second ETA text is=" + FirstETAText);
               } 

  		   }
  		   if(PickupTime.equals("2pm_5pm")){
  			 if(Pickupstate.equals("NSW") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("VIC") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("QLD") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("ACT") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Dropoffstate.equals("NSW") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("VIC") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("QLD") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("ACT") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) ){
  				String SecondETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[1]")).getText();
  				if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
                	 
                	 Assert.assertEquals(SecondETAText, "Delivered by 11:00am tomorrow");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                	 System.out.println("Second ETA text is=" + SecondETAText);
                	 
                	 }
                	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (NexxtDay.equalsIgnoreCase("Saturday") || NexxtDay.equalsIgnoreCase("Sunday"))){
                		 
                		 
                    	 Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                    	 System.out.println("Second ETA text is=" + SecondETAText);
                    	}
                	 else if(date.equalsIgnoreCase(NextDay) && (!NexxtDay.equalsIgnoreCase("Saturday") || !NexxtDay.equalsIgnoreCase("Sunday"))){
                		 
                		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + CurrentNextDay.toLowerCase());
                		System.out.println("Second ETA text is=" + SecondETAText);
                 }
                	 else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") ){
                		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + Next2NextDay.toLowerCase());
                		System.out.println("Second ETA text is=" + SecondETAText);
                	 }
                	 else if(!date.equals(cdate) && !date.equals(NextDay) && Day.equalsIgnoreCase("Saturday") && Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
                 		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                 		System.out.println("Second ETA text is=" + SecondETAText);
                 	 }
                	else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
                 		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                 		System.out.println("Second ETA text is=" + SecondETAText);
                 	 }
                	 else if(NextDay.equalsIgnoreCase("Saturday") || NextDay.equalsIgnoreCase("Sunday") || Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday")){
                		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                		System.out.println("Second ETA text is=" + SecondETAText);
                	 }
                	 else
                		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + Day.toLowerCase());
         				System.out.println("Second ETA text is=" + SecondETAText);
             }else 
             {
            	 String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
          	 if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
            	 
            	 Assert.assertEquals(FirstETAText, "Delivered by 11:00am tomorrow");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
            	 System.out.println("Second ETA text is=" + FirstETAText);
            	 
            	 }
            	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (NexxtDay.equalsIgnoreCase("Saturday") || NexxtDay.equalsIgnoreCase("Sunday"))){
            		 
            		 
                	 Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
                	 System.out.println("Second ETA text is=" + FirstETAText);
                	}
            	 else if(date.equalsIgnoreCase(NextDay) && (!NexxtDay.equalsIgnoreCase("Saturday") || !NexxtDay.equalsIgnoreCase("Sunday"))){
            		 
            		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + CurrentNextDay.toLowerCase());
            		System.out.println("Second ETA text is=" + FirstETAText);
             }
            	 else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") ){
            		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + Next2NextDay.toLowerCase());
            		System.out.println("Second ETA text is=" + FirstETAText);
            	 }
            	 else if(!date.equals(cdate) && !date.equals(NextDay) && Day.equalsIgnoreCase("Saturday") && Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
             		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
             		System.out.println("Second ETA text is=" + FirstETAText);
             	 }
            	else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
             		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
             		System.out.println("Second ETA text is=" + FirstETAText);
             	 }
            	 else if(NextDay.equalsIgnoreCase("Saturday") || NextDay.equalsIgnoreCase("Sunday") || Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday")){
            		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
            		System.out.println("Second ETA text is=" + FirstETAText);
            	 }
            	 else
            		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + Day.toLowerCase());
     				System.out.println("Second ETA text is=" + FirstETAText);
               } 
 		   }
  		   if(PickupTime.equals("5pm_12am")){
  			   
  			 if(Pickupstate.equals("NSW") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("VIC") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("QLD") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Pickupstate.equals("ACT") && (!Dropoffstate.equals("SA") && !Dropoffstate.equals("WA")) || Dropoffstate.equals("NSW") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("VIC") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("QLD") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) || Dropoffstate.equals("ACT") && (!Pickupstate.equals("SA") && !Pickupstate.equals("WA")) )	 {
  				String SecondETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[2]/div[1]")).getText();
             	 if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday")) && (!NexxtDay.equalsIgnoreCase("Saturday") || !NexxtDay.equalsIgnoreCase("Sunday"))){
                 	 
                 	 Assert.assertEquals(SecondETAText, "Delivered by 11:00am tomorrow");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                 	 System.out.println("Second ETA text is=" + SecondETAText);
                 	 
                 	 }
             	    else if((Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday"))){
             	    	Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + "monday");
                    	 System.out.println("Second ETA text is=" + SecondETAText);
             	     }
                 	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (NexxtDay.equalsIgnoreCase("Saturday") || NexxtDay.equalsIgnoreCase("Sunday"))){
                 		 
                 		 
                     	 Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                     	 System.out.println("Second ETA text is=" + SecondETAText);
                     	}
                 	 else if(date.equalsIgnoreCase(NextDay) && (!NexxtDay.equalsIgnoreCase("Saturday") || !NexxtDay.equalsIgnoreCase("Sunday"))){
                 		 
                 		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + CurrentNextDay.toLowerCase());
                 		System.out.println("Second ETA text is=" + SecondETAText);
                  }
                 	 else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") ){
                 		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + Next2NextDay.toLowerCase());
                 		System.out.println("Second ETA text is=" + SecondETAText);
                 	 }
                 	 else if(!date.equals(cdate) && !date.equals(NextDay) && Day.equalsIgnoreCase("Saturday") && Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
                  		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                  		System.out.println("Second ETA text is=" + SecondETAText);
                  	 }
                 	else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
                  		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                  		System.out.println("Second ETA text is=" + SecondETAText);
                  	 }
                 	 else if(NextDay.equalsIgnoreCase("Saturday") || NextDay.equalsIgnoreCase("Sunday") || Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday")){
                 		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + "monday");
                 		System.out.println("Second ETA text is=" + SecondETAText);
                 	 }
                 	 else
                 		Assert.assertEquals(SecondETAText, "Delivered by 11:00am" + " " + Day.toLowerCase());
          				System.out.println("Second ETA text is=" + SecondETAText);
              }else 
              {
           	   String FirstETAText = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[1]/div[1]")).getText();
           	 if(date.equals(cdate) && (!Day.equalsIgnoreCase("Saturday") || !Day.equalsIgnoreCase("Sunday"))){
             	 
             	 Assert.assertEquals(FirstETAText, "Delivered by 11:00am tomorrow");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
             	 System.out.println("Second ETA text is=" + FirstETAText);
             	 
             	 }
             	 else if((date.equalsIgnoreCase(cdate) || date.equalsIgnoreCase(NextDay)) && (NexxtDay.equalsIgnoreCase("Saturday") || NexxtDay.equalsIgnoreCase("Sunday"))){
             		 
             		 
                 	 Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
                 	 System.out.println("Second ETA text is=" + FirstETAText);
                 	}
             	else if((Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday"))){
             		
         	    	Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
                	 System.out.println("First ETA text is=" + FirstETAText);
             	
             	        	     }
             	 else if(date.equalsIgnoreCase(NextDay) && (!NexxtDay.equalsIgnoreCase("Saturday") || !NexxtDay.equalsIgnoreCase("Sunday"))){
             		 
             		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + CurrentNextDay.toLowerCase());
             		System.out.println("Second ETA text is=" + FirstETAText);
              }
             	 else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && !Next2NextDay.equalsIgnoreCase("Saturday") && !Next2NextDay.equalsIgnoreCase("Sunday") ){
             		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + Next2NextDay.toLowerCase());
             		System.out.println("Second ETA text is=" + FirstETAText);
             	 }
             	 else if(!date.equals(cdate) && !date.equals(NextDay) && Day.equalsIgnoreCase("Saturday") && Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
              		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
              		System.out.println("Second ETA text is=" + FirstETAText);
              	 }
             	else if(!date.equals(cdate) && !date.equals(NextDay) && !Day.equalsIgnoreCase("Saturday") && !Day.equalsIgnoreCase("Sunday") && Next2NextDay.equalsIgnoreCase("Saturday") && Next2NextDay.equalsIgnoreCase("Sunday") ){
              		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
              		System.out.println("Second ETA text is=" + FirstETAText);
              	 }
             	 else if(NextDay.equalsIgnoreCase("Saturday") || NextDay.equalsIgnoreCase("Sunday") || Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday") || Next2NextDay.equalsIgnoreCase("Saturday") || Next2NextDay.equalsIgnoreCase("Sunday")){
             		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + "monday");
             		System.out.println("Second ETA text is=" + FirstETAText);
             	 }
             	 else
             		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + Day.toLowerCase());
      				System.out.println("Second ETA text is=" + FirstETAText);
                } 
      	  }
  		 System.out.println("GQ14:" + Shipment + ":" + " " + "with" + " " + Date + ":" + " " + Pickupstate + " " + "and" + Dropoffstate + " " + "completed");
  		   }
	}
 
	

  		 
