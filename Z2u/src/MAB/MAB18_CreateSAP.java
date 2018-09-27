package MAB;

import java.util.Calendar;
import java.util.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.URL_Staging;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class MAB18_CreateSAP extends MAB_Scenarios 
{
	URL_Staging objurl = new URL_Staging();
	WebElement element;
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	MABDefaultMessages objDefaultMessages = new MABDefaultMessages();
	  
	 public void CreateSAPBid(String Shipmenttype) throws InterruptedException, ParseException
	 {
			if (Shipmenttype.equals("Documents")||Shipmenttype.equals("Satchel, laptops")||Shipmenttype.equals("Small box")||Shipmenttype.equals("Cakes, flowers, delicates")||Shipmenttype.equals("Large Box"))
			{ 
				
			System.out.println(".................................................................................................");
			System.out.println("MAB18: verify Suggest a price bid should get created with valid inputs....");
		
			 
			if (Shipmenttype.equals("Documents")) 
			{	
				System.out.println("For Documents");
				driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).sendKeys("25");
			}
			 
			if (Shipmenttype.equals("Satchel, laptops")) 
			{
				System.out.println("For Satchel, laptops");
				driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).sendKeys("10");
			}
		
			//pickup details
			driver.findElement(By.xpath(objMAB.OrderNumber_textfieldLocator())).sendKeys("Ordernumber123");
			driver.findElement(By.xpath(objMAB.Pickupname_textfieldLocator())).sendKeys("test pickup");
			driver.findElement(By.xpath(objMAB.PickupEmail_textfieldLocator())).sendKeys("testpick@gmail.com");
			driver.findElement(By.xpath(objMAB.PickupPhonenumber_textfieldLocator())).sendKeys("78458585");
			driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys("45 Clarence Street, Sydney NSW, Australia");
			//drop details
			driver.findElement(By.xpath(objMAB.dropoffname_textfieldLocator())).sendKeys("test drop");
			driver.findElement(By.xpath(objMAB.dropoffEmail_textfieldLocator())).sendKeys("testdrop@gmail.com");
			driver.findElement(By.xpath(objMAB.DropoffPhonenumber_textfieldLocator())).sendKeys("78458585");
			driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys("123 George Street, The Rocks NSW, Australia");
			driver.findElement(By.xpath(objMAB.Dropoff_DeliveryInstructions_textfieldLocator())).sendKeys("random text"); 
			
			//getdata
			String ordernumber = driver.findElement(By.xpath(objMAB.OrderNumber_textfieldLocator())).getAttribute("value");
			System.out.println("Entered order number is - " +ordernumber);
			String pickupaddress = driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).getAttribute("value");
			System.out.println("Entered pickupaddress is - " +pickupaddress);
			String dropaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
			System.out.println("Entered dropaddress is - " +dropaddress);
			
			//SAP details
			element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='bookingForm']/div[1]/div/div[10]/div/div[2]/button")));
			driver.findElement(By.xpath("//*[@id='bookingForm']/div[1]/div/div[10]/div/div[2]/button")).click();
			element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='suggestPriceForm']/table/tbody/tr[1]/td[2]/div/input")));
			driver.findElement(By.xpath("//*[@id='suggestPriceForm']/table/tbody/tr[1]/td[2]/div/input")).sendKeys("25");
			driver.findElement(By.xpath("//*[@id='suggestPriceForm']/table/tbody/tr[4]/td[2]/div/textarea")).sendKeys("SAP bid");
		
			//getdata
			
		 	 String SAPnotes = driver.findElement(By.xpath("//*[@id='suggestPriceForm']/table/tbody/tr[4]/td[2]/div/textarea")).getAttribute("value");
			 System.out.println("Entered notes is - " +SAPnotes);
			 
			 String pickupdate = driver.findElement(By.xpath("//*[@id=\"suggestPriceForm\"]/table/tbody/tr[2]/td[2]/div/input")).getAttribute("value");
			 System.out.println("Entered pickup date is " + pickupdate);   
			 SimpleDateFormat DATE_FORMAT1 = new SimpleDateFormat("dd-MMM-yyyy");
			 Date parsepickdate = DATE_FORMAT1.parse(pickupdate);  
			 SimpleDateFormat date1 = new SimpleDateFormat("dd-MMM-yy");
			 String pickdate = date1.format(parsepickdate);
		     System.out.println("converted pickup date is : " + pickdate);
		
		    String pickuptime = driver.findElement(By.xpath("//*[@id=\"pickupTime\"]")).getAttribute("value");
			System.out.println("Entered pickuptime is - " +pickuptime);
			SimpleDateFormat DATE_FORMAT3 = new SimpleDateFormat("hh:mmaa");
			Date parsepicktime = DATE_FORMAT3.parse(pickuptime);  
			SimpleDateFormat date3 = new SimpleDateFormat("hh:mm aa");
			String picktime = date3.format(parsepicktime);
			System.out.println("Entered pickuptime is - " +picktime);
			
			String dropoffdate = driver.findElement(By.xpath("//*[@id=\"suggestPriceForm\"]/table/tbody/tr[3]/td[2]/div/input")).getAttribute("value");
			System.out.println("Entered dropoffdate is - " +dropoffdate);
			SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("dd-MMM-yyyy");
			Date parsedropdate2 = DATE_FORMAT2.parse(dropoffdate);  
			SimpleDateFormat date2 = new SimpleDateFormat("dd-MMM-yy");
			String dropdate = date2.format(parsedropdate2);
		    System.out.println("converted dropoff date is : " + dropdate);
		
			
			String dropofftime = driver.findElement(By.xpath("//*[@id=\"dropTime\"]")).getAttribute("value");
			System.out.println("Entered dropofftime is - " +dropofftime);
			SimpleDateFormat DATE_FORMAT4 = new SimpleDateFormat("hh:mmaa");
			Date parsedroptime = DATE_FORMAT4.parse(dropofftime);  
			SimpleDateFormat date4 = new SimpleDateFormat("hh:mm aa");
			String droptime = date4.format(parsedroptime);
			System.out.println("Entered Dropofftime is - " +droptime);
			
			
			driver.findElement(By.xpath("//*[@id=\"suggestPriceForm\"]/table/tbody/tr[5]/td[2]/div/button")).click();
			driver.findElement(By.xpath("//*[@class='ui-checkbox']/span[@class='accept-terms ng-scope'][contains(text(),'I accept the customer')]")).click();
			driver.findElement(By.xpath("//*[@id=\"bookingForm\"]/div[2]/button")).click();
			
			//verify deail page of SAP
			//element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/div[1]/div[1]/img")));
			element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='table table-striped']/tbody/tr[4]/td[2][@class='ng-binding']")));
			String pickup_address = driver.findElement(By.xpath("//*[@class='table table-striped']/tbody/tr[4]/td[2][@class='ng-binding']")).getText();
			System.out.println("Entered pickup_address is - " +pickup_address);
			String drop_address = driver.findElement(By.xpath("//*[@class='table table-striped']/tbody/tr[5]/td[2][@class='ng-binding']")).getText();
			System.out.println("Entered pickup_address is - " +drop_address);
			
			String pickdatetime = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div[4]/table/tbody/tr[6]/td[2]")).getText();
			System.out.println("Entered pickdatetime is - " +pickdatetime);
			String dropdatetime = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div[4]/table/tbody/tr[7]/td[2]")).getText();
			System.out.println("Entered dropdatetime is - " +dropdatetime);
			String notes = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div[4]/table/tbody/tr[8]/td[2]")).getText();
			System.out.println("Entered notes is - " +notes);
			
			Assert.assertEquals("45 "+pickupaddress,pickup_address);
			Assert.assertEquals("123 "+dropaddress,drop_address);
			Assert.assertEquals(pickdate+" "+picktime,pickdatetime);
			Assert.assertEquals(dropdate+" "+droptime,dropdatetime);
			Assert.assertEquals(SAPnotes,notes);
			
			
			WebElement element = driver.findElement(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator()));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);

		//	element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())));
		//	driver.findElement(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())).click();
			System.out.println("completed.....................................................");
	 }
	 
}
}
