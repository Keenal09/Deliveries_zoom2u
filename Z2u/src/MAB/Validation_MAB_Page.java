package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;

public class Validation_MAB_Page extends MAB_Scenarios
{
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	WebElement element;
	
	public void validation_of_MAB()
	{
		System.out.println(".................................................................................................");
		System.out.println("MAB13:Validations for make a booking default page method started......");
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[2]/button")).click();
		
		String alerttext = driver.findElement(By.xpath(".//*[@id='app']/div[1]/div/div/div[1]")).getText();
		System.out.println(alerttext);
		String text = "Oops!" +"\n"+ "Please fill out all mandatory fields marked in red.";
		Assert.assertEquals(text,alerttext );
		driver.findElement(By.xpath(".//*[@id='app']/div[1]/div/div/div[2]/button")).click();
		
		String pick_contactname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[1]/span")).getText();
		Assert.assertEquals(pick_contactname, "Please enter a contact name.");
		String pick_contactnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[3]/span")).getText();
		Assert.assertEquals(pick_contactnumber, "Please enter contact number."); 
		String pick_streetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[5]/span")).getText();
		Assert.assertEquals(pick_streetname, "Please enter street name."); 
		
		String drop_contactname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[1]/span")).getText();
		Assert.assertEquals(drop_contactname, "Please enter a contact name."); 
		String drop_contactnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[3]/span")).getText();
		Assert.assertEquals(drop_contactnumber, "Please enter contact number."); 
		String drop_streetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[5]/span")).getText();
		Assert.assertEquals(drop_streetname, "Please enter street name."); 
	}
}
