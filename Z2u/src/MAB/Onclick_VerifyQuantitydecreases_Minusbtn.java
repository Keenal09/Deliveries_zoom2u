package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class Onclick_VerifyQuantitydecreases_Minusbtn extends MAB_Scenarios {
	WebElement element;
	   MakeaBookingLocator objMAB = new MakeaBookingLocator();
	   LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	   MABDefaultMessages objDefaultMessages = new MABDefaultMessages();
	public void VerifyOnclick_Minusbtndecreases(){
		
		System.out.println(".................................................................................................");
		System.out.println("MAB6:Quantity decreases on click on minus btn method started......");
		
	    for(int DocumentQuan=6;DocumentQuan>0;DocumentQuan--){
			
			driver.findElement(By.xpath(objMAB.Document_MinusbtnLocator())).click();
			String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).getAttribute("value");
			int Value = Integer.parseInt(Textfieldvalue);
			System.out.println("Text field value for Documents is" + Value);
			Assert.assertEquals(Value, DocumentQuan-1);
		}
	    
	    for(int LaptopsQuan=6;LaptopsQuan>0;LaptopsQuan--){
			
			driver.findElement(By.xpath(objMAB.Laptop_MinusbtnLocator())).click();
			String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).getAttribute("value");
			int Value = Integer.parseInt(Textfieldvalue);
			System.out.println("Text field value for Laptops is" + Value);
			Assert.assertEquals(Value, LaptopsQuan-1);
		}
	    for(int SmallBoxQuan=6;SmallBoxQuan>0;SmallBoxQuan--){
		
		driver.findElement(By.xpath(objMAB.SmallBox_MinusbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Small Box is" + Value);
		Assert.assertEquals(Value, SmallBoxQuan-1);
	}
	    for(int FlowersQuan=6;FlowersQuan>0;FlowersQuan--){
		
		driver.findElement(By.xpath(objMAB.Flowers_MinusbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Flower is" + Value);
		Assert.assertEquals(Value, FlowersQuan-1);
	}
	    for(int LargeBoxQuan=6;LargeBoxQuan>0;LargeBoxQuan--){
		
		driver.findElement(By.xpath(objMAB.LargeBox_MinusbtnLocator())).sendKeys(Keys.ENTER);
		String Textfieldvalue=driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Large Box is" + Value);
		Assert.assertEquals(Value, LargeBoxQuan-1);
	}
	    
	    System.out.println("MAB6:Quantity decreases on click on Minus btn method completed....");
	    System.out.println(".................................................................................................");
	}

	}


