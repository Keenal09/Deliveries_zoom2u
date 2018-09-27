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

public class MABTest4 extends MAB_Scenarios {

	LoginCredentialsfor_Login objMABLogin = new LoginCredentialsfor_Login();

@Test (priority=1)
  public void f() throws IOException, JSONException, InterruptedException, ParseException {
	
	objMABLogin.MABopen("farji123@gmail.com", "123456");
	
	ETAVerificationfor_SameState("12am_8am");
	driver.navigate().refresh();
	ETAVerificationfor_SameState("8am_12pm");
	//driver.navigate().refresh();
	//ETAVerificationfor_SameState("12pm_2pm");

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
