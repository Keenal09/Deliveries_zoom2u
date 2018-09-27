package MAB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.MyLocation_Locator;
import Controller.MAB_Scenarios;

public class MAB_DetailsgetfromMyLocation extends MAB_Scenarios {
	
	MyLocation_Locator objMyLocation = new MyLocation_Locator();
	
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	
	WebElement element;
	
	public void MAB_DetailsfromMylocationonMAB() {
		System.out.println(".................................................................................................");
  		System.out.println("MAB15:MAB pickup and drop off details verification from my location started");

		driver.findElement(By.xpath(objMyLocation.MyLocation_MenuinHamburger())).click();
   	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMyLocation.MyLocationList_FirstEntryLocator())));
   	 driver.findElement(By.xpath(objMyLocation.MyLocationList_FirstEntryLocator())).click();
   	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMyLocation.MyLocationDetail_ContactnameLocator())));

		String PickupContactname = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactnameLocator())).getAttribute("value");
		System.out.println("Pickup contact name is" + PickupContactname);
		String PickupContactEmail = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactEmail())).getAttribute("value");
		System.out.println("Pickup contact Email is" + PickupContactEmail);
		String PickupContactPhonenum = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactPhonenumberLocator())).getAttribute("value");
		System.out.println("Pickup contact phone number is" + PickupContactPhonenum);
		String PickupContactunitnumber = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactUnitnumberLocator())).getAttribute("value");
		System.out.println("Pickup contact unit number is" + PickupContactunitnumber);
		String pickupContactStreetnumber = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactStreetnumberLocator())).getAttribute("value");
		System.out.println("Pickup contact street number is" + pickupContactStreetnumber);
		String PickupContactStreetname = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactStreetnameLocator())).getAttribute("value");
		System.out.println("Pickup contact Street name is" + PickupContactStreetname);
		String PickupContacttextarea = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactNotesLocator())).getAttribute("value");
		System.out.println("Pickup contact text area is" + PickupContacttextarea);
		driver.findElement(By.xpath(objMyLocation.MyLocationDetail_Cancelbtn())).click();
	   	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMyLocation.MyLocationList_SixthEntryLocator())));

		driver.findElement(By.xpath(objMyLocation.MyLocationList_SixthEntryLocator())).click();
	   	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMyLocation.MyLocationDetail_ContactnameLocator())));

		String DropoffContactname = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactnameLocator())).getAttribute("value");
		System.out.println("Dropoff contact name is" + DropoffContactname);
		String DropoffContactEmail = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactEmail())).getAttribute("value");
		System.out.println("Dropoff contact Email is" + DropoffContactEmail);
		String DropoffContactPhonenum = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactPhonenumberLocator())).getAttribute("value");
		System.out.println("Dropoff contact Phone num is" + DropoffContactPhonenum);
		String DropoffContactunitnumber = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactUnitnumberLocator())).getAttribute("value");
		System.out.println("Dropoff contact unit number is" + DropoffContactunitnumber);
		String DropoffContactStreetnumber = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactStreetnumberLocator())).getAttribute("value");
		System.out.println("Dropoff contact Street number is" + DropoffContactStreetnumber);
		String DropoffContactStreetname = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactStreetnameLocator())).getAttribute("value");
		System.out.println("Dropoff contact Street name is" + DropoffContactStreetname);
		String DropoffContacttextarea = driver.findElement(By.xpath(objMyLocation.MyLocationDetail_ContactNotesLocator())).getAttribute("value");
		System.out.println("Dropoff contact text area is" + DropoffContacttextarea);
		driver.findElement(By.xpath(objMyLocation.MyLocationDetail_Cancelbtn())).click();
	   	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMyLocation.MyLocationList_FirstEntryLocator())));

		driver.findElement(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())).click();
	   	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_DocumentshipmentLocator())));

		
		driver.findElement(By.xpath(objMAB.Pickupname_textfieldLocator())).sendKeys("Test");
		  // WebElement myDynamicElement = (new WebDriverWait(driver, 10))
         
				     // .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='typeahead-2290-571']")));

				   // Above code is used for explicit wait until the autopopulate value does not appears.
		//List <WebElement> listItems = driver.findElements(By.xpath(".//*[@id='typeahead-2290-571']"));
		//listItems.get(0).click();
				    //driver.findElement(By.xpath(".//*[@id='typeahead-2290-571-option-0']/a")).sendKeys(Keys.ENTER);


		//driver.findElement(By.xpath(".//*[@id='typeahead-196-7124-option-0']/a")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath(".//*[@id='typeahead-2290-571-option-0']/a")).click();
		//Select select = new Select(driver.findElement(By.xpath(".//*[@id='typeahead-2290-571']")));
		//select.deselectAll();
		//select.selectByIndex(1);
		
		//Actions builder = new Actions(driver);

		  // find the element which we want to Select from auto suggestion
		 // WebElement ele = driver.findElement(By.xpath(".//*[@id='typeahead-196-7124-option-0']/a"));

		  // use Mouse hover action for that element
		//  builder.moveToElement(ele).build().perform();

		  // Give wait for 2 seconds
		       // WebDriverWait wait = new WebDriverWait(driver,5);
		    //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='typeahead-196-7124-option-0']/a")));;


		  // finally click on that element
		  //builder.click(ele).build().perform();

		//$('.dropdown-menu>li').attr('id');

WebElement googleSearchBtn = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[1]/ul/li[1]"));
String value = googleSearchBtn.getAttribute("id");
driver.findElement(By.id(value)).click();
System.out.println("Id of the button is:- "+ value );

		//List allOptions = driver.findElements(By.className("dropdown-menu"));
		//String option = allOptions.get(0).getText();
		//System.out.println(option);
	
			//((WebElement) allOptions.get(1)).click();
			//((WebElement) allOptions.get(0)).sendKeys(Keys.ENTER);

			
			
			//Thread.sleep(10000);
		

		String ActualMABPickupContactname = driver.findElement(By.xpath(objMAB.Pickupname_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact name is" + ActualMABPickupContactname);
		String ActualMABPickupContactEmail = driver.findElement(By.xpath(objMAB.PickupEmail_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact Email is" + ActualMABPickupContactEmail);
		String ActualMABPickupContactPhonenum = driver.findElement(By.xpath(objMAB.PickupPhonenumber_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact phone num is" + ActualMABPickupContactPhonenum);
		String ActualMABPickupContactunitnumber = driver.findElement(By.xpath(objMAB.PickupUnitnumber_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact unit number is" + ActualMABPickupContactunitnumber);
		String ActualMABpickupContactStreetnumber = driver.findElement(By.xpath(objMAB.Pickupaddresstreetnumbertextfield_Pickupdetails())).getAttribute("value");
		System.out.println("Pickup contact Street number is" + ActualMABpickupContactStreetnumber);
		String ActualMABPickupContactStreetname = driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).getAttribute("value");
		System.out.println("Pickup contact street name is" + ActualMABPickupContactStreetname);
		String ActualMABPickupContacttextarea = driver.findElement(By.xpath(objMAB.Pickup_DeliveryInstructions_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact text area is" + ActualMABPickupContacttextarea);
		Assert.assertEquals(ActualMABPickupContactname, PickupContactname);
		Assert.assertEquals(ActualMABPickupContactEmail, PickupContactEmail);
		Assert.assertEquals(ActualMABPickupContactPhonenum, PickupContactPhonenum);
		Assert.assertEquals(ActualMABPickupContactunitnumber, PickupContactunitnumber);
		Assert.assertEquals(ActualMABpickupContactStreetnumber, pickupContactStreetnumber);
		Assert.assertEquals(ActualMABPickupContactStreetname, PickupContactStreetname);
		Assert.assertEquals(ActualMABPickupContacttextarea, PickupContacttextarea);
		
driver.findElement(By.xpath(objMAB.dropoffname_textfieldLocator())).sendKeys("Test");
		
		//driver.findElement(By.xpath(".//*[@id='typeahead-1688-1211-option-2']/a")).sendKeys(Keys.ENTER);
	//Select select1 = new Select(driver.findElement(By.xpath(".//*[@id='typeahead-2290-571']")));
	 //select1.deselectAll();
	// select1.selectByIndex(3);	
		//listItems = driver.findElements(By.xpath(".//*[@id='typeahead-2290-571-option-2']/a"));
		//listItems.get(2).click();
//List allOptions1 = driver.findElements(By.className("dropdown-menu"));

//((WebElement) allOptions1.get(3)).click();
//Thread.sleep(10000);
WebElement googleSearchBtn1 = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[1]/ul/li[3]"));
String value1 = googleSearchBtn1.getAttribute("id");
System.out.println("Id of the button is:- "+ value1 );
driver.findElement(By.id(value1)).click();




   //Thread.sleep(10000);
	String ActualMABDropContactname = driver.findElement(By.xpath(objMAB.dropoffname_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact name is" + ActualMABDropContactname);
        String ActualMABDropContactEmail = driver.findElement(By.xpath(objMAB.dropoffEmail_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact Email is" + ActualMABDropContactEmail);
		String ActualMABDropContactPhonenum = driver.findElement(By.xpath(objMAB.DropoffPhonenumber_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact phone number is" + ActualMABDropContactPhonenum);
		String ActualMABDropContactunitnumber = driver.findElement(By.xpath(objMAB.DropoffUnitnumber_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact unit number is" + ActualMABDropContactunitnumber);
		String ActualMABDropContactStreetnumber = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("value");
		System.out.println("Pickup contact street number is" + ActualMABDropContactStreetnumber);
		String ActualMABDropContactStreetname = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("value");
		System.out.println("Pickup contact street name is" + ActualMABDropContactStreetname);
		String ActualMABDropContacttextarea = driver.findElement(By.xpath(objMAB.Dropoff_DeliveryInstructions_textfieldLocator())).getAttribute("value");
		System.out.println("Pickup contact text area is" + ActualMABDropContacttextarea);

		
		Assert.assertEquals(ActualMABDropContactname, DropoffContactname);
		Assert.assertEquals(ActualMABDropContactEmail, DropoffContactEmail);
		Assert.assertEquals(ActualMABDropContactPhonenum, DropoffContactPhonenum);
		Assert.assertEquals(ActualMABDropContactunitnumber, DropoffContactunitnumber);
		Assert.assertEquals(ActualMABDropContactStreetnumber, DropoffContactStreetnumber);
		Assert.assertEquals(ActualMABDropContactStreetname, DropoffContactStreetname);
		Assert.assertEquals(ActualMABDropContacttextarea, DropoffContacttextarea);

  		System.out.println("MAB15:MAB pickup and drop off details verification from my location completed");
		System.out.println(".................................................................................................");


	}

}
