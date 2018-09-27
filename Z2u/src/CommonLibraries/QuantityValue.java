package CommonLibraries;

import org.openqa.selenium.By;

import Controller.LaunchBrowser_inCrossBrowser;

public class QuantityValue extends LaunchBrowser_inCrossBrowser {
	
	GetQuoteLocators objGetquote = new GetQuoteLocators();

	public int DocumentQuantityValue(){
		
		String strValue = driver.findElement(By.xpath(objGetquote.DocumentQuantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(strValue);
		return Value;
	}
	
public int LaptopsQuantityValue(){
		
		String strValue = driver.findElement(By.xpath(objGetquote.LaptopsQuantitytextfieldLocator())).getAttribute("value");
		int Value = Integer.parseInt(strValue);
		return Value;
	}

public int SmallBoxQuantityValue(){
	
	String strValue = driver.findElement(By.xpath(objGetquote.SmallBoxQuantitytextfieldLocator())).getAttribute("value");
	int Value = Integer.parseInt(strValue);
	return Value;
}

public int FlowersQuantityValue(){
	
	String strValue = driver.findElement(By.xpath(objGetquote.FlowersQuantitytextfieldLocator())).getAttribute("value");
	int Value = Integer.parseInt(strValue);
	return Value;
}

public int LargeBoxQuantityValue(){
	
	String strValue = driver.findElement(By.xpath(objGetquote.LargeBoxQuantitytextfieldLocator())).getAttribute("value");
	int Value = Integer.parseInt(strValue);
	return Value;
}
	
}
