package MAB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.URL_Staging;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class Subshipment_text_largeitems extends MAB_Scenarios {
			
	URL_Staging objurl = new URL_Staging();
	WebElement element;
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	MABDefaultMessages objDefaultMessages = new MABDefaultMessages();
	   
	   public void subshipmenttextverificationforlargeitmes()
	   {
		   System.out.println(".................................................................................................");
		   System.out.println("MAB3:By default Subshipments text and Messages method get started....");
		   
		   
		   driver.findElement(By.xpath(objMAB.MAB_LargeItemsshipmentLocator())).click();
			  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objMAB.MAB_SubLargeItem_GeneralVanTextonShipmentLocator())));
			  
			  WebElement FirstSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralVanTextonShipmentLocator()));
		      String FirstSubShipmentHeader = FirstSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of First Sub Shipment Header ="+FirstSubShipmentHeader);
		      Assert.assertEquals(FirstSubShipmentHeader, objDefaultMessages.FirstSubshipmentHeadingText());
		     
		      WebElement SecondSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_FurnitureTextonShipmentLocator()));
		      String SecondSubShipmentHeader = SecondSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of Second Sub Shipment Header ="+SecondSubShipmentHeader);
		      Assert.assertEquals(SecondSubShipmentHeader, objDefaultMessages.SecondSubshipmentHeadingText());
		      
		      
		      WebElement ThirdSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_BuildingMaterialsTextonShipmentLocator()));
		      String ThirdSubShipmentHeader = ThirdSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of Third Sub Shipment Header ="+ThirdSubShipmentHeader);
		      Assert.assertEquals(ThirdSubShipmentHeader, objDefaultMessages.ThirdSubshipmentHeadingText());
		      WebElement FourthSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralTruckTextonShipmentLocator()));
		      String FourthSubShipmentHeader = FourthSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of Fourth Sub Shipment Header ="+FourthSubShipmentHeader);
		      Assert.assertEquals(FourthSubShipmentHeader, objDefaultMessages.FourthSubshipmentHeadingText());
		      WebElement FifthSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_PalletsTextonShipmentLocator()));
		      String FifthSubShipmentHeader = FifthSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of Fifth Sub Shipment Header ="+FifthSubShipmentHeader);
		      Assert.assertEquals(FifthSubShipmentHeader, objDefaultMessages.FifthSubshipmentHeadingText());
		      WebElement SixthSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_MachineryTextonShipmentLocator()));
		      String SixthSubShipmentHeader = SixthSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of Sixth sub Shipment Header ="+SixthSubShipmentHeader);
		      Assert.assertEquals(SixthSubShipmentHeader, objDefaultMessages.SixthSubshipmentHeadingText());
		      WebElement SeventhSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_VehiclesTextonShipmentLocator()));
		      String SeventhSubShipmentHeader = SeventhSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of Seventh sub Shipment Header ="+SeventhSubShipmentHeader);
		      Assert.assertEquals(SeventhSubShipmentHeader, objDefaultMessages.SeventhSubshipmentHeadingText());
		      WebElement EightSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_ContainerTextonShipmentLocator()));
		      String EightSubShipmentHeader = EightSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of Eight sub Shipment Header ="+EightSubShipmentHeader);
		      Assert.assertEquals(EightSubShipmentHeader, objDefaultMessages.EightSubshipmentHeadingText());
		      WebElement NinethSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_FullTruckLoadTextonShipmentLocator()));
		      String NinethSubShipmentHeader = NinethSubShipmentHeaderTextVerify.getText();
		      System.out.println("Name of Nineth sub Shipment Header ="+NinethSubShipmentHeader);
		      Assert.assertEquals(NinethSubShipmentHeader, objDefaultMessages.NinethSubshipmentHeadingText());
		      
		      
		      WebElement DefaultMsgonFirstSubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralVantextmsgonShipmentLocator()));
		      String DefaultMessageonFirstSubShipment = DefaultMsgonFirstSubShipment.getText();
		      System.out.println("Default Msg on 1st Sub Shipment is = "+ DefaultMessageonFirstSubShipment);
		      Assert.assertEquals(DefaultMessageonFirstSubShipment, objDefaultMessages.FirstSubshipmentMsgText());
		      WebElement DefaultMsgonsecondSubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_FurnituretextmsgonShipmentLocator()));
		      String defaultMessageSecondSubShipment = DefaultMsgonsecondSubShipment.getText();
		      System.out.println("Default Msg on 2nd Sub Shipment is = "+ defaultMessageSecondSubShipment);
		      Assert.assertEquals(defaultMessageSecondSubShipment, objDefaultMessages.SecondSubshipmentMsgText());
		      WebElement DefaultMsgonThirdSubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_BuildingMaterialstextmsgonShipmentLocator()));
		      String DefaultMessageonThirdSubShipment = DefaultMsgonThirdSubShipment.getText();
		      System.out.println("Default Msg on 3rd Sub Shipment is = "+ DefaultMessageonThirdSubShipment);
		      Assert.assertEquals(DefaultMessageonThirdSubShipment, objDefaultMessages.ThirdSubshipmentMsgText());
		      WebElement DefaultMsgonFourthsubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_GeneralTrucktextmsgonShipmentLocator()));
		      String DefaultMessageonFourthsubShipment = DefaultMsgonFourthsubShipment.getText();
		      System.out.println("Default Msg on 4th Sub Shipment is = "+ DefaultMessageonFourthsubShipment);
		      Assert.assertEquals(DefaultMessageonFourthsubShipment, objDefaultMessages.FourthSubshipmentMsgText());
		      WebElement DefaultMsgonFifthSubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_PalletstextmsgonShipmentLocator()));
		      String DefaultMessageonFifthSubShipment = DefaultMsgonFifthSubShipment.getText();
		      System.out.println("Default Msg on 5th Sub Shipment is = "+ DefaultMessageonFifthSubShipment);
		      Assert.assertEquals(DefaultMessageonFifthSubShipment, objDefaultMessages.FifthSubshipmentMsgText());
		      WebElement DefaultMsgonSixthSubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_MachinerytextmsgonShipmentLocator()));
		      String DefaultMessageonSixthSubShipment = DefaultMsgonSixthSubShipment.getText();
		      System.out.println("Default Msg on 6th Sub Shipment is = "+ DefaultMessageonSixthSubShipment);
		      Assert.assertEquals(DefaultMessageonSixthSubShipment, objDefaultMessages.SixthSubshipmentMsgText());
		      WebElement DefaultMsgonSeventhSubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_VehiclestextmsgonShipmentLocator()));
		      String DefaultMessageonSeventhSubShipment = DefaultMsgonSeventhSubShipment.getText();
		      System.out.println("Default Msg on 7th Sub Shipment is = "+ DefaultMessageonSeventhSubShipment);
		      Assert.assertEquals(DefaultMessageonSeventhSubShipment, objDefaultMessages.SeventhSubshipmentMsgText());
		      WebElement DefaultMsgonEightSubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_ContainertextmsgonShipmentLocator()));
		      String DefaultMessageonEightSubShipment = DefaultMsgonEightSubShipment.getText();
		      System.out.println("Default Msg on 8th Sub Shipment is = "+ DefaultMessageonEightSubShipment);
		      Assert.assertEquals(DefaultMessageonEightSubShipment, objDefaultMessages.EightSubshipmentMsgText());
		      WebElement DefaultMsgonNinethSubShipment = driver.findElement(By.xpath(objMAB.MAB_SubLargeItem_FullTruckLoadtextmsgonShipmentLocator()));
		      String DefaultMessageonNinethSubShipment = DefaultMsgonNinethSubShipment.getText();
		      System.out.println("Default Msg on 9th Sub Shipment is = "+ DefaultMessageonNinethSubShipment);
		      Assert.assertEquals(DefaultMessageonNinethSubShipment, objDefaultMessages.NinethSubshipmentMsgText());
		      System.out.println("MAB3:By default subshipment text messages and heading completed.........");
		      System.out.println(".....................................................................................................");
		  
	   
	   
	   
	   
	   }
	   
	   
	   

}
