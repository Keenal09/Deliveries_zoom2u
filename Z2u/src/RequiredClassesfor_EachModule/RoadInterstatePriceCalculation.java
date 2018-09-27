package RequiredClassesfor_EachModule;

import java.io.IOException;

import org.json.JSONException;
import org.openqa.selenium.By;


import CommonLibraries.PerKMstatesPrice;
import CommonLibraries.QuantityValue;
import CommonLibraries.RoadInterstateBookingAddresses;
import CommonLibraries.RoadInterstate_perkmPricewithWeight;
import Controller.LaunchBrowser_inCrossBrowser;
import Controller.StateValueService;

public class RoadInterstatePriceCalculation extends LaunchBrowser_inCrossBrowser{
	
	StateValueService objstate = new StateValueService();
	RoadInterstateBookingAddresses objInterstate = new RoadInterstateBookingAddresses();
	InterstateDistCalculation objInterDis = new InterstateDistCalculation();
	QuantityValue objGetQuotequantity = new QuantityValue();
	RoadInterstate_perkmPricewithWeight objPerkmPrice = new RoadInterstate_perkmPricewithWeight(); 

public int pricealculated(String Shipment, String Vehicle,int Weight) throws IOException, JSONException {
		
		String key = "AIzaSyBQPFFqPZBL5iH60TdlZNyHoxQXyuCa5WM";
		String pickupaddress = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[1]/div/input[2]")).getAttribute("value");
		String dropoffaddress = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[3]/div[2]/div[2]/div/input[2]")).getAttribute("value");
		String weight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).getAttribute("value");
		int Actualprice = 0;
		String pickupstate = objstate.PickupAddressService(pickupaddress);
		String dropoffstate = objstate.DropoffAddressService(dropoffaddress);
		double FirstBookingDistance,ThirdBookingDistance;
		int AirPrice = 0;
		
		 double ThreeHour_Perkm = 1.7;
		 int dis;
		 int Firstprice = 0,Thirdprice = 0;
        
        
		if(pickupstate.equals("QLD") && (dropoffstate.equals("NSW") || dropoffstate.equals("VIC") ||  dropoffstate.equals("ACT") )) {
			
				
			FirstBookingDistance =objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.BrisbaneDepotAddress());		
             
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
             
             		System.out.println("First Price is" + Firstprice);
			
             		if(dropoffstate.equals("NSW")) {
				
             			if(Shipment.equals("Documents")){
             				AirPrice = objPerkmPrice.QLD_NSWforDoc();
             			}
             			else if(Weight>0 && Weight<5) {
             				AirPrice = objPerkmPrice.QLD_NSWfor0_5kg();
             			}
             			else  if(Weight>=5 && Weight<10) {
             				AirPrice = objPerkmPrice.QLD_NSWfor5_10kg();
             			}
             			else  if(Weight>=10 && Weight<15) {
             				AirPrice = objPerkmPrice.QLD_NSWfor10_15kg();
             			}
             			else  if(Weight>=15 && Weight<20) {
             				AirPrice = objPerkmPrice.QLD_NSWfor15_20kg();
             			}
             			else  if(Weight>=20 && Weight<30) {
             				AirPrice = objPerkmPrice.QLD_NSWfor20_30kg();
             			}
             			else  if(Weight>=30) {
             				AirPrice = objPerkmPrice.QLD_NSWforabove30kg();
             			}
						
             		}
             			else if(dropoffstate.equals("VIC")) {
					
             				if(Shipment.equals("Documents")){
             					AirPrice = objPerkmPrice.QLD_VICforDoc();
             				}
             				else if(Weight>0 && Weight<5) {
             					AirPrice = objPerkmPrice.QLD_VICfor0_5kg();
             				}
             				else  if(Weight>=5 && Weight<10) {
             					AirPrice = objPerkmPrice.QLD_VICfor5_10kg();
             				}
             				else  if(Weight>=10 && Weight<15) {
             					AirPrice = objPerkmPrice.QLD_VICfor10_15kg();
             				}
             				else  if(Weight>=15 && Weight<20) {
             					AirPrice = objPerkmPrice.QLD_VICfor15_20kg();
             				}
             				else  if(Weight>=20 && Weight<30) {
             					AirPrice = objPerkmPrice.QLD_VICfor20_30kg();
             				}
             				else  if(Weight>=30) {
             					AirPrice = objPerkmPrice.QLD_VICforabove30kg();
             				}
							
             			} 
             			else if(dropoffstate.equalsIgnoreCase("ACT")) {
			
             				if(Shipment.equals("Documents")){
             					AirPrice = objPerkmPrice.QLD_ACTforDoc();
             				}
             				else if(Weight>0 && Weight<5) {
             					AirPrice = objPerkmPrice.QLD_ACTfor0_5kg();
             				}
             				else  if(Weight>=5 && Weight<10) {
             					AirPrice = objPerkmPrice.QLD_ACTfor5_10kg();
             				}
             				else  if(Weight>=10 && Weight<15) {
             					AirPrice = objPerkmPrice.QLD_ACTfor10_15kg();
             				}
             				else  if(Weight>=15 && Weight<20) {
             					AirPrice = objPerkmPrice.QLD_ACTfor15_20kg();
             				}
             				else  if(Weight>=20 && Weight<30) {
             					AirPrice = objPerkmPrice.QLD_ACTfor20_30kg();
             				}
             				else  if(Weight>=30) {
             					AirPrice = objPerkmPrice.QLD_ACTforabove30kg();
             				}
             			}

             				if(dropoffstate.equalsIgnoreCase("NSW") || dropoffstate.equalsIgnoreCase("VIC")) {
					
             					Thirdprice = 15;
					
             				}
             				else if(dropoffstate.equalsIgnoreCase("ACT")) {
					
             					ThirdBookingDistance =objInterDis.BookingDistanceAirport_Drop(objInterstate.ACTDepotAddress(),dropoffaddress);
            					if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=1 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
            						int BaseThreeHour_Car = 18;
            						dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
            						Thirdprice = BaseThreeHour_Car + dis;
            					} 
            					else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
            					{
            						int BaseThreeHour_Van = 25 ;
            						dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
            						Thirdprice = BaseThreeHour_Van + dis;
            					}
            					
            						System.out.println("Third Price is" + Thirdprice);
            			
             				}	
				
             				Actualprice = Firstprice + AirPrice + Thirdprice;
             				System.out.println("Actual Price is" + Actualprice);
				
						}
				else if((pickupstate.equals("NSW") || pickupstate.equals("VIC") ||  pickupstate.equals("ACT")) && dropoffstate.equals("QLD")) {
			
					
					ThirdBookingDistance =objInterDis.BookingDistanceAirport_Drop(objInterstate.BrisbaneDepotAddress(),dropoffaddress);
					if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=1 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
						int BaseThreeHour_Car = 18;
						dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
						Thirdprice = BaseThreeHour_Car + dis;
					} 
					else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
					{
						int BaseThreeHour_Van = 25 ;
						dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
						Thirdprice = BaseThreeHour_Van + dis;
					}
					
						System.out.println("Third Price is" + Thirdprice);
			
				if(pickupstate.equals("NSW")) {
				
					if(Shipment.equals("Documents")){
					AirPrice = objPerkmPrice.NSW_QLDforDoc();
					System.out.println("Air price is" + AirPrice);
					}
					else if(Weight>0 && Weight<5) {
						AirPrice = objPerkmPrice.NSW_QLDfor0_5kg();
					}
					else  if(Weight>=5 && Weight<10) {
						AirPrice = objPerkmPrice.NSW_QLDfor5_10kg();
					}
					else  if(Weight>=10 && Weight<15) {
						AirPrice = objPerkmPrice.NSW_QLDfor10_15kg();
					}
					else  if(Weight>=15 && Weight<20) {
						AirPrice = objPerkmPrice.NSW_QLDfor15_20kg();
					}
					else  if(Weight>=20 && Weight<30) {
						AirPrice = objPerkmPrice.NSW_QLDfor20_30kg();
					}
					else  if(Weight>=30) {
						AirPrice = objPerkmPrice.NSW_QLDforabove30kg();
					}
						
			
				}	else if(pickupstate.equals("VIC")) {
					
					if(Shipment.equals("Documents")){
						AirPrice = objPerkmPrice.VIC_QLDforDoc();
					}
						else if(Weight>0 && Weight<5) {
							AirPrice = objPerkmPrice.VIC_QLDfor0_5kg();
						}
						else  if(Weight>=5 && Weight<10) {
							AirPrice = objPerkmPrice.VIC_QLDfor5_10kg();
						}
						else  if(Weight>=10 && Weight<15) {
							AirPrice = objPerkmPrice.VIC_QLDfor10_15kg();
						}
						else  if(Weight>=15 && Weight<20) {
							AirPrice = objPerkmPrice.VIC_QLDfor15_20kg();
						}
						else  if(Weight>=20 && Weight<30) {
							AirPrice = objPerkmPrice.VIC_QLDfor20_30kg();
						}
						else  if(Weight>=30) {
							AirPrice = objPerkmPrice.VIC_QLDforAbove30kg();
						}
							
			} else if(pickupstate.equalsIgnoreCase("ACT")) {
			
						if(Shipment.equals("Documents")){
								AirPrice = objPerkmPrice.ACT_QLDforDoc();
						}
						else if(Weight>0 && Weight<5) {
								AirPrice = objPerkmPrice.ACT_QLDfor0_5kg();
						}
						else  if(Weight>=5 && Weight<10) {
								AirPrice = objPerkmPrice.ACT_QLDfor5_10kg();
						}
						else  if(Weight>=10 && Weight<15) {
								AirPrice = objPerkmPrice.ACT_QLDfor10_15kg();
						}
						else  if(Weight>=15 && Weight<20) {
								AirPrice = objPerkmPrice.ACT_QLDfor15_20kg();
						}
						else  if(Weight>=20 && Weight<30) {
								AirPrice = objPerkmPrice.ACT_QLDfor20_30kg();
						}
						else  if(Weight>=30) {
								AirPrice = objPerkmPrice.ACT_QLDforabove30kg();
						}
			
			} 
				if(pickupstate.equalsIgnoreCase("NSW") || pickupstate.equalsIgnoreCase("VIC")) {
					
							Firstprice = 15;
							
					
						}else if(pickupstate.equalsIgnoreCase("ACT")) {
					
							FirstBookingDistance =objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.ACTDepotAddress());		
				             
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
			             
			             		System.out.println("First Price is" + Firstprice);
						
			            
							
						}
						Actualprice = Firstprice + AirPrice + Thirdprice;
		   
				}else if(pickupstate.equalsIgnoreCase("NSW")) {
				
						if(dropoffstate.equals("VIC")) {
					
							Firstprice = 15;
							if(Shipment.equals("Documents")){
								AirPrice = objPerkmPrice.NSW_VICforDoc();
							}
							else if(Weight>0 && Weight<5) {
								AirPrice =  objPerkmPrice.NSW_VICfor0_5kg();
							}
							else  if(Weight>=5 && Weight<10) {
								AirPrice = objPerkmPrice.NSW_VICfor5_10kg();
							}
							else  if(Weight>=10 && Weight<15) {
								AirPrice = objPerkmPrice.NSW_VICfor10_15kg();
							}
							else  if(Weight>=15 && Weight<20) {
								AirPrice = objPerkmPrice.NSW_VICfor15_20kg();
							}
							else  if(Weight>=20 && Weight<30) {
								AirPrice = objPerkmPrice.NSW_VICfor20_30kg();
							}
							else  if(Weight>=30) {
								AirPrice = objPerkmPrice.NSW_VICforabove30kg();
							}
							Thirdprice = 15;
							Actualprice = Firstprice + AirPrice + Thirdprice;
					
						}
				else if(dropoffstate.equals("ACT")) {
					
						Firstprice = 15;
						if(Shipment.equals("Documents")){
							AirPrice = objPerkmPrice.NSW_ACTforDoc();
						}
							else if(Weight>0 && Weight<5) {
								AirPrice = objPerkmPrice.NSW_ACTfor0_5kg();
							}
							else  if(Weight>=5 && Weight<10) {
								AirPrice = objPerkmPrice.NSW_ACTfor5_10kg();
							}
							else  if(Weight>=10 && Weight<15) {
								AirPrice = objPerkmPrice.NSW_ACTfor10_15kg();
							}
							else  if(Weight>=15 && Weight<20) {
								AirPrice = objPerkmPrice.NSW_ACTfor15_20kg();
							}
							else  if(Weight>=20 && Weight<30) {
								AirPrice = objPerkmPrice.NSW_ACTfor20_30kg();
							}
							else  if(Weight>=30) {
								AirPrice = objPerkmPrice.NSW_ACTforabove30kg();
							}
						ThirdBookingDistance =objInterDis.BookingDistanceAirport_Drop(objInterstate.ACTDepotAddress(),dropoffaddress);
						if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=1 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
							int BaseThreeHour_Car = 18;
							dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
							Thirdprice = BaseThreeHour_Car + dis;
						} 
						else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
						{
							int BaseThreeHour_Van = 25 ;
							dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
							Thirdprice = BaseThreeHour_Van + dis;
						}
						
							System.out.println("Third Price is" + Thirdprice);
				
						Actualprice = Firstprice + AirPrice + Thirdprice;
					
				}
				
			}else if(pickupstate.equals("VIC")){
				if(dropoffstate.equals("NSW")) {
					
					Firstprice = 15;
					if(Shipment.equals("Documents")){
						AirPrice = objPerkmPrice.VIC_NSWforDoc();
					}
						else if(Weight>0 && Weight<5) {
							AirPrice = objPerkmPrice.VIC_NSWfor0_5kg();
						}
						else  if(Weight>=5 && Weight<10) {
							AirPrice = objPerkmPrice.VIC_NSWfor5_10kg();
						}
						else  if(Weight>=10 && Weight<15) {
							AirPrice = objPerkmPrice.VIC_NSWfor10_15kg();
						}
						else  if(Weight>=15 && Weight<20) {
							AirPrice = objPerkmPrice.VIC_NSWfor15_20kg();
						}
						else  if(Weight>=20 && Weight<30) {
							AirPrice = objPerkmPrice.VIC_NSWfor20_30kg();
						}
						else  if(Weight>=30) {
							AirPrice = objPerkmPrice.VIC_NSWforAbove30kg();
						}
					Thirdprice = 15;
					Actualprice = Firstprice + AirPrice + Thirdprice;
					
				}
				else if(dropoffstate.equals("ACT")) {
					
					Firstprice = 15;
					if(Shipment.equals("Documents")){
						AirPrice = objPerkmPrice.VIC_ACTforDoc();
					}
						else if(Weight>0 && Weight<5) {
							AirPrice = objPerkmPrice.VIC_ACTfor0_5kg();
						}
						else  if(Weight>=5 && Weight<10) {
							AirPrice = objPerkmPrice.VIC_ACTfor5_10kg();
						}
						else  if(Weight>=10 && Weight<15) {
							AirPrice = objPerkmPrice.VIC_ACTfor10_15kg();
						}
						else  if(Weight>=15 && Weight<20) {
							AirPrice = objPerkmPrice.VIC_ACTfor15_20kg();
						}
						else  if(Weight>=20 && Weight<30) {
							AirPrice = objPerkmPrice.VIC_ACTfor20_30kg();
						}
						else  if(Weight>=30) {
							AirPrice = objPerkmPrice.VIC_ACTforAbove30kg();
						}
					ThirdBookingDistance =objInterDis.BookingDistanceAirport_Drop(objInterstate.ACTDepotAddress(),dropoffaddress);
					if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=1 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
						int BaseThreeHour_Car = 18;
						dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
						Thirdprice = BaseThreeHour_Car + dis;
					} 
					else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
					{
						int BaseThreeHour_Van = 25 ;
						dis = (int) Math.round(ThirdBookingDistance*ThreeHour_Perkm);
						Thirdprice = BaseThreeHour_Van + dis;
					}
					
						System.out.println("Third Price is" + Thirdprice);
			
					Actualprice = Firstprice + AirPrice + Thirdprice;
					

			}
		   }else if(pickupstate.equals("ACT")){
				if(dropoffstate.equals("NSW")) {
					
					FirstBookingDistance =objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.ACTDepotAddress());
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
					
						System.out.println("First Price is" + Firstprice);
			
					if(Shipment.equals("Documents")){
						AirPrice = objPerkmPrice.ACT_NSWForDoc();
					}
						else if(Weight>0 && Weight<5) {
							AirPrice = objPerkmPrice.ACT_NSWfor0_5kg();
						}
						else  if(Weight>=5 && Weight<10) {
							AirPrice = objPerkmPrice.ACT_NSWfor5_10kg();
						}
						else  if(Weight>=10 && Weight<15) {
							AirPrice = objPerkmPrice.ACT_NSWfor10_15kg();
						}
						else  if(Weight>=15 && Weight<20) {
							AirPrice = objPerkmPrice.ACT_NSWfor15_20kg();
						}
						else  if(Weight>=20 && Weight<30) {
							AirPrice = objPerkmPrice.ACT_NSWfor20_30kg();
						}
						else  if(Weight>=30) {
							AirPrice = objPerkmPrice.ACT_NSWforabove30kg();
						}
					Thirdprice = 15;
					Actualprice = Firstprice + AirPrice + Thirdprice;
					
					
				}
				else if(dropoffstate.equals("VIC")) {
					
					FirstBookingDistance =objInterDis.BookingDistancePick_Airport(pickupaddress,objInterstate.ACTDepotAddress());
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
					
						System.out.println("First Price is" + Firstprice);
			
					if(Shipment.equals("Documents")){
						AirPrice = objPerkmPrice.ACT_VICforDoc();
					}
						else if(Weight>0 && Weight<5) {
							AirPrice = objPerkmPrice.ACT_VICfor0_5kg();
						}
						else  if(Weight>=5 && Weight<10) {
							AirPrice = objPerkmPrice.ACT_VICfor5_10kg();
						}
						else  if(Weight>=10 && Weight<15) {
							AirPrice = objPerkmPrice.ACT_VICfor10_15kg();
						}
						else  if(Weight>=15 && Weight<20) {
							AirPrice = objPerkmPrice.ACT_VICfor15_20kg();
						}
						else  if(Weight>=20 && Weight<30) {
							AirPrice = objPerkmPrice.ACT_VICfor20_30kg();
						}
						else  if(Weight>=30) {
							AirPrice = objPerkmPrice.ACT_VICforabove30kg();
						}
						else 
							AirPrice = 0;
					Thirdprice = 15;
					Actualprice = Firstprice + AirPrice + Thirdprice;

		
				}
				
				
}
				
		    
		
		return Actualprice;
}
}
