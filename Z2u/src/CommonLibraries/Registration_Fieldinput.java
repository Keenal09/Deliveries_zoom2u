package CommonLibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Controller.LaunchBrowser_inCrossBrowser;

public class Registration_Fieldinput extends LaunchBrowser_inCrossBrowser{
	
	Registration obj1=new Registration();
	public void FieldsRequiredForRegistration(String Name,String LName,int PhoneNumber,String Email,String Password,String ConfirmPwd) throws InterruptedException{
		
		driver.findElement(By.xpath(obj1.NamefieldLocator())).sendKeys(Name);
		driver.findElement(By.xpath(obj1.LastNamefieldLocator())).sendKeys(LName);
		driver.findElement(By.xpath(obj1.PhoneNofieldLocator())).sendKeys(String.valueOf(PhoneNumber));
		driver.findElement(By.xpath(obj1.EmailfieldLocator())).sendKeys(Email);
		driver.findElement(By.xpath(obj1.PwdfieldLocator())).sendKeys(Password);
		driver.findElement(By.xpath(obj1.ConfirmPwdfieldLocator())).sendKeys(ConfirmPwd);
		Thread.sleep(10000);
		driver.findElement(By.className(obj1.AccepttermsLocator())).click();
		driver.findElement(By.xpath(obj1.CreateAccountbtnLocator())).click();
	}
	
	public void FieldsRequiredtoRegisterWithCompanyName(String Name,String LName,String CompanyName,int PhoneNumber,String Email,String Password,String ConfirmPwd) throws InterruptedException{
        driver.navigate().refresh();
       driver.findElement(By.xpath(obj1.NamefieldLocator())).sendKeys(Name);
		System.out.println(Name);
		driver.findElement(By.xpath(obj1.LastNamefieldLocator())).sendKeys(LName);
		driver.findElement(By.xpath(obj1.CompanyNamefieldLocator())).sendKeys(CompanyName);
		driver.findElement(By.xpath(obj1.PhoneNofieldLocator())).sendKeys(String.valueOf(PhoneNumber));
		driver.findElement(By.xpath(obj1.EmailfieldLocator())).sendKeys(Email);
		driver.findElement(By.xpath(obj1.PwdfieldLocator())).sendKeys(Password);
		driver.findElement(By.xpath(obj1.ConfirmPwdfieldLocator())).sendKeys(ConfirmPwd);
		Thread.sleep(10000);
		driver.findElement(By.className(obj1.AccepttermsLocator())).click();
		driver.findElement(By.xpath(obj1.NamefieldLocator())).sendKeys(Name);
	    driver.findElement(By.xpath(obj1.CreateAccountbtnLocator())).click();
	}
	

}
