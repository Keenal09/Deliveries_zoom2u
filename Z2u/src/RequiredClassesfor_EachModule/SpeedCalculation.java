package RequiredClassesfor_EachModule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;

import CommonLibraries.BearerTokengetService;
import CommonLibraries.GetQuoteLocators;
import Controller.LaunchBrowser_inCrossBrowser;


public class SpeedCalculation extends LaunchBrowser_inCrossBrowser{
	
	GetQuoteLocators getquote = new GetQuoteLocators();
	
	 StringBuffer response;
	 BearerTokengetService objToken = new BearerTokengetService();

	
	public void DeliverySpeed() throws JSONException, IOException, InterruptedException{
		String token1 = objToken.Tokenaccess("farji123@gmail.com", "123456");
		//System.out.println("token value is"+ token1);
		
		String token = "bearer" + " " + token1 ;
		
	
	URL url=new URL("https://api-staging.zoom2u.com/breeze/pricing/IntrastateQuote");
    HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
    httpcon.setDoOutput(true);
    httpcon.setRequestMethod("POST");
    httpcon.setRequestProperty("Accept", "application/json");
    httpcon.setRequestProperty("Content-Type", "application/json");
    httpcon.setRequestProperty("Authorization", token);
 JSONObject nameValuePairs = new JSONObject();
 nameValuePairs.put("PickupAddress", "45 Clarence Street Sydney NSW Australia");
nameValuePairs
        .put("PickupSuburb", "Sydney");
nameValuePairs.put("PickupState", "NSW");
nameValuePairs.put("DropAddress","23 Wentworth St, Greenacre, New South Wales, Australia");
nameValuePairs.put("DropSuburb", "Greenacre");
nameValuePairs.put("DropState", "NSW");

JSONArray array=new JSONArray();
JSONObject objp=new JSONObject();
objp.put("Category", "Documents");
objp.put("Quantity", 1);
objp.put("Value", 10);
array.put(objp);
nameValuePairs.put("Shipments", array);
nameValuePairs.put("PickupDateTime", "2018-10-01T13:37:00+05:30");
nameValuePairs.put("CurrentDateTime", "2018-03-31T13:22:09+05:30");
nameValuePairs.put("DistanceInMeters", 0);
nameValuePairs.put("Customer", nameValuePairs.NULL);

OutputStreamWriter output=new OutputStreamWriter(httpcon.getOutputStream());
//System.out.println("output is" + output);
output.write(nameValuePairs.toString());
output.flush();

//System.out.println(nameValuePairs);

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
	
	public String DeliveryOption1() throws JSONException, IOException, InterruptedException {
		
		DeliverySpeed();
		JSONObject jobjk =new JSONObject(response.toString());
		JSONArray jsonarray = jobjk.getJSONArray("QuoteOptions");
		//System.out.println("json arrray is =" + jsonarray);
		String speed = jsonarray.getJSONObject(0).getString("DeliverySpeed");
		System.out.println("Speed 1 is" + speed);
		return speed;
		
	}

	
public String DeliveryOption2() throws JSONException, IOException, InterruptedException {
		
		DeliverySpeed();
		JSONObject jobjk =new JSONObject(response.toString());
		JSONArray jsonarray = jobjk.getJSONArray("QuoteOptions");
		//System.out.println("json arrray is =" + jsonarray);
		String speed = jsonarray.getJSONObject(1).getString("DeliverySpeed");
		System.out.println("Speed 2 is" + speed);
		return speed;
		
	}

public String DeliveryOption3() throws JSONException, IOException, InterruptedException {
	
	DeliverySpeed();
	JSONObject jobjk =new JSONObject(response.toString());
	JSONArray jsonarray = jobjk.getJSONArray("QuoteOptions");
	//System.out.println("json arrray is =" + jsonarray);
	String speed = jsonarray.getJSONObject(2).getString("DeliverySpeed");
	System.out.println("Speed 3 is" + speed);
	return speed;
	
}

public String DeliveryOption4() throws JSONException, IOException, InterruptedException {
	
	DeliverySpeed();
	JSONObject jobjk =new JSONObject(response.toString());
	JSONArray jsonarray = jobjk.getJSONArray("QuoteOptions");
	//System.out.println("json arrray is =" + jsonarray);
	String speed = jsonarray.getJSONObject(3).getString("DeliverySpeed");
	System.out.println("Speed 4 is" + speed);
	return speed;
	
}
	
}
