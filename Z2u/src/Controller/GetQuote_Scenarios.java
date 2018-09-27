package Controller;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.swing.event.MenuListener;

import java.awt.AWTException;
import java.awt.Point;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import CommonLibraries.AddressesForEachstate;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import CommonLibraries.MakeaBookingLocator;
import CommonLibraries.MenuLocators;
import CommonLibraries.QuantityValue;
import CommonLibraries.URL_Staging;
import DeliveriesMessages.AddItemVerificationforLargeItems;
import DeliveriesMessages.GetQuoteDefaultMessages;
import RequiredClassesfor_EachModule.hfimage;
import RequiredClassesfor_EachModule.AirInterstatePriceVerify;
import RequiredClassesfor_EachModule.Dateclass;
import RequiredClassesfor_EachModule.DirectDrivePriceVerification;
import RequiredClassesfor_EachModule.DirectDriveRedirect_Verification;
import RequiredClassesfor_EachModule.DistanceCalculation;
import RequiredClassesfor_EachModule.ETA;
import RequiredClassesfor_EachModule.ETADateandTime;
import RequiredClassesfor_EachModule.ETATimeverifyforSameState;
import RequiredClassesfor_EachModule.ExtraLargeService;
import RequiredClassesfor_EachModule.HeavyfreightService;
import RequiredClassesfor_EachModule.InterstateBooking_RedirectVerification;
import RequiredClassesfor_EachModule.InterstatePriceCalculation;
import RequiredClassesfor_EachModule.LabelsVerificationforBidRequest_GetQuote;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;
import RequiredClassesfor_EachModule.Placeholdersforbidrequest;
import RequiredClassesfor_EachModule.RoadInterstateBooking_RedirectVerification;
import RequiredClassesfor_EachModule.RoadInterstatePriceCalculation;
import RequiredClassesfor_EachModule.RoadInterstate_Price;
import RequiredClassesfor_EachModule.SameStateBookNow_Redirect;
import RequiredClassesfor_EachModule.SameStateCalculation;
import RequiredClassesfor_EachModule.SameStatePriceVerification;
import RequiredClassesfor_EachModule.SpeedCalculation;
import RequiredClassesfor_EachModule.TimeCalculation;
import RequiredClassesfor_EachModule.UIEnabledforHF;

public class GetQuote_Scenarios extends LoginCredentialsfor_Login{
    
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	URL_Staging objurl = new URL_Staging();
	GetQuoteDefaultMessages objDefaultMessages = new GetQuoteDefaultMessages();
	ETA objETA = new ETA();
	ETADateandTime objETATime = new ETADateandTime();
	SameStateCalculation ObjSameDay = new SameStateCalculation();
	SpeedCalculation objspeed = new SpeedCalculation();
	TimeCalculation pickupTime = new TimeCalculation();
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	MenuLocators objMenu = new MenuLocators();
	 ExtraLargeService objExtralarge = new ExtraLargeService();
	 AddressesForEachstate objAddress = new AddressesForEachstate();
	 ETAInterstateTime objETAInterstate = new ETAInterstateTime();
	 ETA_RoadInterstateTime objETARoad = new ETA_RoadInterstateTime();
	 HeavyFreightShipment_DetailVerify objHeavyFreight = new HeavyFreightShipment_DetailVerify();
	 HeavyfreightService objFreightservice = new HeavyfreightService();
	 InterstateBooking_RedirectVerification objInterstateRedirect = new InterstateBooking_RedirectVerification();
	 RoadInterstateBooking_RedirectVerification objRoadInterstateRedirect = new RoadInterstateBooking_RedirectVerification();
	 DirectDrivePriceVerification objDirectDriveETAandPriceVerify = new DirectDrivePriceVerification();
     DirectDriveRedirect_Verification objDirectDriveRedirect = new DirectDriveRedirect_Verification();
	 GetQuotevalidationVerificationforothershipments objGetquoteValidationmessages = new GetQuotevalidationVerificationforothershipments();
     Placeholdersforbidrequest objPlaceholderbid = new Placeholdersforbidrequest();
	 LabelsVerificationforBidRequest_GetQuote objLabelBid = new LabelsVerificationforBidRequest_GetQuote();
	 //AddItemVerificationforLargeItems objAddItem = new AddItemVerificationforLargeItems();
	 //hfimage objhfimage = new hfimage();
	 //UIEnabledforHF objUIEnabled = new UIEnabledforHF();
	 WebElement element;
	 
     
     public void VerifyAvailablemenuOptioninHamburgerandGetquotepage_GetQuote(String Emailid, String Pwd) throws InterruptedException, IOException, JSONException {
		 
    	 
    	 System.out.println(".................................................................................................");
		System.out.println("GQ1:Verify Get quote text method and get quote url in menu item get started.....");
		LoginwithvalidCredentials(Emailid, Pwd);
	    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())));
		WebElement GetQuoteText = driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu()));
		String VerifyGetQuotetext = GetQuoteText.getText();
		System.out.println(VerifyGetQuotetext);
		Assert.assertEquals(VerifyGetQuotetext, "Get quote");
		  driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
		  String GetQuoteurlverify = driver.getCurrentUrl();
		  System.out.println("The url for get quote is = "+ GetQuoteurlverify);
		  Assert.assertEquals(GetQuoteurlverify, objurl.GetQuoteurl());
		System.out.println("GQ1:Verify Get quote text and get quote page method completed...");
		System.out.println(".................................................................................................");
		
	}
      						
  public void VerifyShipmentsandtextBydefault(){
	  
	  System.out.println(".................................................................................................");
      System.out.println("GQ2:By default Text available method started.....");
      WebElement Defaultheader = driver.findElement(By.xpath(objGetQuote.GetquoteHeadertextLocator()));
      String DefaultHeader = Defaultheader.getText();
      System.out.println("Default header is = "+ DefaultHeader);
      Assert.assertEquals(DefaultHeader, objDefaultMessages.Quoteheadertext());
      WebElement DefaultheadertextAboveShipments = driver.findElement(By.xpath(objGetQuote.Defaulttext_AboveShipmentLocator()));
      String DefaulttextAboveShipmentss = DefaultheadertextAboveShipments.getText();
      System.out.println("Default header above shipment is = "+ DefaulttextAboveShipmentss);
      Assert.assertEquals(DefaulttextAboveShipmentss, objDefaultMessages.DefaulttextaboveShipments());
      WebElement DefaultMessageJustAboveShipment = driver.findElement(By.xpath(objGetQuote.DefaultMessage_justAboveShipmentLocator()));
      String DefaultMsgjustaboveshipment = DefaultMessageJustAboveShipment.getText();
      System.out.println("Default Msg just above the shipment is = "+ DefaultMsgjustaboveshipment);
      Assert.assertEquals(DefaultMsgjustaboveshipment, objDefaultMessages.DefaultmessagejustaboveShipments());
      WebElement FirstShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.FirstShipmentHeadingLocator()));
      String FirstShipmentHeader = FirstShipmentHeaderTextVerify.getText();
      System.out.println("Name of First Shipment Header ="+FirstShipmentHeader);
      Assert.assertEquals(FirstShipmentHeader, objDefaultMessages.FirstShipmentHeadingText());
      WebElement SecondShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.SecondShipmentHeadingLocator()));
      String SecondShipmentHeader = SecondShipmentHeaderTextVerify.getText();
      System.out.println("Name of Second Shipment Header ="+SecondShipmentHeader);
      Assert.assertEquals(SecondShipmentHeader, objDefaultMessages.SecondShipmentHeadingText());
      WebElement ThirdShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.ThirdShipmentHeadingLocator()));
      String ThirdShipmentHeader = ThirdShipmentHeaderTextVerify.getText();
      System.out.println("Name of Third Shipment Header ="+ThirdShipmentHeader);
      Assert.assertEquals(ThirdShipmentHeader, objDefaultMessages.ThirdShipmentHeadingText());
      WebElement FourthShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.FourthShipmentHeadingLocator()));
      String FourthShipmentHeader = FourthShipmentHeaderTextVerify.getText();
      System.out.println("Name of Fourth Shipment Header ="+FourthShipmentHeader);
      Assert.assertEquals(FourthShipmentHeader, objDefaultMessages.FourthShipmentHeadingText());
      WebElement FifthShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.FifthShipmentHeadingLocator()));
      String FifthShipmentHeader = FifthShipmentHeaderTextVerify.getText();
      System.out.println("Name of Fifth Shipment Header ="+FifthShipmentHeader);
      Assert.assertEquals(FifthShipmentHeader, objDefaultMessages.FifthShipmentHeadingText());
      WebElement SixthShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.SixthShipmentHeadingLocator()));
      String SixthShipmentHeader = SixthShipmentHeaderTextVerify.getText();
      System.out.println("Name of Sixth Shipment Header ="+SixthShipmentHeader);
      Assert.assertEquals(SixthShipmentHeader, objDefaultMessages.SixthShipmentHeadingText());
      WebElement DefaultMsgonFirstShipment = driver.findElement(By.xpath(objGetQuote.FirstShipmentdefaultMessageLocator()));
      String DefaultMessageonFirstShipment = DefaultMsgonFirstShipment.getText();
      System.out.println("Default Msg on 1st Shipment is = "+ DefaultMessageonFirstShipment);
      Assert.assertEquals(DefaultMessageonFirstShipment, objDefaultMessages.FirstShipmentDefaultMsg());
      WebElement DefaultMsgonsecondShipment = driver.findElement(By.xpath(objGetQuote.SecondShipmentdefaultMessageLocator()));
      String defaultMessageSecondShipment = DefaultMsgonsecondShipment.getText();
      System.out.println("Default Msg on 2nd Shipment is = "+ defaultMessageSecondShipment);
      Assert.assertEquals(defaultMessageSecondShipment, objDefaultMessages.SecondShipmentDefaultMsg());
      WebElement DefaultMsgonThirdShipment = driver.findElement(By.xpath(objGetQuote.ThirdShipmentdefaultMessageLocator()));
      String DefaultMessageonThirdShipment = DefaultMsgonThirdShipment.getText();
      System.out.println("Default Msg on 3rd Shipment is = "+ DefaultMessageonThirdShipment);
      Assert.assertEquals(DefaultMessageonThirdShipment, objDefaultMessages.ThirdShipmentDefaultMsg());
      WebElement DefaultMsgonFourthShipment = driver.findElement(By.xpath(objGetQuote.FourthShipmentdefaultMessageLocator()));
      String DefaultMessageonFourthShipment = DefaultMsgonFourthShipment.getText();
      System.out.println("Default Msg on 4th Shipment is = "+ DefaultMessageonFourthShipment);
      Assert.assertEquals(DefaultMessageonFourthShipment, objDefaultMessages.FourthShipmentDefaultMsg());
      WebElement DefaultMsgonFifthShipment = driver.findElement(By.xpath(objGetQuote.FifthShipmentdefaultMessageLocator()));
      String DefaultMessageonFifthShipment = DefaultMsgonFifthShipment.getText();
      System.out.println("Default Msg on 5th Shipment is = "+ DefaultMessageonFifthShipment);
      Assert.assertEquals(DefaultMessageonFifthShipment, objDefaultMessages.FifthShipmentDefaultMsg());
      System.out.println("GQ2:By default Text available method completed...");
	  System.out.println(".................................................................................................");
  }
  
  public void VerifySubshipmentstextforLargeItems() throws InterruptedException{
	  
	  System.out.println(".....................................................................................................");
	  System.out.println("GQ3:By default Subshipments text and Messages method get started....");
	  driver.findElement(By.xpath(objGetQuote.LargeItemsShipmentLocator())).click();
	  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FirstSubshipmentHeadingtextLocator())));
	  WebElement FirstSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.FirstSubshipmentHeadingtextLocator()));
      String FirstSubShipmentHeader = FirstSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of First Sub Shipment Header ="+FirstSubShipmentHeader);
      Assert.assertEquals(FirstSubShipmentHeader, objDefaultMessages.FirstSubshipmentHeadingText());
      WebElement SecondSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.SecondSubshipmentHeadingtextLocator()));
      String SecondSubShipmentHeader = SecondSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of Second Sub Shipment Header ="+SecondSubShipmentHeader);
      Assert.assertEquals(SecondSubShipmentHeader, objDefaultMessages.SecondSubshipmentHeadingText());
      WebElement ThirdSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.ThirdSubshipmentHeadingtextLocator()));
      String ThirdSubShipmentHeader = ThirdSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of Third Sub Shipment Header ="+ThirdSubShipmentHeader);
      Assert.assertEquals(ThirdSubShipmentHeader, objDefaultMessages.ThirdSubshipmentHeadingText());
      WebElement FourthSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.FourthSubshipmentHeadingtextLocator()));
      String FourthSubShipmentHeader = FourthSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of Fourth Sub Shipment Header ="+FourthSubShipmentHeader);
      Assert.assertEquals(FourthSubShipmentHeader, objDefaultMessages.FourthSubshipmentHeadingText());
      WebElement FifthSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.FifthSubshipmentHeadingtextLocator()));
      String FifthSubShipmentHeader = FifthSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of Fifth Sub Shipment Header ="+FifthSubShipmentHeader);
      Assert.assertEquals(FifthSubShipmentHeader, objDefaultMessages.FifthSubshipmentHeadingText());
      WebElement SixthSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.SixthSubshipmentHeadingtextLocator()));
      String SixthSubShipmentHeader = SixthSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of Sixth sub Shipment Header ="+SixthSubShipmentHeader);
      Assert.assertEquals(SixthSubShipmentHeader, objDefaultMessages.SixthSubshipmentHeadingText());
      WebElement SeventhSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.SeventhSubshipmentHeadingtextLocator()));
      String SeventhSubShipmentHeader = SeventhSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of Seventh sub Shipment Header ="+SeventhSubShipmentHeader);
      Assert.assertEquals(SeventhSubShipmentHeader, objDefaultMessages.SeventhSubshipmentHeadingText());
      WebElement EightSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.EightSubshipmentHeadingtextLocator()));
      String EightSubShipmentHeader = EightSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of Eight sub Shipment Header ="+EightSubShipmentHeader);
      Assert.assertEquals(EightSubShipmentHeader, objDefaultMessages.EightSubshipmentHeadingText());
      WebElement NinethSubShipmentHeaderTextVerify = driver.findElement(By.xpath(objGetQuote.NinethSubshipmentHeadingtextLocator()));
      String NinethSubShipmentHeader = NinethSubShipmentHeaderTextVerify.getText();
      System.out.println("Name of Nineth sub Shipment Header ="+NinethSubShipmentHeader);
      Assert.assertEquals(NinethSubShipmentHeader, objDefaultMessages.NinethSubshipmentHeadingText());
      WebElement DefaultMsgonFirstSubShipment = driver.findElement(By.xpath(objGetQuote.FirstSubshipmentMsgVerifyLocator()));
      String DefaultMessageonFirstSubShipment = DefaultMsgonFirstSubShipment.getText();
      System.out.println("Default Msg on 1st Sub Shipment is = "+ DefaultMessageonFirstSubShipment);
      Assert.assertEquals(DefaultMessageonFirstSubShipment, objDefaultMessages.FirstSubshipmentMsgText());
      WebElement DefaultMsgonsecondSubShipment = driver.findElement(By.xpath(objGetQuote.SecondSubshipmentMsgVerifyLocator()));
      String defaultMessageSecondSubShipment = DefaultMsgonsecondSubShipment.getText();
      System.out.println("Default Msg on 2nd Sub Shipment is = "+ defaultMessageSecondSubShipment);
      Assert.assertEquals(defaultMessageSecondSubShipment, objDefaultMessages.SecondSubshipmentMsgText());
      WebElement DefaultMsgonThirdSubShipment = driver.findElement(By.xpath(objGetQuote.ThirdSubshipmentMsgVerifyLocator()));
      String DefaultMessageonThirdSubShipment = DefaultMsgonThirdSubShipment.getText();
      System.out.println("Default Msg on 3rd Sub Shipment is = "+ DefaultMessageonThirdSubShipment);
      Assert.assertEquals(DefaultMessageonThirdSubShipment, objDefaultMessages.ThirdSubshipmentMsgText());
      WebElement DefaultMsgonFourthsubShipment = driver.findElement(By.xpath(objGetQuote.FourthSubshipmentMsgVerifyLocator()));
      String DefaultMessageonFourthsubShipment = DefaultMsgonFourthsubShipment.getText();
      System.out.println("Default Msg on 4th Sub Shipment is = "+ DefaultMessageonFourthsubShipment);
      Assert.assertEquals(DefaultMessageonFourthsubShipment, objDefaultMessages.FourthSubshipmentMsgText());
      WebElement DefaultMsgonFifthSubShipment = driver.findElement(By.xpath(objGetQuote.FifthSubshipmentMsgVerifyLocator()));
      String DefaultMessageonFifthSubShipment = DefaultMsgonFifthSubShipment.getText();
      System.out.println("Default Msg on 5th Sub Shipment is = "+ DefaultMessageonFifthSubShipment);
      Assert.assertEquals(DefaultMessageonFifthSubShipment, objDefaultMessages.FifthSubshipmentMsgText());
      WebElement DefaultMsgonSixthSubShipment = driver.findElement(By.xpath(objGetQuote.SixthSubshipmentMsgVerifyLocator()));
      String DefaultMessageonSixthSubShipment = DefaultMsgonSixthSubShipment.getText();
      System.out.println("Default Msg on 6th Sub Shipment is = "+ DefaultMessageonSixthSubShipment);
      Assert.assertEquals(DefaultMessageonSixthSubShipment, objDefaultMessages.SixthSubshipmentMsgText());
      WebElement DefaultMsgonSeventhSubShipment = driver.findElement(By.xpath(objGetQuote.SeventhSubshipmentMsgVerifyLocator()));
      String DefaultMessageonSeventhSubShipment = DefaultMsgonSeventhSubShipment.getText();
      System.out.println("Default Msg on 7th Sub Shipment is = "+ DefaultMessageonSeventhSubShipment);
      Assert.assertEquals(DefaultMessageonSeventhSubShipment, objDefaultMessages.SeventhSubshipmentMsgText());
      WebElement DefaultMsgonEightSubShipment = driver.findElement(By.xpath(objGetQuote.EightSubshipmentMsgVerifyLocator()));
      String DefaultMessageonEightSubShipment = DefaultMsgonEightSubShipment.getText();
      System.out.println("Default Msg on 8th Sub Shipment is = "+ DefaultMessageonEightSubShipment);
      Assert.assertEquals(DefaultMessageonEightSubShipment, objDefaultMessages.EightSubshipmentMsgText());
      WebElement DefaultMsgonNinethSubShipment = driver.findElement(By.xpath(objGetQuote.NinethSubshipmentMsgVerifyLocator()));
      String DefaultMessageonNinethSubShipment = DefaultMsgonNinethSubShipment.getText();
      System.out.println("Default Msg on 9th Sub Shipment is = "+ DefaultMessageonNinethSubShipment);
      Assert.assertEquals(DefaultMessageonNinethSubShipment, objDefaultMessages.NinethSubshipmentMsgText());
      System.out.println("GQ3:By default subshipment text messages and heading completed.........");
      System.out.println(".....................................................................................................");
  }
						
	public void DefaultquantityOfShipment_Zero(){
		driver.navigate().refresh();
	    element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())));
		System.out.println(".................................................................................................");
		System.out.println("GQ4:Default quantity of shipments verification method started......");
		String DocumentdefaultValue = driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).getAttribute("Value");
		System.out.println("Default value of Document Shipment is=" + DocumentdefaultValue);
		Assert.assertEquals(DocumentdefaultValue, null);
		String LaptopsdefaultValue = driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).getAttribute("Value");
		System.out.println("Default value of Laptops Shipment is=" + LaptopsdefaultValue);
		Assert.assertEquals(LaptopsdefaultValue, null);
		String SmallBoxdefaultValue = driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).getAttribute("Value");
		System.out.println("Default value of Small Box Shipment is=" + SmallBoxdefaultValue);
		Assert.assertEquals(SmallBoxdefaultValue, null);
		String FlowersdefaultValue = driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).getAttribute("Value");
		System.out.println("Default value of Flowers Shipment is=" + FlowersdefaultValue);
		Assert.assertEquals(FlowersdefaultValue, null);
		String LargeBoxdefaultValue = driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).getAttribute("Value");
		System.out.println("Default value of Large Box Shipment is=" + LargeBoxdefaultValue);
		Assert.assertEquals(LargeBoxdefaultValue, null);
		System.out.println("GQ4:Default quantity of shipment verification method completed.....");
		System.out.println(".................................................................................................");
	}
	
	public void OnclickonAddbtnQuantityincreases(){
		
		System.out.println(".................................................................................................");
		System.out.println("GQ5:Quantity increases on click on add btn method started......");
		
	    for(int DocumentQuan=0;DocumentQuan<=10;DocumentQuan++){
			
			driver.findElement(By.xpath(objGetQuote.QuantityDocumentAddbtnLocator())).click();
			String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).getAttribute("value");
			int Value = Integer.parseInt(Textfieldvalue);
			System.out.println("Text field value for Documents is" + Value);
			Assert.assertEquals(Value, DocumentQuan+1);
		}
	    
	    for(int LaptopsQuan=0;LaptopsQuan<=10;LaptopsQuan++){
			
			driver.findElement(By.xpath(objGetQuote.QuantityLaptopsAddbtnLocator())).click();
			String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).getAttribute("value");
			int Value = Integer.parseInt(Textfieldvalue);
			System.out.println("Text field value for Laptops is" + Value);
			Assert.assertEquals(Value, LaptopsQuan+1);
		}
	    for(int SmallBoxQuan=0;SmallBoxQuan<=10;SmallBoxQuan++){
		
		driver.findElement(By.xpath(objGetQuote.QuantitySmallBoxAddbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Small Box is" + Value);
		Assert.assertEquals(Value, SmallBoxQuan+1);
	}
	    for(int FlowersQuan=0;FlowersQuan<=10;FlowersQuan++){
		
		driver.findElement(By.xpath(objGetQuote.QuantityFlowersAddbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Flower is" + Value);
		Assert.assertEquals(Value, FlowersQuan+1);
	}
	    for(int LargeBoxQuan=0;LargeBoxQuan<=10;LargeBoxQuan++){
	    	element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.QuantityLargeBoxAddbtnLocator())));
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[7]/button[2]")).sendKeys(Keys.ENTER);
		String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Large Box is" + Value);
		Assert.assertEquals(Value, LargeBoxQuan+1);
	}
	    System.out.println("GQ5:Quantity increases on click on Add btn method completed....");
	    System.out.println(".................................................................................................");
	}
public void OnclickonMinusbtnQuantitydecreases(){
		
		System.out.println(".................................................................................................");
		System.out.println("GQ6:Quantity decreases on click on minus btn method started......");
		
	    for(int DocumentQuan=11;DocumentQuan>0;DocumentQuan--){
			
			driver.findElement(By.xpath(objGetQuote.QuantityDocumentMinusbtnLocator())).click();
			String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).getAttribute("value");
			int Value = Integer.parseInt(Textfieldvalue);
			System.out.println("Text field value for Documents is" + Value);
			Assert.assertEquals(Value, DocumentQuan-1);
		}
	    
	    for(int LaptopsQuan=11;LaptopsQuan>0;LaptopsQuan--){
			
			driver.findElement(By.xpath(objGetQuote.QuantityLaptopsMinusbtnLocator())).click();
			String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).getAttribute("value");
			int Value = Integer.parseInt(Textfieldvalue);
			System.out.println("Text field value for Laptops is" + Value);
			Assert.assertEquals(Value, LaptopsQuan-1);
		}
	    for(int SmallBoxQuan=11;SmallBoxQuan>0;SmallBoxQuan--){
		
		driver.findElement(By.xpath(objGetQuote.QuantitySmallBoxMinusbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Small Box is" + Value);
		Assert.assertEquals(Value, SmallBoxQuan-1);
	}
	    for(int FlowersQuan=11;FlowersQuan>0;FlowersQuan--){
		
		driver.findElement(By.xpath(objGetQuote.QuantityFlowersMinusbtnLocator())).click();
		String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Flower is" + Value);
		Assert.assertEquals(Value, FlowersQuan-1);
	}
	    for(int LargeBoxQuan=11;LargeBoxQuan>0;LargeBoxQuan--){
		
		driver.findElement(By.xpath(objGetQuote.QuantityLargeBoxMinusbtnLocator())).sendKeys(Keys.ENTER);
		String Textfieldvalue=driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(Textfieldvalue);
		System.out.println("Text field value for Large Box is" + Value);
		Assert.assertEquals(Value, LargeBoxQuan-1);
	}
	    
	    System.out.println("GQ6:Quantity decreases on click on Minus btn method completed....");
	    System.out.println(".................................................................................................");
	}

     /* public void OnclickofshipmentColourchanges() throws InterruptedException{
    	  
    	  Thread.sleep(5000);
    	  driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).click();
    	  driver.findElement(By.xpath(objGetQuote.LaptopsShipmentLocator())).click();
    	  driver.findElement(By.xpath(objGetQuote.SmallBoxShipmentLocator())).click();
    	  driver.findElement(By.xpath(objGetQuote.CakesandFlowersShipmentLocator())).click();
    	  driver.findElement(By.xpath(objGetQuote.LargeBoxShipmentLocator())).click();
    	  //driver.findElement(By.xpath(objGetQuote.LargeItemsShipmentLocator())).click();
    	  Thread.sleep(10000);
    	  String Doccolor = driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).getCssValue("color");
    	  String Laptopscolor = driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).getCssValue("color");
    	  String SmallBoxcolor = driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).getCssValue("color");
    	  String CakesandFlowerscolor = driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).getCssValue("color");
    	  String LargeBoxcolor = driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).getCssValue("color");
    	  //String LargeItemscolor = driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).getCssValue("color");
    	 
    	  String[] DochexValue = Doccolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] LaptophexValue = Laptopscolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] SmallBoxhexValue = SmallBoxcolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] CakesandFlowerhexValue = CakesandFlowerscolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] LargeBoxhexValue = LargeBoxcolor.replace("rgba(","").replace(")", "").split(",");  
    	  //String[] LargeItemshexValue = LargeItemscolor.replace("rgba(","").replace(")", "").split(",");  

    	  DochexValue[0] = DochexValue[0].trim();
    	  LaptophexValue[0] = LaptophexValue[0].trim();
    	  SmallBoxhexValue[0] = SmallBoxhexValue[0].trim();
    	  CakesandFlowerhexValue[0] = CakesandFlowerhexValue[0].trim();
    	  LargeBoxhexValue[0] = LargeBoxhexValue[0].trim();
    	  //LargeItemshexValue[0] = LargeItemshexValue[0].trim();

    	  int DochexValue1 = Integer.parseInt(DochexValue[0]);   
    	  int LaptophexValue1 = Integer.parseInt(LaptophexValue[0]);  
    	  int SmallBoxhexValue1 = Integer.parseInt(SmallBoxhexValue[0]);  
    	  int CakesandFlowershexValue1 = Integer.parseInt(CakesandFlowerhexValue[0]);  
    	  int LargeBoxhexValue1 = Integer.parseInt(LargeBoxhexValue[0]);  
    	  //int LargeItemshexValue1 = Integer.parseInt(LargeItemshexValue[0]);  

    	  DochexValue[1] = DochexValue[1].trim();
    	  LaptophexValue[1] = LaptophexValue[1].trim();
    	  SmallBoxhexValue[1] = SmallBoxhexValue[1].trim();
    	  CakesandFlowerhexValue[1] = CakesandFlowerhexValue[1].trim();
    	  LargeBoxhexValue[1] = LargeBoxhexValue[1].trim();
    	  //LargeItemshexValue[1] = LargeItemshexValue[1].trim();

    	  int DochexValue2 = Integer.parseInt(DochexValue[1]);  
    	  int LaptopshexValue2 = Integer.parseInt(LaptophexValue[1]);
    	  int SmallBoxhexValue2 = Integer.parseInt(SmallBoxhexValue[1]);
    	  int CakesandFLowershexValue2 = Integer.parseInt(CakesandFlowerhexValue[1]);
    	  int LargeBoxhexValue2 = Integer.parseInt(LargeBoxhexValue[1]);
    	  //int LargeItemshexValue2 = Integer.parseInt(LargeItemshexValue[1]);

    	  DochexValue[2] = DochexValue[2].trim();
    	  LaptophexValue[2] = LaptophexValue[2].trim();
    	  SmallBoxhexValue[2] = SmallBoxhexValue[2].trim();
    	  CakesandFlowerhexValue[2] = CakesandFlowerhexValue[2].trim();
    	  LargeBoxhexValue[2] = LargeBoxhexValue[2].trim();
    	  //LargeItemshexValue[2] = LargeItemshexValue[2].trim();

    	  int DochexValue3 = Integer.parseInt(DochexValue[2]); 
    	  int LaptophexValue3 = Integer.parseInt(LaptophexValue[2]);  
    	  int SmallBoxhexValue3 = Integer.parseInt(SmallBoxhexValue[2]);  
    	  int CakesandFlowerhexValue3 = Integer.parseInt(CakesandFlowerhexValue[2]);  
    	  int LargeBoxhexValue3 = Integer.parseInt(LargeBoxhexValue[2]);  
    	  //int LargeItemshexValue3 = Integer.parseInt(LargeItemshexValue[2]);  

    	  String DocactualColor = String.format("#%02x%02x%02x", DochexValue1, DochexValue2, DochexValue3);
    	  String LaptopsactualColor = String.format("#%02x%02x%02x", LaptophexValue1, LaptopshexValue2, LaptophexValue3);
    	  String SmallBoxactualColor = String.format("#%02x%02x%02x", SmallBoxhexValue1, SmallBoxhexValue2, SmallBoxhexValue3);
    	  String CakesandFlowersactualColor = String.format("#%02x%02x%02x", CakesandFlowershexValue1, CakesandFLowershexValue2, CakesandFlowerhexValue3);
    	  String LargeBoxactualColor = String.format("#%02x%02x%02x", LargeBoxhexValue1, LargeBoxhexValue2, LargeBoxhexValue3);
    	  //String LargeItemsactualColor = String.format("#%02x%02x%02x", LargeItemshexValue1, LargeItemshexValue2, LargeItemshexValue3);
    	  
    	  System.out.println("Actual Colour code of Document with selected quantity is = " + DocactualColor);
    	  Assert.assertTrue(DocactualColor.equals("#45515b"));
    	  System.out.println("Actual Colour code Laptop with selected quantity is = " + LaptopsactualColor);
    	  Assert.assertTrue(LaptopsactualColor.equals("#45515b"));
    	  System.out.println("Actual Colour code Small Box with selected quantity is = " + SmallBoxactualColor);
    	  Assert.assertTrue(SmallBoxactualColor.equals("#45515b"));
    	  System.out.println("Actual Colour code Cakes and Flowers with selected quantity is = " + CakesandFlowersactualColor);
    	  Assert.assertTrue(CakesandFlowersactualColor.equals("#45515b"));
    	  System.out.println("Actual Colour code Large Box with selected quantity is = " + LargeBoxactualColor);
    	  Assert.assertTrue(LargeBoxactualColor.equals("#45515b"));
    	  //System.out.println("Actual Colour code Large Items with selected quantity is = " + LargeItemsactualColor);
    	  //Assert.assertTrue(LargeItemsactualColor.equals("#45515b"));
      } */
      
     /* public void Bydefaultcolorofshipment() throws InterruptedException{
    	  
          driver.navigate().refresh(); 	 
    	  Thread.sleep(10000);
    	  String Doccolor = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[3]")).getCssValue("background-color");
    	  System.out.println("Document color = " +Doccolor);
    	  String Laptopscolor = driver.findElement(By.xpath(objGetQuote.LaptopsShipmentLocator())).getCssValue("background-color");
    	  String SmallBoxcolor = driver.findElement(By.xpath(objGetQuote.SmallBoxShipmentLocator())).getCssValue("background-color");
    	  String CakesandFlowerscolor = driver.findElement(By.xpath(objGetQuote.CakesandFlowersShipmentLocator())).getCssValue("background-color");
    	  String LargeBoxcolor = driver.findElement(By.xpath(objGetQuote.LargeBoxShipmentLocator())).getCssValue("background-color");
    	  String LargeItemscolor = driver.findElement(By.xpath(objGetQuote.LargeItemsShipmentLocator())).getCssValue("background-color");
    	 
    	  String[] DochexValue = Doccolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] LaptophexValue = Laptopscolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] SmallBoxhexValue = SmallBoxcolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] CakesandFlowerhexValue = CakesandFlowerscolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] LargeBoxhexValue = LargeBoxcolor.replace("rgba(","").replace(")", "").split(",");  
    	  String[] LargeItemshexValue = LargeItemscolor.replace("rgba(","").replace(")", "").split(",");  

    	  DochexValue[0] = DochexValue[0].trim();
    	  LaptophexValue[0] = LaptophexValue[0].trim();
    	  SmallBoxhexValue[0] = SmallBoxhexValue[0].trim();
    	  CakesandFlowerhexValue[0] = CakesandFlowerhexValue[0].trim();
    	  LargeBoxhexValue[0] = LargeBoxhexValue[0].trim();
    	  LargeItemshexValue[0] = LargeItemshexValue[0].trim();

    	  int DochexValue1 = Integer.parseInt(DochexValue[0]);   
    	  int LaptophexValue1 = Integer.parseInt(LaptophexValue[0]);  
    	  int SmallBoxhexValue1 = Integer.parseInt(SmallBoxhexValue[0]);  
    	  int CakesandFlowershexValue1 = Integer.parseInt(CakesandFlowerhexValue[0]);  
    	  int LargeBoxhexValue1 = Integer.parseInt(LargeBoxhexValue[0]);  
    	  int LargeItemshexValue1 = Integer.parseInt(LargeItemshexValue[0]);  

    	  DochexValue[1] = DochexValue[1].trim();
    	  LaptophexValue[1] = LaptophexValue[1].trim();
    	  SmallBoxhexValue[1] = SmallBoxhexValue[1].trim();
    	  CakesandFlowerhexValue[1] = CakesandFlowerhexValue[1].trim();
    	  LargeBoxhexValue[1] = LargeBoxhexValue[1].trim();
    	  LargeItemshexValue[1] = LargeItemshexValue[1].trim();

    	  int DochexValue2 = Integer.parseInt(DochexValue[1]);  
    	  int LaptopshexValue2 = Integer.parseInt(LaptophexValue[1]);
    	  int SmallBoxhexValue2 = Integer.parseInt(SmallBoxhexValue[1]);
    	  int CakesandFLowershexValue2 = Integer.parseInt(CakesandFlowerhexValue[1]);
    	  int LargeBoxhexValue2 = Integer.parseInt(LargeBoxhexValue[1]);
    	  int LargeItemshexValue2 = Integer.parseInt(LargeItemshexValue[1]);

    	  DochexValue[2] = DochexValue[2].trim();
    	  LaptophexValue[2] = LaptophexValue[2].trim();
    	  SmallBoxhexValue[2] = SmallBoxhexValue[2].trim();
    	  CakesandFlowerhexValue[2] = CakesandFlowerhexValue[2].trim();
    	  LargeBoxhexValue[2] = LargeBoxhexValue[2].trim();
    	  LargeItemshexValue[2] = LargeItemshexValue[2].trim();

    	  int DochexValue3 = Integer.parseInt(DochexValue[2]); 
    	  int LaptophexValue3 = Integer.parseInt(LaptophexValue[2]);  
    	  int SmallBoxhexValue3 = Integer.parseInt(SmallBoxhexValue[2]);  
    	  int CakesandFlowerhexValue3 = Integer.parseInt(CakesandFlowerhexValue[2]);  
    	  int LargeBoxhexValue3 = Integer.parseInt(LargeBoxhexValue[2]);  
    	  int LargeItemshexValue3 = Integer.parseInt(LargeItemshexValue[2]);  

    	  String DocactualColor = String.format("#%02x%02x%02x", DochexValue1, DochexValue2, DochexValue3);
    	  System.out.println("Actual Color = " + DocactualColor);
    	  String LaptopsactualColor = String.format("#%02x%02x%02x", LaptophexValue1, LaptopshexValue2, LaptophexValue3);
    	  System.out.println("Actual Color = " + LaptopsactualColor);
    	  String SmallBoxactualColor = String.format("#%02x%02x%02x", SmallBoxhexValue1, SmallBoxhexValue2, SmallBoxhexValue3);
    	  System.out.println("Actual Color = " + SmallBoxactualColor);
    	  String CakesandFlowersactualColor = String.format("#%02x%02x%02x", CakesandFlowershexValue1, CakesandFLowershexValue2, CakesandFlowerhexValue3);
    	  System.out.println("Actual Color = " + CakesandFlowersactualColor);
    	  String LargeBoxactualColor = String.format("#%02x%02x%02x", LargeBoxhexValue1, LargeBoxhexValue2, LargeBoxhexValue3);
    	  System.out.println("Actual Color = " + LargeBoxactualColor);
    	  String LargeItemsactualColor = String.format("#%02x%02x%02x", LargeItemshexValue1, LargeItemshexValue2, LargeItemshexValue3);
    	  System.out.println("Actual Color = " + LargeItemsactualColor);
    	  System.out.println("Actual Colour code of Document with selected quantity is = " + DocactualColor);
    	  Assert.assertTrue(DocactualColor.equals("#FFFFFF"));
    	  System.out.println("Actual Colour code Laptop with selected quantity is = " + LaptopsactualColor);
    	  Assert.assertTrue(LaptopsactualColor.equals("#FFFFFF"));
    	  System.out.println("Actual Colour code Small Box with selected quantity is = " + SmallBoxactualColor);
    	  Assert.assertTrue(SmallBoxactualColor.equals("#FFFFFF"));
    	  System.out.println("Actual Colour code Cakes and Flowers with selected quantity is = " + CakesandFlowersactualColor);
    	  Assert.assertTrue(CakesandFlowersactualColor.equals("#FFFFFF"));
    	  System.out.println("Actual Colour code Large Box with selected quantity is = " + LargeBoxactualColor);
    	  Assert.assertTrue(LargeBoxactualColor.equals("#FFFFFF"));
    	 System.out.println("Actual Colour code Large Items with selected quantity is = " + LargeItemsactualColor);
    	 Assert.assertTrue(LargeItemsactualColor.equals("#FFFFFF"));
    	  
      } */

      public void OnsingleClickShipment_QuantitybeOne(){
    	  System.out.println(".................................................................................................");
  		  System.out.println("GQ7:on single click shipment quantity will be 1 method started......");
    	  driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).click();
    	  driver.findElement(By.xpath(objGetQuote.LaptopsShipmentLocator())).click();
    	  driver.findElement(By.xpath(objGetQuote.SmallBoxShipmentLocator())).click();
    	  driver.findElement(By.xpath(objGetQuote.CakesandFlowersShipmentLocator())).click();
    	  driver.findElement(By.xpath(objGetQuote.LargeBoxShipmentLocator())).click();
    	  
    	  String DocActualValue = driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).getAttribute("value");
    	  System.out.println("Document Actual value is =" + DocActualValue);
    	  String LaptopsActualValue = driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).getAttribute("value");
    	  System.out.println("Document Actual value is =" + LaptopsActualValue);
    	  String SmallBoxActualValue = driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).getAttribute("value");
    	  System.out.println("Document Actual value is =" + SmallBoxActualValue);
    	  String CakesandFlowersActualValue = driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).getAttribute("value");
    	  System.out.println("Document Actual value is =" + CakesandFlowersActualValue);
    	  String LargeBoxActualValue = driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).getAttribute("value");
    	  System.out.println("Document Actual value is =" + LargeBoxActualValue);
    	  Assert.assertEquals(DocActualValue, "1");
    	  Assert.assertEquals(LaptopsActualValue, "1");
    	  Assert.assertEquals(SmallBoxActualValue, "1");
    	  Assert.assertEquals(CakesandFlowersActualValue, "1");
    	  Assert.assertEquals(LargeBoxActualValue, "1");
    	  System.out.println("GQ7:On single click shipment quantity will be 1 method completed....");
  	    System.out.println(".................................................................................................");
      }
      
      public void Verifytextlabelsandplaceholders_PickupandDropoff(){
    	  System.out.println(".................................................................................................");
  		System.out.println("GQ8:Labels and Placeholder verification  method started......");
    	  String Labeltext = driver.findElement(By.xpath(objGetQuote.LabelPickupanddropoffAddresses())).getText();
    	  System.out.println("The label text is" + Labeltext);
    	  Assert.assertEquals(Labeltext, objDefaultMessages.LabelPickupanddropoffAddresses());
    	  String pickupPlaceholdertext = driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of pickup = " + pickupPlaceholdertext);
    	  String dropoffPlaceholdertext = driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of dropoff = " + dropoffPlaceholdertext);
    	  Assert.assertEquals(pickupPlaceholdertext, objDefaultMessages.Pickupaddressplaceholder());
    	  Assert.assertEquals(dropoffPlaceholdertext, objDefaultMessages.Dropoffaddressplaceholder());
    	  System.out.println("GQ8:Labels and Placeholder verification method completed....");
  	    System.out.println(".................................................................................................");
      }
      public void AbletogetquoteWithSameState(String Shipment, String PickupTime) throws InterruptedException{
    	  System.out.println(".................................................................................................");
  		System.out.println("GQ9:Delivery options are showing for same state method for the shipment" + " " + Shipment + " " + "with" + " " + PickupTime + " " +"started......");
    	  driver.navigate().refresh();
    	 
    	  if(Shipment.equals("Documents")){
    	  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.DocumentShipmentLocator())));
    	  driver.findElement(By.xpath(objGetQuote.DocumentShipmentLocator())).click();
    	  }
    	  if(Shipment.equals("Satchel, laptops")){
    	      element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.LaptopsShipmentLocator())));
        	  driver.findElement(By.xpath(objGetQuote.LaptopsShipmentLocator())).click();
        	  }
    	  if(Shipment.equals("Small box")){
    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.SmallBoxShipmentLocator())));
        	  driver.findElement(By.xpath(objGetQuote.SmallBoxShipmentLocator())).click();
        	  }
    	  if(Shipment.equals("Cakes, flowers, delicates")){
    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.CakesandFlowersShipmentLocator())));
        	  driver.findElement(By.xpath(objGetQuote.CakesandFlowersShipmentLocator())).click();
        	  }
    	  if(Shipment.equals("Large Box")){
    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.LargeBoxShipmentLocator())));
        	  driver.findElement(By.xpath(objGetQuote.LargeBoxShipmentLocator())).click();
        	  }
    	  driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys("45 clarence st sydney nsw australia");
    	  driver.findElement(By.xpath(objGetQuote.DropoffAddresstextfieldLocator())).sendKeys("23 wentworth st greenacre nsw australia");
    	  
    	  //WebDriverWait wait = new WebDriverWait(driver, 10);
    	  /*wait.until(ExpectedConditions.visibilityOfElementLocated(
    	                   By.xpath(objGetQuote.Getquotebtn())));*/
    	  //Driver.FindElement(By.Id("second")).FindElement(By.XPath(".//button")).Click();
    	  //WebElement Mouseclick = driver.findElement(By.xpath(objGetQuote.Getquotebtn()));
    	 // Mouseclick.sendKeys(Keys.TAB);
    	  //Mouseclick.sendKeys(Keys.ENTER);
    	  //WebElement footer= driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div"));
    	  //footer.findElement(By.className("footer-content")).click();
    	   //driver.findElement(By.className("footer-content")).click();
    	  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).clear();
    	  
    	 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteDateLocator())));
    	 String Date = objETA.ETACurrentDate(); 
    	 driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Date);
    	 
    	  if(PickupTime.equals("12am_8am")){
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
    		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("1:00am");
    	  }
    	  else if(PickupTime.equals("8am_12pm")){
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
    		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("10:00am");
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
    	  }
    	  else if(PickupTime.equals("12pm_2pm")){
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
    		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("1:00pm");
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
    	  }
    	  else if(PickupTime.equals("2pm_5pm")){
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
    		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("3:00pm");
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
    	  }
    	  else if(PickupTime.equals("5pm_12am")){
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).clear();
    		 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())));
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys("8:00pm");
    		  driver.findElement(By.xpath(objGetQuote.PickupGetQuoteTimeLocator())).sendKeys(Keys.TAB);
    	  }
    	  
    	element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(objGetQuote.FirstDeliveryoptionLocator())));
    	  if(Shipment.equals("Documents") || Shipment.equals("Satchel, laptops") || Shipment.equals("Small box") || Shipment.equals("Large Box")){
    	  Boolean Firstdeliveryoption = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())).isDisplayed();
    	  System.out.println(Firstdeliveryoption);
    	  Boolean Seconddeliveryoption = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionLocator())).isDisplayed();
    	  System.out.println(Seconddeliveryoption);
    	  Boolean Thirddeliveryoption = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionLocator())).isDisplayed();
    	  System.out.println(Thirddeliveryoption);
    	  Boolean Fourthdeliveryoption = driver.findElement(By.xpath(objGetQuote.FourthDeliveryoptionLocator())).isDisplayed();
    	  System.out.println(Fourthdeliveryoption);
    	  }
    	  else if(Shipment.equals("Cakes, flowers, delicates")){
    		  if(PickupTime.equals("12am_8am") || PickupTime.equals("8am_12pm") || PickupTime.equals("5pm_12am")){
    			  Boolean Firstdeliveryoption = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())).isDisplayed();
    	    	  System.out.println(Firstdeliveryoption);
    	    	  Boolean Seconddeliveryoption = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionLocator())).isDisplayed();
    	    	  System.out.println(Seconddeliveryoption);
    			  }
    		  if(PickupTime.equals("12pm_2pm") || PickupTime.equals("2pm_5pm")){
    			  Boolean Firstdeliveryoption = driver.findElement(By.xpath(objGetQuote.FirstDeliveryoptionLocator())).isDisplayed();
    	    	  System.out.println(Firstdeliveryoption);
    	    	  Boolean Seconddeliveryoption = driver.findElement(By.xpath(objGetQuote.SecondDeliveryoptionLocator())).isDisplayed();
    	    	  System.out.println(Seconddeliveryoption);
    	    	  Boolean Thirddeliveryoption = driver.findElement(By.xpath(objGetQuote.ThirdDeliveryoptionLocator())).isDisplayed();
    	    	  System.out.println(Thirddeliveryoption);
    		  }
    	  }
    	  System.out.println("GQ9:Delivery options are showing for same state method for the shipment"+ " " + Shipment + " " + "with" + " " + PickupTime + " " +"completed....");
  	    System.out.println(".................................................................................................");
      }
      
      @SuppressWarnings("deprecation")
	public void ETADeliveryTimeVerify(String Shipment,String PickupTime) throws InterruptedException, ParseException{
    	  Dateclass objDate = new Dateclass();
    	  ETATimeverifyforSameState objETASameState = new ETATimeverifyforSameState();
    	  System.out.println(".................................................................................................");
  		System.out.println("GQ10:ETA delivery time for same state verification method" + " " + Shipment + " " + "with" + " " +PickupTime + " " + "started......");
    	  driver.navigate().refresh();
    	  String CurrentDate = objDate.ETACurrentDate();
    	  String ETANextDate = objDate.ETANextdate();
    	  String ETANextFifthDate = objDate.ETANext5Date();
    	  objETASameState.ETAvalidateforSameState(Shipment, CurrentDate, PickupTime);
    	  driver.navigate().refresh();
    	  objETASameState.ETAvalidateforSameState(Shipment, ETANextDate, PickupTime);
    	  driver.navigate().refresh();
    	  objETASameState.ETAvalidateforSameState(Shipment, ETANextFifthDate, PickupTime);
    	System.out.println("GQ10:ETA delivery time for same state method" + " " + Shipment + " " + "with" + " " + PickupTime + " " + "completed....");
  	    System.out.println(".................................................................................................");
    	   }
            
		 public void SamePricestateVerification(String PickupTime) throws InterruptedException, JSONException, IOException {
			 System.out.println(".................................................................................................");
		     System.out.println("GQ11:Same state Price verification method started" + " "  + "with" + " " + PickupTime);
		     SameStatePriceVerification objSamestate = new SameStatePriceVerification();
		     driver.navigate().refresh();
		     objSamestate.SamestateMethod("Documents", "Bike", "5", PickupTime);
			 driver.navigate().refresh();
			 objSamestate.SamestateMethod("Satchel, laptops", "Bike", "3", PickupTime);
			 driver.navigate().refresh();
			 objSamestate.SamestateMethod("Documents", "Car", "13", PickupTime);
			 driver.navigate().refresh(); 
			 objSamestate.SamestateMethod("Satchel, laptops", "Car", "6", PickupTime);
			 driver.navigate().refresh();
			 objSamestate.SamestateMethod("Cakes, flowers, delicates", "Car", "3", PickupTime);
			 driver.navigate().refresh();
			 objSamestate.SamestateMethod("Small Box", "Car", "9", PickupTime);
			 driver.navigate().refresh();
			 objSamestate.SamestateMethod("Small Box", "Van", "12", PickupTime);
			 driver.navigate().refresh();
			 objSamestate.SamestateMethod("Large Box", "Van", "3", PickupTime);
			 driver.navigate().refresh();
			 System.out.println("GQ11:Same state price verification method completed" + " "  + "with" + " " + PickupTime);
			 System.out.println(".................................................................................................");
		 }
			   public void SameStateBookNowbuttonredirect_BookingPage(String PickupTime) throws InterruptedException, JSONException, IOException {
				   System.out.println(".................................................................................................");
					System.out.println("GQ12:Same state book now button redirection method started" + " "  + "with" + " " + PickupTime);   
					SameStateBookNow_Redirect objRedirect = new SameStateBookNow_Redirect();
					driver.navigate().refresh();
					objRedirect.SameStateBookNow_Redirectform("Documents", PickupTime);
					//driver.navigate().refresh();
					objRedirect.SameStateBookNow_Redirectform("Satchel, laptops", PickupTime);
					//driver.navigate().refresh();
					objRedirect.SameStateBookNow_Redirectform("Small box", PickupTime);
					//driver.navigate().refresh();
					objRedirect.SameStateBookNow_Redirectform("Large Box", PickupTime);
					//driver.navigate().refresh();
					objRedirect.SameStateBookNow_Redirectform("Cakes, flowers, delicates", PickupTime);
				   	System.out.println("GQ12:Same state book now redirection method completed" + " "  + "with" + " " + PickupTime);
				    System.out.println(".................................................................................................");
			      
			    
			   }
			   
			   public void InterstatePriceVerification(String Pickupstate,String Dropoffstate) throws InterruptedException, IOException, JSONException {
				   System.out.println(".................................................................................................");
				   System.out.println("GQ13:Interstate Price verification method started" + " "  + "with" + " " + Pickupstate + " " + "and" + " " + Dropoffstate);
					AirInterstatePriceVerify objAirPrice = new AirInterstatePriceVerify();
					driver.navigate().refresh();
					objAirPrice.AirInterstateVerification("Documents", "11", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objAirPrice.AirInterstateVerification("Documents", "14", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objAirPrice.AirInterstateVerification("Documents", "14", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objAirPrice.AirInterstateVerification("Satchel, laptops", "3", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objAirPrice.AirInterstateVerification("Satchel, laptops", "6", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objAirPrice.AirInterstateVerification("Cakes, flowers, delicates", "4", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objAirPrice.AirInterstateVerification("Small Box", "8", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objAirPrice.AirInterstateVerification("Small Box", "12", Pickupstate, Dropoffstate, "Van");
				   driver.navigate().refresh();
				   objAirPrice.AirInterstateVerification("Large Box", "2", Pickupstate, Dropoffstate, "Van");
				   System.out.println("GQ13:Interstate Price verification method completed" + " "  + "with" + " " + Pickupstate + " " + "and" + " " + Dropoffstate);
				   System.out.println(".................................................................................................");
				   
			   }
			   
			   public void InterstateRedirectVerification() throws InterruptedException{
				   System.out.println(".................................................................................................");
					System.out.println("GQ15:Interstate redirect verification method started......");
				   driver.navigate().refresh();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
				   objInterstateRedirect.InterstateRedirection("NSW", "VIC", "12", "Documents", "12", "Car");
				   driver.navigate().refresh();
				   objInterstateRedirect.InterstateRedirection("VIC", "QLD", "12", "Satchel, laptops", "12", "Car");
				   driver.navigate().refresh();
				   objInterstateRedirect.InterstateRedirection("ACT", "QLD", "12", "Cakes, flowers, delicates", "12", "Car");
				   driver.navigate().refresh();
				   objInterstateRedirect.InterstateRedirection("QLD", "SA", "12", "Large Box", "3", "Van");
				   driver.navigate().refresh();
				   objInterstateRedirect.InterstateRedirection("SA", "WA", "12", "Small Box", "9", "Car");
				   driver.navigate().refresh();
				   
			        System.out.println("GQ15:Interstate redirect verification method completed....");
				    System.out.println(".................................................................................................");
			   }
			   
			  public void RoadInterstatePriceVerification(String Pickupstate,String Dropoffstate) throws InterruptedException, IOException, JSONException {
				  System.out.println(".................................................................................................");
					System.out.println("GQ16:Road Interstate price verification method started" + " "  + "with" + " " + Pickupstate + " " + "and" + " " + Dropoffstate);
					RoadInterstate_Price objRoadInterstate = new RoadInterstate_Price();
				  driver.navigate().refresh();
				  objRoadInterstate.VerificationofRI("Documents", "11", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objRoadInterstate.VerificationofRI("Documents", "14", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objRoadInterstate.VerificationofRI("Documents", "14", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objRoadInterstate.VerificationofRI("Satchel, laptops", "3", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objRoadInterstate.VerificationofRI("Satchel, laptops", "6", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objRoadInterstate.VerificationofRI("Cakes, flowers, delicates", "4", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objRoadInterstate.VerificationofRI("Small Box", "8", Pickupstate, Dropoffstate, "Car");
				   driver.navigate().refresh();
				   objRoadInterstate.VerificationofRI("Small Box", "12", Pickupstate, Dropoffstate, "Van");
				   driver.navigate().refresh();
				   objRoadInterstate.VerificationofRI("Large Box", "2", Pickupstate, Dropoffstate, "Van");
				  		   System.out.println("GQ16:Road Interstate Price verification method completed" + " "  + "with" + " " + Pickupstate + " " + "and" + " " + Dropoffstate);
				    System.out.println(".................................................................................................");
				
			  }
			  
			  public void RoadInterstateRedirectVerification() throws InterruptedException{
				  System.out.println(".................................................................................................");
					System.out.println("GQ18:Road Interstate redirect verification method started"); 
				  driver.navigate().refresh();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
				   objRoadInterstateRedirect.RoadInterstateRedirection("NSW", "VIC", "12", "Satchel, laptops", "12");
				   driver.navigate().refresh();
				   objRoadInterstateRedirect.RoadInterstateRedirection("QLD", "VIC", "12", "Cakes, flowers, delicates", "12");
				   driver.navigate().refresh();
				   objRoadInterstateRedirect.RoadInterstateRedirection("QLD", "ACT", "12", "Small Box", "12");
				   driver.navigate().refresh();
				   objRoadInterstateRedirect.RoadInterstateRedirection("ACT", "NSW", "12", "Large Box", "12");
				   driver.navigate().refresh();
				   
			        System.out.println("GQ18:Road Interstate redirect verification method completed");
				    System.out.println(".................................................................................................");
			  }
			  
			      public void ETAVerifyInterstate() throws ParseException, InterruptedException {
			    	  Dateclass objDate = new Dateclass();
			    	  ETAInterstateTime objETAInterState = new ETAInterstateTime();
			    	 System.out.println(".................................................................................................");
			  		System.out.println("GQ14:Interstate ETA verification method started......");
			    	  driver.navigate().refresh();
			    	  String CurrentDate = objDate.ETACurrentDate();
			    	  String ETANextDate = objDate.ETANextdate();
			    	  String ETASaturday = objDate.ETASaturday();
			    	  String ETASunday = objDate.ETASunday();
			    	  objETAInterState.ETAInterstateVerify("Documents", CurrentDate, "8am_11am", "NSW", "VIC", "12");
			    	  driver.navigate().refresh();
			    	  objETAInterState.ETAInterstateVerify("Satchel, laptops", ETANextDate, "11am_2pm", "NSW", "ACT", "12");
			    	  driver.navigate().refresh();
			    	  objETAInterState.ETAInterstateVerify("Small box", ETASaturday, "2pm_5pm", "NSW", "WA", "12");
			    	  driver.navigate().refresh();
			    	  objETAInterState.ETAInterstateVerify("Cakes, flowers, delicates", ETASunday, "5pm_12am", "SA", "WA", "12");
			    	  driver.navigate().refresh();
			    	  objETAInterState.ETAInterstateVerify("Large Box", ETANextDate, "12am_8am", "QLD", "WA", "12");
			    	 // element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
			    	  //objETAInterstate.ETAInterstateVerify(Shipment, Date, PickupTime, Pickupstate, Dropoffstate, Weight);
			    	  System.out.println("GQ14:Interstate ETA verification method completed....");
			  	    System.out.println(".................................................................................................");
			      }
			      
			      public void ETAVerifyRoadInterstate() throws ParseException, InterruptedException {
			    	  Dateclass objDate = new Dateclass();
                      ETA_RoadInterstateTime objETARI = new ETA_RoadInterstateTime();
			    	  System.out.println(".................................................................................................");
			  		System.out.println("GQ17:Road Interstate ETA Verification method started......");
			    	  driver.navigate().refresh();
			    	  String CurrentDate = objDate.ETACurrentDate();
			    	  String ETANextDate = objDate.ETANextdate();
			    	  String ETASaturday = objDate.ETASaturday();
			    	  String ETASunday = objDate.ETASunday();
			    	  objETARI.ETAInterstateVerify("Documents", CurrentDate, "12am_12pm", "NSW", "VIC", "12");
			    	  driver.navigate().refresh();
			    	  objETARI.ETAInterstateVerify("Satchel, laptops", ETANextDate, "After 12pm", "QLD", "ACT", "12");
			    	  driver.navigate().refresh();
			    	  objETARI.ETAInterstateVerify("Small box", ETASaturday, "12am_12pm", "NSW", "ACT", "12");
			    	  driver.navigate().refresh();
			    	  objETARI.ETAInterstateVerify("Cakes, flowers, delicates", ETASunday, "After 12pm", "ACT", "VIC", "12");
			    	  driver.navigate().refresh();
			    	  objETARI.ETAInterstateVerify("Large Box", ETANextDate, "12am_12pm", "QLD", "NSW", "12");

			    	  //element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
			    	 // objETARoad.ETAInterstateVerify(Shipment, Date, PickupTime, Pickupstate, Dropoffstate, Weight);
			    	  System.out.println("GQ17:Road Interstate ETA verification method completed....");
			  	    System.out.println(".................................................................................................");
			      }
			      
			      public void DirectDrive_PriceandETAVerify() throws InterruptedException{
			    	  System.out.println(".................................................................................................");
			  		System.out.println("GQ19:Direct drive Price and ETA verification method started......");
			    	  driver.navigate().refresh();
			    	  element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
			    	  objDirectDriveETAandPriceVerify.DirectDrivePriceVerify("NSW", "ACT", "12", "Documents", "12");
			    	  driver.navigate().refresh();
			    	  objDirectDriveETAandPriceVerify.DirectDrivePriceVerify("NSW", "ACT", "12", "Documents", "20");
			    	  driver.navigate().refresh();
			    	  objDirectDriveETAandPriceVerify.DirectDrivePriceVerify("NSW", "ACT", "12", "Satchel, laptops", "12");
			    	  driver.navigate().refresh();
			    	  objDirectDriveETAandPriceVerify.DirectDrivePriceVerify("ACT", "NSW", "12", "Cakes, flowers, delicates", "12");
			    	  driver.navigate().refresh();
			    	  objDirectDriveETAandPriceVerify.DirectDrivePriceVerify("ACT", "NSW", "12", "Small Box", "4");
			    	  driver.navigate().refresh();
			    	  objDirectDriveETAandPriceVerify.DirectDrivePriceVerify("ACT", "NSW", "12", "Small Box", "7");
			    	  driver.navigate().refresh();
			    	  objDirectDriveETAandPriceVerify.DirectDrivePriceVerify("ACT", "NSW", "12", "Large Box", "3");
			    	  System.out.println("GQ19:Direct drive Price and ETA verification method completed....");
			  	    System.out.println(".................................................................................................");
			      }
			      
			      public void DirectDrive_RedirectVerification() throws InterruptedException{
			    	  System.out.println(".................................................................................................");
			  		System.out.println("GQ20:Direct Drive Redirect verification method started......");
			    	  driver.navigate().refresh();
			    	  element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
			    	   objDirectDriveRedirect.DirectDriveRedirect_Verify("NSW", "ACT", "12", "Satchel, laptops", "12");
			    	   driver.navigate().refresh();
			    	   objDirectDriveRedirect.DirectDriveRedirect_Verify("ACT", "NSW", "12", "Cakes, flowers, delicates", "12");
			    	  
				        System.out.println("GQ20:Direct Drive Redirect verification method completed....");
					    System.out.println(".................................................................................................");
			      }

				   public void GetQuote_URLExtraLargeBidRequest(String Shipment) throws IOException, JSONException, InterruptedException {
					   System.out.println(".................................................................................................");
						System.out.println("GQ21:URl and request id verification for extra large bid request method started" + " "  + "with" + " " + Shipment);
					   driver.navigate().refresh();
				      element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
				      int request = objExtralarge.requestID(Shipment);
				      driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.TAB);
				      driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.ENTER);
				      //element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
				      Thread.sleep(10000);
				      String currenturl = driver.getCurrentUrl();
				      System.out.println("current url is " + currenturl);
				      int requestid = request + 1;
				      Assert.assertEquals(currenturl, "https://deliveries-staging.zoom2u.com/#/requests/detail/extralargeitem/" + requestid);
				      String ActualReference = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[1]/td[2]")).getText();
				      Assert.assertEquals(ActualReference, "LQ" + objETA.CurrentDateETAheavyfreight() + requestid);
				      driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
				        Thread.sleep(5000);
				      System.out.println("GQ21:URL and request id verification for extra large bid request method completed"  + " "  + "with" + " " + Shipment);
					  System.out.println(".................................................................................................");   
				  
				   } 
			   
			   public void GetQuote_ExtraLargedetailsVerify(String Shipment) throws IOException, JSONException, InterruptedException, ParseException{
				   System.out.println(".................................................................................................");
					System.out.println("GQ22:Extra large details verify method started"  + " "  + "with" + " " + Shipment);
				   //driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.LargeItemsShipmentLocator())));
				   driver.findElement(By.xpath(objGetQuote.LargeItemsShipmentLocator())).click();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.GeneralVanSubshipment_LargeItemLocator())));
				   if(Shipment.equals("General Van Shipments")) {
					   
					   driver.findElement(By.xpath(objGetQuote.GeneralVanSubshipment_LargeItemLocator())).click();
				   }
		if(Shipment.equals("Furniture")) {
					   
					   driver.findElement(By.xpath(objGetQuote.Furniture_LargeItemLocator())).click();
				   }
				   
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[2]/input")).sendKeys("Test Pickup Name");
					   String Pickupname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[2]/input")).getAttribute("value");
					   System.out.println("Pickup Name is" + Pickupname);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[2]/input")).sendKeys("Test Dropoff Name");
					   String Dropoffname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[2]/input")).getAttribute("value");
					   System.out.println("Dropoff Name is" + Dropoffname);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[3]/input")).sendKeys("Pickupemail@gmail.com");
					   String Pickupemail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[3]/input")).getAttribute("value");
					   System.out.println("Pickup email is" + Pickupemail);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[3]/input")).sendKeys("Dropoffemail@gmail.com");
					   String Dropoffemail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[3]/input")).getAttribute("value");
					   System.out.println("Dropoff email is" + Dropoffemail);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[4]/input")).sendKeys("123");
					   String PickupContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[4]/input")).getAttribute("value");
					   System.out.println("Pickup Contact is" + PickupContact);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[4]/input")).sendKeys("321");
					   String DropoffContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[4]/input")).getAttribute("value");
					   System.out.println("Drop off Contact is" + DropoffContact);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[1]/div/input")).sendKeys("unit 1");
					   String PickupUnitnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[1]/div/input")).getAttribute("value");
					   System.out.println("Pickup unit number is" + PickupUnitnumber);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[1]/div/input")).sendKeys("Unit 2");
					   String DropoffUnitnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[1]/div/input")).getAttribute("value");
					   System.out.println("Drop off unit number is" + DropoffUnitnumber);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[2]/div/input")).sendKeys("45");
					   String PickupStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[2]/div/input")).getAttribute("value");
					   System.out.println("Pickup street number is" + PickupStreetnumber);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[2]/div/input")).sendKeys("23");
					   String DropoffStreetNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[2]/div/input")).getAttribute("value");
					   System.out.println("Dropoff street number is" + DropoffStreetNumber);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[6]/input")).sendKeys("Clarence st sydney nsw australia");
					   String PickupStreetName = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[6]/input")).getAttribute("value");
					   System.out.println("Pickup street name is" + PickupStreetName);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[6]/input")).sendKeys("wentworth st greenacre nsw australia");
					   String DropoffStreetName = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[6]/input")).getAttribute("value");
					   System.out.println("Drop off street name is" + DropoffStreetName);
					   driver.findElement(By.xpath(".//*[@id='pickup_notes']")).sendKeys("Pickup Notes entered");
					   String PickupNotes = driver.findElement(By.xpath(".//*[@id='pickup_notes']")).getAttribute("value");
					   System.out.println("Pickup notes is" + PickupNotes);
					   driver.findElement(By.xpath(".//*[@id='drop_notes']")).sendKeys("Drop notes entered");
					   String DropoffNotes = driver.findElement(By.xpath(".//*[@id='drop_notes']")).getAttribute("value");
					   System.out.println("Dropoff notes is" + DropoffNotes);
					   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div/textarea")).sendKeys("Described about the package");
					   String DescribedNotes = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div/textarea")).getAttribute("value");
					   System.out.println("Described notes is" + DescribedNotes);
					   String PickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/div[1]/div/input")).getAttribute("value");
					   SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
					   Date date = formatter.parse(PickupDate);
					   System.out.println(date);
					   String value = formatter.format(date);
					   System.out.println("Pickupdate is" + value);
					   
					   String PickupTime = driver.findElement(By.xpath(".//*[@id='quotePickupTime']")).getAttribute("value");
					   DateFormat timeInstance = new SimpleDateFormat("h:mm a");
					   
					  
					   //String value1 = formatter1.format(Time);
					   //System.out.println("PickupTime is" + value1);
					   
					   System.out.println("Pickup Time is =" + PickupTime);
					   String DropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[7]/div[2]/div[1]/div/input")).getAttribute("value");
					   System.out.println("Dropoff Date is =" + DropoffDate);
					   String DropoffTime = driver.findElement(By.xpath(".//*[@id='quoteDropTime']")).getAttribute("value");
					   System.out.println("Dropoff Time is =" + DropoffTime);
					   
				      driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.TAB);
				      driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.ENTER);
				      element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[2]/td[2]/span")));
				      Thread.sleep(10000);
				      String ActualStatus = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[2]/td[2]/span")).getText();
				      Assert.assertEquals(ActualStatus, "Active");
				      String ActualBidtype = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[3]/td[2]")).getText(); 
				      Assert.assertEquals(ActualBidtype, "Large Items");
				      String ActualPickupaddress = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[4]/td[2]")).getText();
				      Assert.assertEquals(ActualPickupaddress, PickupUnitnumber + "," + " " + PickupStreetnumber + " " + PickupStreetName);
			          String ActualDropoffAddress = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[5]/td[2]")).getText();
			          Assert.assertEquals(ActualDropoffAddress, DropoffUnitnumber + "," + " " + DropoffStreetNumber + " " + DropoffStreetName);
			          //String ActualPickupDateandTime = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[6]/td[2]")).getText();
			          //Assert.assertEquals(ActualPickupDateandTime, value + " " + "07:39 AM");
			          String ActualDeliveryNotes = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[8]/td[2]")).getText();
			          Assert.assertEquals(ActualDeliveryNotes, DescribedNotes);
			          driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
				        Thread.sleep(5000);
			          System.out.println("GQ22:Extra large details verify method completed"  + " "  + "with" + " " + Shipment);
			  	    System.out.println(".................................................................................................");  
			   }
			   
			   public void GetQuote_URLHeavyFreightBidRequest(String Shipment) throws IOException, JSONException, InterruptedException {
				   System.out.println(".................................................................................................");
					System.out.println("GQ26:Heavy freight bid request url and request id verification method started"  + " "  + "with" + " " + Shipment);   
				   driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
				      element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
				      //int request = objFreightservice.requestID(Shipment);
				      long requestidref = objFreightservice.requestidref(Shipment);
				      driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.TAB);
				      driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).sendKeys(Keys.ENTER);
				      Thread.sleep(10000);
				      String currenturl = driver.getCurrentUrl();
				      System.out.println("current url is " + currenturl);
				      //int requestid = request + 1;
				      long requesttidref = requestidref + 1;
				      Assert.assertEquals(currenturl, "https://deliveries-staging.zoom2u.com/#/requests/detail/freight/HQ" + requesttidref);
				      String ActualReference = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[4]/table/tbody/tr[1]/td[2]")).getText();
				      Assert.assertEquals(ActualReference, "HQ" + requesttidref);
				      driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
				        Thread.sleep(5000);
				      System.out.println("GQ26:Heavy freight bid request url and request id verification method completed"  + " "  + "with" + " " + Shipment);
					    System.out.println("................................................................................................."); 
			   } 
			   
			   public void HeavyFreightsubshipmentVerification(String Subshipment, int containervalue) throws InterruptedException{
				   System.out.println(".................................................................................................");
					System.out.println("GQ27:Heavy freight sub shipment detail verification method started"  + " "  + "with" + " " + Subshipment);
				   driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
				   driver.navigate().refresh();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.LargeItemsShipmentLocator())));
				   objHeavyFreight.Heavyfreightshipment(Subshipment, containervalue);
				   System.out.println("GQ27:Heavy freight sub shipment detail verification method completed"  + " "  + "with" + " " + Subshipment);
				    System.out.println(".................................................................................................");
			   }
			   
			   public void GetQuote_ValidationTextVerify_ExceptLargeitems() throws InterruptedException{
				   System.out.println(".................................................................................................");
					System.out.println("GQ23:Get quote validation text verification method started......");
				   driver.navigate().refresh();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));
				   objGetquoteValidationmessages.GetQuotevalidationforShipments_exceptLargeitems();
				   System.out.println("GQ23:Get quote validation text verification method completed....");
				    System.out.println(".................................................................................................");
			   }
			   
			   public void Placeholder_GetquoteLargeItems(String Shipment) throws InterruptedException{
				   System.out.println(".................................................................................................");
					System.out.println("GQ24:Placeholder verification of get quote large item method started......");
				   driver.navigate().refresh();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.LargeItemsShipmentLocator())));
				   objPlaceholderbid.Placeholdersforbidrequest(Shipment);
				   System.out.println("GQ24:Placeholder verification of get quote large item method completed....");
				    System.out.println(".................................................................................................");
			   }
			   
			   public void Label_GetquoteLargeItems(String Shipment) throws InterruptedException{
				   System.out.println(".................................................................................................");
					System.out.println("GQ25:Label verification of get quote large items method started......");
				   driver.navigate().refresh();
				   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.LargeItemsShipmentLocator())));
				   objLabelBid.LabelVerification_BidRequest(Shipment);
				   System.out.println("GQ25:Label verification of get quote large items method completed....");
				    System.out.println(".................................................................................................");
			   }
			   
			   public void AddItemverify_HeavyFreightItems() throws Exception{
				   System.out.println(".................................................................................................");
					System.out.println("GQ25:Add items section for heavy freight method started......");
                   AddItemVerificationforLargeItems objAddItem = new AddItemVerificationforLargeItems();
				   objAddItem.additem("BuildingMaterials");
				   objAddItem.additem("Container");
				   //objAddItem.additem("Vehicles");
				   
				   System.out.println("GQ25:Add items section for heavy freight method completed....");
				    System.out.println(".................................................................................................");
				  
				   
				   
			   }
			   
			   public void HeavyfreightImageselection() throws InterruptedException, AWTException{
				   System.out.println(".................................................................................................");
					System.out.println("GQ25:Heavy freight image uploaded method started......");
                   hfimage objhfimage = new hfimage();
				   objhfimage.selectimagesforhf("BuildingMaterials");
				   driver.navigate().refresh();
				   objhfimage.selectimagesforhf("GeneralTruckShipments");
				   driver.navigate().refresh();
				   objhfimage.selectimagesforhf("Pallets");
				   driver.navigate().refresh();
				   objhfimage.selectimagesforhf("Machinery");
				   driver.navigate().refresh();
				   objhfimage.selectimagesforhf("Vehicles");
				   driver.navigate().refresh();
				   objhfimage.selectimagesforhf("Container");
				   driver.navigate().refresh();
				   objhfimage.selectimagesforhf("FullTruckLoad");
				   driver.navigate().refresh();
				   System.out.println("GQ25:heavy freight image uploaded method completed....");
				    System.out.println(".................................................................................................");

			   }
			   
			   public void UIEnabledVerification() throws Exception{
				   
				   UIEnabledforHF objUIEnabled = new UIEnabledforHF();
				   objUIEnabled.overlimitUI("Documents");
				   //driver.navigate().refresh();
				   objUIEnabled.overlimitUI("stachellaptops");
				   //driver.navigate().refresh();
				   objUIEnabled.overlimitUI("Smallbox");
				   //driver.navigate().refresh();
				   objUIEnabled.overlimitUI("Cakesflowersdelicates");
				   //driver.navigate().refresh();
				   objUIEnabled.overlimitUI("LargeBox");
				   //driver.navigate().refresh();
				   objUIEnabled.largeiteminterstateui("GeneralVanShipments");
				   //driver.navigate().refresh();
				   objUIEnabled.largeiteminterstateui("Furniture");
				   
			   }
				   
}

	

