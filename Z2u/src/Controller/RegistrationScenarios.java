package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.reporters.EmailableReporter;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.ForgotPwdLocators;
import CommonLibraries.Login;
import CommonLibraries.MenuLocators;
import CommonLibraries.MyProfile;
import CommonLibraries.Registration;
import CommonLibraries.Registration_Fieldinput;
import CommonLibraries.Registration_Validation;
import CommonLibraries.URL_Staging;
import DeliveriesMessages.RegistrationMessages;
import RequiredClassesfor_EachModule.Emailgeneration;


public class RegistrationScenarios extends LaunchBrowser_inCrossBrowser{
	
	Registration obj1 = new Registration();
	Login obj2 = new Login();
	Registration_Fieldinput obj3 = new Registration_Fieldinput();
	MenuLocators menuobj = new MenuLocators();
	MyProfile Myprofileobj = new MyProfile();
	URL_Staging urlstaging = new URL_Staging();
    ForgotPwdLocators obj4 = new ForgotPwdLocators();
    Registration_Validation obj5 = new Registration_Validation();
    RegistrationMessages Registrationmsgobj=new RegistrationMessages();
    Emailgeneration fr = new Emailgeneration();
    
	public void RedirecttoRegisterpage() throws InterruptedException{
		
		System.out.println("...........................................................................................................");
		System.out.println("R1:From Login page on click on a btn it should redirect to register page test case is starting (1st Registration test case).....");
		driver.findElement(By.xpath(obj1.CreateaFreeAccountbtnLocator())).click();
		Thread.sleep(10000);
		String Actualresult=driver.getCurrentUrl();
		System.out.println(Actualresult);
		Assert.assertEquals(Actualresult, urlstaging.Register_url());
		System.out.println("R1:From Login page on click on a btn it should redirect to register page test case completed (1st Registration test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void RegisterwithoutCompanyName(String Fname,String Lname,int Phoneno,String Pwd,String confirmPwd) throws InterruptedException{
		WebElement element;
		String Email = null;
		
		System.out.println("...........................................................................................................");
		System.out.println("R2:Register without company name test case is starting (2nd Registration test case).....");
		/*String Fname, Lname, Email, Pwd, confirmPwd;
		int Phoneno;
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the valid First Name");
	      Fname = in.next();
	      System.out.println("You entered First name is = "+Fname);
	      System.out.println("Enter the valid last Name");
	      Lname = in.next();
	      System.out.println("You entered Last name is = "+Lname);
	      System.out.println("Enter the valid Phone number");
	      Phoneno = in.nextInt();
	      System.out.println("You entered phone number is = "+Phoneno);
	      System.out.println("Enter the Email Id which is not registered to zoom2u yet");
	      Email = in.next();
	      System.out.println("You entered Email is = "+Email);
	      System.out.println("Enter the Password which must be at least 6 characters");
	      Pwd = in.next();
	      System.out.println("You entered Password is = "+Pwd);
	      System.out.println("Enter the same Password to confirm");
	       confirmPwd = in.next();
	      System.out.println("You entered confirm Password is = "+ confirmPwd);
	      System.out.println("Thank you..Your details are recorded. Please wait....");
	      */
				    Email = fr.genText()+"@gmail.com";
				    System.out.println(Email);
		

		obj3.FieldsRequiredForRegistration(Fname, Lname,Phoneno,Email,Pwd,confirmPwd);
		Thread.sleep(10000);
		String ActualResult= driver.getCurrentUrl();
		System.out.println(ActualResult);
		Assert.assertEquals(ActualResult, urlstaging.Home_url());
		Thread.sleep(10000);
		driver.findElement(By.xpath(menuobj.MyProfileLocator())).click();
		//Thread.sleep(10000);
		//driver.navigate().refresh();
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(Myprofileobj.FNamefieldLocator())));
		String FNamefield=driver.findElement(By.xpath(Myprofileobj.FNamefieldLocator())).getAttribute("value");
		System.out.println(FNamefield);
		Assert.assertEquals(FNamefield, Fname );
		String LNamefield=driver.findElement(By.xpath(Myprofileobj.LNamefieldLocator())).getAttribute("value");
		System.out.println(LNamefield);
		Assert.assertEquals(LNamefield, Lname);
		String CompanyNamefield=driver.findElement(By.xpath(Myprofileobj.CompanyNamefieldLocator())).getAttribute("value");
		System.out.println(CompanyNamefield);
		Assert.assertEquals(CompanyNamefield, "");
		String Phonenumberfield=driver.findElement(By.xpath(Myprofileobj.PhonenumfieldLocator())).getAttribute("value");
		int phhonevalue = Integer.parseInt(Phonenumberfield);
		System.out.println(phhonevalue);
		Assert.assertEquals(phhonevalue, Phoneno);
		//element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(Myprofileobj.AccountEmailfieldLocator())));
		String AccountEmailfield=driver.findElement(By.xpath(Myprofileobj.AccountEmailfieldLocator())).getAttribute("value");
		System.out.println(AccountEmailfield);
		Assert.assertEquals(AccountEmailfield, Email);
		String InvoiceEmailfield=driver.findElement(By.xpath(Myprofileobj.InvoiceEmailfieldLocator())).getAttribute("value");
		System.out.println(InvoiceEmailfield);
		Assert.assertEquals(InvoiceEmailfield, Email);
		Thread.sleep(10000);
		driver.findElement(By.xpath(obj2.logoutlocator())).click();
		Thread.sleep(10000);
		  if(browser=="Firefox"){
			  Thread.sleep(10000);
			  driver.findElement(By.xpath(obj2.alreadyLoggedoutpopup())).click();
		  }
		  System.out.println("R2:Register without company name test case completed (2nd Registration test case)");
			System.out.println("...........................................................................................................");
		  
	}
	
	public void RegistrationFailedwithoutFields() throws InterruptedException{
		WebElement element;
		System.out.println("...........................................................................................................");
		System.out.println("R3: Not register with empty fields test case is starting (3rd Registration test case).....");
		//RedirecttoRegisterpage();
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(obj1.CreateaFreeAccountbtnLocator())));
		driver.findElement(By.xpath(obj1.CreateaFreeAccountbtnLocator())).click();
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(obj1.CreateAccountbtnLocator())));
		driver.findElement(By.xpath(obj1.CreateAccountbtnLocator())).click();
		WebElement Firstnamevalid=driver.findElement(By.xpath(obj1.FirstnamevalidLocator()));
		String Firstnamevalidation=Firstnamevalid.getText();
		Assert.assertEquals(Firstnamevalidation, Registrationmsgobj.FirstnameValidation() );
		WebElement Lnamevalid=driver.findElement(By.xpath(obj1.LnamevalidLocator()));
		String Lnamevalidation=Lnamevalid.getText();
		Assert.assertEquals(Lnamevalidation, Registrationmsgobj.LastnameValidation());
		WebElement PhoneNovalid=driver.findElement(By.xpath(obj1.PhonevalidLocator()));
		String PhoneNovalidation=PhoneNovalid.getText();
		Assert.assertEquals(PhoneNovalidation, Registrationmsgobj.PhonenumberValidation());		
		WebElement Emailvalid=driver.findElement(By.xpath(obj1.EmailvalidLocator()));
		String Emailvalidation=Emailvalid.getText();
		Assert.assertEquals(Emailvalidation, Registrationmsgobj.ValidEmailValidation());
		WebElement Pwdvalid=driver.findElement(By.xpath(obj1.PwdvalidLocator()));
		String Pwdvalidation=Pwdvalid.getText();
		Assert.assertEquals(Pwdvalidation, Registrationmsgobj.PasswordValidation());
	WebElement ConfirmPwdvalid=driver.findElement(By.xpath(obj1.ConfirmPwdvalidLocator()));
	String ConfirmPwdvalidation=ConfirmPwdvalid.getText();
	Assert.assertEquals(ConfirmPwdvalidation, Registrationmsgobj.ConfirmPasswordValidation());
	WebElement Termsvalid=driver.findElement(By.xpath(obj1.TermsValidLocator()));
	String Termsvalidation=Termsvalid.getText();
	Assert.assertEquals(Termsvalidation, Registrationmsgobj.TermsandConditionsMessage());
	System.out.println("R3:Not register with empty fields test case completed (3rd Registration test case)");
	System.out.println("...........................................................................................................");

}
	
	public void AlreadyRegisteredValidationcheck(String Name, String LName, int PhoneNo, String Email, String Password, String ConfirmPwd) throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("R4:Already registered message verify test case is starting (4th Registration test case).....");
		driver.navigate().refresh();
		Thread.sleep(10000);
		obj3.FieldsRequiredForRegistration(Name, LName, PhoneNo, Email, Password, ConfirmPwd);
	    Thread.sleep(10000);
	    WebElement AlreadyRegisteredValid=driver.findElement(By.xpath(obj1.RegisteredEmailValidLocator()));
	    String AlreadyRegisteredValidation=AlreadyRegisteredValid.getText();
	    System.out.println(AlreadyRegisteredValidation);
	    Assert.assertEquals(AlreadyRegisteredValidation, Registrationmsgobj.AlreadyRegisteredValidationMsg());
	    Thread.sleep(10000);
	    Boolean linkpresent= driver.findElement(By.partialLinkText(Registrationmsgobj.PartiallinktextinAlreadyRegisteredContentPart1())).isDisplayed();
	    System.out.println(linkpresent);
	    Thread.sleep(10000);
	    Boolean otherlinkpresent= driver.findElement(By.partialLinkText(Registrationmsgobj.PartiallinktextinAlreadyRegisteredContentPart2())).isDisplayed();
	    System.out.println(otherlinkpresent);
	    driver.findElement(By.partialLinkText(Registrationmsgobj.PartiallinktextinAlreadyRegisteredContentPart1())).click();
	    Thread.sleep(10000);
	    String RedirecttoLogin=driver.getCurrentUrl();
	    Assert.assertEquals(RedirecttoLogin, urlstaging.Login_url());
	    Thread.sleep(10000);
	    driver.findElement(By.xpath(obj1.CreateaFreeAccountbtnLocator())).click();
	    obj3.FieldsRequiredForRegistration(Name, LName, PhoneNo, Email, Password, ConfirmPwd);
	    Thread.sleep(10000);
	    driver.findElement(By.linkText(Registrationmsgobj.PartiallinktextinAlreadyRegisteredContentPart2())).click();
	    Thread.sleep(10000);
	    String RedirecttoForgotPassword=driver.getCurrentUrl();
	    Assert.assertEquals(RedirecttoForgotPassword, URL_Staging.ForgotPwd_url());
	    driver.findElement(By.xpath(obj4.ForgotPwd_CancelLocator())).click();
	    System.out.println("R4:Already registered validation message test case completed (4th Registration test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void PwdConfirmPwdMissmatchValid(String Name, String LName, int PhoneNo, String Email, String Password, String ConfirmPwd) throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("R5:Pwd/confirm pwd mismatch message verify test case is starting (5th Registration test case).....");
		Thread.sleep(5000);
		driver.findElement(By.xpath(obj1.CreateaFreeAccountbtnLocator())).click();
		obj3.FieldsRequiredForRegistration(Name, LName, PhoneNo, Email, Password, ConfirmPwd);
		Thread.sleep(10000);
		WebElement PwdConfirmPwdValid=driver.findElement(By.xpath(obj5.Pwd_Confirmpwvalidation()));
		String PwdConfirmPwdValidation=PwdConfirmPwdValid.getText();
		Assert.assertEquals(PwdConfirmPwdValidation,Registrationmsgobj.PwdandConfirmPwdMismatchMessage() );
		System.out.println("R5:Pwd/Confirm pwd mismatch msg verify test case completed (5th Registration test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void OnClickloginhere() throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("R6:on login here it should redirect to login page test case is starting (6th Registration test case).....");
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		driver.findElement(By.xpath(obj1.LoginherebtnLocator())).click();
		Thread.sleep(10000);
		String loginRedirectpage=driver.getCurrentUrl();
		Assert.assertEquals(loginRedirectpage, urlstaging.Login_url());
		System.out.println("R6:On login here it should redirect to login page test case completed (6th Registration test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void Placeholderverify(){
		System.out.println("...........................................................................................................");
		System.out.println("R7:Placeholder verify test case is starting (7th Registration test case).....");
		String Firstname=driver.findElement(By.xpath(obj1.NamefieldLocator())).getAttribute("placeholder");
		Assert.assertEquals(Firstname, Registrationmsgobj.FirstNamePlaceholder_Registration());
		String Lname=driver.findElement(By.xpath(obj1.LastNamefieldLocator())).getAttribute("placeholder");
		Assert.assertEquals(Lname, Registrationmsgobj.LastNamePlaceholder_Registration());
		String Companyname=driver.findElement(By.xpath(obj1.CompanyNamefieldLocator())).getAttribute("placeholder");
		Assert.assertEquals(Companyname, Registrationmsgobj.CompanyNamePlaceholder_Registration());
		String PhoneNumber=driver.findElement(By.xpath(obj1.PhoneNofieldLocator())).getAttribute("placeholder");
		Assert.assertEquals(PhoneNumber, Registrationmsgobj.PhoneNumberPlaceholder_Registration());
		String Email=driver.findElement(By.xpath(obj1.EmailfieldLocator())).getAttribute("placeholder");
		Assert.assertEquals(Email, Registrationmsgobj.EmailPlaceholder_Registration());
		String Pwd=driver.findElement(By.xpath(obj1.PwdfieldLocator())).getAttribute("placeholder");
		Assert.assertEquals(Pwd, Registrationmsgobj.PasswordPlaceholder_Registration());
		String ConfirmPwd=driver.findElement(By.xpath(obj1.ConfirmPwdfieldLocator())).getAttribute("placeholder");
		Assert.assertEquals(ConfirmPwd, Registrationmsgobj.ConfirmPasswordPlaceholder_Registration());
		System.out.println(Firstname);
		System.out.println(Lname);
		System.out.println(Companyname);
		System.out.println(PhoneNumber);
		System.out.println(Email);
		System.out.println(Pwd);
		System.out.println(ConfirmPwd);
		System.out.println("R7:Placeholder verify test case completed (7th Registration test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void TermsandConditionslink() throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("R8:Terms and conditions link should be work in test case is starting (8th Registration test case).....");
		driver.findElement(By.xpath(obj1.TermsandConditionsLocator())).click();
		
		ArrayList<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(browserTabs .get(1));
		Thread.sleep(10000);
		//check is it correct page opened or not (e.g. check page's title)
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		Assert.assertEquals(url1, urlstaging.TermsandConditionsurl());
		//...
		//then close tab and get back
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		System.out.println("R8:Terms and conditions link should be work in test case completed (8th Registration test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void VerifyProfilewithCompanynameRegistered(String Fname,String Lname,String CompanyName,int Phoneno,String Pwd,String confirmPwd) throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("R9: Register with company name is test case is starting (9th Registration test case).....");
		Thread.sleep(10000);
		//String Fname, Lname, Email, Pwd, confirmPwd,CompanyName;
		//int Phoneno;
		WebElement element;
		String Email = null;
	     /* Scanner in = new Scanner(System.in);
	      System.out.println("Enter the valid First Name");
	      Fname = in.next();
	      System.out.println("You entered First name is = "+Fname);
	      System.out.println("Enter the valid last Name");
	      Lname = in.next();
	      System.out.println("You entered Last name is = "+Lname);
	      System.out.println("Enter the valid Phone number");
	      Phoneno = in.nextInt();
	      System.out.println("You entered phone number is = "+Phoneno);
	      System.out.println("Enter the Company name");
	      CompanyName = in.next();
	      System.out.println("You entered company name is = "+CompanyName);
	      System.out.println("Enter the Email Id which is not registered to zoom2u yet");
	      Email = in.next();
	      System.out.println("You entered Email is = "+Email);
	      System.out.println("Enter the Password");
	      Pwd = in.next();
	      System.out.println("You entered Password is = "+Pwd);
	      System.out.println("Enter the same Password to confirm");
	       confirmPwd = in.next();
	      System.out.println("You entered confirm Password is = "+ confirmPwd);
	      System.out.println("Thank you..Your details are recorded. Please wait....");
	      */
		 Email = fr.gen1Text()+"@gmail.com";
		    System.out.println(Email);
		obj3.FieldsRequiredtoRegisterWithCompanyName(Fname, Lname, CompanyName, Phoneno, Email, Pwd, confirmPwd);
		System.out.println("Firstname is= "+Fname);
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(menuobj.MyProfileLocator())));
		driver.findElement(By.xpath(menuobj.MyProfileLocator())).click();
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(Myprofileobj.FNamefieldLocator())));
	    String FNamefield=driver.findElement(By.xpath(Myprofileobj.FNamefieldLocator())).getAttribute("value");
		System.out.println(FNamefield);
		Assert.assertEquals(FNamefield, Fname );
		String LNamefield=driver.findElement(By.xpath(Myprofileobj.LNamefieldLocator())).getAttribute("value");
		System.out.println(LNamefield);
		Assert.assertEquals(LNamefield, Lname);
		String CompanyNamefield=driver.findElement(By.xpath(Myprofileobj.CompanyNamefieldLocator())).getAttribute("value");
		System.out.println(CompanyNamefield);
		Assert.assertEquals(CompanyNamefield, CompanyName);
		String Phonenumberfield=driver.findElement(By.xpath(Myprofileobj.PhonenumfieldLocator())).getAttribute("value");
		int phhonevalue = Integer.parseInt(Phonenumberfield);
		System.out.println(phhonevalue);
		Assert.assertEquals(phhonevalue, Phoneno);
		String AccountEmailfield=driver.findElement(By.xpath(Myprofileobj.AccountEmailfieldLocator())).getAttribute("value");
		System.out.println(AccountEmailfield);
		Assert.assertEquals(AccountEmailfield, Email);
		String InvoiceEmailfield=driver.findElement(By.xpath(Myprofileobj.InvoiceEmailfieldLocator())).getAttribute("value");
		System.out.println(InvoiceEmailfield);
		Assert.assertEquals(InvoiceEmailfield, Email);
		element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(obj2.logoutlocator())));
		driver.findElement(By.xpath(obj2.logoutlocator())).click();
		Thread.sleep(10000);
		System.out.println("R9:Register with company name is test case completed (9th Registration test case)");
		System.out.println("...........................................................................................................");
	}
	
	}

