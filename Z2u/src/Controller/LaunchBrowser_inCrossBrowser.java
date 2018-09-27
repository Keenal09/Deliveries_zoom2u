package Controller;

import java.awt.List;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.remote.server.handler.html5.SetSessionStorageItem;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import CommonLibraries.DriverClass;
import CommonLibraries.Login;
import bsh.Capabilities;

public class LaunchBrowser_inCrossBrowser{
       protected static RemoteWebDriver driver;
	   static String username = "steve%40zoom2u.com"; // Your username
	   static String authkey = "u531be937a8a0ac9";// Your authkey
	   //static String username = "dde%40gmail.com"; // Your username
	   //static String authkey = "u7e75c340e5bcad5";
	    static Login objj=new Login();
	    static String browser;
	    static String ModuleName;
	    static SessionId d;
	    public static void OpenBrowser(String browserType, String browserVersion, String platform, String Module) throws Exception {
	       ModuleName=Module;
            browser=browserType;
	        DesiredCapabilities caps = new DesiredCapabilities();
	        
	        caps.setCapability("name", ModuleName);
	        caps.setCapability("build", "1.0");
	        caps.setCapability("browserName", browser);
	        caps.setCapability("version", browserVersion);
	        caps.setCapability("platform", platform);
	        caps.setCapability("screenResolution", "1366x768");
	        caps.setCapability("record_video", "true");
            
	        
	        driver = new RemoteWebDriver(new URL("http://" + username + ":" + authkey +"@hub.crossbrowsertesting.com:80/wd/hub"), caps);
	        System.out.println(driver.getSessionId());
	        //d = driver.getSessionId();
	        
	        driver.manage().timeouts().implicitlyWait(3600, TimeUnit.SECONDS);
	        
	        
	        
	        driver.get(objj.url("https://deliveries-staging.zoom2u.com/#/login"));
			   driver.manage().window().maximize();
			   //Thread.sleep(10000);
	
	
}      
	    /*
	    public static void Newsession(){
	    	
	    	if(d==null){
	        	driver.getSessionId();
	        	System.out.println("Session id is" + driver.getSessionId());
	        }
	    	
	    }*/
	    	    public static void driverclose(){
	    	
	    	driver.quit();
	    }
	    
	    
}
