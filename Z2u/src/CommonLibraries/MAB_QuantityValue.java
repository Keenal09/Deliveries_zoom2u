package CommonLibraries;

import org.openqa.selenium.By;

import Controller.MAB_Scenarios;

public class MAB_QuantityValue extends MAB_Scenarios {
	
	
	MakeaBookingLocator objMAB = new MakeaBookingLocator();

	public int DocumentQuantityValue(){
		
		String strValue = driver.findElement(By.xpath(objMAB.MAB_DocumentquantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(strValue);
		return Value;
	}
	
public int LaptopsQuantityValue(){
		
		String strValue = driver.findElement(By.xpath(objMAB.MAB_LaptopquantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(strValue);
		return Value;
	}

public int SmallBoxQuantityValue(){
	
	String strValue = driver.findElement(By.xpath(objMAB.MAB_SmallBoxquantitytextfieldLocator())).getAttribute("value");
	int Value = Integer.parseInt(strValue);
	return Value;
}

public int FlowersQuantityValue(){
	
	String strValue = driver.findElement(By.xpath(objMAB.MAB_FlowersquantitytextfieldLocator())).getAttribute("value");
	int Value = Integer.parseInt(strValue);
	return Value;
}

public int LargeBoxQuantityValue(){
	
	String strValue = driver.findElement(By.xpath(objMAB.MAB_LargeBoxquantitytextfieldLocator())).getAttribute("value");
	int Value = Integer.parseInt(strValue);
	return Value;
}


}
