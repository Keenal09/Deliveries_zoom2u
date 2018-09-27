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

import Controller.MAB_Scenarios;

public class MAB_NewDistanceCalculat extends MAB_Scenarios{

	public static void main(String[] args) throws JSONException, IOException {
		// TODO Auto-generated method stub
		//String key = "AIzaSyBEUY3SxgChFlmriALZovvSAaMpO-3ceew";
		//String pickupStreetnumber = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='pick_streetNo']")).getAttribute("value");
		//String pickupStreetname = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='pick_street']")).getAttribute("value");
		//String pickupvalue = pickupStreetnumber + " " + pickupStreetname;
		//String dropoffstreetnumber = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='drop_streetNo']")).getAttribute("value");
		//String dropoffstreetname = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='drop_street']")).getAttribute("value");
		//String dropoffvalue = dropoffstreetnumber + " " + dropoffstreetname;
		java.net.URL url = new java.net.URL("https://maps.googleapis.com/maps/api/directions/json?origin=" + URLEncoder.encode("45 clarence street nsw australia", "UTF-8") +"&destination=" +  URLEncoder.encode("23 wentworth street greenacre nsw australia", "UTF-8") +"&alternatives=true&mode=driving");
		URLConnection conn = url.openConnection();

		// parent /***** JsonObject to pass in body
		ByteArrayOutputStream output = new ByteArrayOutputStream(1024);  
		IOUtils.copy(conn.getInputStream(), output);  
		output.close();
		String s = output.toString(); 
		double Dis;
		//System.out.println();
		JSONObject jObj = new JSONObject(output.toString());

		//System.out.println("jsonobject is" +jObj);
		JSONArray jArray = jObj.getJSONArray("routes"); 
		//String distance = jArray.getJSONObject(0).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
		//String distance1 = jArray.getJSONObject(1).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
		//String distance2 = jArray.getJSONObject(2).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
        ArrayList<Double> arrayOfDistance = new ArrayList<Double>();
		for(int i=0;i<jArray.length();i++){
    		String distance = jArray.getJSONObject(i).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
    		//System.out.println("Distance is =" + distance);
    		String[] dd =distance.split(" km");
    		//System.out.println("distance is =" + dd[0]);
    		double distancce = Double.parseDouble((dd[0]));
    		//System.out.println("DEv is" + distancce);
    		arrayOfDistance.add(distancce);
    		
    		//Dis = distancce;

        }
		double Shortdistance = 0;
		
		//System.out.println("Array out of ="+ arrayOfDistance.size());
		
		for(int i=0;i<arrayOfDistance.size();i++){
			
			//double Shortdistance=2000;
			
			for(int j=i+1;j<arrayOfDistance.size();j++){
				
				if(arrayOfDistance.get(i)<arrayOfDistance.get(j)){
					
					Shortdistance = arrayOfDistance.get(i);
					break;
				}
				
			}
		}
		System.out.println("Shortest distance is=" + Shortdistance);
		//System.out.println("Distance 1 is =" + distance1);

		//System.out.println("Distance 2 is =" + distance2);

		//String[] dd =distance.split(" km");
		//System.out.println("distance is =" + dd[0]);
		//double distancce = Double.parseDouble((dd[0]));
		//System.out.println("ddistance is =" + distancce);
		
		}


	}


