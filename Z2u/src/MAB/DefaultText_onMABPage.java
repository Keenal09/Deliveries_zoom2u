package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.URL_Staging;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class DefaultText_onMABPage extends MAB_Scenarios{
	
	URL_Staging objurl = new URL_Staging();
	 WebElement element;
   MakeaBookingLocator objMAB = new MakeaBookingLocator();
   LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
   MABDefaultMessages objDefaultMessages = new MABDefaultMessages();
	
	public void DefaultTextverification(){
		
		System.out.println(".................................................................................................");
	      System.out.println("MAB2:By default Text available method started.....");
	      WebElement Defaultheader = driver.findElement(By.xpath(objMAB.MABHeaderLocator_onMABPage()));
	      String DefaultHeader = Defaultheader.getText();
	      System.out.println("Default header is = "+ DefaultHeader);
	      Assert.assertEquals(DefaultHeader, objDefaultMessages.MABheadertext());
	      WebElement DefaultheadertextAboveShipments = driver.findElement(By.xpath(objMAB.MABSizeparcelTextLocator()));
	      String DefaulttextAboveShipmentss = DefaultheadertextAboveShipments.getText();
	      System.out.println("Default header above shipment is = "+ DefaulttextAboveShipmentss);
	      Assert.assertEquals(DefaulttextAboveShipmentss, objDefaultMessages.DefaulttextaboveShipments());
	      WebElement DefaultMessageJustAboveShipment = driver.findElement(By.xpath(objMAB.MABParceltextmessage_Aboveshipments()));
	      String DefaultMsgjustaboveshipment = DefaultMessageJustAboveShipment.getText();
	      System.out.println("Default Msg just above the shipment is = "+ DefaultMsgjustaboveshipment);
	      Assert.assertEquals(DefaultMsgjustaboveshipment, objDefaultMessages.DefaultmessagejustaboveShipments());
	      WebElement FirstShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_DocumenttextLocator_onShipments()));
	      String FirstShipmentHeader = FirstShipmentHeaderTextVerify.getText();
	      System.out.println("Name of First Shipment Header ="+FirstShipmentHeader);
	      Assert.assertEquals(FirstShipmentHeader, objDefaultMessages.FirstShipmentHeadingText());
	      WebElement SecondShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_LaptoptextLocator_onShipments()));
	      String SecondShipmentHeader = SecondShipmentHeaderTextVerify.getText();
	      System.out.println("Name of Second Shipment Header ="+SecondShipmentHeader);
	      Assert.assertEquals(SecondShipmentHeader, objDefaultMessages.SecondShipmentHeadingText());
	      WebElement ThirdShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SmallBoxtextLocator_onShipments()));
	      String ThirdShipmentHeader = ThirdShipmentHeaderTextVerify.getText();
	      System.out.println("Name of Third Shipment Header ="+ThirdShipmentHeader);
	      Assert.assertEquals(ThirdShipmentHeader, objDefaultMessages.ThirdShipmentHeadingText());
	      WebElement FourthShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_FlowerstextLocator_onShipments()));
	      String FourthShipmentHeader = FourthShipmentHeaderTextVerify.getText();
	      System.out.println("Name of Fourth Shipment Header ="+FourthShipmentHeader);
	      Assert.assertEquals(FourthShipmentHeader, objDefaultMessages.FourthShipmentHeadingText());
	      WebElement FifthShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_LargeBoxtextLocator_onShipments()));
	      String FifthShipmentHeader = FifthShipmentHeaderTextVerify.getText();
	      System.out.println("Name of Fifth Shipment Header ="+FifthShipmentHeader);
	      Assert.assertEquals(FifthShipmentHeader, objDefaultMessages.FifthShipmentHeadingText());
	      WebElement SixthShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_LargeItemtextLocator_onShipments()));
	      String SixthShipmentHeader = SixthShipmentHeaderTextVerify.getText();
	      System.out.println("Name of Sixth Shipment Header ="+SixthShipmentHeader);
	      Assert.assertEquals(SixthShipmentHeader, objDefaultMessages.SixthShipmentHeadingText());
	      WebElement DefaultMsgonFirstShipment = driver.findElement(By.xpath(objMAB.MAB_DocumentMsgtextLocator_onShipments()));
	      String DefaultMessageonFirstShipment = DefaultMsgonFirstShipment.getText();
	      System.out.println("Default Msg on 1st Shipment is = "+ DefaultMessageonFirstShipment);
	      Assert.assertEquals(DefaultMessageonFirstShipment, objDefaultMessages.FirstShipmentDefaultMsg());
	      WebElement DefaultMsgonsecondShipment = driver.findElement(By.xpath(objMAB.MAB_LaptopMsgtextLocator_onShipments()));
	      String defaultMessageSecondShipment = DefaultMsgonsecondShipment.getText();
	      System.out.println("Default Msg on 2nd Shipment is = "+ defaultMessageSecondShipment);
	      Assert.assertEquals(defaultMessageSecondShipment, objDefaultMessages.SecondShipmentDefaultMsg());
	      WebElement DefaultMsgonThirdShipment = driver.findElement(By.xpath(objMAB.MAB_SmallBoxMsgtextLocator_onShipments()));
	      String DefaultMessageonThirdShipment = DefaultMsgonThirdShipment.getText();
	      System.out.println("Default Msg on 3rd Shipment is = "+ DefaultMessageonThirdShipment);
	      Assert.assertEquals(DefaultMessageonThirdShipment, objDefaultMessages.ThirdShipmentDefaultMsg());
	      WebElement DefaultMsgonFourthShipment = driver.findElement(By.xpath(objMAB.MAB_FlowersMsgtextLocator_onShipments()));
	      String DefaultMessageonFourthShipment = DefaultMsgonFourthShipment.getText();
	      System.out.println("Default Msg on 4th Shipment is = "+ DefaultMessageonFourthShipment);
	      Assert.assertEquals(DefaultMessageonFourthShipment, objDefaultMessages.FourthShipmentDefaultMsg());
	      WebElement DefaultMsgonFifthShipment = driver.findElement(By.xpath(objMAB.MAB_LargeBoxMsgtextLocator_onShipments()));
	      String DefaultMessageonFifthShipment = DefaultMsgonFifthShipment.getText();
	      System.out.println("Default Msg on 5th Shipment is = "+ DefaultMessageonFifthShipment);
	      Assert.assertEquals(DefaultMessageonFifthShipment, objDefaultMessages.FifthShipmentDefaultMsg());
	      System.out.println("MAB2:By default Text available method completed...");
		  System.out.println(".................................................................................................");
	  }
	  
	}


