package RequiredClassesfor_EachModule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonLibraries.BearerTokengetService;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import Controller.LaunchBrowser_inCrossBrowser;

public class HeavyfreightService extends LaunchBrowser_inCrossBrowser {
	
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	StringBuffer response;
	String PurchaseOrderNumber;
	String Quantityvalue;
	String Lengthvalue;
	String Widthvalue;
	String Heightvalue;
	String ItemWeightvalue;
	String TotalWeightvalue;
	String FreightTitlevalue;
	String Freightmoneyvalue;
	String Describeshipment;
	String DeliveryInstruction;
	String Pickupsuburb;
	String Dropoffsuburb;
	String PickupDate;
	String DropoffDate;
	WebElement element;
	BearerTokengetService objToken = new BearerTokengetService();
	public void GetQuote_CreateHeavyFreightBidRequest(String SubShipment) throws IOException, JSONException, InterruptedException {
		
		driver.findElement(By.xpath(objGetQuote.LargeItemsShipmentLocator())).click();
		   
		   
			 element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[3]")));
		     
			 if(SubShipment.equals("Building Materials")){
				 
				 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[3]")).click();
			 }
			 else if(SubShipment.equals("General Truck Shipments")){
				 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[4]/div")).click();
			 }
			 else if(SubShipment.equals("Pallets")){
				 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[5]")).click();
			 }
			 else if(SubShipment.equals("Machinery")){
				 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[6]")).click();
	 }
			 else if(SubShipment.equals("Vehicles")){
				 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[7]")).click();
	 }
			 else if(SubShipment.equals("Container")){
				 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[8]")).click();
	 }
			 else if(SubShipment.equals("Full Truck Load")){
				 driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[9]")).click();
	 }
			if(SubShipment.equals("Building Materials") || SubShipment.equals("General Truck Shipments") || SubShipment.equals("Pallets") || SubShipment.equals("Machinery") || SubShipment.equals("Vehicles")){
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).sendKeys("1223456");
			PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("value");
			System.out.println("Purchase order number is =" + PurchaseOrderNumber);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/input")).sendKeys("12");
	        Quantityvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/input")).getAttribute("value");
	        System.out.println("Quantity value is" + Quantityvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/span/input")).sendKeys("12");
	        Lengthvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/span/input")).getAttribute("value");
	        System.out.println("Length value is" + Lengthvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/span/input")).sendKeys("16");
	        Widthvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/span/input")).getAttribute("value");
	        System.out.println("Width value is" + Widthvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/span/input")).sendKeys("16");
	        Heightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/span/input")).getAttribute("value");
	        System.out.println("Height value is" + Heightvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[5]/span/input")).sendKeys("16");
	        ItemWeightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[5]/span/input")).getAttribute("value");
	        System.out.println("Item weight value is" + ItemWeightvalue);
	        TotalWeightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[6]/span/input")).getAttribute("value");
	        System.out.println("Total Weight value is" + TotalWeightvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).sendKeys("Freight Match");
	        FreightTitlevalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).getAttribute("value");
	        System.out.println("Freight Title value is" + FreightTitlevalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).sendKeys("13");
	        Freightmoneyvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).getAttribute("value");
	        System.out.println("Freight money value is" + Freightmoneyvalue);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).sendKeys("Building material shipment selected");
	        Describeshipment = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).getAttribute("value");
	        System.out.println("Shipment Description" + Describeshipment);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).sendKeys("Building material should be kept properly...");
	        DeliveryInstruction = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).getAttribute("value");
	        System.out.println("Shipment Description" + DeliveryInstruction);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).sendKeys("Sydney new south wales australia");
	        Pickupsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).getAttribute("value");
	        System.out.println("Pickup suburb is" + Pickupsuburb);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).sendKeys("Greenacre new south wales australia");
	        Dropoffsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).getAttribute("value");
	        System.out.println("Dropoff suburb is" + Dropoffsuburb);
	        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[2]/label")).click();
	        PickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[1]/div/input")).getAttribute("value");
	        System.out.println("Pickup Date is" + PickupDate);
	        DropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[1]/div/input")).getAttribute("value");
	        System.out.println("Dropoff Date is" + DropoffDate);

		   }else if(SubShipment.equals("Container")){
			   
			   org.openqa.selenium.support.ui.Select containersize = new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/select")));
				containersize.selectByIndex(1);
				WebElement Containeroption =containersize.getFirstSelectedOption();
				String Containersizeoption = Containeroption.getText();
				
				System.out.println("Container size value is" + Containersizeoption);
				driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).sendKeys("1223456");
				String PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("value");
				System.out.println("Purchase order number is =" + PurchaseOrderNumber);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/input")).sendKeys("12");
		        String Quantityvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/input")).getAttribute("value");
		        System.out.println("Quantity value is" + Quantityvalue);
		        //driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[2]/span/input")).sendKeys("12");
		        String Lengthvalue = driver.findElement(By.xpath("//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/span/input")).getAttribute("value");
		        System.out.println("Length value is" + Lengthvalue);
		        //driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[3]/span/input")).sendKeys("16");
		        String Widthvalue = driver.findElement(By.xpath("//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/span/input")).getAttribute("value");
		        System.out.println("Width value is" + Widthvalue);
		        //driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[4]/span/input")).sendKeys("16");
		        String Heightvalue = driver.findElement(By.xpath("//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[5]/span/input")).getAttribute("value");
		        System.out.println("Height value is" + Heightvalue);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[6]/span/input")).sendKeys("16");
		        String ItemWeightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[6]/span/input")).getAttribute("value");
		        System.out.println("Item weight value is" + ItemWeightvalue);
		        String TotalWeightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[7]/span/input")).getAttribute("value");
		        System.out.println("Total Weight value is" + TotalWeightvalue);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).sendKeys("Freight Match");
		        String FreightTitlevalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[1]/input")).getAttribute("value");
		        System.out.println("Freight Title value is" + FreightTitlevalue);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).sendKeys("13");
		        String Freightmoneyvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[5]/div[2]/input")).getAttribute("value");
		        System.out.println("Freight money value is" + Freightmoneyvalue);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).sendKeys("Building material shipment selected");
		        String Describeshipment = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[1]/textarea")).getAttribute("value");
		        System.out.println("Shipment Description" + Describeshipment);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).sendKeys("Building material should be kept properly...");
		        String DeliveryInstruction = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[7]/div[2]/textarea")).getAttribute("value");
		        System.out.println("Shipment Description" + DeliveryInstruction);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).sendKeys("Sydney new south wales australia");
		        String Pickupsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).getAttribute("value");
		        System.out.println("Pickup suburb is" + Pickupsuburb);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).sendKeys("Greenacre new south wales australia");
		        String Dropoffsuburb = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[2]/input")).getAttribute("value");
		        System.out.println("Dropoff suburb is" + Dropoffsuburb);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[2]/label")).click();
		        String PickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[3]/div[7]/div[1]/div/input")).getAttribute("value");
		        System.out.println("Pickup Date is" + PickupDate);
		        String DropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[3]/div[3]/div[7]/div[1]/div/input")).getAttribute("value");
		        System.out.println("Dropoff Date is" + DropoffDate);

			   
		   }else if(SubShipment.equals("Full Truck Load")){
				
				driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).sendKeys("1223456");
				String PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[2]/input")).getAttribute("value");
				System.out.println("Purchase order number is =" + PurchaseOrderNumber);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[2]/input")).sendKeys("Test Milind");
		        String TestContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[2]/input")).getAttribute("value");
		        System.out.println("TestContact is" + TestContact);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[3]/input")).sendKeys("milind.k@gmail.com");
		        String Pickupemail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[3]/input")).getAttribute("value");
		        System.out.println("Pickup Email is" + Pickupemail);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[4]/input")).sendKeys("1234567890");
		        String Pickupphonenumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[4]/input")).getAttribute("value");
		        System.out.println("Pickup phone number is" + Pickupphonenumber);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[1]/div/input")).sendKeys("unit 1");
		        String Pickupunitnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[1]/div/input")).getAttribute("value");
		        System.out.println("Pickup unit number is" + Pickupunitnumber); 
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[2]/div/input")).sendKeys("45");
		        String PickupStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[5]/div[2]/div/input")).getAttribute("value");
		        System.out.println("Pickup street number is" + PickupStreetnumber); 
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[6]/input")).sendKeys("Clarence St Sydney NSW australia");
		        String PickupStreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[6]/input")).getAttribute("value");
		        System.out.println("Pickup street name is" + PickupStreetname); 
		        driver.findElement(By.xpath(".//*[@id='pickup_notes']")).sendKeys("Pickup notes");
		        String Pickupnotes = driver.findElement(By.xpath(".//*[@id='pickup_notes']")).getAttribute("value");
		        System.out.println("Pickup notes is" + Pickupnotes); 
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[2]/input")).sendKeys("Test Arjun");
		        String TestDropoffContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[2]/input")).getAttribute("value");
		        System.out.println("Dropoff Contact name is" + TestDropoffContact);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[3]/input")).sendKeys("milind@gmail.com");
		        String TestDropoffemail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[3]/input")).getAttribute("value");
		        System.out.println("Dropoff email is" + TestDropoffemail);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[4]/input")).sendKeys("1234678");
		        String DropoffPhonenumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[4]/input")).getAttribute("value");
		        System.out.println("Dropoff phone number is" + DropoffPhonenumber);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[1]/div/input")).sendKeys("Dropoff unit 2");
		        String Dropoffunitnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[1]/div/input")).getAttribute("value");
		        System.out.println("Dropoff unit number is" + Dropoffunitnumber);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[2]/div/input")).sendKeys("23");
		        String DropoffStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[5]/div[2]/div/input")).getAttribute("value");
		        System.out.println("Dropoff street number is" + DropoffStreetnumber);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[6]/input")).sendKeys("wentworth st greenacre nsw australia");
		        String DropoffStreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[6]/input")).getAttribute("value");
		        System.out.println("Dropoff street name is" + DropoffStreetname);
		        driver.findElement(By.xpath(".//*[@id='drop_notes']")).sendKeys("Drop notes");
		        String Dropoffnotes = driver.findElement(By.xpath(".//*[@id='drop_notes']")).getAttribute("value");
		        System.out.println("Dropoff notes is" + Dropoffnotes);
		        driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[1]/div/textarea")).sendKeys("Description of the bid request");
		        String Description = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[1]/div/textarea")).getAttribute("value");
		        System.out.println("Description is" + Description);
		        String PickupDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[7]/div[2]/div[1]/div/input")).getAttribute("value");
		        System.out.println("Pickup Date is" + PickupDate);
		        String DropoffDate = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[8]/div[2]/div[1]/div/input")).getAttribute("value");
		        System.out.println("Dropoff Date is" + DropoffDate);
		   }
	}
			public void HeavyFreightApiservice(String Shipment) throws IOException, JSONException, InterruptedException{
				 GetQuote_CreateHeavyFreightBidRequest(Shipment);
				 String token = "bearer" + " " + objToken.Tokenaccess("farji123@gmail.com", "123456");
			     URL url=new URL("https://api-staging.zoom2u.com/breeze/HeavyFreight/SaveHeavyFreightQuote");
		         HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
		         httpcon.setDoOutput(true);
		         httpcon.setRequestMethod("POST");
		         httpcon.setRequestProperty("Accept", "application/json");
		         httpcon.setRequestProperty("Content-Type", "application/json");
		         httpcon.setRequestProperty("Authorization", token);
		         
		         JSONObject Mainjson = new JSONObject();
		         JSONObject RequestModel = new JSONObject();
		         
		         //RequestModel.put("_requestModel", RequestModel).toString();
		        
		         JSONArray Items = new JSONArray();
		         
		         JSONObject objp=new JSONObject();
		         RequestModel.put("Items", Items);       
		objp.put("ContainerSize", "");
		objp.put("Packaging","" );
		objp.put("Quantity", "12");
		objp.put("LengthCm", "12");
		objp.put("WidthCm", "13");
		objp.put("HeightCm", "14");
		objp.put("ItemWeightKg", "12");
		objp.put("TotalWeightKg", 144);
		Items.put(objp);


		RequestModel.put("FreightTitle", "fffdg");
		RequestModel.put("TrailerType", "");
		RequestModel.put("LoadType","FullLoad");
		RequestModel.put("FreightValue", "22");
		RequestModel.put("SecurityIdCardNumber","");
		RequestModel.put("PickupLocationPremisesType","y");
		RequestModel.put("DropLocationPremisesType","y");
		RequestModel.put("PickupLocationTailLiftType","Crane");
		RequestModel.put("DropLocationTailLiftType","Crane");
		RequestModel.put("PickupLocationTailLiftNotes", "");
		RequestModel.put("DropLocationTailLiftNotes" , "");
		RequestModel.put("Status","Active");
		RequestModel.put("Source","Deliveries");
		RequestModel.put("FreightCategory",2);
		RequestModel.put("OtherDetails",Describeshipment);

		JSONObject PickupLocation = new JSONObject();
		RequestModel.put("PickupLocation", PickupLocation);
		PickupLocation.put("ContactName", "");
		PickupLocation.put("Phone", "");
		PickupLocation.put("Email", "");
		PickupLocation.put("Address", "");
		PickupLocation.put("Notes", "");
		PickupLocation.put("GPSX","-33.8646468");
		PickupLocation.put("GPSY", "151.20446200000004");
		PickupLocation.put("UnitNumber", "");
		PickupLocation.put("StreetNumber", "");
		PickupLocation.put("Street", "");
		PickupLocation.put("Suburb",  Pickupsuburb);
		PickupLocation.put("State", "NSW");
		PickupLocation.put("Postcode", "2000");
		PickupLocation.put("IsFlexible", false);


		JSONObject DropoffLocation = new JSONObject();
		RequestModel.put("DropLocation", DropoffLocation);
		DropoffLocation.put("ContactName", "");
		DropoffLocation.put("Phone", "");
		DropoffLocation.put("Email", "");
		DropoffLocation.put("Address", "");
		DropoffLocation.put("Notes", "");
		DropoffLocation.put("GPSX","-33.8983538");
		DropoffLocation.put("GPSY", "151.06848309999998");
		DropoffLocation.put("UnitNumber", "");
		DropoffLocation.put("StreetNumber", "");
		DropoffLocation.put("Street", "");
		DropoffLocation.put("Suburb",  Dropoffsuburb);
		DropoffLocation.put("State", "NSW");
		DropoffLocation.put("Postcode", "2190");
		DropoffLocation.put("IsFlexible", false);


		RequestModel.put("Vehicle", "");
		RequestModel.put("PickupDateTime", "2018-02-12T22:00:00+05:30");
		RequestModel.put("DropDateTime", "2018-02-12T23:00:00+05:30");
		RequestModel.put("DeliverySpeed", "");
		RequestModel.put("Price", 0);
		RequestModel.put("Notes", Describeshipment);
		RequestModel.put("Distance", "");
		RequestModel.put("IsInterstate", false);
		RequestModel.put("BookingFee", 0);
		RequestModel.put("createUserFlag", false);
		RequestModel.put("customerType", "Deliveries");
		RequestModel.put("isPayByInvoiceMarked", false);
		RequestModel.put("IsRentContainer", false);
		RequestModel.put("sendSmsToPickupPerson", false);
		RequestModel.put("OrderNumber", "1234567890");

		
		Mainjson.put("_requestModel", RequestModel);

		OutputStreamWriter output=new OutputStreamWriter(httpcon.getOutputStream());
		//System.out.println("output is" + output);
		output.write(Mainjson.toString());
		output.flush();

		//System.out.println(Mainjson);

		int responseCode = httpcon.getResponseCode();
		//System.out.println(responseCode);
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(httpcon.getInputStream()));
		String inputLine;
		response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		//print in String
			 
			}
			 public int requestID(String Shipment) throws JSONException, IOException, InterruptedException{
				 HeavyFreightApiservice(Shipment);
				 JSONObject jssson = new JSONObject(response.toString());
				  String text = jssson.getString("QuoteRequestId");
				  //System.out.println("text is ="+ text);
				  int requestID = Integer.parseInt(text);
				  //System.out.println("Request Id is =" + requestID);
				  
				  return requestID;
			 }
			 
			 public long requestidref(String Shipment) throws JSONException, IOException, InterruptedException{
				 HeavyFreightApiservice(Shipment);
				 JSONObject jssson = new JSONObject(response.toString());
				  String text = jssson.getString("HeavyFreightQuoteRef");
				  //System.out.println("text is ="+ text);
				  String text1 = text.replaceAll("HQ", "");
				  //System.out.println("text 1 is " + text1);
				  long requestIDref = Long.parseLong(text1);
				  //System.out.println("Request Id is =" + requestIDref);
				  
				  return requestIDref;
			 }


}
