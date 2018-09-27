package RequiredClassesfor_EachModule;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InterstateDistCalculation {
     
	String key = "AIzaSyDwAkeJlWfIp3AGWx41Cd2dfbwESpCDdws";
	
	
	public double BookingDistancePick_Airport(String PickupAddress, String DropoffAddress) throws IOException, JSONException {
		double Shortdistance = 0;

		java.net.URL FirstBookingurl = new java.net.URL("https://maps.googleapis.com/maps/api/directions/json?origin=" + URLEncoder.encode(PickupAddress, "UTF-8")  +"&destination="+URLEncoder.encode(DropoffAddress, "UTF-8")
		+ "&alternatives=true&mode=driving&key=" + key);
		URLConnection conn = FirstBookingurl.openConnection();
		
		// parent /***** JsonObject to pass in body
		ByteArrayOutputStream output = new ByteArrayOutputStream(1024);  
		IOUtils.copy(conn.getInputStream(), output);  
		output.close();
		String s = output.toString(); 
		//System.out.println();
		JSONObject jObj = new JSONObject(output.toString());
		
		//System.out.println("jsonobject is" +jObj);
		JSONArray jArray = jObj.getJSONArray("routes"); 
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
	
	
	
	public double BookingDistanceAirport_Drop(String PickupAddress,String DropoffAddress) throws JSONException, IOException {
		double Shortdistance = 0;

		 java.net.URL SecondBookingurl = new java.net.URL("https://maps.googleapis.com/maps/api/directions/json?origin=" + URLEncoder.encode(PickupAddress, "UTF-8")  +"&destination="+URLEncoder.encode(DropoffAddress, "UTF-8")
			+ "&alternatives=true&mode=driving&key=" + key);
			URLConnection conn2 = SecondBookingurl.openConnection();
			
			// parent /***** JsonObject to pass in body
			ByteArrayOutputStream output2 = new ByteArrayOutputStream(1024);  
			IOUtils.copy(conn2.getInputStream(), output2);  
			output2.close();
			String s2 = output2.toString(); 
			//System.out.println(s2);
			JSONObject jObj2 = new JSONObject(output2.toString());
			
			//System.out.println("jsonobject is" +jObj2);
			JSONArray jArray2 = jObj2.getJSONArray("routes"); 
			ArrayList<Double> arrayOfDistance = new ArrayList<Double>();
			//System.out.println("calculation is running"+);
			for(int i=0;i<jArray2.length();i++){
				String distance = jArray2.getJSONObject(i).getJSONArray("legs").getJSONObject(0).getJSONObject("distance").getString("text");
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
