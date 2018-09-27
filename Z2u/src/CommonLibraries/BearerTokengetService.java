package CommonLibraries;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.json.JSONException;
import org.json.JSONObject;

public class BearerTokengetService {
	StringBuffer response;
	public void GetToken(String Email,String Password) throws IOException{
    String urlParameters  = "grant_type=password&username="+Email+"&password="+Password;
    byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
    int postDataLength = postData.length;
	URL url=new URL("https://api-staging.zoom2u.com/token");
    HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
    httpcon.setDoOutput(true);
    httpcon.setRequestMethod("POST");
    httpcon.setRequestProperty("Accept", "application/json");
    httpcon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    httpcon.setRequestProperty("charset", "utf-8");
    httpcon.setRequestProperty("Content-Length", Integer.toString(postDataLength));
    httpcon.setUseCaches(false);
    try(DataOutputStream wr = new DataOutputStream(httpcon.getOutputStream())) {
    	   wr.write(postData);
    	}
    
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
	}
	
	 public String Tokenaccess(String Email, String Password) throws JSONException, IOException, InterruptedException{
		 GetToken(Email, Password);
		 JSONObject jssson = new JSONObject(response.toString());
		  String text = jssson.getString("access_token");
		  //System.out.println("text is ="+ text);
		  
		  
		  return text;
	 }
}
