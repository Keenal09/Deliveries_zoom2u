package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class DefaultvalueofShipment_IsZero extends MAB_Scenarios {
	 WebElement element;
	   MakeaBookingLocator objMAB = new MakeaBookingLocator();
	   LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	   MABDefaultMessages objDefaultMessages = new MABDefaultMessages();

	
	public void VerifyDefaultvalueofShipment_zero(){
		
		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_DocumentshipmentLocator())));
			System.out.println(".................................................................................................");
			System.out.println("MAB4:Default quantity of shipments verification method started......");
			String DocumentdefaultValue = driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).getAttribute("Value");
			System.out.println("Default value of Document Shipment is=" + DocumentdefaultValue);
			Assert.assertEquals(DocumentdefaultValue, null);
			String LaptopsdefaultValue = driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).getAttribute("Value");
			System.out.println("Default value of Laptops Shipment is=" + LaptopsdefaultValue);
			Assert.assertEquals(LaptopsdefaultValue, null);
			String SmallBoxdefaultValue = driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).getAttribute("Value");
			System.out.println("Default value of Small Box Shipment is=" + SmallBoxdefaultValue);
			Assert.assertEquals(SmallBoxdefaultValue, null);
			String FlowersdefaultValue = driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).getAttribute("Value");
			System.out.println("Default value of Flowers Shipment is=" + FlowersdefaultValue);
			Assert.assertEquals(FlowersdefaultValue, null);
			String LargeBoxdefaultValue = driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).getAttribute("Value");
			System.out.println("Default value of Large Box Shipment is=" + LargeBoxdefaultValue);
			Assert.assertEquals(LargeBoxdefaultValue, null);
			System.out.println("MAB4:Default quantity of shipment verification method completed.....");
			System.out.println(".................................................................................................");
		
		
	}
	

}
