package Test;

import org.testng.annotations.Test;

import Controller.LaunchBrowser_inCrossBrowser;
import Controller.MAB_Scenarios;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class MABTest7 extends MAB_Scenarios {
	
	LoginCredentialsfor_Login objMABLogin = new LoginCredentialsfor_Login();

  @Test
  public void f() throws InterruptedException, IOException, JSONException {
	  objMABLogin.MABopen("farji123@gmail.com", "123456");
  
	  InterstatePriceVerification("NSW", "SA");
	  driver.navigate().refresh();
	  InterstatePriceVerification("NSW", "WA");
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "MABTest");

  }

  @AfterTest
  public void afterTest() {
  }

}
