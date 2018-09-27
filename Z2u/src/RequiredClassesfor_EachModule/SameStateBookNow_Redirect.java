package RequiredClassesfor_EachModule;

import java.io.IOException;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.MenuLocators;
import CommonLibraries.URL_Staging;
import Controller.GetQuote_Scenarios;

public class SameStateBookNow_Redirect extends GetQuote_Scenarios{
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	URL_Staging objurl = new URL_Staging();
	SpeedCalculation objspeed = new SpeedCalculation();
	TimeCalculation pickupTime = new TimeCalculation();
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	MenuLocators objMenu = new MenuLocators();
	WebElement element;
	int i;
	public void SameStateBookNow_Redirectform(String Shipment, String PickupTime) throws InterruptedException, JSONException, IOException{
		System.out.println("GQ12:" + Shipment + ":" + " "  + "with" + " " + PickupTime + " " + "started");		
		String DeliveryOption1 = objspeed.DeliveryOption1();
		   String DeliveryOption2 = objspeed.DeliveryOption2();
		   String DeliveryOption3 = objspeed.DeliveryOption3();
		   String DeliveryOption4 = objspeed.DeliveryOption4();
		   driver.navigate().refresh();
		   element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.DocumentShipmentLocator())));
		   if(Shipment.equals("Cakes, flowers, delicates")  && (DeliveryOption1.equals("3 hour") || DeliveryOption2.equals("3 hour") || DeliveryOption3.equals("3 hour") || DeliveryOption4.equals("VIP"))) {
			   
			   if(PickupTime.equals("12am_8am") || PickupTime.equals("8am_12pm") || PickupTime.equals("After 5pm")){
				   
				   for(int i=0;i<2;i++) {
					   
					   driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).sendKeys("12");
					   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
					   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys("45 clarence st sydney nsw australia");
				       driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).sendKeys("23 wentworth st greenacre nsw australia");
				       
				       pickupTime.TimeBetween(PickupTime);
						
					    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
					    
					    //element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())));
			        String Shipmentquaavalue = driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).getAttribute("value");
			        System.out.println("quantity is" + Shipmentquaavalue);
			        String Pickupaddressvalue = driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).getAttribute("value");
			        System.out.println("Address is" + Pickupaddressvalue);
			        String Dropoffaddressvalue = driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).getAttribute("value");
			        System.out.println("Address is" + Dropoffaddressvalue);
			        String PickupDatevalue = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).getAttribute("value");
			        System.out.println("Address is" + PickupDatevalue);
			        String PickupTimevalue = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");
			        System.out.println("Address is" + PickupTimevalue);
			        String FirstPriceValue = driver.findElement(By.xpath(objGetQuote.FirstPriceLocators())).getText();
			        System.out.println("Address is" + FirstPriceValue);
			        String SecondPriceValue = driver.findElement(By.xpath(objGetQuote.SecondPriceLocators())).getText();
			        System.out.println("Address is" + SecondPriceValue);
			        
			       element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
			       
			        if(i==0) {
				    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.TAB);
				    String btn = driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).getText();
				    System.out.println("btn text is = " + btn);
				    
				    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.FirstBookNowbtnLocator())));
				    JavascriptExecutor executor = (JavascriptExecutor) driver;
				    executor.executeScript("arguments[0].click()", element);
				    
				    
				    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
				    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
				    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
				    String Currenturl = driver.getCurrentUrl();
				    Assert.assertEquals(Currenturl, objurl.BookingPage());
				    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
				    System.out.println("Shipment value is=" + Shipvalue);
				    String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]/input")).getAttribute("value");
				    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
				    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
				    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
				    
				    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
				    WebElement element = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
				    ((JavascriptExecutor) driver).executeScript(
				            "arguments[0].scrollIntoView();", element);
				    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
				    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
				    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
				    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
				    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
				    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
				    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
				    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
				    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
				    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
				    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
				    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
				    WebElement element1 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
				    ((JavascriptExecutor) driver).executeScript(
				            "arguments[0].scrollIntoView();", element1);
				    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupDate())));
				    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
				    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
				    //String BookingPage_PickupTimefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");
				    //System.out.println("Pickup Time is =" + BookingPage_PickupTimefield);
			        //Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
			        //Assert.assertEquals(BookingPage_PickupTimefield, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
			        boolean Firstoption = driver.findElement(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())).isEnabled();
			        System.out.println("Option 1st is" + Firstoption);
			        String BookingPage_FirstPricevalue = driver.findElement(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())).getText();
			        Assert.assertEquals(BookingPage_FirstPricevalue, FirstPriceValue);
			        }
			        if(i==1) {
			        	String btn = driver.findElement(By.xpath(objGetQuote.SecondBookNowbtnLocator())).getText();
					    System.out.println("btn text is = " + btn);
					    WebDriverWait wait = new WebDriverWait(driver, 10);
					    WebElement BookNowbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.SecondBookNowbtnLocator())));
					    JavascriptExecutor executor = (JavascriptExecutor) driver;
					    executor.executeScript("arguments[0].click()", BookNowbtn);
					    
					    
					    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
					    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
					    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
					    String Currenturl = driver.getCurrentUrl();
					    Assert.assertEquals(Currenturl, objurl.BookingPage());
					    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
					    System.out.println("Shipment value is=" + Shipvalue);
					    String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]/input")).getAttribute("value");
					    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
					    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
					    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
					    WebElement element = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
					    ((JavascriptExecutor) driver).executeScript(
					            "arguments[0].scrollIntoView();", element);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
					    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
					    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
					    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
					    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
					    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
					    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
					    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
					    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
					    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
					    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
					    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
					    WebElement element1 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
					    ((JavascriptExecutor) driver).executeScript(
					            "arguments[0].scrollIntoView();", element1);
					     element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupDate())));
					    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
					    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
					    //String BookingPage_PickupTimefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");
					    //System.out.println("Pickup Time is =" + BookingPage_PickupTimefield);
				        //Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
				        //Assert.assertEquals(BookingPage_PickupTimefield, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
				        boolean Firstoption = driver.findElement(By.xpath(objMAB.BookingPage_SecondDeliveryoptionLocator())).isEnabled();
				        System.out.println("Option 1st is" + Firstoption);
				        String BookingPage_SecondPricevalue = driver.findElement(By.xpath(objMAB.BookingPage_SecondPriceDeliveryoptionLocator())).getText();
				        Assert.assertEquals(BookingPage_SecondPricevalue, SecondPriceValue);
				        }
			        driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
			        Thread.sleep(5000);
			
				   }
		        
			   }
			   
			   if(PickupTime.equals("12pm_2pm") || PickupTime.equals("2pm_5pm") || PickupTime.equals("After 3pm") ) {
				   for(int i=0;i<3;i++) {
					   
					   driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).sendKeys("12");
					   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
					   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys("45 clarence st sydney nsw australia");
				       driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).sendKeys("23 wentworth st greenacre nsw australia");
				    
				       pickupTime.TimeBetween(PickupTime);
					
					    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
					   						 
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())));
			        String Shipmentquaavalue = driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).getAttribute("value");
			        System.out.println("quantity is" + Shipmentquaavalue);
			        String Pickupaddressvalue = driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).getAttribute("value");
			        System.out.println("Pickupaddress is" + Pickupaddressvalue);
			        String Dropoffaddressvalue = driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).getAttribute("value");
			        System.out.println("Dropoffaddress is" + Dropoffaddressvalue);
			        String PickupDatevalue = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).getAttribute("value");
			        System.out.println("PickupDate is" + PickupDatevalue);
			        String PickupTimevalue = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");
			        System.out.println("PickupTime is" + PickupTimevalue);
			        String FirstPriceValue = driver.findElement(By.xpath(objGetQuote.FirstPriceLocators())).getText();
			        System.out.println("FirstPrice is" + FirstPriceValue);
			        String SecondPriceValue = driver.findElement(By.xpath(objGetQuote.SecondPriceLocators())).getText();
			        System.out.println("SecondPrice is" + SecondPriceValue);
			        String ThirdPriceValue = driver.findElement(By.xpath(objGetQuote.ThirdPriceLocators())).getText();
			        System.out.println("ThirdPrice is" + ThirdPriceValue);
			        if(i==0) {
			        	  String btn = driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).getText();
						    System.out.println("btn text is = " + btn);
						   
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.FirstBookNowbtnLocator())));
						    JavascriptExecutor executor = (JavascriptExecutor) driver;
						    executor.executeScript("arguments[0].click()", element);
						    
						    
						    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
						    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
						    String Currenturl = driver.getCurrentUrl();
						    Assert.assertEquals(Currenturl, objurl.BookingPage());
						    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
						    System.out.println("Shipment value is=" + Shipvalue);
						    String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]/input")).getAttribute("value");
						    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
						    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
						    
						    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
						    WebElement element = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
						    ((JavascriptExecutor) driver).executeScript(
						            "arguments[0].scrollIntoView();", element);
						    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
						    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
						    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
						    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
						    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
						    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
						    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
						    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
						    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
						    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
						    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
						    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
						    WebElement element1 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
						    ((JavascriptExecutor) driver).executeScript(
						            "arguments[0].scrollIntoView();", element1);
						    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupDate())));
						    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
						    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
						    //String BookingPage_PickupTimefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");
						    //System.out.println("Pickup Time is =" + BookingPage_field);
					       // Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
					        //Assert.assertEquals(BookingPage_field, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
					        boolean Firstoption = driver.findElement(By.xpath(objMAB.BookingPage_FirstDeliveryoptionLocator())).isEnabled();
					        System.out.println("Option 1st is" + Firstoption);
					        String BookingPage_FirstPricevalue = driver.findElement(By.xpath(objMAB.BookingPage_FirstPriceDeliveryoptionLocator())).getText();
					        Assert.assertEquals(BookingPage_FirstPricevalue, FirstPriceValue);
			        }
			        if(i==1) {
			        	String btn = driver.findElement(By.xpath(objGetQuote.SecondBookNowbtnLocator())).getText();
					    System.out.println("btn text is = " + btn);
					    //WebDriverWait wait = new WebDriverWait(driver, 10);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.SecondBookNowbtnLocator())));
					    JavascriptExecutor executor = (JavascriptExecutor) driver;
					    executor.executeScript("arguments[0].click()", element);
					    
					    
					    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
					    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
					    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
					    String Currenturl = driver.getCurrentUrl();
					    Assert.assertEquals(Currenturl, objurl.BookingPage());
					    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
					    System.out.println("Shipment value is=" + Shipvalue);
					    String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]/input")).getAttribute("value");
					    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
					    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
					    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
					    
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
					    WebElement element = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
					    ((JavascriptExecutor) driver).executeScript(
					            "arguments[0].scrollIntoView();", element);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
					    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
					    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
					    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
					    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
					    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
					    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
					    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
					    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
					    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
					    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
					    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
					    WebElement element1 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
					    ((JavascriptExecutor) driver).executeScript(
					            "arguments[0].scrollIntoView();", element1);
					   element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupDate())));
					    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
					    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
					    //String BookingPage_field = driver.findElement(By.xpath(objMAB.BookingPage_())).getAttribute("value");
					    //System.out.println("Pickup Time is =" + BookingPage_field);
				       // Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
				        //Assert.assertEquals(BookingPage_field, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
				        boolean Firstoption = driver.findElement(By.xpath(objMAB.BookingPage_SecondDeliveryoptionLocator())).isEnabled();
				        System.out.println("Option 1st is" + Firstoption);
				        String BookingPage_SecondPricevalue = driver.findElement(By.xpath(objMAB.BookingPage_SecondPriceDeliveryoptionLocator())).getText();
				        Assert.assertEquals(BookingPage_SecondPricevalue, SecondPriceValue);
				        }
			        if(i==2) {
			        	String btn = driver.findElement(By.xpath(objGetQuote.ThirdBookNowbtnLocator())).getText();
					    System.out.println("btn text is = " + btn);
					    //WebDriverWait wait = new WebDriverWait(driver, 10);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.ThirdBookNowbtnLocator())));
					    JavascriptExecutor executor = (JavascriptExecutor) driver;
					    executor.executeScript("arguments[0].click()", element);
					    
					    
					    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
					    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
					    //Thread.sleep(10000);
					    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
					    String Currenturl = driver.getCurrentUrl();
					    Assert.assertEquals(Currenturl, objurl.BookingPage());
					    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
					    System.out.println("Shipment value is=" + Shipvalue);
					    String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]/input")).getAttribute("value");
					    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
					    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
					    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
					    WebElement element1 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
					    ((JavascriptExecutor) driver).executeScript(
					            "arguments[0].scrollIntoView();", element1);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
					    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
					    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
					    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
					    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
					    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
					    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
					    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
					    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
					    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
					    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
					    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
					    WebElement element2 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
					    ((JavascriptExecutor) driver).executeScript(
					            "arguments[0].scrollIntoView();", element2);
					    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupDate())));
					    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
					    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
					    //String BookingPage_field = driver.findElement(By.xpath(objMAB.BookingPage_())).getAttribute("value");
					    //System.out.println("Pickup Time is =" + BookingPage_field);
				        //Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
				        //Assert.assertEquals(BookingPage_field, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
				        boolean Thirdoption = driver.findElement(By.xpath(objMAB.BookingPage_ThirdDeliveryoptionLocator())).isEnabled();
				        System.out.println("Option 1st is" + Thirdoption);
				        String BookingPage_ThirdPricevalue = driver.findElement(By.xpath(objMAB.BookingPage_ThirdPriceDeliveryoptionLocator())).getText();
				        Assert.assertEquals(BookingPage_ThirdPricevalue, ThirdPriceValue);
				        }
			        driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
			        Thread.sleep(5000);
				   }
			   	}
		   }
		   else if(Shipment.equals("Documents") || Shipment.equals("Satchel, laptops") || Shipment.equals("Small box") || Shipment.equals("Large Box")) {
			   String Shipmentquaavalue = null;
			   for(int i=0;i<4;i++) {
			    if(Shipment.equals("Documents")){
			    	driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).clear();
			    	 driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).sendKeys("12");
			    	 Shipmentquaavalue = driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).getAttribute("value");
				        System.out.println("quantity is" + Shipmentquaavalue);
			    }
			    if(Shipment.equals("Satchel, laptops")){
			    	driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).clear();
			    	 driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).sendKeys("12");
			    	 Shipmentquaavalue = driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).getAttribute("value");
				        System.out.println("quantity is" + Shipmentquaavalue);
			    }
			    if(Shipment.equals("Small box")){
			    	driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).clear();
			    	 driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).sendKeys("12");
			    	 Shipmentquaavalue = driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).getAttribute("value");
				        System.out.println("quantity is" + Shipmentquaavalue);
			    }
			    if(Shipment.equals("Large Box")){
			    	driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).clear();
			    	 driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).sendKeys("3");
			    	 Shipmentquaavalue = driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).getAttribute("value");
				        System.out.println("quantity is" + Shipmentquaavalue);
			    }
			    
					   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
					   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys("45 clarence st sydney nsw australia");
				       driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).sendKeys("23 wentworth st greenacre nsw australia");
				       
				       if(PickupTime.equals("12pm_2pm") || PickupTime.equals("2pm_5pm") || PickupTime.equals("After 3pm") || PickupTime.equals("12am_8am") || PickupTime.equals("8am_12pm") || PickupTime.equals("After 5pm")){
				       pickupTime.TimeBetween(PickupTime);
				       }
				       element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
					    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
			      
			       
			        String Pickupaddressvalue = driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).getAttribute("value");
			        System.out.println("Address is" + Pickupaddressvalue);
			        String Dropoffaddressvalue = driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).getAttribute("value");
			        System.out.println("Address is" + Dropoffaddressvalue);
			        String PickupDatevalue = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).getAttribute("value");
			        System.out.println("Address is" + PickupDatevalue);
			        String PickupTimevalue = driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).getAttribute("value");
			        System.out.println("Address is" + PickupTimevalue);
			        String FirstPriceValue = driver.findElement(By.xpath(objGetQuote.FirstPriceLocators())).getText();
			        System.out.println("Address is" + FirstPriceValue);
			        String SecondPriceValue = driver.findElement(By.xpath(objGetQuote.SecondPriceLocators())).getText();
			        System.out.println("Address is" + SecondPriceValue);
			        String ThirdPriceValue = driver.findElement(By.xpath(objGetQuote.ThirdPriceLocators())).getText();
			        System.out.println("Address is" + ThirdPriceValue);
			        String FourthPriceValue = driver.findElement(By.xpath(objGetQuote.FourthPriceLocators())).getText();
			        System.out.println("Address is" + FourthPriceValue);
			        element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FirstBookNowbtnLocator())));
			       
			        
						   
						   
				        if(i==0) {
				        	  String btn = driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).getText();
							    System.out.println("btn text is = " + btn);
							    //WebDriverWait wait = new WebDriverWait(driver, 10);
							    element = Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.FirstBookNowbtnLocator())));
							    JavascriptExecutor executor = (JavascriptExecutor) driver;
							    executor.executeScript("arguments[0].click()", element);
							    
							    
							    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
							    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
							    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
							    String Currenturl = driver.getCurrentUrl();
							    Assert.assertEquals(Currenturl, objurl.BookingPage());
							    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
							    System.out.println("Shipment value is=" + Shipvalue);
							    //String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]/input")).getAttribute("value");
							    //System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    //Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
							    if(Shipment.equals("Documents")){
							    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]/input")).getAttribute("value");
								    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
								    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
							    }
							    if(Shipment.equals("Satchel, laptops")){
							    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[4]/input")).getAttribute("value");
								    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
								    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
							    }
							    if(Shipment.equals("Small box")){
							    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[5]/input")).getAttribute("value");
								    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
								    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
							    }
							    if(Shipment.equals("Large Box")){
							    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[7]/input")).getAttribute("value");
								    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
								    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
							    }

							    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
							    //Thread.sleep(10000);
							    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
							    WebElement element1 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
							    ((JavascriptExecutor) driver).executeScript(
							            "arguments[0].scrollIntoView();", element1);
							    //Thread.sleep(10000);
							    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
							    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
							    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
							    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
							    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
							    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
							    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
							    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())));
							    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
							    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
							    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
							    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
							    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
							    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
							    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[6]/textarea")).sendKeys(Keys.TAB);
							    //driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
							    WebElement element2 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
							    ((JavascriptExecutor) driver).executeScript(
							            "arguments[0].scrollIntoView();", element2);
							    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.BookingPage_PickupDate())));
							    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
							    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
							    //String BookingPage_PickupTimefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");
							    //System.out.println("Pickup Time is =" + BookingPage_PickupTimefield);
						        //Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
							    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[9]/div[1]")));
						        //Assert.assertEquals(BookingPage_PickupTimefield, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
						        boolean Firstoption = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[9]/div[1]")).isEnabled();
						        System.out.println("Option 1st is" + Firstoption);
						        String BookingPage_FirstPricevalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[9]/div[1]/div[2]/span")).getText();
						        Assert.assertEquals(BookingPage_FirstPricevalue, FirstPriceValue);
				        }
				        if(i==1) {
				        	String btn = driver.findElement(By.xpath(objGetQuote.SecondBookNowbtnLocator())).getText();
						    System.out.println("btn text is = " + btn);
						    WebDriverWait wait = new WebDriverWait(driver, 10);
						    WebElement BookNowbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.SecondBookNowbtnLocator())));
						    JavascriptExecutor executor = (JavascriptExecutor) driver;
						    executor.executeScript("arguments[0].click()", BookNowbtn);
						    
						    
						    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
						    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
						    //Thread.sleep(10000);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
						    String Currenturl = driver.getCurrentUrl();
						    Assert.assertEquals(Currenturl, objurl.BookingPage());
						    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
						    System.out.println("Shipment value is=" + Shipvalue);
						    if(Shipment.equals("Documents")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Satchel, laptops")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[4]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Small box")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[5]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Large Box")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[7]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }

						    
						    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
						    WebElement element1 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
						    ((JavascriptExecutor) driver).executeScript(
						            "arguments[0].scrollIntoView();", element1);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
						    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
						    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
						    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
						    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
						    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
						    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
						    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
						    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
						    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
						    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
						    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
						    WebElement element2 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
						    ((JavascriptExecutor) driver).executeScript(
						            "arguments[0].scrollIntoView();", element2);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.BookingPage_PickupDate())));
						    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
						    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
						    //String BookingPage_PickupTimefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");
						    //System.out.println("Pickup Time is =" + BookingPage_PickupTimefield);
					        //Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
					        //Assert.assertEquals(BookingPage_PickupTimefield, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
					        boolean Firstoption = driver.findElement(By.xpath(objMAB.BookingPage_SecondDeliveryoptionLocator())).isEnabled();
					        System.out.println("Option 1st is" + Firstoption);
					        String BookingPage_SecondPricevalue = driver.findElement(By.xpath(objMAB.BookingPage_SecondPriceDeliveryoptionLocator())).getText();
					        Assert.assertEquals(BookingPage_SecondPricevalue, SecondPriceValue);
					        }
				        if(i==2) {
				        	String btn = driver.findElement(By.xpath(objGetQuote.ThirdBookNowbtnLocator())).getText();
						    System.out.println("btn text is = " + btn);
						    WebDriverWait wait = new WebDriverWait(driver, 10);
						    WebElement BookNowbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.ThirdBookNowbtnLocator())));
						    JavascriptExecutor executor = (JavascriptExecutor) driver;
						    executor.executeScript("arguments[0].click()", BookNowbtn);
						    
						    
						    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
						    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
						    String Currenturl = driver.getCurrentUrl();
						    Assert.assertEquals(Currenturl, objurl.BookingPage());
						    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
						    System.out.println("Shipment value is=" + Shipvalue);
						    //String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]/input")).getAttribute("value");
						   // System.out.println("Shipment quantity value is" + ShipmentQuanValue);
						   //Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    if(Shipment.equals("Documents")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Satchel, laptops")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[4]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Small box")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[5]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Large Box")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[7]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
 
						    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
						    WebElement element2 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
						    ((JavascriptExecutor) driver).executeScript(
						            "arguments[0].scrollIntoView();", element2);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
						    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
						    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
						    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
						    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
						    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
						    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
						    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
						    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
						    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
						    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
						    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
						    WebElement element1 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
						    ((JavascriptExecutor) driver).executeScript(
						            "arguments[0].scrollIntoView();", element1);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.BookingPage_PickupDate())));
						    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
						    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
						    //String BookingPage_PickupTimefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");
						    //System.out.println("Pickup Time is =" + BookingPage_PickupTimefield);
					        //Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
					        //Assert.assertEquals(BookingPage_PickupTimefield, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
					        boolean Thirdoption = driver.findElement(By.xpath(objMAB.BookingPage_ThirdDeliveryoptionLocator())).isEnabled();
					        System.out.println("Option 1st is" + Thirdoption);
					        String BookingPage_ThirdPricevalue = driver.findElement(By.xpath(objMAB.BookingPage_ThirdPriceDeliveryoptionLocator())).getText();
					        Assert.assertEquals(BookingPage_ThirdPricevalue, ThirdPriceValue);
			    }
				        if(i==3) {
				        	String btn = driver.findElement(By.xpath(objGetQuote.FourthBookNowbtnLocator())).getText();
						    System.out.println("btn text is = " + btn);
						    WebDriverWait wait = new WebDriverWait(driver, 10);
						    WebElement BookNowbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.FourthBookNowbtnLocator())));
						    JavascriptExecutor executor = (JavascriptExecutor) driver;
						    executor.executeScript("arguments[0].click()", BookNowbtn);
						    
						    
						    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
						    //driver.findElement(By.xpath(objGetQuote.FirstBookNowbtnLocator())).sendKeys(Keys.ENTER);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));
						    String Currenturl = driver.getCurrentUrl();
						    Assert.assertEquals(Currenturl, objurl.BookingPage());
						    Boolean Shipvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]")).isEnabled();
						    System.out.println("Shipment value is=" + Shipvalue);
						    //String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[2]/div/div[6]/input")).getAttribute("value");
						    //System.out.println("Shipment quantity value is" + ShipmentQuanValue);
						    //Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    if(Shipment.equals("Documents")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Satchel, laptops")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[4]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Small box")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[5]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }
						    if(Shipment.equals("Large Box")){
						    	String ShipmentQuanValue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[7]/input")).getAttribute("value");
							    System.out.println("Shipment quantity value is" + ShipmentQuanValue);
							    Assert.assertEquals(ShipmentQuanValue, Shipmentquaavalue);
						    }

						    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[3]/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input")));
						    WebElement element = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[2]/input"));
						    ((JavascriptExecutor) driver).executeScript(
						            "arguments[0].scrollIntoView();", element);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")));
						    driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
						    String BookingPage_PickupStreetnum = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
						    System.out.println("PickupStreet number is =" + BookingPage_PickupStreetnum);
						    String BookingPage_Pickupaddress = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div[1]/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
						    System.out.println("Pickupaddress is =" + BookingPage_Pickupaddress);
						    String BookingPage_Dropoffaddress = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
						    System.out.println("Dropoffaddress is =" + BookingPage_Dropoffaddress);
						    String BookingPage_DropoffStreetnum = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
						    System.out.println("DropoffStreetnum is =" + BookingPage_DropoffStreetnum);
						    Assert.assertEquals(BookingPage_PickupStreetnum + " " + BookingPage_Pickupaddress, Pickupaddressvalue);
						    Assert.assertEquals(BookingPage_DropoffStreetnum + " " + BookingPage_Dropoffaddress, Dropoffaddressvalue);
						    WebElement element1 = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate()));
						    ((JavascriptExecutor) driver).executeScript(
						            "arguments[0].scrollIntoView();", element1);
						    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objMAB.BookingPage_PickupDate())));
						    String BookingPage_PickupDatefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupDate())).getAttribute("value");
						    System.out.println("Pickup Date is =" + BookingPage_PickupDatefield);
						    //String BookingPage_PickupTimefield = driver.findElement(By.xpath(objMAB.BookingPage_PickupTime())).getAttribute("value");
						    //System.out.println("Pickup Time is =" + BookingPage_PickupTimefield);
					        //Assert.assertEquals(BookingPage_PickupDatefield, objETA.ETACurrentDate());
					        //Assert.assertEquals(BookingPage_PickupTimefield, new SimpleDateFormat("hh:mma").format(Calendar.getInstance().getTime()));
					        boolean Fourthoption = driver.findElement(By.xpath(objMAB.BookingPage_FourthDeliveryoptionLocator())).isEnabled();
					        System.out.println("Option 1st is" + Fourthoption);
					        String BookingPage_FourthPricevalue = driver.findElement(By.xpath(objMAB.BookingPage_FourthPriceDeliveryoptionLocator())).getText();
					        Assert.assertEquals(BookingPage_FourthPricevalue, FourthPriceValue);
			    }
						   driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
					        Thread.sleep(5000);

			             
			  
		   }
		   
			  
	   }
		   System.out.println("GQ12:" + Shipment + ":" + " "  + "with" + " " + PickupTime + " " + "completed");
	}
}



