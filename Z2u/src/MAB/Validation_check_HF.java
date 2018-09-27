package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;

import CommonLibraries.MakeaBookingLocator;

public class Validation_check_HF extends MAB_Scenarios
{
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	WebElement element;
	public void validation_forhf() 
	{
		System.out.println(".................................................................................................");
		System.out.println("MAB14:Validations for make a booking(Heavyfreight) default page method started......");
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[8]/button")).click();
		driver.findElement(By.xpath(".//*[@id='bookingForm']/div[2]/button")).click();
		String alerttext = driver.findElement(By.xpath(".//*[@id='app']/div[1]/div/div/div[1]")).getText();
		System.out.println(alerttext);
		String text = "Oops!" +"\n"+ "Please fill out all mandatory fields marked in red.";
		Assert.assertEquals(text,alerttext );
		driver.findElement(By.xpath(".//*[@id='app']/div[1]/div/div/div[2]/button")).click();
	
		String quantitycolor = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[1]/label")).getCssValue("color");
		System.out.println(quantitycolor);
		Assert.assertEquals(quantitycolor, "rgba(255, 71, 106, 1)");
		
		String lengthcolor = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[2]/label")).getCssValue("color");
		Assert.assertEquals(lengthcolor, "rgba(255, 71, 106, 1)");
	
		String widthcolor = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[3]/label")).getCssValue("color");
		Assert.assertEquals(widthcolor, "rgba(255, 71, 106, 1)"); 
	
		String Heightcolor = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[4]/label")).getCssValue("color");
		Assert.assertEquals(Heightcolor, "rgba(255, 71, 106, 1)");
		
		String ItemWeightcolor = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[5]/label")).getCssValue("color");
		Assert.assertEquals(ItemWeightcolor, "rgba(255, 71, 106, 1)");
	
		String TotalWeightcolor = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[1]/div[6]/label")).getCssValue("color");
		Assert.assertEquals(TotalWeightcolor, "rgba(255, 71, 106, 1)");
	
		
		String Frighttitle = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[5]/div[1]/span")).getText();
		Assert.assertEquals(Frighttitle, "The freight title is required*.");
	
		String Frightvalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[5]/div[5]/div[2]/span")).getText();
		Assert.assertEquals(Frightvalue, "The freight value is required.");
	}
}
