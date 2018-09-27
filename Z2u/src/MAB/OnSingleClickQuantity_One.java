package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class OnSingleClickQuantity_One extends MAB_Scenarios {
	WebElement element;
	   MakeaBookingLocator objMAB = new MakeaBookingLocator();
	   //LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	   //MABDefaultMessages objDefaultMessages = new MABDefaultMessages();

	public void OnClick_valueone(){
		
		System.out.println(".................................................................................................");
		  System.out.println("MAB7:on single click shipment quantity will be 1 method started......");
  	  driver.findElement(By.xpath(objMAB.MAB_DocumentshipmentLocator())).click();
  	  driver.findElement(By.xpath(objMAB.MAB_LaptopshipmentLocator())).click();
  	  driver.findElement(By.xpath(objMAB.MAB_SmallBoxshipmentLocator())).click();
  	  driver.findElement(By.xpath(objMAB.MAB_FlowersshipmentLocator())).click();
  	  driver.findElement(By.xpath(objMAB.MAB_LargeBoxshipmentLocator())).click();
  	  
  	  String DocActualValue = driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).getAttribute("value");
  	  System.out.println("Document Actual value is =" + DocActualValue);
  	  String LaptopsActualValue = driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).getAttribute("value");
  	  System.out.println("Document Actual value is =" + LaptopsActualValue);
  	  String SmallBoxActualValue = driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).getAttribute("value");
  	  System.out.println("Document Actual value is =" + SmallBoxActualValue);
  	  String CakesandFlowersActualValue = driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).getAttribute("value");
  	  System.out.println("Document Actual value is =" + CakesandFlowersActualValue);
  	  String LargeBoxActualValue = driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).getAttribute("value");
  	  System.out.println("Document Actual value is =" + LargeBoxActualValue);
  	  Assert.assertEquals(DocActualValue, "1");
  	  Assert.assertEquals(LaptopsActualValue, "1");
  	  Assert.assertEquals(SmallBoxActualValue, "1");
  	  Assert.assertEquals(CakesandFlowersActualValue, "1");
  	  Assert.assertEquals(LargeBoxActualValue, "1");
  	  System.out.println("MAB7:On single click shipment quantity will be 1 method completed....");
	    System.out.println(".................................................................................................");

	}

}
