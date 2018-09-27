package Test;

import org.testng.annotations.Test;

import Controller.LaunchBrowser_inCrossBrowser;
import Controller.MAB_Scenarios;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class MABTest5 extends MAB_Scenarios {
	
	LoginCredentialsfor_Login objMABLogin = new LoginCredentialsfor_Login();

  @Test
  public void f() throws IOException, JSONException, InterruptedException, ParseException {
	  
	  objMABLogin.MABopen("farji123@gmail.com", "123456");
		
		ETAVerificationfor_SameState("12pm_2pm");
		driver.navigate().refresh();
		ETAVerificationfor_SameState("2pm_5pm");
		//driver.navigate().refresh();
		//ETAVerificationfor_SameState("5pm_12am");

  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "MABTest");

  }

  @AfterTest
  public void afterTest() {
	  
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
