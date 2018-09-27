package RequiredClassesfor_EachModule;



import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Controller.GetQuote_Scenarios;

public class hfimage extends GetQuote_Scenarios
{
	public void selectimagesforhf(String Shipmenttype) throws InterruptedException, AWTException
	{
		if(Shipmenttype.equals("BuildingMaterials") || Shipmenttype.equals("GeneralTruckShipments") || Shipmenttype.equals("Pallets") || Shipmenttype.equals("Machinery") || Shipmenttype.equals("Vehicles"))
		{
		if (Shipmenttype.equals("BuildingMaterials")) 
		{
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			Thread.sleep(1000);
			System.out.println("Check images for HF Bid shipment - BuildingMaterials");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[3]/div/div[3]/div")).click();
			Thread.sleep(1000);
			
		}
			
		else if(Shipmenttype.equals("GeneralTruckShipments"))
		{
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			Thread.sleep(1000);	
			System.out.println("Check images for HF Bid shipment - General Truck Shipments");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[4]/div")).click();
			Thread.sleep(1000);
				
		}
		else if(Shipmenttype.equals("Pallets"))
		{
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
				Thread.sleep(1000);
				System.out.println("Check images for HF Bid shipment - Pallets");
				Thread.sleep(1000);
				WebElement pallets = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[5]/div"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", pallets);
				Thread.sleep(10000);
			
		}
		else if(Shipmenttype.equals("Machinery"))
		{
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			Thread.sleep(1000);
				System.out.println("Check images for HF Bid shipment - Machinery");
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[6]/div")).click();
				Thread.sleep(1000);
		}
		else if(Shipmenttype.equals("Vehicles"))
		{
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			Thread.sleep(1000);
				System.out.println("Check images for HF Bid shipment - Vehicles");
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[7]/div")).click();
				Thread.sleep(1000);
		}
		
				
		driver.findElement(By.name("orderNumber")).sendKeys("test125");	
		driver.findElement(By.name("quantity")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.name("length")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.name("width")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.name("height")).sendKeys("8");
		driver.findElement(By.name("weight")).sendKeys("8");
		driver.findElement(By.name("title")).sendKeys("Title it is- Building material");
		Thread.sleep(10000);
		driver.findElement(By.name("freight_value")).sendKeys("25");
		Thread.sleep(1000);
		
		
			// Upload images
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-1']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Desert.jpg");
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-2']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Jellyfish.jpg");
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-3']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-4']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Lighthouse.jpg");
			//driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-5']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//Verify that all images are visible
			String Image1 = driver.findElement(By.xpath(".//*[@id='image-holder-1']")).getAttribute("src");
			Thread.sleep(1000);
			if(Image1.equals("content/images/booking/graphic-photo@2x.png"))
			{
				 System.out.println("First Image is not visible.");
			}
			else
		    {
		         System.out.println("First Image is visible.");
		    }
			
			
			
			String Image2 = driver.findElement(By.xpath(".//*[@id='image-holder-2']")).getAttribute("src");
			
			Thread.sleep(1000);
			if(Image2.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
			{
				 System.out.println("second Image is not visible.");
			}
			else
		    {
		         System.out.println("second Image is visible.");
		    }
		
			
			
			String Image3 = driver.findElement(By.xpath(".//*[@id='image-holder-3']")).getAttribute("src");
			
			Thread.sleep(1000);
			if(Image3.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
			{
				 System.out.println("Third Image is not visible.");
			}
			else
		    {
		         System.out.println("Third Image is visible.");
		    }
			
			
			String Image4 = driver.findElement(By.xpath(".//*[@id='image-holder-4']")).getAttribute("src");
			
			Thread.sleep(1000);
			if(Image4.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
			{
				 System.out.println("Fourth Image is not visible.");
			}
			else
		    {
		         System.out.println("Fourth Image is visible.");
		    }
			
			
			String Image5 = driver.findElement(By.xpath(".//*[@id='image-holder-5']")).getAttribute("src");
			
			Thread.sleep(1000);
			if(Image5.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
			{
				 System.out.println("Fifth Image is not visible.");
			}
			else
		    {
		         System.out.println("Fifth Image is visible.");
		    }	
			
			
			driver.findElement(By.name("pick_street")).sendKeys("George Street, The Rocks NSW, Australia");
			Thread.sleep(1000);	
			WebElement element = driver.findElement(By.name("drop_street"));
			element.sendKeys("Clarence Street, Sydney NSW, Australia");
			Thread.sleep(1000);
			element.sendKeys(Keys.TAB);
			Thread.sleep(1000);	
			driver.findElement(By.xpath("//div[2]/div/button")).click();
			
			Thread.sleep(10000);
			//C:\Users\Public\Pictures\Sample Pictures\Desert
			//Jellyfish
			//Penguins
			//Lighthouse
			//Tulips
			//	element.send_keys("C:\myfile.txt")
		
		}
	
		
		if (Shipmenttype.equals("Container"))
		{
			System.out.println("Check images for HF Bid shipment - conatiner");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[8]/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("orderNumber")).sendKeys("test125");	
			Thread.sleep(1000);
			Select containersize = new Select(driver.findElement(By.name("ContainerSize")));
			//Select containersize = new Select(driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div[1]/div[1]/select")));
			containersize.selectByVisibleText("20ft (6.06m x 2.44m x 2.59m)");
		
			driver.findElement(By.name("quantity")).sendKeys("8");
			Thread.sleep(1000);
			
			driver.findElement(By.name("weight")).sendKeys("8");
			Thread.sleep(1000);
			driver.findElement(By.name("title")).sendKeys("Title it is- Building material");
			Thread.sleep(10000);
			driver.findElement(By.name("freight_value")).sendKeys("25");
			Thread.sleep(1000);
			
			// Upload images
						driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div/div/div[1]/div[2]/input")).sendKeys(Keys.TAB);
						Thread.sleep(10000);
						driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-1']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Desert.jpg");
						Thread.sleep(10000);
						driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-2']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Jellyfish.jpg");
						Thread.sleep(10000);
						driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-3']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
						Thread.sleep(10000);
						driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-4']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Lighthouse.jpg");
						//driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-5']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg");
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						//Verify that all images are visible
						String Image1 = driver.findElement(By.xpath(".//*[@id='image-holder-1']")).getAttribute("src");
						Thread.sleep(1000);
						if(Image1.equals("content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("First Image is not visible.");
						}
						else
					    {
					         System.out.println("First Image is visible.");
					    }
						
						
						
						String Image2 = driver.findElement(By.xpath(".//*[@id='image-holder-2']")).getAttribute("src");
						
						Thread.sleep(1000);
						if(Image2.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("second Image is not visible.");
						}
						else
					    {
					         System.out.println("second Image is visible.");
					    }
					
						
						
						String Image3 = driver.findElement(By.xpath(".//*[@id='image-holder-3']")).getAttribute("src");
						
						Thread.sleep(1000);
						if(Image3.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("Third Image is not visible.");
						}
						else
					    {
					         System.out.println("Third Image is visible.");
					    }
						
						
						String Image4 = driver.findElement(By.xpath(".//*[@id='image-holder-4']")).getAttribute("src");
						
						Thread.sleep(1000);
						if(Image4.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("Fourth Image is not visible.");
						}
						else
					    {
					         System.out.println("Fourth Image is visible.");
					    }
						
						
						String Image5 = driver.findElement(By.xpath(".//*[@id='image-holder-5']")).getAttribute("src");
						
						Thread.sleep(1000);
						if(Image5.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("Fifth Image is not visible.");
						}
						else
					    {
					         System.out.println("Fifth Image is visible.");
					    }	
						
			
			
			
			driver.findElement(By.name("pick_street")).sendKeys("George Street, The Rocks NSW, Australia");
			Thread.sleep(1000);	
			WebElement element = driver.findElement(By.name("drop_street"));
			element.sendKeys("Clarence Street, Sydney NSW, Australia");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[2]/div/button")).click();
			Thread.sleep(10000);
	
				
			
		}
	
		else
		if(Shipmenttype.equals("FullTruckLoad"))
		{ 
			System.out.println("Check images for HF Bid shipment - Fulltruckload");
			
			// WebDriverWait wait = new WebDriverWait(driver, 10);

			// WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")));
		
		
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/ul/li[1]/ul/li[3]/a/span")).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/form/div[1]/div/div[2]/div/div[8]/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div/div[9]/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[2]/input")).sendKeys("test keenal");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[4]/input")).sendKeys("879879");
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[1]/div[6]/input")).sendKeys("George Street, The Rocks NSW, Australia");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[2]/input")).sendKeys("test keenal");
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[4]/input")).sendKeys("879879");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[5]/div/div/div[3]/div[6]/input")).sendKeys("George Street, The Rocks NSW, Australia");
			Thread.sleep(1000);
			// Upload images
						
						driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-1']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Desert.jpg");
						Thread.sleep(10000);
						driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-2']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Jellyfish.jpg");
						Thread.sleep(10000);
						driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-3']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
						Thread.sleep(10000);
						driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-4']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Lighthouse.jpg");
						//driver.findElement(By.xpath(".//div[@class='image-upload ng-scope']/input[@id='file-input-5']")).sendKeys("C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg");
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						//Verify that all images are visible
						String Image1 = driver.findElement(By.xpath(".//*[@id='image-holder-1']")).getAttribute("src");
						Thread.sleep(1000);
						if(Image1.equals("content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("First Image is not visible.");
						}
						else
					    {
					         System.out.println("First Image is visible.");
					    }
						
						
						
						String Image2 = driver.findElement(By.xpath(".//*[@id='image-holder-2']")).getAttribute("src");
						
						Thread.sleep(1000);
						if(Image2.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("second Image is not visible.");
						}
						else
					    {
					         System.out.println("second Image is visible.");
					    }
					
						
						
						String Image3 = driver.findElement(By.xpath(".//*[@id='image-holder-3']")).getAttribute("src");
						
						Thread.sleep(1000);
						if(Image3.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("Third Image is not visible.");
						}
						else
					    {
					         System.out.println("Third Image is visible.");
					    }
						
						
						String Image4 = driver.findElement(By.xpath(".//*[@id='image-holder-4']")).getAttribute("src");
						
						Thread.sleep(1000);
						if(Image4.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("Fourth Image is not visible.");
						}
						else
					    {
					         System.out.println("Fourth Image is visible.");
					    }
						
						
						String Image5 = driver.findElement(By.xpath(".//*[@id='image-holder-5']")).getAttribute("src");
						
						Thread.sleep(1000);
						if(Image5.equals("https://deliveries-staging.zoom2u.com/content/images/booking/graphic-photo@2x.png"))
						{
							 System.out.println("Fifth Image is not visible.");
						}
						else
					    {
					         System.out.println("Fifth Image is visible.");
					    }				
				
						
						driver.findElement(By.xpath("//div[2]/div/button")).click();
						Thread.sleep(10000);
				
							
				
		}
		
		}

}


