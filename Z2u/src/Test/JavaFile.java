package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import bsh.Parser;

public class JavaFile {

	public static void main(String[] args) throws JSONException, IOException {
		// TODO Auto-generated method stub
		 URL url=new URL("https://api-staging.zoom2u.com/breeze/pricing/IntrastateQuote");
	        HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
	        httpcon.setDoOutput(true);
	        httpcon.setRequestMethod("POST");
	        httpcon.setRequestProperty("Accept", "application/json");
	        httpcon.setRequestProperty("Content-Type", "application/json");
	        httpcon.setRequestProperty("Authorization", "bearer ni6hrefnT_dk5KLfHoIz_A96QvOtlIpBA5RSnBfRyBurmDau98Qs1dESZQMkGMRramcf7jadZiOtJhE_rNu4OamEQNHT7GWwlpTBcDcMk2Y-WVXaAI1fdTEyDTz_BuJTKx-q9B2-19rlibT_HuqGGRlVItvW_5oLvNFvEN1lOJMV7lLVVWeOPGwKPgm_pKVxgpbYPraCJWFy8-zXwBsxVxfKRzVgE-G_LR8Z94jmfKzeFw8LETqjeEEfzFzy3XuJlqXdChyh1nvzQX6XIOr7aRe7ertZ_pXQ3E7CI44bZ_lpg2ggga96Y_WNMfyRyF8rmLYtMEO09TM08wxrRwSyH15unh6nIRvfaZKQUirKQFVMmVdWbo6kN9Chm0VoNM_ep0NgOQidddo0z51upKJGNRNoAu8");
		 JSONObject nameValuePairs = new JSONObject();
   	  nameValuePairs.put("PickupAddress", "45 Clarence Street, Sydney, New South Wales, Australia");
        nameValuePairs
                .put("PickupSuburb", "Sydney");
       nameValuePairs.put("PickupState", "NSW");
        nameValuePairs.put("DropAddress",
      		  "23 Wentworth St, Greenacre, New South Wales, Australia");
        nameValuePairs.put("DropSuburb", "Greenacre");
        nameValuePairs.put("DropState", "NSW");
        
        JSONArray array=new JSONArray();
        JSONObject objp=new JSONObject();
        objp.put("Category", "Documents");
        objp.put("Quantity", 1);
        array.put(objp);
        nameValuePairs.put("Shipments", array);
        nameValuePairs.put("PickupDateTime", "2018-01-19T13:37:00+05:30");
        nameValuePairs.put("CurrentDateTime", "2018-01-19T13:38:43+05:30");
        nameValuePairs.put("DistanceInMeters", 0);
        nameValuePairs.put("Customer","null");
        
        OutputStreamWriter output=new OutputStreamWriter(httpcon.getOutputStream());
        System.out.println("output is" + output);
        output.write(nameValuePairs.toString());
        output.flush();
      
        System.out.println(nameValuePairs);
       
        int responseCode = httpcon.getResponseCode();
        System.out.println(responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(httpcon.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
        	response.append(inputLine);
        }
        in.close();
        //print in String
        JSONObject jobjk =new JSONObject(response.toString());
        JSONArray jsonarray = jobjk.getJSONArray("QuoteOptions");
        System.out.println("json arrray is =" + jsonarray);
        String speed = jsonarray.getJSONObject(0).getString("DeliverySpeed");
        System.out.println("Speed is" + speed);
        String speed1 = jsonarray.getJSONObject(1).getString("DeliverySpeed");
        System.out.println("Speed1 is" + speed1);
        String speed2 = jsonarray.getJSONObject(2).getString("DeliverySpeed");
        System.out.println("Speed2 is" + speed2);
        String speed3 = jsonarray.getJSONObject(3).getString("DeliverySpeed");
        System.out.println("Speed3 is" + speed3);
       
        
      
    

	}

}
