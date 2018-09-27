package CommonLibraries;

import org.openqa.selenium.By;

import Controller.LaunchBrowser_inCrossBrowser;

public class MAB_Addressforeachstate extends LaunchBrowser_inCrossBrowser {

	MakeaBookingLocator objMAB = new MakeaBookingLocator();
public String PickNSWState(){
		
		String Sydcity = "45 Clarence Street Sydney NSW Australia";
		driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Sydcity);
		return Sydcity;
	}
	
	public String PickVICState(){
		
		String Melcity = "328 Swanston street Melbourne VIC Australia";
		driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Melcity);
		return Melcity;
	}
	
public String PickQLDState(){
		
		String Bricity = "46 queen street brisbane QLD Australia";
		driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(Bricity);
		return Bricity;
	}

public String PickACTState(){
	
	String CanCity = "101-103 London circuit Canberra Australia";
	driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(CanCity);
	return CanCity;
}

public String PickSAState(){
	
	String AdeCity = "102-114 Grenfell St Adelaide SA 5000 Australia";
	driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(AdeCity);
	return AdeCity;
}

public String PickWAState(){
	
	String PerthCity = "167-201 William St Northbridge WA 6003, Australia";
	driver.findElement(By.xpath(objMAB.Pickupaddresstextfield_Pickupdetails())).sendKeys(PerthCity);
	return PerthCity;
}

public String DropNSWState(){
	
	String Sydcity = "45 Clarence Street Sydney NSW Australia";
	driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys(Sydcity);
	return Sydcity;
}

public String DropVICState(){
	
	String Melcity = "328 Swanston street Melbourne VIC Australia";
	driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys(Melcity);
	return Melcity;
}

public String DropQLDState(){
	
	String Bricity = "46 queen street brisbane QLD Australia";
	driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys(Bricity);
	return Bricity;
}

public String DropACTState(){

String CanCity = "101-103 London circuit Canberra Australia";
driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys(CanCity);
return CanCity;
}

public String DropSAState(){

String AdeCity = "439-435 Morphett St Adelaide SA 5000, Australia";
driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys(AdeCity);
return AdeCity;
}

public String DropWAState(){

String PerthCity = "167-201 William St Northbridge WA 6003, Australia";
driver.findElement(By.xpath(objMAB.Dropoffaddresstextfield_Dropoffdetails())).sendKeys(PerthCity);
return PerthCity;
}


}
