package RequiredClassesfor_EachModule;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.*;
import org.apache.commons.io.IOUtils;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.google.gson.JsonObject;

import CommonLibraries.GetQuoteLocators;
import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;

import org.json.*;
import org.openqa.selenium.By;

import netscape.javascript.JSObject;


public class DistanceCalculation extends LaunchBrowser_inCrossBrowser {
	
	GetQuoteLocators NewQuote = new GetQuoteLocators();
			
	
	public static double Distancalculated() throws IOException, JSONException {
		
		String key = "AIzaSyCATVPaXErgxJBx232RBPOO6dQrniAkbnI";
		String pickupaddress = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[1]/div/input[2]")).getAttribute("value");
		String dropoffaddress = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[2]/div/input[2]")).getAttribute("value");
		java.net.URL url = new java.net.URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + URLEncoder.encode(pickupaddress, "UTF-8")  +"&destinations="+URLEncoder.encode(dropoffaddress, "UTF-8")
		+ "&mode=driving&key=" + key);
		URLConnection conn = url.openConnection();
		
		// parent /***** JsonObject to pass in body
		ByteArrayOutputStream output = new ByteArrayOutputStream(1024);  
		IOUtils.copy(conn.getInputStream(), output);  
		output.close();
		String s = output.toString(); 
		//System.out.println();
		JSONObject jObj = new JSONObject(output.toString());
		
		//System.out.println("jsonobject is" +jObj);
		JSONArray jArray = jObj.getJSONArray("rows"); 
		String distance = jArray.getJSONObject(0).getJSONArray("elements").getJSONObject(0).getJSONObject("distance").getString("text");
        //System.out.println("Distance is =" + distance);
        String[] dd =distance.split(" km");
        //System.out.println("distance is =" + dd[0]);
        double distancce = Double.parseDouble((dd[0]));
        //System.out.println("ddistance is =" + distancce);
        return distancce;
	}

}
