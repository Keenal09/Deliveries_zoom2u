package Test;

import org.testng.annotations.Test;

import Controller.LaunchBrowser_inCrossBrowser;
import Controller.MAB_Scenarios;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class MABTest2 extends MAB_Scenarios {
	LoginCredentialsfor_Login objMABLogin = new LoginCredentialsfor_Login();

  @Test (priority=1)
  public void f() throws JSONException, IOException, InterruptedException {
		 objMABLogin.MABopen("farji123@gmail.com", "123456");
		 SamestatePriceverification("12pm_2pm");
	     driver.navigate().refresh();
	  SamestatePriceverification("2pm_3pm");
	     driver.navigate().refresh(); 

		//  SamestatePriceverification("5pm_12am");
		 //driver.navigate().refresh();
		

	  
  }
  
  
  @Test (priority = 2)
  public void MAB12() throws JSONException, IOException, InterruptedException{
	  
	Images_ForLargeContainerandFullTruckload();

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
