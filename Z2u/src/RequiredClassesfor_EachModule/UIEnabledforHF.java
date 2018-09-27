package RequiredClassesfor_EachModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import Controller.GetQuote_Scenarios;

public class UIEnabledforHF extends GetQuote_Scenarios {
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	WebElement element;
	//Common data for heavy freight panel
	public void heavyfreightpanel() throws InterruptedException 
	{
		driver.findElement(By.name("quantity")).sendKeys("8");
		//Thread.sleep(1000);
		driver.findElement(By.name("length")).sendKeys("8");
		//Thread.sleep(1000);
		driver.findElement(By.name("width")).sendKeys("8");
		//Thread.sleep(1000);
		driver.findElement(By.name("height")).sendKeys("8");
		driver.findElement(By.name("weight")).sendKeys("8");
		//Thread.sleep(1000);
		WebElement duplicaterow = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div[1]/div[1]/div[7]/img"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", duplicaterow);
		//Thread.sleep(1000);
		driver.findElement(By.name("title")).sendKeys("Title it is- doc, laptop, cakes, small and large box");
		//Thread.sleep(10000);
		driver.findElement(By.name("freight_value")).sendKeys("25");
		//Thread.sleep(1000);
		
		String quantity = driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println("Entered quantity in firstrow is - " +quantity);
		String length = driver.findElement(By.name("length")).getAttribute("value");
		System.out.println("Entered length in firstrow is - " +length);
		String width = driver.findElement(By.name("width")).getAttribute("value");
		System.out.println("Entered width in firstrow is - " +width);
		String height = driver.findElement(By.name("height")).getAttribute("value");
		System.out.println("Entered height in firstrow is - " +height);
		String weight = driver.findElement(By.name("weight")).getAttribute("value");
		System.out.println("Entered weight in firstrow is - " +weight);
		String title = driver.findElement(By.name("title")).getAttribute("value");
		System.out.println("Entered title is - " +title);
		String freightvalue = driver.findElement(By.name("freight_value")).getAttribute("value");
		System.out.println("Entered freightvalue is - " +freightvalue);
	}
	public void overlimitUI(String Shipmenttype) throws Exception
	{
		
		if (Shipmenttype.equals("Documents")) {
			System.out.println("Creating a heavyfreight bid, with interstate addresses Document-32");
			  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[3]/input")));

			driver.findElement(By.xpath(".//*[@id='nav']/li[1]/ul/li[3]/a/span")).click();
			//Thread.sleep(10000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[3]/input")).sendKeys("32");
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[3]/input")).sendKeys(Keys.TAB);
		    //Thread.sleep(1000);
		}
		else if(Shipmenttype.equals("stachellaptops"))
		{
			System.out.println("Creating a heavyfreight bid, with interstate addresses stachellaptops-16");
			//driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
	        //Thread.sleep(5000);
			//Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='nav']/li[1]/ul/li[3]/a/span")).click();
			//Thread.sleep(10000);
			  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[4]/input")));
	
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[4]/input")).sendKeys("16");
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[4]/input")).sendKeys(Keys.TAB);
			Thread.sleep(1000);
		}
		else if(Shipmenttype.equals("Smallbox"))
		{
			System.out.println("Creating a heavyfreight bid, with interstate addresses Smallbox-16");
			//driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
	        //Thread.sleep(5000);
			//Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='nav']/li[1]/ul/li[3]/a/span")).click();
			//Thread.sleep(10000);
			  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[5]/input")));

			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[5]/input")).sendKeys("32");
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[5]/input")).sendKeys(Keys.TAB);
			//Thread.sleep(1000);
		}
		else if(Shipmenttype.equals("Cakesflowersdelicates"))
		{
			System.out.println("Creating a heavyfreight bid, with interstate addresses Cakesflowersdelicates-16");
			//driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
	        //Thread.sleep(5000);
			//Thread.sleep(1000);
			  //element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[6]/input")));

			driver.findElement(By.xpath(".//*[@id='nav']/li[1]/ul/li[3]/a/span")).click();
			//Thread.sleep(10000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[6]/input")).sendKeys("32");
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[6]/input")).sendKeys(Keys.TAB);
			//Thread.sleep(1000);
		}
		else if(Shipmenttype.equals("LargeBox"))
		{
			System.out.println("Creating a heavyfreight bid, with interstate addresses LargeBox-16");
			//driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
	        //Thread.sleep(5000);
			//Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='nav']/li[1]/ul/li[3]/a/span")).click();
			//Thread.sleep(10000);
			  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[7]/input")));

			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[7]/input")).sendKeys("32");
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[7]/input")).sendKeys(Keys.TAB);
			//Thread.sleep(1000);
		}
		//Pickup details(Only mandatory fields) 
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div/div[1]/div[2]/input")).sendKeys("Test keenal");
		//Thread.sleep(1000);
		  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div/div[1]/div[4]/input")));

		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div/div[1]/div[4]/input")).sendKeys("987654");
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div/div[1]/div[6]/input")).sendKeys("123 George Street, Redfern NSW, Australia");
			
		//Drop details(Only mandatory fields) 
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div/div[3]/div[2]/input")).sendKeys("Test nik");
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div/div[3]/div[4]/input")).sendKeys("123456");
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div/div[3]/div[6]/input")).sendKeys("123 Elizabeth Street, Melbourne VIC, Australia");
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div/div[3]/div[6]/input")).sendKeys(Keys.TAB);
		//Thread.sleep(1000);
		// Check UI panel for Heavy freights
		boolean fname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div[1]")).isEnabled();
		System.out.println("The panel for Heavy freight bid is enabled-");
		System.out.print(fname);
		System.out.println('\n');
		heavyfreightpanel();
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).click();
		//Thread.sleep(10000);
		
	}
	public void largeiteminterstateui(String Shipmenttype) throws InterruptedException {
		if (Shipmenttype.equals("GeneralVanShipments")) {
			System.out.println("Creating a heavyfreight bid, with interstate addresses shipment- General van");
			//Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='nav']/li[1]/ul/li[3]/a/span")).click();
			//Thread.sleep(10000);
			  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")));

			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[1]/div")).click();
			//Thread.sleep(1000);
			
		}
		else if(Shipmenttype.equals("Furniture"))
		{
			System.out.println("Creating a heavyfreight bid, with interstate addresses shipment-Furniture");
			//Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='nav']/li[1]/ul/li[3]/a/span")).click();
			//Thread.sleep(10000);
			  element = Driverwaitclass.Driverwait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")));

			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[2]/div")).click();
			//Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[2]/input")).sendKeys("Test keenal");
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[4]/input")).sendKeys("987654");
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[1]/div[6]/input")).sendKeys("123 George Street, Redfern NSW, Australia");
			
		//Drop details(Only mandatory fields) 
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[2]/input")).sendKeys("Test nik");
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[4]/input")).sendKeys("123456");
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[6]/input")).sendKeys("123 Elizabeth Street, Melbourne VIC, Australia");
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[4]/div/div/div[3]/div[6]/input")).sendKeys(Keys.TAB);
		//Thread.sleep(1000);
		// Check UI panel for Heavy freights
		boolean fname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]")).isEnabled();
		System.out.println("The panel for Heavy freight bid is enabled-");
		System.out.print(fname);
		System.out.println('\n');
	//data for heavy freight panel
		//Thread.sleep(1000);
		driver.findElement(By.name("quantity")).sendKeys("8");
		//Thread.sleep(1000);
		driver.findElement(By.name("length")).sendKeys("8");
		//Thread.sleep(1000);
		driver.findElement(By.name("width")).sendKeys("8");
		//Thread.sleep(1000);
		driver.findElement(By.name("height")).sendKeys("8");
		driver.findElement(By.name("weight")).sendKeys("8");
		//Thread.sleep(1000);
		WebElement duplicaterow = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/div[7]/img"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", duplicaterow);
		//Thread.sleep(1000);
		driver.findElement(By.name("title")).sendKeys("Title it is- general van or furniture");
		//Thread.sleep(10000);
		driver.findElement(By.name("freight_value")).sendKeys("25");
		//Thread.sleep(1000);
		
		String quantity = driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println("Entered quantity in firstrow is - " +quantity);
		String length = driver.findElement(By.name("length")).getAttribute("value");
		System.out.println("Entered length in firstrow is - " +length);
		String width = driver.findElement(By.name("width")).getAttribute("value");
		System.out.println("Entered width in firstrow is - " +width);
		String height = driver.findElement(By.name("height")).getAttribute("value");
		System.out.println("Entered height in firstrow is - " +height);
		String weight = driver.findElement(By.name("weight")).getAttribute("value");
		System.out.println("Entered weight in firstrow is - " +weight);
		String title = driver.findElement(By.name("title")).getAttribute("value");
		System.out.println("Entered title is - " +title);
		String freightvalue = driver.findElement(By.name("freight_value")).getAttribute("value");
		System.out.println("Entered freightvalue is - " +freightvalue);
		
		driver.findElement(By.xpath(".//*[@id='quoteForm']/div[2]/div/button")).click();
		//Thread.sleep(10000);	
		driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
        Thread.sleep(5000);
		//driver.navigate().refresh();
		
	}
	
	
}
