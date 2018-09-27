package MAB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;
import DeliveriesMessages.MABDefaultMessages;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

public class DefaultPlaceholdersandlabels_AvailableonMAB extends MAB_Scenarios {
	WebElement element;
	   MakeaBookingLocator objMAB = new MakeaBookingLocator();
	   LoginCredentialsfor_Login objLogin = new LoginCredentialsfor_Login();
	   MABDefaultMessages objDefaultMessages = new MABDefaultMessages();

	public void LabelsandPlaceholders_Verify(){
		
		System.out.println(".................................................................................................");
  		System.out.println("MAB8:Labels and Placeholder verification  method started......");
  		 String LabelOrdernumbertext = driver.findElement(By.xpath(objMAB.Label_OrderNumber_ExceptLargeItems())).getText();
   	  System.out.println("The label of order number field is" + LabelOrdernumbertext);
   	 String LabelDescribedeliverytext = driver.findElement(By.xpath(objMAB.Label_DescribeDelivery_ExceptLargeItems())).getText();
	  System.out.println("The label of describe delivery is" + LabelDescribedeliverytext);
	  String LabelPickuptext = driver.findElement(By.xpath(objMAB.Label_PickupDetails_ExceptLargeItems())).getText();
	  System.out.println("The label of pickup field is" + LabelPickuptext);
	  String LabelSMSCheckbox = driver.findElement(By.xpath(objMAB.Label_SMSTrackingCheckbox_ExceptLargeItems())).getText();
	  System.out.println("The label of sms checkbox is" + LabelSMSCheckbox);
    	  String LabelDropofftext = driver.findElement(By.xpath(objMAB.Label_DropoffDetails_ExceptLargeItems())).getText();
    	  System.out.println("The label of drop off field is" + LabelDropofftext);
    	  String LabelParcelAvailabletext = driver.findElement(By.xpath(objMAB.Label_ParcelAvailableDate_ExceptLargeItems())).getText();
    	  System.out.println("The label of parcel available field is" + LabelParcelAvailabletext);
    	  String LabelDatetext = driver.findElement(By.xpath(objMAB.Label_PickupDate_ExceptLargeItems())).getText();
    	  System.out.println("The label of pickup date is" + LabelDatetext);
    	  String Labeltimetext = driver.findElement(By.xpath(objMAB.Label_PickupTime_ExceptLargeItems())).getText();
    	  System.out.println("The label of pickup time is" + Labeltimetext);
    	  Assert.assertEquals(LabelOrdernumbertext, objDefaultMessages.Label_OrderNumber());
    	  Assert.assertEquals(LabelDescribedeliverytext, objDefaultMessages.Label_Describedelivery());
    	  Assert.assertEquals(LabelPickuptext, objDefaultMessages.Label_Pickupdetails());
    	  Assert.assertEquals(LabelSMSCheckbox, objDefaultMessages.Label_SMSCheckbox());
    	  Assert.assertEquals(LabelParcelAvailabletext, objDefaultMessages.Label_ParcelAvailableafter());
    	  Assert.assertEquals(LabelDatetext, objDefaultMessages.Label_Date());
    	  Assert.assertEquals(Labeltimetext, objDefaultMessages.Label_Time());
    	  String OrdernumberPlaceholdertext = driver.findElement(By.xpath(objMAB.OrderNumber_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of ordernumber = " + OrdernumberPlaceholdertext);
    	  String DeliveryInstructionPlaceholdertext = driver.findElement(By.xpath(objMAB.DescribeDelivery_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of Delivery Instruction = " + DeliveryInstructionPlaceholdertext);
    	  String pickupcontactnamePlaceholdertext = driver.findElement(By.xpath(objMAB.Pickupname_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of pickup contact name = " + pickupcontactnamePlaceholdertext);
    	  String pickupEmailPlaceholdertext = driver.findElement(By.xpath(objMAB.PickupEmail_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of pickup Email = " + pickupEmailPlaceholdertext);
    	  String pickupPhonenumberPlaceholdertext = driver.findElement(By.xpath(objMAB.PickupPhonenumber_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of pickup phone number = " + pickupPhonenumberPlaceholdertext);
    	  String pickupunitnumberPlaceholdertext = driver.findElement(By.xpath(objMAB.PickupUnitnumber_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of pickup unit number = " + pickupunitnumberPlaceholdertext);
    	  String pickupstreetnumberPlaceholdertext = driver.findElement(By.xpath(objMAB.Pickupaddresstreetnumbertextfield_Pickupdetails())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of pickup street number = " + pickupstreetnumberPlaceholdertext);
    	  String pickupstreetaddressPlaceholdertext = driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of pickup street address = " + pickupstreetaddressPlaceholdertext);
    	  String pickupdeliveryinstructionPlaceholdertext = driver.findElement(By.xpath(objMAB.Pickup_DeliveryInstructions_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of pickup delivery instruction = " + pickupdeliveryinstructionPlaceholdertext);
    	  String dropoffcontactnamePlaceholdertext = driver.findElement(By.xpath(objMAB.dropoffname_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of dropoff contact name = " + dropoffcontactnamePlaceholdertext);
    	  String DropoffEmailPlaceholdertext = driver.findElement(By.xpath(objMAB.dropoffEmail_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of dropoff Email = " + DropoffEmailPlaceholdertext);
    	  String DropoffPhonenumberPlaceholdertext = driver.findElement(By.xpath(objMAB.DropoffPhonenumber_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of dropoff = " + DropoffPhonenumberPlaceholdertext);
    	  String DropoffunitnumberPlaceholdertext = driver.findElement(By.xpath(objMAB.DropoffUnitnumber_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of dropoff unit number = " + DropoffunitnumberPlaceholdertext);
    	  String DropoffstreetnumberPlaceholdertext = driver.findElement(By.xpath(objMAB.Dropoffaddresstreetnumbertextfield_Dropoffdetails())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of dropoff street number = " + DropoffstreetnumberPlaceholdertext);
    	  String DropoffstreetaddressPlaceholdertext = driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of dropoff street address = " + DropoffstreetaddressPlaceholdertext);
    	  String DropoffdeliveryinstructionPlaceholdertext = driver.findElement(By.xpath(objMAB.Dropoff_DeliveryInstructions_textfieldLocator())).getAttribute("Placeholder");
    	  System.out.println("Placeholder of dropoff delivery instruction = " + DropoffdeliveryinstructionPlaceholdertext);

    	  Assert.assertEquals(OrdernumberPlaceholdertext, objDefaultMessages.Placeholder_Ordernumber());
    	  Assert.assertEquals(DeliveryInstructionPlaceholdertext, objDefaultMessages.Placeholder_DeliveryInstructions());
    	  Assert.assertEquals(pickupcontactnamePlaceholdertext, objDefaultMessages.Placeholder_PickupContactname());
    	  Assert.assertEquals(pickupEmailPlaceholdertext, objDefaultMessages.Placeholder_PickupEmail());
    	  Assert.assertEquals(pickupPhonenumberPlaceholdertext, objDefaultMessages.Placeholder_PickupPhonenumber());
    	  Assert.assertEquals(pickupunitnumberPlaceholdertext, objDefaultMessages.Placeholder_PickupUnitnumber());
    	  Assert.assertEquals(pickupstreetnumberPlaceholdertext, objDefaultMessages.Placeholder_PickupStreetnumber());
    	  Assert.assertEquals(pickupstreetaddressPlaceholdertext, objDefaultMessages.Placeholder_PickupStreetname());
    	  Assert.assertEquals(pickupdeliveryinstructionPlaceholdertext, objDefaultMessages.Placeholder_PickupDeliveryInstructions());
    	  Assert.assertEquals(dropoffcontactnamePlaceholdertext, objDefaultMessages.Placeholder_DropoffContactname());
    	  Assert.assertEquals(DropoffEmailPlaceholdertext, objDefaultMessages.Placeholder_DropoffEmail());
    	  Assert.assertEquals(DropoffPhonenumberPlaceholdertext, objDefaultMessages.Placeholder_DropoffPhonenumber());
    	  Assert.assertEquals(DropoffunitnumberPlaceholdertext, objDefaultMessages.Placeholder_DropoffUnitnumber());
    	  Assert.assertEquals(DropoffstreetnumberPlaceholdertext, objDefaultMessages.Placeholder_DropoffStreetnumber());
    	  Assert.assertEquals(DropoffstreetaddressPlaceholdertext, objDefaultMessages.Placeholder_DropoffStreetname());
    	  Assert.assertEquals(DropoffdeliveryinstructionPlaceholdertext, objDefaultMessages.Placeholder_DropoffDeliveryInstructions());
    	  System.out.println("MAB8:Labels and Placeholder verification method completed....");
  	    System.out.println(".................................................................................................");
		
		
		
	}

}
