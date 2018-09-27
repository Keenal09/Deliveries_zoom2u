package Controller;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
//import com.gargoylesoftware.htmlunit.javascript.host.Set;
//import com.gargoylesoftware.htmlunit.javascript.host.URL;
//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
//import com.gargoylesoftware.htmlunit.javascript.host.html.Image;



import CommonLibraries.ForgotPwdLocators;
import CommonLibraries.URL_Staging;
import DeliveriesMessages.ForgotPassword;
//import javafx.scene.control.Alert;


public class ForgotPwd_Scenarios extends LaunchBrowser_inCrossBrowser{

	ForgotPwdLocators forgotpwdlocobj = new ForgotPwdLocators();
	URL_Staging urlobj = new URL_Staging();
	ForgotPassword forgotpwdmsgobj = new ForgotPassword();

	public void RedirecttoForgotPwdURL()  {
		System.out.println("...........................................................................................................");
		System.out.println("FP1:Redirect to forgot pwd page from login test case is starting (1st Forgot Pwd test case).....");
		driver.findElement(By.xpath(forgotpwdlocobj.ForgotyourPwdlink())).click();
	    String currentforgotpwdurl=driver.getCurrentUrl();
	    System.out.println(currentforgotpwdurl);
	    Assert.assertEquals(currentforgotpwdurl, URL_Staging.ForgotPwd_url());
	    System.out.println("FP1:Redirect to forgot pwd page from login test case completed (1st forgot Pwd test case)");
		System.out.println("..........................................................................................................."); 		
		}
	
	public void VerifyResetPwdMessagewith_RegisteredEmail(String ForgotPwdEmailId) throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("FP2:Reset Pwd message get test case is starting (2nd Forgot Pwd test case).....");
		/*
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the valid Email which is registered with zoom2u");
	    ForgotPwdEmailId = in.next();
	    */
	      System.out.println("You entered Email id is = "+ForgotPwdEmailId);
		driver.findElement(By.xpath(forgotpwdlocobj.Emailfield_ForgotPwdLocator())).sendKeys(ForgotPwdEmailId);
		String Resetbtntext = driver.findElement(By.xpath(forgotpwdlocobj.ResetBtnLocator_ForgotPwd())).getText();
		System.out.println("The text of the reset button is = " + Resetbtntext);
		Assert.assertEquals(Resetbtntext, "Reset password");
		driver.findElement(By.xpath(forgotpwdlocobj.ResetBtnLocator_ForgotPwd())).click();
		System.out.println("Please check your reset password email that has been sent to you on your email id");
		Thread.sleep(10000);
		String forgotpwdlocators =driver.findElement(By.xpath(forgotpwdlocobj.ResetMessage_Locator())).getText();
		
		System.out.println(forgotpwdlocators);
		Assert.assertEquals(forgotpwdlocators, forgotpwdmsgobj.SuccessMessagepart1() + " " + ForgotPwdEmailId + " " + forgotpwdmsgobj.SuccessMessagepart2());
		System.out.println("FP2:Reset Pwd Message get test case completed (2nd Forgot Pwd test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void Loginherebtn_ForgotPwd(){
		System.out.println("...........................................................................................................");
		System.out.println("FP3:Login here button should work and redirect to login page test case is starting (7th Forgot Pwd test case).....");
		driver.findElement(By.xpath(forgotpwdlocobj.Loginherelocator_ForgotPwd())).click();
		String currentURl_AfterLoginherebtn=driver.getCurrentUrl();
		System.out.println(currentURl_AfterLoginherebtn);
		Assert.assertEquals(currentURl_AfterLoginherebtn, urlobj.Login_url());
		System.out.println("FP3:Login here btn should work and redirect to login page test case completed (7th Forgot Pwd test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void InvalidEmail_VerifyMessage(String InvalidEmail_ForgotPwd) throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("FP4:Invalid email msg verify is test case is starting (3rd Forgot pwd test case).....");
		RedirecttoForgotPwdURL();
		driver.findElement(By.xpath(forgotpwdlocobj.Emailfield_ForgotPwdLocator())).sendKeys(InvalidEmail_ForgotPwd);
		driver.findElement(By.xpath(forgotpwdlocobj.ResetBtnLocator_ForgotPwd())).click();
		Thread.sleep(10000);
		WebElement errormsg_Invalidmsg=driver.findElement(By.xpath(forgotpwdlocobj.NotRegisteredEmailValidLocator_ForgotPwd()));
		String ErrorMessage_InvalidEmail=errormsg_Invalidmsg.getText();
		System.out.println(ErrorMessage_InvalidEmail);
		WebElement Errormsg_Invalidmsg1=driver.findElement(By.xpath(forgotpwdlocobj.NotRegisteredEmailValidotherLocator_ForgotPwd()));
		String ErrorMessage_InvalidEmail1=Errormsg_Invalidmsg1.getText();
		System.out.println(ErrorMessage_InvalidEmail1);
		String ErrorMessage_InvalidEmail2=ErrorMessage_InvalidEmail+ " " + ErrorMessage_InvalidEmail1;
		Assert.assertEquals(ErrorMessage_InvalidEmail2, forgotpwdmsgobj.ErrorMessageforNotRegisteredEmail());
		System.out.println("FP4:Invalid Email msg verify is test case completed (3rd Forgot pwd test case)");
		System.out.println("...........................................................................................................");
		}
	
	public void Cancelbtnworking_ForgotPwd(){
		System.out.println("...........................................................................................................");
		System.out.println("FP5:Cancel btn should be work is test case is starting (4th Forgot pwd test case).....");
		String Cancelbtntext = driver.findElement(By.xpath(forgotpwdlocobj.ForgotPwd_CancelLocator())).getText();
		System.out.println("The text of the Cancel button is = " + Cancelbtntext);
		Assert.assertEquals(Cancelbtntext, "Cancel");
		driver.findElement(By.xpath(forgotpwdlocobj.ForgotPwd_CancelLocator())).click();
		String Cancelbtnworkinglocator=driver.getCurrentUrl();
		Assert.assertEquals(Cancelbtnworkinglocator, urlobj.Login_url());
		System.out.println("FP5:Cancel btn should be work is test case completed (4th Forgot pwd test case)");
		System.out.println("...........................................................................................................");
	}
	
	/*public void ResetPwd_withResetLink(String ValidEmail, String Password) throws InterruptedException{
		
		RedirecttoForgotPwdURL();
		driver.findElement(By.xpath(forgotpwdlocobj.Emailfield_ForgotPwdLocator())).sendKeys(ValidEmail);
		driver.findElement(By.xpath(forgotpwdlocobj.ResetBtnLocator_ForgotPwd())).click();
		Thread.sleep(10000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(ValidEmail);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(Password);
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		((JavascriptExecutor) driver).executeScript("window.confirm = function(msg) { return true; }");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='gbqfq']")).sendKeys("password reset confirmation");
		driver.findElement(By.xpath(".//*[@id='gbqfb']")).click();
		driver.findElement(By.xpath(".//*[@id='gbqfb']")).click();
		driver.findElement(By.xpath(".//*[@id=':1lm']/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/p[3]/a/span[2]")).click();
		ArrayList<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(browserTabs .get(2));
		Thread.sleep(10000);
		//check is it correct page opened or not (e.g. check page's title)
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		Assert.assertEquals(url1, "https://courier.zoom2u.com/#/reset-password?userId=01c502d6-9926-4a73-ae69-52901f660c17&resetToken=I1lZX2ciJsMkAgVyWTSJ5IRgdUdMlN7S2hnz%2BbWnYrTk0GoJzX39n19kwyFTQmF2xrTzKK60q9k3d0d4r%2FL9uyvrEYeoBvDy1KSGRnnJE3mR2WzBX6cqYPuL6PFD%2B%2By75Y8RXVdTFT9a7KuOMJdQR9%2BJ9RaGoHQtzRaCUlZnV9bU17YKaGzWYccrIoLQK35WMLy1kw%3D%3D");
		//...
		//then close tab and get back
		driver.close();
		driver.switchTo().window(browserTabs.get(1));
		driver.close();
		driver.switchTo().window(browserTabs.get(0));

		
		
		
		
	
	}*/
	
	public void WithoutEmailVerifyMessage_ForgotPwd(String InvalidString){
		System.out.println("...........................................................................................................");
		System.out.println("FP6:Verify message with empty field is test case is starting (6th Forgot pwd test case).....");
		driver.findElement(By.xpath(forgotpwdlocobj.ForgotyourPwdlink())).click();
		driver.findElement(By.xpath(forgotpwdlocobj.ResetBtnLocator_ForgotPwd())).click();
	    WebElement ErrorMessage_VerifyMessage=driver.findElement(By.xpath(forgotpwdlocobj.EmptyEmailfieldvalidLocator_ForgotPwd()));
	    String ErrorMessage_VerifyMessageValidation=ErrorMessage_VerifyMessage.getText();
	    Assert.assertEquals(ErrorMessage_VerifyMessageValidation, forgotpwdmsgobj.ErrorMessageforInvalidorEmptyString());
	    driver.findElement(By.xpath(forgotpwdlocobj.Emailfield_ForgotPwdLocator())).sendKeys(InvalidString);
	    driver.findElement(By.xpath(forgotpwdlocobj.ResetBtnLocator_ForgotPwd())).click();
	    String InvalidStringErrorMessage = driver.findElement(By.xpath(forgotpwdlocobj.EmptyEmailfieldvalidLocator_ForgotPwd())).getText();
	    Assert.assertEquals(InvalidStringErrorMessage, forgotpwdmsgobj.ErrorMessageforInvalidorEmptyString());
	    System.out.println("FP6:Verify message with empty field is test case completed (6th Forgot pwd test case)");
		System.out.println("...........................................................................................................");
	  	}
	
	public void ForgotYourPasswordlinkTextVerify(){
		System.out.println("...........................................................................................................");
		System.out.println("FP7:Forgot Password link text verify is test case is starting (8th Forgot Pwd test case).....");
		driver.findElement(By.xpath(forgotpwdlocobj.ForgotPwd_CancelLocator())).click();
		String s = driver.findElement(By.xpath(forgotpwdlocobj.ForgotyourPwdlink())).getText();
		System.out.println("The link is" +s);
		Assert.assertEquals(s, forgotpwdmsgobj.ForgotPasswordLinkText());
		 Boolean linkpresent= driver.findElement(By.linkText(forgotpwdmsgobj.ForgotPasswordLinkText())).isDisplayed();
		    System.out.println("Link Available=" + linkpresent);
		    System.out.println("FP7:Forgot pwd link text verify is test case completed (8th Forgot Pwd test case)");
			System.out.println("...........................................................................................................");
	}
	
	public void AvailableTextOn_ForgotPwd() throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("FP8:Available text on forgot pwd page is test case is starting (9th Forgot pwd test case).....");
		driver.findElement(By.xpath(forgotpwdlocobj.ForgotyourPwdlink())).click();
		Thread.sleep(10000);
		String BydefaultMessage = driver.findElement(By.xpath(forgotpwdlocobj.DefaultMessageDisplayedLocator_ForgotPassword())).getText();
		System.out.println("By default text available on text field = " + BydefaultMessage);
		Assert.assertEquals(BydefaultMessage, forgotpwdmsgobj.DefaultMessageDisplayed());
		String Placeholdertextvalue = driver.findElement(By.xpath(forgotpwdlocobj.Emailfield_ForgotPwdLocator())).getAttribute("placeholder");
		System.out.println("Place holder value is = " + Placeholdertextvalue);
		Assert.assertEquals(Placeholdertextvalue, forgotpwdmsgobj.PlaceholderValue_ForgotPassword());
		System.out.println("FP8:Available text on forgot pwd page is test case completed (9th Forgot pwd test case)");
		System.out.println("...........................................................................................................");
	}
	
	public void VerifyZoom2uImageandredirection_ForgotPwd() throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("FP9:Verify zoom2u image and text is test case is starting (10th Forgot pwd test case).....");
		 WebElement ImageFile = driver.findElement(By.xpath(forgotpwdlocobj.Zoom2uimgAvailable_ForgotPassword()));
		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
		 if (!ImagePresent) {
			 System.out.println("Image not displayed.");
			 } 

			 else {
			 System.out.println("Image displayed.");
			 }
		driver.findElement(By.xpath(forgotpwdlocobj.Zoom2uimgAvailable_ForgotPassword())).click();
		Thread.sleep(10000);
		String CurrentredirectOnImage = driver.getCurrentUrl();
		Assert.assertEquals(CurrentredirectOnImage, urlobj.Zoom2uOfficialurl());
		driver.navigate().to(urlobj.DeliveriesUrl());
		System.out.println("FP9:Verify zoom2u image and text is test case completed (10th Forgot pwd test case)");
		System.out.println("...........................................................................................................");

	}
	
}
