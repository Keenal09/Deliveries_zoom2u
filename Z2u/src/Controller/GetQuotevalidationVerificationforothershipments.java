package Controller;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;

public class GetQuotevalidationVerificationforothershipments extends LaunchBrowser_inCrossBrowser{

	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	WebElement element;
	public void GetQuotevalidationforShipments_exceptLargeitems() throws InterruptedException{
		
		driver.navigate().refresh();
		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));

		driver.findElement(By.xpath(objGetQuote.Getquotebtn())).sendKeys(Keys.ENTER);
		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='app']/div[1]/div/div/div[1]/div[2]")));

		//Alert alert = driver.switchTo().alert();
		String validationalertmsg = driver.findElement(By.xpath(".//*[@id='app']/div[1]/div/div/div[1]/div[2]")).getText();
		System.out.println("validation alert msg is" + validationalertmsg );
		Assert.assertEquals(validationalertmsg, "Please fill out all mandatory fields marked in red.");
		String headingalert = driver.findElement(By.xpath(".//*[@id='app']/div[1]/div/div/div[1]/div[1]")).getText();
		System.out.println("validation heading alert is" + headingalert );
		Assert.assertEquals(headingalert, "Oops!");
		//alert.accept();
		driver.findElement(By.xpath(".//*[@id='app']/div[1]/div/div/div[2]/button")).click();
		element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[1]/div/span")));

		String Pickupvalidation = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[1]/div/span")).getText();
		System.out.println("Pickup validation msg is" + Pickupvalidation);
		Assert.assertEquals(Pickupvalidation, "Please enter a pickup address.");
		String Dropoffvalidation = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[2]/div/span")).getText();
		System.out.println("Dropoff validation msg is" + Dropoffvalidation);
		Assert.assertEquals(Dropoffvalidation, "Please enter a dropoff address.");
		driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys("45 clarence st sydney nsw australia");
	    driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).sendKeys("328 swanston street melbourne vic australia");
	    driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
	    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")));

	    boolean Weightfield =driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).isEnabled();
	    System.out.println("Weight field is" + Weightfield);
	    driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).click();
	    element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")));

	    driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys(Keys.TAB);
	    driver.findElement(By.xpath(objGetQuote.Getquotebtn())).sendKeys(Keys.ENTER);
	    String weightfieldvalidation = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/span")).getText();
	    System.out.println("Weightfield validation msg is" + weightfieldvalidation);
	    Assert.assertEquals(weightfieldvalidation, "Please select weight.");
	}
}
