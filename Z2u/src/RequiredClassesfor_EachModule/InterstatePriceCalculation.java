package RequiredClassesfor_EachModule;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.swing.SwingWorker.StateValue;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;

import com.google.common.util.concurrent.Service.State;

import CommonLibraries.InterstateBookingAddresses;
import CommonLibraries.PerKMstatesPrice;
import CommonLibraries.QuantityValue;
import Controller.LaunchBrowser_inCrossBrowser;
import Controller.StateValueService;

public class InterstatePriceCalculation extends LaunchBrowser_inCrossBrowser {
	
	StateValueService objstate = new StateValueService();
	InterstateBookingAddresses objInterstate = new InterstateBookingAddresses();
	InterstateDistCalculation objInterDis = new InterstateDistCalculation();
	QuantityValue objGetQuotequantity = new QuantityValue();
	PerKMstatesPrice objPerkmPrice = new PerKMstatesPrice(); 

public int pricealculated(String Shipment, String Vehicle,int Weight) throws IOException, JSONException {
		
		String key = "AIzaSyBQPFFqPZBL5iH60TdlZNyHoxQXyuCa5WM";
		String pickupaddress = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[1]/div/input[2]")).getAttribute("value");
		String dropoffaddress = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[2]/div/input[2]")).getAttribute("value");
		int Actualprice;
		String pickupstate = objstate.PickupAddressService(pickupaddress);
		String dropoffstate = objstate.DropoffAddressService(dropoffaddress);
		double FirstBookingDistance,ThirdBookingDistance;
		int AirPrice;
		if(pickupstate.equalsIgnoreCase("NSW")){
			
			// First Booking Calculation
			FirstBookingDistance = objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.SydneyAirportAddress());
		}else if(pickupstate.equalsIgnoreCase("VIC")){
			
			// First Booking Calculation
		    FirstBookingDistance = objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.MelbourneAirportAddress());
		}else if(pickupstate.equalsIgnoreCase("QLD")){
			
			// First Booking Calculation
			FirstBookingDistance = objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.BrisbaneAirportAddress());
		}else if(pickupstate.equalsIgnoreCase("ACT")){
			
			// First Booking Calculation
			FirstBookingDistance = objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.ACTAirportAddress());
		}else if(pickupstate.equalsIgnoreCase("SA")){
			
			// First Booking Calculation
			FirstBookingDistance = objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.AdelaideAirportAddress());
		}else if(pickupstate.equalsIgnoreCase("WA")){
			
			// First Booking Calculation
			FirstBookingDistance = objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.PerthAirportAddress());
		}
		else 
			FirstBookingDistance = 0;

			 double ThreeHour_Perkm = 1.7;
	    	 int dis;
             int Firstprice,Thirdprice;
             double BaseAirPrice = 40;
             
			if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=1 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
				int BaseThreeHour_Car = 18;
	    		dis = (int) Math.round(FirstBookingDistance*ThreeHour_Perkm);
	    		Firstprice = BaseThreeHour_Car + dis;
	    	} 
	    	else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
	    	{
	    		int BaseThreeHour_Van = 25 ;
	    		dis = (int) Math.round(FirstBookingDistance*ThreeHour_Perkm);
	    		Firstprice = BaseThreeHour_Van + dis;
	    	}
	    	else
	    		Firstprice = 0;
			System.out.println("First Price is" + Firstprice);
	        // Second Booking Calculation
			if(pickupstate.equalsIgnoreCase("NSW")){
		      if(dropoffstate.equalsIgnoreCase("VIC")){		
		    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.NSW_VIC()));
		      }
		      else if(dropoffstate.equalsIgnoreCase("QLD")){		
		    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.NSW_QLD()));
		      }
		      else if(dropoffstate.equalsIgnoreCase("ACT")){		
		    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.NSW_ACT()));
		      }
		      else if(dropoffstate.equalsIgnoreCase("SA")){		
		    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.NSW_SA()));
		      }
		      else if(dropoffstate.equalsIgnoreCase("WA")){		
		    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.NSW_WA()));
		      }
		      else
					AirPrice = 0;
			 
			} 
			else if(pickupstate.equalsIgnoreCase("VIC")){
			      if(dropoffstate.equalsIgnoreCase("NSW")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.VIC_NSW()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("QLD")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.VIC_QLD()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("ACT")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.VIC_ACT()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("SA")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.VIC_SA()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("WA")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.VIC_WA()));
			      }
			      else
						AirPrice = 0;
				 
				} 
			else if(pickupstate.equalsIgnoreCase("QLD")){
			      if(dropoffstate.equalsIgnoreCase("NSW")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.QLD_NSW()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("VIC")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.QLD_VIC()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("ACT")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.QLD_ACT()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("SA")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.QLD_SA()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("WA")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.QLD_WA()));
			      }
			      else
						AirPrice = 0;
				 
				} 
			else if(pickupstate.equalsIgnoreCase("ACT")){
			      if(dropoffstate.equalsIgnoreCase("NSW")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.ACT_NSW()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("VIC")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.ACT_VIC()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("QLD")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.ACT_QLD()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("SA")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.ACT_SA()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("WA")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.ACT_WA()));
			      }
			      else
						AirPrice = 0;
				 
				} 
			else if(pickupstate.equalsIgnoreCase("SA")){
			      if(dropoffstate.equalsIgnoreCase("NSW")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.SA_NSW()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("VIC")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.SA_VIC()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("QLD")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.SA_QLD()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("ACT")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.SA_ACT()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("WA")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.SA_WA()));
			      }
			      else
						AirPrice = 0;
				 } 
			else if(pickupstate.equalsIgnoreCase("WA")){
			      if(dropoffstate.equalsIgnoreCase("NSW")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.WA_NSW()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("VIC")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.WA_VIC()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("QLD")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.WA_QLD()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("ACT")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.WA_ACT()));
			      }
			      else if(dropoffstate.equalsIgnoreCase("SA")){		
			    	  AirPrice = (int) (BaseAirPrice + Math.round(Weight * objPerkmPrice.WA_SA()));
			      }else
			    	  AirPrice =0;
			     }
			else 
				AirPrice = 0;
			 
			  System.out.println("Airprice is =" + AirPrice);
			   
	        
			 if(dropoffstate.equalsIgnoreCase("NSW")){
	        // Third Booking Calculation
			 ThirdBookingDistance = objInterDis.BookingDistanceAirport_Drop(objInterstate.SydneyAirportAddress(), dropoffaddress);
			 }else  if(dropoffstate.equalsIgnoreCase("VIC")){
			        // Third Booking Calculation
				 ThirdBookingDistance = objInterDis.BookingDistanceAirport_Drop(objInterstate.MelbourneAirportAddress(), dropoffaddress);
				 }else  if(dropoffstate.equalsIgnoreCase("QLD")){
				        // Third Booking Calculation
					 ThirdBookingDistance = objInterDis.BookingDistanceAirport_Drop(objInterstate.BrisbaneAirportAddress(), dropoffaddress);
					 }else  if(dropoffstate.equalsIgnoreCase("ACT")){
					        // Third Booking Calculation
						 ThirdBookingDistance = objInterDis.BookingDistanceAirport_Drop(objInterstate.ACTAirportAddress(), dropoffaddress);
						 }else  if(dropoffstate.equalsIgnoreCase("SA")){
						        // Third Booking Calculation
							 ThirdBookingDistance = objInterDis.BookingDistanceAirport_Drop(objInterstate.AdelaideAirportAddress(), dropoffaddress);
							 }else  if(dropoffstate.equalsIgnoreCase("WA")){
							        // Third Booking Calculation
								 ThirdBookingDistance = objInterDis.BookingDistanceAirport_Drop(objInterstate.PerthAirportAddress(), dropoffaddress);
								 }
							 else 
								 ThirdBookingDistance = 0;
	    	 
             
            
			if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=1 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
				int BaseThreeHour_Car = 18;
	    		dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
	    		Thirdprice = BaseThreeHour_Car + dis;
	    	} 
	    	else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
	    	{
	    		int BaseThreeHour_Van = 25 ;
	    		dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
	    		System.out.println("Van distance is" + dis);
	    		Thirdprice = BaseThreeHour_Van + dis;
	    		System.out.println("Price distance is" + Thirdprice);
	    	}
	    	else
	    		Thirdprice = 0;
			System.out.println("First Price is" + Thirdprice);
	        
			int mainprice = Firstprice + AirPrice + Thirdprice;
	        
	        System.out.println(mainprice); 
	        
	        if(mainprice<20){
   			 
    			Actualprice = mainprice + 1;
    		
    			 
    		 }
    		 else if(mainprice>20 && mainprice<50){
    			Actualprice = mainprice + 2;
    		
    			 
    		 }
    		 else if(mainprice>50 && mainprice<100){
    			Actualprice = mainprice + 3;
    			 
    		 }
    		 else if(mainprice>100 && mainprice<200){
    			 Actualprice = mainprice + 5;
    			
    			 
    		 }
    		 else 
    			 Actualprice = mainprice +20;
    			

		


			return Actualprice;


}
}
