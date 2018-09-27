package RequiredClassesfor_EachModule;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import Controller.LaunchBrowser_inCrossBrowser;

public class ETATimeverifyforSameState extends LaunchBrowser_inCrossBrowser {
      
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	WebElement element;
	ETA objETA = new ETA();
	ETADateandTime objETATime = new ETADateandTime();
	Timeliebtwntwotimes objTimelie = new Timeliebtwntwotimes();

	public void ETAvalidateforSameState(String Shipment,String Date, String PickupTime) throws InterruptedException, ParseException {
		
		  if(Shipment.equals("Documents")){
	    		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.DocumentShipmentLocator())));
	        	  driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).click();
	        	  }
	        	  if(Shipment.equals("Satchel, laptops")){
	        	      element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.LaptopsShipmentLocator())));
	            	  driver.findElement(By.xpath(objGetQuote.LaptopsShipmentLocator())).click();
	            	  }
	        	  if(Shipment.equals("Small box")){
	        		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.SmallBoxShipmentLocator())));
	            	  driver.findElement(By.xpath(objGetQuote.SmallBoxShipmentLocator())).click();
	            	  }
	        	  if(Shipment.equals("Cakes, flowers, delicates")){
	        		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.CakesandFlowersShipmentLocator())));
	            	  driver.findElement(By.xpath(objGetQuote.CakesandFlowersShipmentLocator())).click();
	            	  }
	        	  if(Shipment.equals("Large Box")){
	        		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.LargeBoxShipmentLocator())));
	            	  driver.findElement(By.xpath(objGetQuote.LargeBoxShipmentLocator())).click();
	            	  }
	        	  driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys("45 clarence st sydney nsw australia");
	        	  driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).sendKeys("23 wentworth st greenacre nsw australia");
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
	    	  String ETAnextday = objETA.ETANextDay(date);
	    	  String ETAMorethanNextday = objETA.ETA2DaysfromtheDate(date);
	    	  String ETANextday = objETA.ETAnext2nextDay(date);
	    	  String ETANext3day = objETA.ETA3DaysfromtheDate(date);
	          //getTime() returns the current date in default time zone
	         // String time = null;
	    	  String time1 = null,time2= null,time3= null,time4= null,time5= null;
	    	  Thread.sleep(10000);
	    	  if(PickupTime.equals("12am_8am")){
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
	    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("1:09am");
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Keys.TAB);
	    		 time1 = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");

	    	  }
	    	  else if(PickupTime.equals("8am_12pm")){
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
	    		   element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("10:08am");
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Keys.TAB);
	    		  time2 = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");

	    	  }
	    	  else if(PickupTime.equals("12pm_2pm")){
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
	    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("1:09pm");
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
	    		  time3 = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");

	    	  }
	    	  else if(PickupTime.equals("2pm_5pm")){
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
	    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("3:07pm");
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
	    		  time4 = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");

	    	  }
	    	  else if(PickupTime.equals("5pm_12am")){
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
	    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("8:08pm");
	    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
	    		  time5 = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");

	    	  }
	    	  
	    	  String pickupTime = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");
	    	  System.out.println("Pickup Time is=" + pickupTime);
	    	  //DateFormat sdf = new SimpleDateFormat("h:mma");
	    	  //sdf.setTimeZone(TimeZone.getTimeZone("CST"));
	    	    //Date time = sdf.parse(pickupTime);
                //String reporttime = sdf.format(time);
	    	  String output1 = objETATime.ETATime(pickupTime); 
	    	  System.out.println("3 hr is=" + output1);
	    	  // SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
	    	  //Date dt1=format1.parse(output);
	    	  //DateFormat format2=new SimpleDateFormat("EEEE"); 
	    	  //String finalDay=format2.format(dt1);
	    	  //GetQuote_Scenarios.System.out.println(finalDay);
	    	  
	    	  String pickupdate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div[2]/div[1]/div/input")).getAttribute("value");
	    	  
	    	  //DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	    	  //String date1= dateFormat.format(Date);
	    	  //System.out.println("The date is =" + date1);
	    	  Date Am8to12pm = objTimelie.Eightam_12pm(pickupTime);
	    	  Date Pm12to2pm = objTimelie.Twelvepm_2pm(pickupTime);
	    	  Date Pm2to5pm = objTimelie.Twopm_5pm(pickupTime);
	    	  Date Pm5to12am = objTimelie.Fivepm_12am(pickupTime);
	    	  Date Am12to8am = objTimelie.Twelveam_8am(pickupTime);
	    	  
	    	  WebElement element1 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div[2]/div[1]/div/input"));

	    			  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element1);
	    	  
	    	  if(Shipment.equals("Documents") || Shipment.equals("Satchel, laptops") || Shipment.equals("Small box") || Shipment.equals("Large Box")){
	               if(Am12to8am!=null){  
	                	 String FirstETAText = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionETALocator())).getText();
	                	 String SecondETAText = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionETALocator())).getText();
	                	 String ThirdETAText = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionETALocator())).getText();
	                	 String FourthETAText = driver.findElement(By.xpath(objGetQuote.FourthDeliveryoptionETALocator())).getText();
	                	 if(pickupdate.equals(cdate)){
	                	 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm today");
	                	 System.out.println("First ETA text is=" + FirstETAText);
	                	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm today");
	                	 System.out.println("Second ETA text is=" + SecondETAText);
	                	 Assert.assertEquals(ThirdETAText, "Delivered by 11:00am today");
	                	 System.out.println("Third ETA text is=" + ThirdETAText);
	                	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	                	 System.out.println("Fourth ETA text is=" + FourthETAText);
	                	 }
	                	 else if(pickupdate.equals(NextDay)){
	                		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm tomorrow");
	                    	 System.out.println("First ETA text is=" + FirstETAText);
	                    	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm tomorrow");
	                    	 System.out.println("Second ETA text is=" + SecondETAText);
	                    	 Assert.assertEquals(ThirdETAText, "Delivered by 11:00am tomorrow");
	                    	 System.out.println("Third ETA text is=" + ThirdETAText);
	                    	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	                    	 System.out.println("Fourth ETA text is=" + FourthETAText);
	                	 }
	                	 else{
	                		 
	                		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Day.toLowerCase());
	                    	 System.out.println("First ETA text is=" + FirstETAText);
	                    	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + Day.toLowerCase());
	                    	 System.out.println("Second ETA text is=" + SecondETAText);
	                    	 Assert.assertEquals(ThirdETAText, "Delivered by 11:00am" + " " + Day.toLowerCase());
	                    	 System.out.println("Third ETA text is=" + ThirdETAText);
	                    	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	                    	 System.out.println("Fourth ETA text is=" + FourthETAText);

	                		 
	                	 }
	                 }
	                 
	                 if(Am8to12pm!=null){
	                	 String FirstETAText = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionETALocator())).getText();
	                	 String SecondETAText = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionETALocator())).getText();
	                	 String ThirdETAText = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionETALocator())).getText();
	                	 String FourthETAText = driver.findElement(By.xpath(objGetQuote.FourthDeliveryoptionETALocator())).getText();
	                	 if(pickupdate.equals(cdate)) {
	                	 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm today");
	                	 System.out.println("First ETA text is=" + FirstETAText);
	                	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm today");
	                	 System.out.println("Second ETA text is=" + SecondETAText);
	                	 Assert.assertEquals(ThirdETAText, "Delivered by" + " " + output1.toLowerCase() + " " + "today");
	                	 System.out.println("Third ETA text is=" + ThirdETAText);
	                	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	                	 System.out.println("Fourth ETA text is=" + FourthETAText);
	                	 }
	                	 else if(pickupdate.equals(NextDay)){
		             		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + "tomorrow");
			               	 System.out.println("First ETA text is=" + FirstETAText);
			               	Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + "tomorrow");
			               	 System.out.println("Second ETA text is=" + SecondETAText);
			               	 Assert.assertEquals(ThirdETAText, "Delivered by" + " " +output1.toLowerCase() + " " + "tomorrow");
			               	 System.out.println("Third ETA text is=" + ThirdETAText);
			               	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
			               	 System.out.println("Fourth ETA text is=" + FourthETAText);
		             	 }
	                	 else {
	                		 
	                		 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + Day.toLowerCase());
	                    	 System.out.println("First ETA text is=" + FirstETAText);
	                    	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + Day.toLowerCase());
	                    	 System.out.println("Second ETA text is=" + SecondETAText);
	                    	 Assert.assertEquals(ThirdETAText, "Delivered by" + " " + output1.toLowerCase() + " " + Day.toLowerCase());
	                    	 System.out.println("Third ETA text is=" + ThirdETAText);
	                    	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	                    	 System.out.println("Fourth ETA text is=" + FourthETAText);
	                	 }
	                 }
	    		   if(Pm12to2pm!=null){
	    			   String FirstETAText = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionETALocator())).getText();
	              	 String SecondETAText = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionETALocator())).getText();
	              	 String ThirdETAText = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionETALocator())).getText();
	              	 String FourthETAText = driver.findElement(By.xpath(objGetQuote.FourthDeliveryoptionETALocator())).getText();
	              	if(pickupdate.equals(NextDay)){
	             		 Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + "tomorrow");
		               	 System.out.println("First ETA text is=" + FirstETAText);
		               	 Assert.assertEquals(SecondETAText, "Delivered by" + " " +output1.toLowerCase() + " " + "tomorrow");
		               	 System.out.println("Second ETA text is=" + SecondETAText);
		               	 Assert.assertEquals(ThirdETAText, "Delivered by 5:00pm" + " " + "tomorrow");
		               	 System.out.println("Third ETA text is=" + ThirdETAText);
		               	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
		               	 System.out.println("Fourth ETA text is=" + FourthETAText);
	             	 } else if(pickupdate.equals(cdate)){
		              	 Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + "today");
		            	 System.out.println("First ETA text is=" + FirstETAText);
		            	 Assert.assertEquals(SecondETAText, "Delivered by" + " " +output1.toLowerCase() + " " + "today");
		            	 System.out.println("Second ETA text is=" + SecondETAText);
		            	 Assert.assertEquals(ThirdETAText, "Delivered by 5:00pm" + " " + "today");
		            	 System.out.println("Third ETA text is=" + ThirdETAText);
		            	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
		            	 System.out.println("Fourth ETA text is=" + FourthETAText);
	              	 } else{
	              		 Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + Day.toLowerCase());
	                	 System.out.println("First ETA text is=" + FirstETAText);
	                	 Assert.assertEquals(SecondETAText, "Delivered by" + " " +output1.toLowerCase() + " " + Day.toLowerCase());
	                	 System.out.println("Second ETA text is=" + SecondETAText);
	                	 Assert.assertEquals(ThirdETAText, "Delivered by 5:00pm" + " " + Day.toLowerCase());
	                	 System.out.println("Third E TA text is=" + ThirdETAText);
	                	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	                	 System.out.println("Fourth ETA text is=" + FourthETAText);
	              	 }
	    		   }
	    		   if(Pm2to5pm!=null){
	    			   String FirstETAText = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionETALocator())).getText();
	              	 String SecondETAText = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionETALocator())).getText();
	              	 String ThirdETAText = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionETALocator())).getText();
	              	 String FourthETAText = driver.findElement(By.xpath(objGetQuote.FourthDeliveryoptionETALocator())).getText();
	              	 if(pickupdate.equals(cdate)) {
	              	Assert.assertEquals(FirstETAText, "Delivered by 8:30pm" + " " + "today");
	           	 System.out.println("First ETA text is=" + FirstETAText);
	           	 Assert.assertEquals(SecondETAText, "Delivered by" + " " + output1.toLowerCase() + " " +"today");
	           	 System.out.println("Second ETA text is=" + SecondETAText);
	           	 Assert.assertEquals(ThirdETAText, "Delivered by 12:00pm" + " " + "tomorrow");
	           	System.out.println("Third ETA text is=" + ThirdETAText);
	           	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	           	 System.out.println("Fourth ETA text is=" + FourthETAText);
	    		 }
	              	 else if(pickupdate.equals(NextDay)) {
	              		 
	              		Assert.assertEquals(FirstETAText, "Delivered by 8:30pm"+ " " + "tomorrow");
	                  	 System.out.println("First ETA text is=" + FirstETAText);
	                  	 Assert.assertEquals(SecondETAText, "Delivered by" + " " + output1.toLowerCase() + " " + "tomorrow" );
	                  	 System.out.println("Second ETA text is=" + SecondETAText);
	                  	 Assert.assertEquals(ThirdETAText, "Delivered by 12:00pm" + " " + CurrentNextDay.toLowerCase());
	                  	System.out.println("Third ETA text is=" + ThirdETAText);
	                  	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	                  	 System.out.println("Fourth ETA text is=" + FourthETAText);
	              	 }
	              	 else {
	              		 
	              		Assert.assertEquals(FirstETAText, "Delivered by 8:30pm"+ " " + Day.toLowerCase());
	                 	 System.out.println("First ETA text is=" + FirstETAText);
	                 	 Assert.assertEquals(SecondETAText, "Delivered by" + " " + output1.toLowerCase() + " " + Day.toLowerCase() );
	                 	 System.out.println("Second ETA text is=" + SecondETAText);
	                 	 Assert.assertEquals(ThirdETAText, "Delivered by 12:00pm" + " " + CurrentNextDay.toLowerCase());
	                 	System.out.println("Third ETA text is=" + ThirdETAText);
	                 	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	                 	 System.out.println("Fourth ETA text is=" + FourthETAText);
	              		 
	              	 }
	    		   }
	    		   if(Pm5to12am!=null){
	    			 String FirstETAText = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionETALocator())).getText();
	              	 String SecondETAText = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionETALocator())).getText();
	              	 String ThirdETAText = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionETALocator())).getText();
	              	 String FourthETAText = driver.findElement(By.xpath(objGetQuote.FourthDeliveryoptionETALocator())).getText();
	              	if(pickupdate.equals(cdate)){
	              	 Assert.assertEquals(FirstETAText, "Delivered by 5:00pm tomorrow");
	              	 Assert.assertEquals(SecondETAText, "Delivered by 8:30pm tomorrow");
	              	Assert.assertEquals(ThirdETAText, "Delivered by 12:00pm tomorrow");
	              	}else{
	              		Assert.assertEquals(FirstETAText, "Delivered by 5:00pm" + " " + ETAnextday.toLowerCase());
	              		Assert.assertEquals(SecondETAText, "Delivered by 8:30pm" + " " + ETAnextday.toLowerCase());
	              		Assert.assertEquals(ThirdETAText, "Delivered by 12:00pm" + " " + ETAnextday.toLowerCase());
	              	}
	            	 System.out.println("First ETA text is=" + FirstETAText);
	            	 System.out.println("Second ETA text is=" + SecondETAText);
	            	 System.out.println("Third ETA text is=" + ThirdETAText);
	            	 Assert.assertEquals(FourthETAText, "Deliver ASAP");
	            	 System.out.println("Fourth ETA text is=" + FourthETAText);
	    		   }
	    		  
	        	  }
	    	  
	        	  else if(Shipment.equals("Cakes, flowers, delicates")){
	        		  if( Am12to8am!=null || Am8to12pm!=null || Pm5to12am!=null){
	        			  Boolean Firstdeliveryoption = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())).isDisplayed();
	        	    	  System.out.println(Firstdeliveryoption);
	        	    	  Boolean Seconddeliveryoption = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionLocator())).isDisplayed();
	        	    	  System.out.println(Seconddeliveryoption);
		    			   String FirstETAText = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionETALocator())).getText();
			              	 String SecondETAText = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionETALocator())).getText();
			              	if(Am12to8am!=null){
			              		
			              	
			              	 if(pickupdate.equals(cdate)) {
				             Assert.assertEquals(FirstETAText, "Delivered by 11:00am today");
				           	 System.out.println("First ETA text is=" + FirstETAText);
				           	 Assert.assertEquals(SecondETAText, "Deliver ASAP");
				           	 System.out.println("Second ETA text is=" + SecondETAText);
				    		 }
				              	 else if(pickupdate.equals(NextDay)) {
				              		 
				                     Assert.assertEquals(FirstETAText, "Delivered by 11:00am tomorrow");
				                  	 System.out.println("First ETA text is=" + FirstETAText);
				                     Assert.assertEquals(SecondETAText, "Deliver ASAP");
				                  	 System.out.println("Second ETA text is=" + SecondETAText);
				              	 }
				              	 else {
				              		 
				              		Assert.assertEquals(FirstETAText, "Delivered by 11:00am" + " " + Day.toLowerCase());
				                 	 System.out.println("First ETA text is=" + FirstETAText);
				                 	  Assert.assertEquals(SecondETAText, "Deliver ASAP");
				                 	 System.out.println("Second ETA text is=" + SecondETAText);
				              		 
				              	 }
			              	}
			              	else if(Am8to12pm!=null){
			              		
			              	
			              	 if(pickupdate.equals(cdate)) {
			              	Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + "today" );
			                System.out.println("First ETA text is=" + FirstETAText);
				           	 Assert.assertEquals(SecondETAText, "Deliver ASAP");
				           	 System.out.println("Second ETA text is=" + SecondETAText);
				    		 }
				              	 else if(pickupdate.equals(NextDay)) {
				              		 
				              		Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + "tomorrow" );
					                System.out.println("First ETA text is=" + FirstETAText);
				                     Assert.assertEquals(SecondETAText, "Deliver ASAP");
				                  	 System.out.println("Second ETA text is=" + SecondETAText);
				              	 }
				              	 else {
				              		 
				              		Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + Day.toLowerCase() );
					                System.out.println("First ETA text is=" + FirstETAText);
				                 	  Assert.assertEquals(SecondETAText, "Deliver ASAP");
				                 	 System.out.println("Second ETA text is=" + SecondETAText);
				              		 
				              	 }
			              	}
			              	else if(Pm5to12am!=null){
			              		
			              	
			              	 if(pickupdate.equals(cdate)) {
			              	Assert.assertEquals(FirstETAText, "Delivered by 12:00pm tomorrow");
			                System.out.println("First ETA text is=" + FirstETAText);
				           	 Assert.assertEquals(SecondETAText, "Deliver ASAP");
				           	 System.out.println("Second ETA text is=" + SecondETAText);
				    		 }
				            else if(pickupdate.equals(NextDay)) {
				              		 
				              		Assert.assertEquals(FirstETAText, "Delivered by 12:00pm" + " " + ETANextday.toLowerCase() );
					                System.out.println("First ETA text is=" + FirstETAText);
				                 	  Assert.assertEquals(SecondETAText, "Deliver ASAP");
				                 	 System.out.println("Second ETA text is=" + SecondETAText);
				              		 
				              	 }
				            else {
				            	
				            	Assert.assertEquals(FirstETAText, "Delivered by 12:00pm" + " " + ETANextday.toLowerCase() );
				                System.out.println("First ETA text is=" + FirstETAText);
			                 	  Assert.assertEquals(SecondETAText, "Deliver ASAP");
			                 	 System.out.println("Second ETA text is=" + SecondETAText);
				            }
			              	}
	        	    	 }
	        		  if(PickupTime.equals("12pm_2pm") || PickupTime.equals("2pm_5pm")){
	        			  Boolean Firstdeliveryoption = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())).isDisplayed();
	        	    	  System.out.println(Firstdeliveryoption);
	        	    	  Boolean Seconddeliveryoption = driver.findElement(By.xpath(objGetQuote.  SecondDeliveryoptionLocator())).isDisplayed();
	        	    	  System.out.println(Seconddeliveryoption);
	        	    	  Boolean Thirddeliveryoption = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionLocator())).isDisplayed();
	        	    	  System.out.println(Thirddeliveryoption);
	        	    	  String FirstETAText = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionETALocator())).getText();
	 	              	  String SecondETAText = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionETALocator())).getText();
	 	              	  String ThirdETAText = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionETALocator())).getText();
	 	              	if(Pm12to2pm!=null){
		              		
			              	
			              	 if(pickupdate.equals(cdate)) {
			              	Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + "today" );
			                System.out.println("First ETA text is=" + FirstETAText);
			                Assert.assertEquals(SecondETAText, "Delivered by 5:00pm" + " " + "today" );
			                System.out.println("Second ETA text is=" + SecondETAText);
				           	 Assert.assertEquals(ThirdETAText, "Deliver ASAP");
				           	 System.out.println("Third ETA text is=" + ThirdETAText);
				    		 }
				              	 else if(pickupdate.equals(NextDay)) {
				              		 
				              		Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + "tomorrow" );
					                System.out.println("First ETA text is=" + FirstETAText);
					                Assert.assertEquals(SecondETAText, "Delivered by 5:00pm" + " " + "tomorrow" );
					                System.out.println("Second ETA text is=" + SecondETAText);
						           	 Assert.assertEquals(ThirdETAText, "Deliver ASAP");
						           	 System.out.println("Third ETA text is=" + ThirdETAText);
				              	 }
				              	 else {
				              		 
				              		Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + Day.toLowerCase() );
					                System.out.println("First ETA text is=" + FirstETAText);
					                Assert.assertEquals(SecondETAText, "Delivered by 5:00pm" + " " + Day.toLowerCase() );
					                System.out.println("Second ETA text is=" + SecondETAText);
						           	 Assert.assertEquals(ThirdETAText, "Deliver ASAP");
						           	 System.out.println("Third ETA text is=" + ThirdETAText);
				              		 
				              	 }
			              	}
	 	              	else{
	 	              		if(pickupdate.equals(cdate)) {
				              	Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + "today" );
				                System.out.println("First ETA text is=" + FirstETAText);
				                Assert.assertEquals(SecondETAText, "Delivered by 12:00pm" + " " + "tomorrow" );
				                System.out.println("Second ETA text is=" + SecondETAText);
					           	 Assert.assertEquals(ThirdETAText, "Deliver ASAP");
					           	 System.out.println("Third ETA text is=" + ThirdETAText);
					    		 }
					              	 else if(pickupdate.equals(NextDay)) {
					              		 
					              		Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + "tomorrow" );
						                System.out.println("First ETA text is=" + FirstETAText);
						                Assert.assertEquals(SecondETAText, "Delivered by 12:00pm" + " " + ETANextday.toLowerCase() );
						                System.out.println("Second ETA text is=" + SecondETAText);
							           	 Assert.assertEquals(ThirdETAText, "Deliver ASAP");
							           	 System.out.println("Third ETA text is=" + ThirdETAText);
					              	 }
					              	 else {
					              		 
					              		Assert.assertEquals(FirstETAText, "Delivered by" + " " + output1.toLowerCase() + " " + Day.toLowerCase() );
						                System.out.println("First ETA text is=" + FirstETAText);
						                Assert.assertEquals(SecondETAText, "Delivered by 12:00pm" + " " + ETANextday.toLowerCase() );
						                System.out.println("Second ETA text is=" + SecondETAText);
							           	 Assert.assertEquals(ThirdETAText, "Deliver ASAP");
							           	 System.out.println("Third ETA text is=" + ThirdETAText);
					              		 
					              	 }
		
	 	              	}
	        		  }
	        	  }
	}
}
	    	  
	        		  
