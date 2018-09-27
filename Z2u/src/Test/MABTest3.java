package Test;

import org.testng.annotations.Test;

import Controller.LaunchBrowser_inCrossBrowser;
import Controller.MAB_Scenarios;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class MABTest3 extends MAB_Scenarios {
	
	LoginCredentialsfor_Login objMABLogin = new LoginCredentialsfor_Login();

  @Test (priority = 1)
  public void MAB21() throws JSONException, IOException, InterruptedException {
	objMABLogin.MABopen("farji123@gmail.com", "123456");

	  SamestatePriceverification("After 3pm");
		driver.navigate().refresh();
	  SamestatePriceverification("After 5pm");
  }
  
  @Test (priority = 2)
  public void MAB12() throws JSONException, IOException, InterruptedException{
	  
	Images_ForLargeItems();

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
