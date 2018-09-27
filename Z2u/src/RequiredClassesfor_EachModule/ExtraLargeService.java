package RequiredClassesfor_EachModule;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import CommonLibraries.BearerTokengetService;
import CommonLibraries.GetQuoteLocators;
import Controller.LaunchBrowser_inCrossBrowser;

public class ExtraLargeService extends LaunchBrowser_inCrossBrowser {
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	StringBuffer response;
	String Pickupname;
	String Dropoffname;
	String Pickupemail;
	String Dropoffemail;
	String PickupContact;
	 String DropoffContact;
	 String PickupUnitnumber;
	 String DropoffUnitnumber;
	 String PickupStreetName;
	 String DropoffStreetNumber;
	 String PickupStreetnumber;   
	 String DropoffStreetName;
	 String PickupNotes;
	 String DropoffNotes; 
	 String DescribedNotes;
	 
	 BearerTokengetService objToken = new BearerTokengetService();
	 
	 public void GetQuote_CreateExtraLargeBidRequest(String Shipment) throws IOException, JSONException, InterruptedException {
		   
		   driver.findElement(By.xpath(objGetQuote.LargeItemsShipmentLocator())).click();
		   Thread.sleep(10000);
		   if(Shipment.equals("General Van Shipments")) {
			   
			   driver.findElement(By.xpath(objGetQuote.GeneralVanSubshipment_LargeItemLocator())).click();
		   }
if(Shipment.equals("Furniture")) {
			   
			   driver.findElement(By.xpath(objGetQuote.Furniture_LargeItemLocator())).click();
		   }
		   
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[2]/input")).sendKeys("Test Pickup Name");
			   Pickupname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[2]/input")).getAttribute("value");
			   System.out.println("Pickup Name is" + Pickupname);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[2]/input")).sendKeys("Test Dropoff Name");
			   Dropoffname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[2]/input")).getAttribute("value");
			   System.out.println("Dropoff Name is" + Dropoffname);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[3]/input")).sendKeys("Pickupemail@gmail.com");
			   Pickupemail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[3]/input")).getAttribute("value");
			   System.out.println("Pickup email is" + Pickupemail);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[3]/input")).sendKeys("Dropoffemail@gmail.com");
			   Dropoffemail = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[3]/input")).getAttribute("value");
			   System.out.println("Dropoff email is" + Dropoffemail);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[4]/input")).sendKeys("123");
			   PickupContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[4]/input")).getAttribute("value");
			   System.out.println("Pickup Contact is" + PickupContact);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[4]/input")).sendKeys("321");
			   DropoffContact = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[4]/input")).getAttribute("value");
			   System.out.println("Drop off Contact is" + DropoffContact);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[1]/div/input")).sendKeys("unit 1");
			   PickupUnitnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[1]/div/input")).getAttribute("value");
			   System.out.println("Pickup unit number is" + PickupUnitnumber);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[1]/div/input")).sendKeys("Unit 2");
			   DropoffUnitnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[1]/div/input")).getAttribute("value");
			   System.out.println("Drop off unit number is" + DropoffUnitnumber);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[2]/div/input")).sendKeys("45");
			   PickupStreetnumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[5]/div[2]/div/input")).getAttribute("value");
			   System.out.println("Pickup street number is" + PickupStreetnumber);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[2]/div/input")).sendKeys("23");
			   DropoffStreetNumber = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[5]/div[2]/div/input")).getAttribute("value");
			   System.out.println("Dropoff street number is" + DropoffStreetNumber);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[6]/input")).sendKeys("Clarence st sydney nsw australia");
			   PickupStreetName = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[6]/input")).getAttribute("value");
			   System.out.println("Pickup street name is" + PickupStreetName);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[6]/input")).sendKeys("wentworth st greenacre nsw australia");
			   DropoffStreetName = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[6]/input")).getAttribute("value");
			   System.out.println("Drop off street name is" + DropoffStreetName);
			   driver.findElement(By.xpath(".//*[@id='pickup_notes']")).sendKeys("Pickup Notes entered");
			   PickupNotes = driver.findElement(By.xpath(".//*[@id='pickup_notes']")).getAttribute("value");
			   System.out.println("Pickup notes is" + PickupNotes);
			   driver.findElement(By.xpath(".//*[@id='drop_notes']")).sendKeys("Drop notes entered");
			  DropoffNotes = driver.findElement(By.xpath(".//*[@id='drop_notes']")).getAttribute("value");
			   System.out.println("Dropoff notes is" + DropoffNotes);
			   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div/textarea")).sendKeys("Described about the package");
			   DescribedNotes = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div/textarea")).getAttribute("value");
			   System.out.println("Described notes is" + DescribedNotes);
			  
	 }
	 
	 public void ExtraLargeApiservice(String Shipment) throws IOException, JSONException, InterruptedException{
		 GetQuote_CreateExtraLargeBidRequest(Shipment);
		 String token = "bearer" + " " + objToken.Tokenaccess("farji123@gmail.com", "123456");
	     URL url=new URL("https://api-staging.zoom2u.com/breeze/ExtraLargeQuoteRequest/SaveQuoteRequest");
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
objp.put("Quantity", "");
objp.put("LengthCm", "");
objp.put("WidthCm", "");
objp.put("HeightCm", "");
objp.put("ItemWeightKg", "");
objp.put("TotalWeightKg", "");
Items.put(objp);


RequestModel.put("FreightTitle", "");
RequestModel.put("TrailerType", "");
RequestModel.put("LoadType","FullLoad");
RequestModel.put("FreightValue", "");
RequestModel.put("SecurityIdCardNumber","");
RequestModel.put("PickupLocationPremisesType","y");
RequestModel.put("DropLocationPremisesType","y");
RequestModel.put("PickupLocationTailLiftType","None");
RequestModel.put("DropLocationTailLiftType","None");
RequestModel.put("PickupLocationTailLiftNotes", PickupNotes);
RequestModel.put("DropLocationTailLiftNotes" , DropoffNotes);
RequestModel.put("Status","Active");
RequestModel.put("Source","Deliveries");
RequestModel.put("FreightCategory",0);
RequestModel.put("OtherDetails","");

JSONObject PickupLocation = new JSONObject();
RequestModel.put("PickupLocation", PickupLocation);
PickupLocation.put("ContactName", Pickupname);
PickupLocation.put("Phone", PickupContact);
PickupLocation.put("Email", Pickupemail);
PickupLocation.put("Address", PickupStreetnumber + " " + PickupStreetName);
PickupLocation.put("Notes", "");
PickupLocation.put("GPSX","-33.8646468");
PickupLocation.put("GPSY", "151.20446200000004");
PickupLocation.put("UnitNumber", PickupUnitnumber);
PickupLocation.put("StreetNumber", PickupStreetnumber);
PickupLocation.put("Street", PickupStreetName);
PickupLocation.put("Suburb",  "Sydney");
PickupLocation.put("State", "NSW");
PickupLocation.put("Postcode", "2000");
PickupLocation.put("IsFlexible", false);


JSONObject DropoffLocation = new JSONObject();
RequestModel.put("DropLocation", DropoffLocation);
DropoffLocation.put("ContactName", Dropoffname);
DropoffLocation.put("Phone", DropoffContact);
DropoffLocation.put("Email", Dropoffemail);
DropoffLocation.put("Address", DropoffStreetNumber + " " + DropoffStreetName);
DropoffLocation.put("Notes", "");
DropoffLocation.put("GPSX","-33.8983538");
DropoffLocation.put("GPSY", "151.06848309999998");
DropoffLocation.put("UnitNumber", DropoffUnitnumber);
DropoffLocation.put("StreetNumber", DropoffStreetNumber);
DropoffLocation.put("Street", DropoffStreetName);
DropoffLocation.put("Suburb",  "Greenacre");
DropoffLocation.put("State", "NSW");
DropoffLocation.put("Postcode", "2190");
DropoffLocation.put("IsFlexible", false);


RequestModel.put("Vehicle", "");
RequestModel.put("PickupDateTime", "2018-01-26T22:00:00+05:30");
RequestModel.put("DropDateTime", "2018-01-26T23:00:00+05:30");
RequestModel.put("DeliverySpeed", "");
RequestModel.put("Price", 0);
RequestModel.put("Notes", DescribedNotes);
RequestModel.put("Distance", "");
RequestModel.put("IsInterstate", "");
RequestModel.put("BookingFee", 0);
RequestModel.put("createUserFlag", false);
RequestModel.put("customerType", "Deliveries");
RequestModel.put("isPayByInvoiceMarked", false);
RequestModel.put("IsRentContainer", false);
RequestModel.put("sendSmsToPickupPerson", false);

JSONArray ShipmentModel = new JSONArray();

JSONObject shipmentt = new JSONObject();
Mainjson.put("_shipmentModel", ShipmentModel);
shipmentt.put("Category", "XL");
shipmentt.put("Quantity", 1);
ShipmentModel.put(shipmentt);

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
		 ExtraLargeApiservice(Shipment);
		 JSONObject jssson = new JSONObject(response.toString());
		  String text = jssson.getString("requestId");
		  //System.out.println("text is ="+ text);
		  int requestID = Integer.parseInt(text);
		  //System.out.println("Request Id is =" + requestID);
		  
		  return requestID;
	 }
	
	
	
	
}
