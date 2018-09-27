package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class Onclick_VerifyQuantityIncreases_Plusbtn extends MAB_Scenarios {
	
	WebElement element;
	   MakeaBookingLocator objMAB = new MakeaBookingLocator();
	   LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	   MABDefaultMessages objDefaultMessages = new MABDefaultMessages();

	
	public void VerifyOnclick_PlusbtnIncreases(){
		
		System.out.println(".................................................................................................");
		System.out.println("MAB5:Quantity increases on click on add btn method started......");
		
	    for(int DocumentQuan=0;DocumentQuan<=5;DocumentQuan++){
			
			driver.findElement(By.xpath(objMAB.Document_PlusbtnLocator())).click();
			String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).getAttribute("value");
			int Value = Integer.parseInt(Textfieldvalue);
			System.out.println("Text field value for Documents is" + Value);
			Assert.assertEquals(Value, DocumentQuan+1);
		}
	    
	    for(int LaptopsQuan=0;LaptopsQuan<=5;LaptopsQuan++){
			
			driver.findElement(By.xpath(objMAB.Laptop_PlusbtnLocator())).click();
			String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).getAttribute("value");
			int Value = Integer.parseInt(Textfieldvalue);
			System.out.println("Text field value for Laptops is" + Value);
			Assert.assertEquals(Value, LaptopsQuan+1);
		}
	    for(int SmallBoxQuan=0;SmallBoxQuan<=5;SmallBoxQuan++){
		
		driver.findElement(By.xpath(objMAB.SmallBox_PlusbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Small Box is" + Value);
		Assert.assertEquals(Value, SmallBoxQuan+1);
	}
	    for(int FlowersQuan=0;FlowersQuan<=5;FlowersQuan++){
		
		driver.findElement(By.xpath(objMAB.Flowers_PlusbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Flower is" + Value);
		Assert.assertEquals(Value, FlowersQuan+1);
	}
	    for(int LargeBoxQuan=0;LargeBoxQuan<=5;LargeBoxQuan++){
	    	//element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.QuantityLargeBoxAddbtnLocator())));
		driver.findElement(By.xpath(objMAB.LargeBox_PlusbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Large Box is" + Value);
		Assert.assertEquals(Value, LargeBoxQuan+1);
	}
	    System.out.println("MAB5:Quantity increases on click on Add btn method completed....");
	    System.out.println(".................................................................................................");
		
		 
	}

}
