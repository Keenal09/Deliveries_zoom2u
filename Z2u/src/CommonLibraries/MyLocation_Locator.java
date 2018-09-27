package CommonLibraries;

public class MyLocation_Locator {
	
	
	public String MyLocation_MenuinHamburger(){
		
		String MyLocation = ".//*[@id='nav']/li[2]/ul/li[1]/a/span";
		return MyLocation;
	}
	public String MyLocationList_FirstEntryLocator(){
		
		String FirstLocation = ".//*[@id='content']/div/div/table/tbody/tr[1]/td[1]";
		return FirstLocation;
	}
	
	public String MyLocationList_SixthEntryLocator(){
		
		String SixthLocation = ".//*[@id='content']/div/div/table/tbody/tr[6]/td[1]";
		return SixthLocation;
	}
	
	public String MyLocationDetail_ContactnameLocator(){
		
		String Contactname = ".//*[@id='content']/div/div[1]/form/div[1]/div[2]/div[1]/div[1]/input";
		return Contactname;
	}
	
public String MyLocationDetail_ContactEmail(){
		
		String ContactEmail = ".//*[@id='content']/div/div[1]/form/div[1]/div[2]/div[1]/div[2]/input";
		return ContactEmail;
	}
public String MyLocationDetail_ContactPhonenumberLocator(){
	
	String ContactPhone = ".//*[@id='content']/div/div[1]/form/div[1]/div[2]/div[1]/div[3]/input";
	return ContactPhone;
}
public String MyLocationDetail_ContactUnitnumberLocator(){
	
	String ContactUnitnumber = ".//*[@id='content']/div/div[1]/form/div[1]/div[2]/div[1]/div[4]/div[1]/div/input";
	return ContactUnitnumber;
}
public String MyLocationDetail_ContactStreetnumberLocator(){
	
	String ContactStreetnumber = ".//*[@id='content']/div/div[1]/form/div[1]/div[2]/div[1]/div[4]/div[2]/div/input";
	return ContactStreetnumber;
}
public String MyLocationDetail_ContactStreetnameLocator(){
	
	String Contactstreetname = ".//*[@id='content']/div/div[1]/form/div[1]/div[2]/div[1]/div[5]/input";
	return Contactstreetname;
}
public String MyLocationDetail_ContactNotesLocator(){
	
	String Contactnotes = ".//*[@id='content']/div/div[1]/form/div[1]/div[2]/div[1]/div[6]/textarea";
	return Contactnotes;
}
public String MyLocationDetail_SaveLocationbtn(){
	
	String SaveLocationbtn = ".//*[@id='content']/div/div[2]/button[1]";
	return SaveLocationbtn;
}
public String MyLocationDetail_Cancelbtn(){
	
	String Cancelbtn = ".//*[@id='content']/div/div[2]/button[2]";
	return Cancelbtn;
}

}
