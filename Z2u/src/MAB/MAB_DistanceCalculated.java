package MAB;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;

import CommonLibraries.MakeaBookingLocator;
import Controller.MAB_Scenarios;

public class MAB_DistanceCalculated extends MAB_Scenarios {
	
	MakeaBookingLocator objMAB = new MakeaBookingLocator();
	
public static double Distancalculated() throws IOException, JSONException {
	double Shortdistance = 0;
String key = "AIzaSyDKqly97o0hJ5qPkDTkwAVeHdV9hc1qGfs";
String pickupStreetnumber = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='pick_streetNo']")).getAttribute("value");
String pickupStreetname = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='pick_street']")).getAttribute("value");
String pickupvalue = pickupStreetnumber + " " + pickupStreetname;
String dropoffstreetnumber = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='drop_streetNo']")).getAttribute("value");
String dropoffstreetname = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='drop_street']")).getAttribute("value");
String dropoffvalue = dropoffstreetnumber + " " + dropoffstreetname;
java.net.URL url = new java.net.URL("https://maps.googleapis.com/maps/api/directions/json?origin=" + URLEncoder.encode(pickupvalue, "UTF-8") +"&destination=" +  URLEncoder.encode(dropoffvalue, "UTF-8") +"&alternatives=true&mode=driving&key="+key);
URLConnection conn = url.openConnection();

// parent /***** JsonObject to pass in body
ByteArrayOutputStream output = new ByteArrayOutputStream(1024);  
IOUtils.copy(conn.getInputStream(), output);  
output.close();
String s = output.toString(); 
//double Dis;
//System.out.println();
JSONObject jObj = new JSONObject(output.toString());

//System.out.println("jsonobject is" +jObj);
JSONArray jArray = jObj.getJSONArray("routes"); 
//String distance = jArray.getJSONObject(0).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
//String distance1 = jArray.getJSONObject(1).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
//String distance2 = jArray.getJSONObject(2).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
ArrayList<Double> arrayOfDistance = new ArrayList<Double>();
//System.out.println("calculation is running"+);
for(int i=0;i<jArray.length();i++){
	String distance = jArray.getJSONObject(i).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
	System.out.println("Distance is =" + distance);
	String[] dd =distance.split(" km");
	System.out.println("distance is =" + dd[0]);
	double distancce = Double.parseDouble((dd[0]));
	System.out.println("DEv is" + distancce);
	arrayOfDistance.add(distancce);
	
	//Dis = distancce;

}


System.out.println("Array out of ="+ arrayOfDistance.size());
double minvalue = arrayOfDistance.get(0);
for(int i=1;i<arrayOfDistance.size();i++){
	
	//double Shortdistance=2000;
	
	if(arrayOfDistance.get(i) < minvalue){
		  minvalue = arrayOfDistance.get(i);
		}
				
	}

System.out.println("Shortest distance is" + minvalue);
//System.out.println("Distance 1 is =" + distance1);

//System.out.println("Distance 2 is =" + distance2);

//String[] dd =distance.split(" km");
//System.out.println("distance is =" + dd[0]);
//double distancce = Double.parseDouble((dd[0]));
//System.out.println("ddistance is =" + distancce);

return minvalue;
}


}
