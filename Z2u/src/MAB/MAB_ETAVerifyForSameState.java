package MAB;

import java.text.ParseException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import RequiredClassesfor_EachModule.ETA;
import RequiredClassesfor_EachModule.ETADateandTime;
import RequiredClassesfor_EachModule.Timeliebtwntwotimes;

public class MAB_ETAVerifyForSameState extends MAB_Scenarios {
	
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	WebElement element;
	ETA objETA = new ETA();
	ETADateandTime objETATime = new ETADateandTime();
	Timeliebtwntwotimes objTimelie = new Timeliebtwntwotimes();
	public void ETAvalidateforSameState(String Shipment,String Date, String PickupTime) throws InterruptedException, ParseException {
		System.out.println(".................................................................................................");
		System.out.println("MAB4:ETA verification for Same state method started" + " " + Shipment + " " + Date + " " + PickupTime);
		 
		WebElement element = driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator()));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element); 

		if(Shipment.equals("Documents")){
		     element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_DocumentshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).sendKeys("3");
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).clear();
		      driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).clear();
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
		      driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
		      
		     
			   }
		 
		   if(Shipment.equals("Satchel, laptops")){
			     //element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_LaptopshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).sendKeys("0");
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).clear();  
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).sendKeys("3");
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			   //driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
		      // driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
	
		      
			   }

		   if(Shipment.equals("Cakes, flowers, delicates")){
			     //element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_FlowersshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).sendKeys("0");
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).sendKeys("3");
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			// driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
		   // driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
	
		     
	   }

		   if(Shipment.equals("Small Box")){
			    // element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SmallBoxshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).sendKeys("0");
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).sendKeys("3");
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			  // driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).clear();
			   //driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).clear();
			  // driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
			   //driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
	
		      
	   }
		   if(Shipment.equals("Large Box")){
			   // element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_LargeBoxshipmentLocator())));
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).sendKeys("0");
			   //driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).clear();
			   driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).sendKeys("3");
			   driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Keys.TAB);
			// driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 clarence st sydney nsw australia");
		   // driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("23 wentworth st greenacre nsw australia");
	
		      
	   }

		 driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).clear();
		 driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).sendKeys(Date);
		 driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys(Keys.TAB);
		 String date = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
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
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).clear();
		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupTime())));
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys("1:09am");
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).sendKeys(Keys.TAB);
		 time1 = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");

	  }
	  else if(PickupTime.equals("8am_12pm")){
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).clear();
		   element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupTime())));
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys("10:08am");
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).sendKeys(Keys.TAB);
		  time2 = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");

	  }
	  else if(PickupTime.equals("12pm_2pm")){
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).clear();
		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupTime())));
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys("1:09pm");
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys(Keys.TAB);
		  time3 = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");

	  }
	  else if(PickupTime.equals("2pm_5pm")){
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).clear();
		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupTime())));
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys("3:07pm");
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys(Keys.TAB);
		  time4 = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");

	  }
	  else if(PickupTime.equals("5pm_12am")){
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).clear();
		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupTime())));
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys("8:08pm");
		  driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).sendKeys(Keys.TAB);
		  time5 = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");

	  }
	  
	  String pickupTime = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");
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
	  
	  String pickupdate = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
	  
	  //DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	  //String date1= dateFormat.format(Date);
	  //System.out.println("The date is =" + date1);
	  Date Am8to12pm = objTimelie.Eightam_12pm(pickupTime);
	  Date Pm12to2pm = objTimelie.Twelvepm_2pm(pickupTime);
	  Date Pm2to5pm = objTimelie.Twopm_5pm(pickupTime);
	  Date Pm5to12am = objTimelie.Fivepm_12am(pickupTime);
	  Date Am12to8am = objTimelie.Twelveam_8am(pickupTime);
	  
	  //WebElement element1 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div[2]/div[1]/div/input"));

			 // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element1);
	  
	  if(Shipment.equals("Documents") || Shipment.equals("Satchel, laptops") || Shipment.equals("Small Box") || Shipment.equals("Large Box")){
          if(Am12to8am!=null){  
           	 String FirstETAText = driver.findElement(By.xpath(objMAB.FirstDeliveryoptionETALocator())).getText();
           	 String SecondETAText = driver.findElement(By.xpath(objMAB.SecondDeliveryoptionETALocator())).getText();
           	 String ThirdETAText = driver.findElement(By.xpath(objMAB.ThirdDeliveryoptionETALocator())).getText();
           	 String FourthETAText = driver.findElement(By.xpath(objMAB.FourthDeliveryoptionETALocator())).getText();
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
           	 String FirstETAText = driver.findElement(By.xpath(objMAB.FirstDeliveryoptionETALocator())).getText();
           	 String SecondETAText = driver.findElement(By.xpath(objMAB.SecondDeliveryoptionETALocator())).getText();
           	 String ThirdETAText = driver.findElement(By.xpath(objMAB.ThirdDeliveryoptionETALocator())).getText();
           	 String FourthETAText = driver.findElement(By.xpath(objMAB.FourthDeliveryoptionETALocator())).getText();
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
			   String FirstETAText = driver.findElement(By.xpath(objMAB.FirstDeliveryoptionETALocator())).getText();
         	 String SecondETAText = driver.findElement(By.xpath(objMAB.SecondDeliveryoptionETALocator())).getText();
         	 String ThirdETAText = driver.findElement(By.xpath(objMAB.ThirdDeliveryoptionETALocator())).getText();
         	 String FourthETAText = driver.findElement(By.xpath(objMAB.FourthDeliveryoptionETALocator())).getText();
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
			   String FirstETAText = driver.findElement(By.xpath(objMAB.FirstDeliveryoptionETALocator())).getText();
         	 String SecondETAText = driver.findElement(By.xpath(objMAB.SecondDeliveryoptionETALocator())).getText();
         	 String ThirdETAText = driver.findElement(By.xpath(objMAB.ThirdDeliveryoptionETALocator())).getText();
         	 String FourthETAText = driver.findElement(By.xpath(objMAB.FourthDeliveryoptionETALocator())).getText();
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
			 String FirstETAText = driver.findElement(By.xpath(objMAB.FirstDeliveryoptionETALocator())).getText();
         	 String SecondETAText = driver.findElement(By.xpath(objMAB.SecondDeliveryoptionETALocator())).getText();
         	 String ThirdETAText = driver.findElement(By.xpath(objMAB.ThirdDeliveryoptionETALocator())).getText();
         	 String FourthETAText = driver.findElement(By.xpath(objMAB.FourthDeliveryoptionETALocator())).getText();
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
   			  Boolean Firstdeliveryoption = driver.findElement(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())).isDisplayed();
   	    	  System.out.println(Firstdeliveryoption);
   	    	  Boolean Seconddeliveryoption = driver.findElement(By.xpath(objMAB.BookingPage_SecondDeliveryoptionLocator())).isDisplayed();
   	    	  System.out.println(Seconddeliveryoption);
   			   String FirstETAText = driver.findElement(By.xpath(objMAB.FirstDeliveryoptionETALocator())).getText();
	              	 String SecondETAText = driver.findElement(By.xpath(objMAB.SecondDeliveryoptionETALocator())).getText();
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
   			  Boolean Firstdeliveryoption = driver.findElement(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())).isDisplayed();
   	    	  System.out.println(Firstdeliveryoption);
   	    	  Boolean Seconddeliveryoption = driver.findElement(By.xpath(objMAB.BookingPage_SecondDeliveryoptionLocator())).isDisplayed();
   	    	  System.out.println(Seconddeliveryoption);
   	    	  Boolean Thirddeliveryoption = driver.findElement(By.xpath(objMAB.BookingPage_ThirdDeliveryoptionLocator())).isDisplayed();
   	    	  System.out.println(Thirddeliveryoption);
   	    	  String FirstETAText = driver.findElement(By.xpath(objMAB.FirstDeliveryoptionETALocator())).getText();
              	  String SecondETAText = driver.findElement(By.xpath(objMAB.SecondDeliveryoptionETALocator())).getText();
              	  String ThirdETAText = driver.findElement(By.xpath(objMAB.ThirdDeliveryoptionETALocator())).getText();
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
    			System.out.println("MAB4:ETA verification for same state method completed" + " " + Shipment + " " + Date + " " + PickupTime);
              	System.out.println(".................................................................................................");
    			
   		  }
   	  }
}


}
