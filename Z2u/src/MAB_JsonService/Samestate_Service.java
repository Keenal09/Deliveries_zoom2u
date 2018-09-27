package MAB_JsonService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import CommonLibraries.BearerTokengetService;

public class Samestate_Service {
	StringBuffer response;
	BearerTokengetService objToken = new BearerTokengetService();

	public void SamestateBooking() throws JSONException, IOException, InterruptedException{
		
		 String token = "bearer" + " " + objToken.Tokenaccess("farji123@gmail.com", "123456");
	     URL url=new URL("https://api-staging.zoom2u.com/breeze/customer/SaveDeliveryRequest");
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
RequestModel.put("PickupLocationTailLiftNotes", "");
RequestModel.put("DropLocationTailLiftNotes" , "");
RequestModel.put("Status","Active");
RequestModel.put("Source","Deliveries");
RequestModel.put("FreightCategory",10);
RequestModel.put("OtherDetails","");

JSONObject PickupLocation = new JSONObject();
RequestModel.put("PickupLocation", PickupLocation);
PickupLocation.put("ContactName", "test 334");
PickupLocation.put("Phone", "987654321");
PickupLocation.put("Email", "test@gmail.com");
PickupLocation.put("Address", "unit 1, 23 Wentworth St, Greenacre NSW, Australia");
PickupLocation.put("Notes", "hey rajat");
PickupLocation.put("GPSX","-33.8983538");
PickupLocation.put("GPSY", "151.06848309999998");
PickupLocation.put("UnitNumber", "unit 1");
PickupLocation.put("StreetNumber", "23");
PickupLocation.put("Street", "Wentworth St, Greenacre NSW, Australia");
PickupLocation.put("Suburb",  "Greenacre");
PickupLocation.put("State", "NSW");
PickupLocation.put("Postcode", "2190");
PickupLocation.put("IsFlexible", false);


JSONObject DropoffLocation = new JSONObject();
RequestModel.put("DropLocation", DropoffLocation);
DropoffLocation.put("ContactName", "test 334");
DropoffLocation.put("Phone", "987654321");
DropoffLocation.put("Email", "test@gmail.com");
DropoffLocation.put("Address", "unit 1, 23 Wentworth St, Greenacre NSW, Australia");
DropoffLocation.put("Notes", "hey rajat");
DropoffLocation.put("GPSX","-33.8983538");
DropoffLocation.put("GPSY", "151.06848309999998");
DropoffLocation.put("UnitNumber", "unit 1");
DropoffLocation.put("StreetNumber", "23");
DropoffLocation.put("Street", "Wentworth St, Greenacre NSW, Australia");
DropoffLocation.put("Suburb",  "Greenacre");
DropoffLocation.put("State", "NSW");
DropoffLocation.put("Postcode", "2190");
DropoffLocation.put("IsFlexible", false);


RequestModel.put("Vehicle", "Bike");
RequestModel.put("PickupDateTime", "2018-04-16T22:00:00+05:30");
RequestModel.put("DropDateTime", "2018-04-16T23:00:00+05:30");
RequestModel.put("DeliverySpeed", "Same day");
RequestModel.put("Price", 11);
RequestModel.put("Notes", "");
RequestModel.put("Distance", "0 km");
RequestModel.put("IsInterstate", false);
RequestModel.put("BookingFee", 1);
//RequestModel.put("createUserFlag", false);
//RequestModel.put("customerType", "Deliveries");
RequestModel.put("isPayByInvoiceMarked", false);
RequestModel.put("IsRentContainer", false);
RequestModel.put("sendSmsToPickupPerson", false);
RequestModel.put("IsSuggestedPrice", false);
RequestModel.put("source", "Deliveries");
RequestModel.put("Weight", 0);

JSONObject Interstatemodel = new JSONObject();
RequestModel.put("_interstateModel", Interstatemodel);

JSONArray ShipmentModel = new JSONArray();
JSONObject objp1=new JSONObject();
objp1.put("Category", "Documents");
objp1.put("Quantity", 1);
objp1.put("Value", 10);
ShipmentModel.put(objp1);


Mainjson.put("_deliveryRequestModel", RequestModel);
Mainjson.put("_shipmentModel", ShipmentModel);

OutputStreamWriter output=new OutputStreamWriter(httpcon.getOutputStream());
System.out.println("output is" + output);
output.write(Mainjson.toString());
output.flush();

System.out.println(Mainjson);

int responseCode = httpcon.getResponseCode();
System.out.println(responseCode);
BufferedReader in = new BufferedReader(
        new InputStreamReader(httpcon.getInputStream()));
String inputLine;
response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
	response.append(inputLine);
}
in.close();
	}
	
	public long Bookingref() throws JSONException, IOException, InterruptedException{
SamestateBooking();		
JSONObject jssson = new JSONObject(response.toString());
String text = jssson.getString("BookingRef");
System.out.println("text is ="+ text);
String text1 = text.replaceAll("Z", "");
//System.out.println("text 1 is " + text1);
long bookingref = Long.parseLong(text1);

return bookingref;
//print in String
	 
	}
	

}
