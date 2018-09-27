package RequiredClassesfor_EachModule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import CommonLibraries.GetQuoteLocators;
import Controller.LaunchBrowser_inCrossBrowser;

public class TimeCalculation extends LaunchBrowser_inCrossBrowser {
	
	GetQuoteLocators Getquote = new GetQuoteLocators();

	public void TimeBetween(String PickupTime) throws InterruptedException{
		
		Calendar calendar = Calendar.getInstance();
	    
	    // get a date to represent "today"
	    Date today = calendar.getTime();
	    //System.out.println("today:    " + today);
	 
	    // add one day to the date/calendar
	    calendar.add(Calendar.DAY_OF_YEAR, 1);
	    
	    // now get "tomorrow"
	    SimpleDateFormat format1=new SimpleDateFormat("dd-MMM-yyyy");
	    Date tomorrow = calendar.getTime();
	    String Nextdate = format1.format(tomorrow);
	driver.findElement(By.xpath(Getquote.PickupGetQuoteDateLocator())).clear();
	driver.findElement(By.xpath(Getquote.PickupGetQuoteDateLocator())).sendKeys(Nextdate);
	Thread.sleep(5000);
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).clear();
	
		if(PickupTime.equals("8am_12pm")){
			
			driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys("9:00am");
			driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys(Keys.ENTER);
			 
		}
		
if(PickupTime.equals("12pm_2pm")){
			
			driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys("1:00pm");
			driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys(Keys.ENTER);
			 
		}

if(PickupTime.equals("2pm_3pm")){
	
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys("2:10pm");
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys(Keys.ENTER);
	 
}

if(PickupTime.equals("5pm_12am")){
	
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys("6:00pm");
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys(Keys.ENTER);
	 
}

if(PickupTime.equals("12am_8am")){
	
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys("1:00am");
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys(Keys.ENTER);
	 
}

if(PickupTime.equals("After 3pm")){
	
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys("3:00pm");
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys(Keys.ENTER);
	
}

if(PickupTime.equals("After 5pm")){
	
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys("7:00pm");
	driver.findElement(By.xpath(Getquote.PickupGetQuoteTimeLocator())).sendKeys(Keys.ENTER);
	
}
		
	}

}
