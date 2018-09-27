package Controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StateValueService {
	String key = "AIzaSyBQPFFqPZBL5iH60TdlZNyHoxQXyuCa5WM ";
	public String PickupAddressService(String PickupAddress) throws IOException, JSONException{
		
		java.net.URL url = new java.net.URL("https://maps.googleapis.com/maps/api/geocode/json?&address=" + URLEncoder.encode(PickupAddress, "UTF-8") + "&key=" + key);
		URLConnection conn = url.openConnection();
		ByteArrayOutputStream output = new ByteArrayOutputStream(1024);  
		IOUtils.copy(conn.getInputStream(), output); 
		output.close();
		String s = output.toString(); 
		//System.out.println(s);
		JSONObject jObj = new JSONObject(output.toString());
		//System.out.println("jsonobject is" +jObj);
		JSONArray jArray = jObj.getJSONArray("results");
		JSONArray jA = jArray.getJSONObject(0).getJSONArray("address_components");
		String longName = "";
		String Shortname = "";
		for (int i=0;i<jA.length();i++){
			
			JSONArray jAA = jA.getJSONObject(i).getJSONArray("types");
			String jsson = jAA.getString(0);
			//System.out.println("JAAAAA is =" + jsson);
			if(jsson.contains("administrative_area_level_1")){
				
				longName = jA.getJSONObject(i).getString("long_name");
				Shortname = jA.getJSONObject(i).getString("short_name");
				//System.out.println("looong name is" + longName);
				//System.out.println("Shooo name is" + Shortname);
				break;
			}
			
				
			
		}
		
		//System.out.println("lllllonf name is=" + longName);
		
		  
		
		return Shortname;

		 
		
	}
	
public String DropoffAddressService(String DropoffAddress) throws IOException, JSONException{
		
		java.net.URL url = new java.net.URL("https://maps.googleapis.com/maps/api/geocode/json?&address=" + URLEncoder.encode(DropoffAddress, "UTF-8") + "&key=" + key);
		URLConnection conn = url.openConnection();
		ByteArrayOutputStream output = new ByteArrayOutputStream(1024);  
		IOUtils.copy(conn.getInputStream(), output); 
		output.close();
		String s = output.toString(); 
		String Shortname =  "";
		//System.out.println(s);
		JSONObject jObj = new JSONObject(output.toString());
		//System.out.println("jsonobject is" +jObj);
		JSONArray jArray = jObj.getJSONArray("results"); 
		JSONArray jA = jArray.getJSONObject(0).getJSONArray("address_components");
		String longName = "";
		for (int i=0;i<jA.length();i++){
			
			JSONArray jAA = jA.getJSONObject(i).getJSONArray("types");
			String jsson = jAA.getString(0);
			//System.out.println("JAAAAA is =" + jsson);
			if(jsson.contains("administrative_area_level_1")){
				
				longName = jA.getJSONObject(i).getString("long_name");
			    Shortname = jA.getJSONObject(i).getString("short_name");
				//System.out.println("looong name is" + longName);
				//System.out.println("Shooo name is" + Shortname);
				break;
			}
			
				
			
		}
		
		//System.out.println("lllllonf name is=" + longName);
		
		  
		
		return Shortname;

		 
		
	}
	
}
