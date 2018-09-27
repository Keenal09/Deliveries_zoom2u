package Controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.DriverClass;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.Login;
import CommonLibraries.Registration;
import CommonLibraries.URL_Staging;
import DeliveriesMessages.LoginMessages;

public class Loginscenarios extends LaunchBrowser_inCrossBrowser {
    
      Login obj=new Login();
      URL_Staging url=new URL_Staging();
      LoginMessages LoginmessagesDisplay = new LoginMessages();
	  public void loginwithvalidcredentials(String email, String password) throws InterruptedException {
		  
		  System.out.println("...........................................................................................................");
		  System.out.println("L1 :Login with valid credentials 1st test case Starting........");
		  driver.findElement(By.xpath(obj.emaillocator())).sendKeys(email);
		  driver.findElement(By.xpath(obj.pwdlocator())).sendKeys(password);
		  driver.findElement(By.xpath(obj.loginbtnlocator())).click();
		  System.out.println("L1:Login Success");
		  Thread.sleep(10000);
          driver.findElement(By.xpath(obj.logoutlocator())).click();
		  if(browser=="Firefox"){
			  Thread.sleep(10000);
			  driver.findElement(By.xpath(obj.alreadyLoggedoutpopup())).click();
		  }
		  System.out.println("L1: Login with Valid Credentials 1st Test case Completed");
		  System.out.println("...........................................................................................................");
	
	  }
	  
	  public void loginwithinvalidcredentials(String email,String password) throws InterruptedException{
		  System.out.println("...........................................................................................................");
		  System.out.println("L4:Login with invalid username/pwd 4th test case starting.....");
		  WebElement element;
		  driver.navigate().refresh();
		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(obj.emaillocator())));
		  driver.findElement(By.xpath(obj.emaillocator())).sendKeys(email);
		  driver.findElement(By.xpath(obj.pwdlocator())).sendKeys(password);
		  driver.findElement(By.xpath(obj.loginbtnlocator())).click();
		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(obj.EmailNotRegisteredValid())));
		  WebElement EmailNotRegisteredValid=driver.findElement(By.xpath(obj.EmailNotRegisteredValid()));
		  String EmailNotRegisteredValidation= EmailNotRegisteredValid.getText();
		  
		  Assert.assertEquals(EmailNotRegisteredValidation, LoginmessagesDisplay.NotRegisteredEmailValidation());
		  System.out.println("L4:Login with invalid username/pwd 4th test case Completed");
		  System.out.println("...........................................................................................................");
		  
	  }
	  
	  public void loginwithoutcredentials() throws InterruptedException{
		  System.out.println("...........................................................................................................");
		  System.out.println("L5:Login without credentials 5th test case Starting......... ");
		  driver.findElement(By.xpath(obj.emaillocator())).clear();
		  driver.findElement(By.xpath(obj.pwdlocator())).clear();
		  driver.findElement(By.xpath(obj.loginbtnlocator())).click();
		  Thread.sleep(10000);
		  WebElement emailvalidation=driver.findElement(By.xpath(obj.emailvalidation()));
		  String Actualemailvalidation=emailvalidation.getText();   
		  Assert.assertEquals(Actualemailvalidation, "Please enter a valid email.");
		  WebElement passwordvalidation=driver.findElement(By.xpath(obj.passwordvalidation()));
		  String Actualpasswordvalidation=passwordvalidation.getText();
		  Assert.assertEquals(Actualpasswordvalidation, LoginmessagesDisplay.PasswordLengthMessage());
		  System.out.println("L5:Login without credentials 5th test case completed");
		  System.out.println("...........................................................................................................");
	  }
	  
	  public void loginwithinvalidpassword(String email, String password) throws InterruptedException {
		  
		  System.out.println("...........................................................................................................");
		  System.out.println("L2:Login with invalid password 2nd test case Starting......");
		  
		  driver.findElement(By.xpath(obj.emaillocator())).sendKeys(email);
		  driver.findElement(By.xpath(obj.pwdlocator())).sendKeys(password);
		  driver.findElement(By.xpath(obj.loginbtnlocator())).click();
		  Thread.sleep(10000);
		  WebElement userpassvalidation=driver.findElement(By.xpath(obj.usernamepasswordvalidation()));
		  String Actualuserpassvalidation=userpassvalidation.getText();
		  Assert.assertEquals(Actualuserpassvalidation, LoginmessagesDisplay.IncorrectUsernameorPwdMessage());
		  System.out.println("L2:Login with invalid password 2nd test case Completed...");
		  System.out.println("...........................................................................................................");
		  
	  }
	  
	  public void MaskedPwdfield() throws InterruptedException{
		  System.out.println("...........................................................................................................");
		  System.out.println("L6:Field is a pwd type field 6th test case Starting......");
		  driver.navigate().refresh();
		  Thread.sleep(10000);
		  WebElement input=driver.findElement(By.xpath(obj.pwdlocator()));
		  boolean isEncrypted = input.getAttribute("type").equals("password");
		  System.out.println(isEncrypted);
		  Assert.assertEquals(isEncrypted, true);
		  System.out.println("L6:Field is a pwd type field 6th test case Completed");
		  System.out.println("...........................................................................................................");
	  }
	  
	  public void redirectTosameloginurlOnRefresh() throws InterruptedException{
		  System.out.println("...........................................................................................................");
		  System.out.println("L7:On login refresh it is redirecting to the login page 7th test case starting......");
		  driver.navigate().refresh();
		  Thread.sleep(10000);
		  String Actual1=driver.getCurrentUrl();
		  System.out.println(Actual1);
		  Assert.assertEquals(Actual1, url.Login_url());
		  System.out.println("L7:On login refresh it is redirecting to the login page 7th test case completed");
		  System.out.println("...........................................................................................................");
		  
	  }
	  
	  	  public void focusonloginsection() throws InterruptedException{
		  System.out.println("...........................................................................................................");
		  System.out.println("L8:Enter login url - It should focus on login section 8th test case starting......");
		  String logintext = driver.findElement(By.xpath(obj.focusloginpage())).getText();
		  System.out.println(logintext);
		  Assert.assertEquals(logintext, "Log in");
		  System.out.println("L8:Enter login url - It should focus on login section 8th test case completed");
		  System.out.println("...........................................................................................................");
		  
	  }
	  	  
	  	 public void verifydisableaccounttext(String email, String password) throws InterruptedException{
			  System.out.println("...........................................................................................................");
			  System.out.println("L9:Verify disable account text 9th test case starting......");
			  driver.findElement(By.xpath(obj.emaillocator())).sendKeys(email);
			  driver.findElement(By.xpath(obj.pwdlocator())).sendKeys(password);
			  driver.findElement(By.xpath(obj.loginbtnlocator())).click();
			  Thread.sleep(10000);
			  String disableaccountvalidation=driver.findElement(By.xpath(obj.disableaccountext())).getText();
			  Assert.assertEquals(disableaccountvalidation, LoginmessagesDisplay.Disableaccountvalidation());
			  
			  System.out.println("L9:Verify disable account text 9th test case completed");
			  System.out.println("...........................................................................................................");
			  
		  }  	
	  
	  
	  
}
