package RequiredClassesfor_EachModule;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import CommonLibraries.BearerTokengetService;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import CommonLibraries.Login;
import CommonLibraries.MakeaBookingLocator;
import Controller.LaunchBrowser_inCrossBrowser;

public class LoginCredentialsfor_Login extends LaunchBrowser_inCrossBrowser {
	
	Login objLogin = new Login();
	BearerTokengetService objToken = new BearerTokengetService();
	WebElement element;
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	MakeaBookingLocator objMAB = new MakeaBookingLocator();

	
	public void LoginwithvalidCredentials(String Emailid, String Pwd) throws IOException, JSONException, InterruptedException{
		
		driver.findElement(By.xpath(objLogin.emaillocator())).sendKeys(Emailid);
		driver.findElement(By.xpath(objLogin.pwdlocator())).sendKeys(Pwd);
		//objToken.Tokenaccess(Emailid, Pwd);
		driver.findElement(By.xpath(objLogin.loginbtnlocator())).click();
	}
	
	public void GetQuoteopen(String Emailid,String Pwd) throws IOException, JSONException, InterruptedException {
		
		LoginwithvalidCredentials(Emailid, Pwd);
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())));
		driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
		
		
	}
	
public void MABopen(String Emailid,String Pwd) throws IOException, JSONException, InterruptedException {
		
		LoginwithvalidCredentials(Emailid, Pwd);
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())));
		driver.findElement(By.xpath(objMAB.MakeaBooking_HamburgerMenuoptionLocator())).click();
		
		
	}
	
	
public void GetQuotedirectlyopen() throws IOException, JSONException, InterruptedException {
		
		//LoginwithvalidCredentials(Emailid, Pwd);
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())));
		driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
		
		
	}

}
