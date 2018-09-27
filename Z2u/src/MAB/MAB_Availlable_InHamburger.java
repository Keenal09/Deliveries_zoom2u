package MAB;

import java.io.IOException;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.URL_Staging;
import Controller.MAB_Scenarios;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;
import Test.MABTest;

public class MAB_Availlable_InHamburger extends MAB_Scenarios {
	
	URL_Staging objurl = new URL_Staging();
	 WebElement element;
    MakeaBookingLocator objMAB = new MakeaBookingLocator();
    LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	
	public void MAB_Available(String Emailid, String Pwd) throws IOException, JSONException, InterruptedException{
		
		 System.out.println(".................................................................................................");
		 System.out.println("MAB1:Verify Make a Booking text method and booking url in menu item get started.....");
			objLogin.LoginwithvalidCredentials(Emailid, Pwd);
		    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())));
			WebElement MABText = driver.findElement(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator()));
			String VerifyMABtext = MABText.getText();
			System.out.println(VerifyMABtext);
			Assert.assertEquals(VerifyMABtext, "Make a booking");
			  driver.findElement(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())).click();
			  String MABurlverify = driver.getCurrentUrl();
			  System.out.println("The url for MAB is = "+ MABurlverify);
			  Assert.assertEquals(MABurlverify, objurl.BookingPage());
			System.out.println("MAB1:Verify Make a booking text and make a booking page method completed...");
			System.out.println(".................................................................................................");

		
	}

}
