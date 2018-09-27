package RequiredClassesfor_EachModule;

import java.io.IOException;

import org.json.JSONException;

import CommonLibraries.GetQuoteLocators;
import CommonLibraries.QuantityValue;
import MAB.MAB_DistanceCalculated;

public class SameStateCalculation extends DistanceCalculation{
	
	QuantityValue objGetQuotequantity = new QuantityValue();
	double distance;
	
	 public double SameDayCalculation(String Shipment, String Vehicle) throws IOException, JSONException {
    	 
		 distance = Distancalculated();
    	 
    	 double SameDay_Perkm = 1.4;
    	
    	 double Actualprice;
    	 double price;
    	 double dis = 0;
    	 
    	 if(dis<2){
    		 dis = 2;
    	 }
    	
    	 
    	if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>0 && objGetQuotequantity.DocumentQuantityValue()<=12) || Shipment.equals("Satchel, laptops") && objGetQuotequantity.LaptopsQuantityValue()<=4 && Vehicle.equals("Bike") ){	
    		 double BaseSameDay_Bike = 8;
    		 dis = Math.round(distance*SameDay_Perkm); 
    		 price = BaseSameDay_Bike + dis;
    		 
    	}
    	else if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=13 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
    		double BaseSameDay_Car = 12;
    		dis = Math.round(distance*SameDay_Perkm);
    		price = BaseSameDay_Car + dis;
    	} 
    	else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
    	{
    		double BaseSameDay_Van = 18 ;
    		dis = Math.round(distance*SameDay_Perkm);
    		price = BaseSameDay_Van + dis;
    	}
    	else
    		price =0;
    		
    	
    		System.out.println("pprice is=" + price);
    		if(price<20){
    			 
    			Actualprice = price + 1;
    		
    			 
    		 }
    		 else if(price>20 && price<50){
    			Actualprice = price + 2;
    		
    			 
    		 }
    		 else if(price>50 && price<100){
    			Actualprice = price + 3;
    			 
    		 }
    		 else if(price>100 && price<200){
    			 Actualprice = price + 5;
    			
    			 
    		 }
    		 else {
    			 Actualprice = price +20;
    			
    		 }
    		 return Actualprice;
	
		}
	 
	 public double ThreehourCalculation(String Shipment, String Vehicle) throws IOException, JSONException{
		 
		 distance = Distancalculated();
		 double ThreeHour_Perkm = 1.7;
	    	
    	 double Actualprice;
    	 double price;
    	 double dis;
    	 if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>0 && objGetQuotequantity.DocumentQuantityValue()<=12) || Shipment.equals("Satchel, laptops") && objGetQuotequantity.LaptopsQuantityValue()<=4 && Vehicle.equals("Bike") ){	
    		 double BaseThreeHour_Bike = 11;
    		 dis = Math.round(distance*ThreeHour_Perkm); 
    		 price = BaseThreeHour_Bike + dis;
    		 
    	}
    	else if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=13 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
    		double BaseThreeHour_Car = 18;
    		dis = Math.round(distance*ThreeHour_Perkm);
    		price = BaseThreeHour_Car + dis;
    	} 
    	else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
    	{
    		double BaseThreeHour_Van = 25 ;
    		dis = Math.round(distance*ThreeHour_Perkm);
    		price = BaseThreeHour_Van + dis;
    	}
    	else
    		price =0;
    		
    	
    		System.out.println("pprice is=" + price);
    		if(price<20){
    			 
    			Actualprice = price + 1;
    		
    			 
    		 }
    		 else if(price>20 && price<50){
    			Actualprice = price + 2;
    		
    			 
    		 }
    		 else if(price>50 && price<100){
    			Actualprice = price + 3;
    			 
    		 }
    		 else if(price>100 && price<200){
    			 Actualprice = price + 5;
    			
    			 
    		 }
    		 else {
    			 Actualprice = price +20;
    			
    		 }
    		 return Actualprice;
	
		}
	 
 public double VIPCalculation(String Shipment, String Vehicle) throws IOException, JSONException{
		 
		 distance = Distancalculated();
		 double VIP_Perkm = 4;
	    	
    	 double Actualprice;
    	 double price;
    	 double dis;
    	 if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>0 && objGetQuotequantity.DocumentQuantityValue()<=12) || Shipment.equals("Satchel, laptops") && objGetQuotequantity.LaptopsQuantityValue()<=4 && Vehicle.equals("Bike") ){	
    		 double BaseVIP_Bike = 18;
    		 dis = Math.round(distance*VIP_Perkm); 
    		 price = BaseVIP_Bike + dis;
    		 
    	}
    	else if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=13 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
    		double BaseVIP_Car = 30;
    		dis = Math.round(distance*VIP_Perkm);
    		price = BaseVIP_Car + dis;
    	} 
    	else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
    	{
    		double BaseVIP_Van = 45 ;
    		dis = Math.round(distance*VIP_Perkm);
    		price = BaseVIP_Van + dis;
    	}
    	else
    		price =0;
    		
    	
    		System.out.println("pprice is=" + price);
    		if(price<20){
    			 
    			Actualprice = price + 1;
    		
    			 
    		 }
    		 else if(price>20 && price<50){
    			Actualprice = price + 2;
    		
    			 
    		 }
    		 else if(price>50 && price<100){
    			Actualprice = price + 3;
    			 
    		 }
    		 else if(price>100 && price<200){
    			 Actualprice = price + 5;
    			
    			 
    		 }
    		 else {
    			 Actualprice = price +20;
    			
    		 }
    		 return Actualprice;
	
		}
 
 public double VIPCalculationAfter3pm(String Shipment, String Vehicle) throws IOException, JSONException{
	 
	 distance = Distancalculated();
	 double VIP_Perkm = 4;
    	
	 double Actualprice;
	 double price;
	 double dis;
	 
	 if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>0 && objGetQuotequantity.DocumentQuantityValue()<=12) || Shipment.equals("Satchel, laptops") && objGetQuotequantity.LaptopsQuantityValue()<=4 && Vehicle.equals("Bike") ){	
		 double BaseVIP_Bike = 18;
		 dis = Math.round(distance*VIP_Perkm); 
		 price = BaseVIP_Bike + dis;
		 
	}
	else if((Shipment.equals("Documents") && objGetQuotequantity.DocumentQuantityValue()>=13 && objGetQuotequantity.DocumentQuantityValue()<=30) || Shipment.equals("Satchel, laptops") && (objGetQuotequantity.LaptopsQuantityValue()>0 && objGetQuotequantity.LaptopsQuantityValue()<16) || Shipment.equals("Small Box") && (objGetQuotequantity.SmallBoxQuantityValue()>0 && objGetQuotequantity.SmallBoxQuantityValue()<11) || Shipment.equals("Cakes, flowers, delicates") && (objGetQuotequantity.FlowersQuantityValue()>0 && objGetQuotequantity.FlowersQuantityValue()<16) && Vehicle.equals("Car")){
		double BaseVIP_Car = 30;
		dis = Math.round(distance*VIP_Perkm);
		price = BaseVIP_Car + dis;
	} 
	else if((Shipment.equals("Small Box") && objGetQuotequantity.SmallBoxQuantityValue()>10 && objGetQuotequantity.SmallBoxQuantityValue()<16) || (objGetQuotequantity.LargeBoxQuantityValue()>0 && objGetQuotequantity.LargeBoxQuantityValue()<5) && Vehicle.equals("Van"))
	{
		double BaseVIP_Van = 45 ;
		dis = Math.round(distance*VIP_Perkm);
		price = BaseVIP_Van + dis;
	}
	else
		price =0;
		
	
		System.out.println("pprice is=" + price);
		if(price<20){
			 
			Actualprice = price + 1 + 10;
		
			 
		 }
		 else if(price>20 && price<50){
			Actualprice = price + 2 + 10;
		
			 
		 }
		 else if(price>50 && price<100){
			Actualprice = price + 3 + 10;
			 
		 }
		 else if(price>100 && price<200){
			 Actualprice = price + 5 + 10;
			
			 
		 }
		 else {
			 Actualprice = price +20 + 10;
			
		 }
		 return Actualprice;

 }
	 
	 
	 }
    	
	 

     



