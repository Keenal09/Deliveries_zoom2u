package Controller;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import MAB.Add_item_verification_heavyfreight;
import MAB.Create_aSameStateBooking;
import MAB.DefaultLabels_ForLargeItems;
import MAB.DefaultPlaceholders_ForLargeItems;

import MAB.DefaultPlaceholdersandlabels_AvailableonMAB;
import MAB.DefaultText_onMABPage;
import MAB.DefaultvalueofShipment_IsZero;
import MAB.Image_is_selected_for_HFshipments;
import MAB.MAB18_CreateSAP;
import MAB.MAB_Availlable_InHamburger;
import MAB.MAB_DetailsgetfromMyLocation;
import MAB.MAB_ETAVerifyForSameState;
import MAB.MAB_InterstatePriceVerification;
import MAB.OnSingleClickQuantity_One;
import MAB.Onclick_VerifyQuantityIncreases_Plusbtn;
import MAB.Onclick_VerifyQuantitydecreases_Minusbtn;
import MAB.SameStatePricingVerification;
import MAB.Subshipment_text_largeitems;
import MAB.Validation_MAB_Page;
import MAB.Validation_check_HF;
import MAB.validation_check_overlimits;
import RequiredClassesfor_EachModule.AirInterstatePriceVerify;
import RequiredClassesfor_EachModule.Dateclass;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;
import RequiredClassesfor_EachModule.SameStatePriceVerification;

public class MAB_Scenarios extends LoginCredentialsfor_Login{
	
	public void MAB_AvailableOption(String Emailid, String Pwd) throws IOException, JSONException, InterruptedException{
		MAB_Availlable_InHamburger objMABAvailable = new MAB_Availlable_InHamburger();

		objMABAvailable.MAB_Available(Emailid, Pwd);
		
	}
	
	public void VerifyShipmentsandtextBydefault(){
		
		DefaultText_onMABPage objDefault = new DefaultText_onMABPage();
		
		objDefault.DefaultTextverification();
	}
	
	public void DefaultShipmentIs_Zero(){
		
		DefaultvalueofShipment_IsZero objDefault = new DefaultvalueofShipment_IsZero();
		objDefault.VerifyDefaultvalueofShipment_zero();
	}
	
	public void OnclickonPlusbtn_QuantityIncreases(){
		
		Onclick_VerifyQuantityIncreases_Plusbtn objOnclick = new Onclick_VerifyQuantityIncreases_Plusbtn();
	    objOnclick.VerifyOnclick_PlusbtnIncreases();
	}
	
public void OnclickonMinusbtn_Quantitydecreases(){
		
		Onclick_VerifyQuantitydecreases_Minusbtn objOnclick = new Onclick_VerifyQuantitydecreases_Minusbtn();
	    objOnclick.VerifyOnclick_Minusbtndecreases();
	}

public void OnSingleClick_Quantitywillbeone(){
	
	OnSingleClickQuantity_One objSingleClick = new OnSingleClickQuantity_One();
	
	objSingleClick.OnClick_valueone();
	
}

public void Defaultplaceholderslabels_Verification(){
	
	DefaultPlaceholdersandlabels_AvailableonMAB objDefault = new DefaultPlaceholdersandlabels_AvailableonMAB();
	
	objDefault.LabelsandPlaceholders_Verify();
}

public void SubshipmentMessages_ForLargeItems(){
	
	Subshipment_text_largeitems objSubshipment = new Subshipment_text_largeitems();
	
	objSubshipment.subshipmenttextverificationforlargeitmes();
}

public void LabelsDefault_ForLargeItems(){
	
	DefaultLabels_ForLargeItems objLarge = new DefaultLabels_ForLargeItems();
	objLarge.LargeItem_DefaultLabels("General Van");
	objLarge.LargeItem_DefaultLabels("Furniture");
	objLarge.LargeItem_DefaultLabels("Building Materials");
	objLarge.LargeItem_DefaultLabels("General Truck Shipments");
	objLarge.LargeItem_DefaultLabels("Pallets");
	objLarge.LargeItem_DefaultLabels("Machinery");
	objLarge.LargeItem_DefaultLabels("Vehicles");
	objLarge.LargeItem_DefaultLabels("Container");
	objLarge.LargeItem_DefaultLabels("Full Truck Load");
}

public void PlaceholdersDefault_ForLargeItems(){
	
	DefaultPlaceholders_ForLargeItems objLarge = new DefaultPlaceholders_ForLargeItems();
	objLarge.Verifyplaceholders_forheavyfreight("GeneralVansShipment");
	objLarge.Verifyplaceholders_forheavyfreight("Furniture");
	objLarge.Verifyplaceholders_forheavyfreight("BuildingMaterials");
	objLarge.Verifyplaceholders_forheavyfreight("GeneralTruckShipments");
	objLarge.Verifyplaceholders_forheavyfreight("Pallets");
	objLarge.Verifyplaceholders_forheavyfreight("Machinery");
	objLarge.Verifyplaceholders_forheavyfreight("Vehicles");
	objLarge.Verifyplaceholders_forheavyfreight("Container");
	objLarge.Verifyplaceholders_forheavyfreight("Fulltruckload");
}

public void DetailsgetfromMyLocation_onMAB(){
	
	MAB_DetailsgetfromMyLocation objMAB = new MAB_DetailsgetfromMyLocation();
	
	objMAB.MAB_DetailsfromMylocationonMAB();
}

public void SamestatePriceverification(String PickupTime) throws JSONException, IOException, InterruptedException{
	
	SameStatePricingVerification objSamestate = new SameStatePricingVerification();
	
	objSamestate.samestate_Pricing("Documents", "Bike", "5", PickupTime);
	 //driver.navigate().refresh();
	objSamestate.samestate_Pricing("Satchel, laptops", "Bike", "3", PickupTime);
	// driver.navigate().refresh();
	 objSamestate.samestate_Pricing("Documents", "Car", "13", PickupTime);
	 //driver.navigate().refresh(); 
	objSamestate.samestate_Pricing("Satchel, laptops", "Car", "6", PickupTime);
	 //driver.navigate().refresh();
	objSamestate.samestate_Pricing("Cakes, flowers, delicates", "Car", "3", PickupTime);
	//driver.navigate().refresh();
	objSamestate.samestate_Pricing("Small Box", "Car", "9", PickupTime);
	// driver.navigate().refresh();
	objSamestate.samestate_Pricing("Small Box", "Van", "12", PickupTime);
	// driver.navigate().refresh();
	objSamestate.samestate_Pricing("Large Box", "Van", "3", PickupTime);
}

public void InterstatePriceVerification(String Pickupstate,String Dropoffstate) throws InterruptedException, IOException, JSONException {
	   System.out.println(".................................................................................................");
	   System.out.println("GQ13:Interstate Price verification method started" + " "  + "with" + " " + Pickupstate + " " + "and" + " " + Dropoffstate);
		MAB_InterstatePriceVerification objAirPrice = new MAB_InterstatePriceVerification();
		driver.navigate().refresh();
		objAirPrice.AirInterstateVerification("Documents", "11", Pickupstate, Dropoffstate, "Car");
	   driver.navigate().refresh();
	   objAirPrice.AirInterstateVerification("Documents", "14", Pickupstate, Dropoffstate, "Car");
	   driver.navigate().refresh();
	   objAirPrice.AirInterstateVerification("Documents", "14", Pickupstate, Dropoffstate, "Car");
	   driver.navigate().refresh();
	   objAirPrice.AirInterstateVerification("Satchel, laptops", "3", Pickupstate, Dropoffstate, "Car");
	   driver.navigate().refresh();
	   objAirPrice.AirInterstateVerification("Satchel, laptops", "6", Pickupstate, Dropoffstate, "Car");
	   driver.navigate().refresh();
	   objAirPrice.AirInterstateVerification("Cakes, flowers, delicates", "4", Pickupstate, Dropoffstate, "Car");
	   driver.navigate().refresh();
	   objAirPrice.AirInterstateVerification("Small Box", "8", Pickupstate, Dropoffstate, "Car");
	   driver.navigate().refresh();
	   objAirPrice.AirInterstateVerification("Small Box", "12", Pickupstate, Dropoffstate, "Van");
	   driver.navigate().refresh();
	   objAirPrice.AirInterstateVerification("Large Box", "2", Pickupstate, Dropoffstate, "Van");
	   System.out.println("GQ13:Interstate Price verification method completed" + " "  + "with" + " " + Pickupstate + " " + "and" + " " + Dropoffstate);
	   System.out.println(".................................................................................................");
	   
}

public void SamestatebookingCreate() throws InterruptedException, JSONException, IOException{
	
	Create_aSameStateBooking objsamestate = new Create_aSameStateBooking();
	
	objsamestate.SameStateBooking_create("Documents");
}

public void AddItemFor_Heavyfreight() throws InterruptedException{
	
	Add_item_verification_heavyfreight objAdd = new Add_item_verification_heavyfreight();
	objAdd.Additem_verification_HF("BuildingMaterials");
	objAdd.Additem_verification_HF("GeneralTruckShipments");
	objAdd.Additem_verification_HF("Pallets");
	objAdd.Additem_verification_HF("Machinery");
	objAdd.Additem_verification_HF("Vehicles");
	objAdd.Additem_verification_HF("Container");
}

public void ETAVerificationfor_SameState(String PickupTime) throws InterruptedException, ParseException{
	
	
	Dateclass objDate = new Dateclass();
	String CurrentDate = objDate.ETACurrentDate();
	  String ETANextDate = objDate.ETANextdate();
	  String ETANextFifthDate = objDate.ETANext5Date();
	
	MAB_ETAVerifyForSameState objETAverifyforSameState = new MAB_ETAVerifyForSameState();
	
	objETAverifyforSameState.ETAvalidateforSameState("Documents",CurrentDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Documents",ETANextDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Documents",ETANextFifthDate, PickupTime);
	
	objETAverifyforSameState.ETAvalidateforSameState("Satchel, laptops",CurrentDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Satchel, laptops",ETANextDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Satchel, laptops",ETANextFifthDate, PickupTime);
	
	objETAverifyforSameState.ETAvalidateforSameState("Cakes, flowers, delicates",CurrentDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Cakes, flowers, delicates",ETANextDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Cakes, flowers, delicates",ETANextFifthDate, PickupTime);

	objETAverifyforSameState.ETAvalidateforSameState("Small Box",CurrentDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Small Box",ETANextDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Small Box",ETANextFifthDate, PickupTime);
	
	objETAverifyforSameState.ETAvalidateforSameState("Large Box",CurrentDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Large Box",ETANextDate, PickupTime);
	objETAverifyforSameState.ETAvalidateforSameState("Large Box",ETANextFifthDate, PickupTime);
}


public void Images_ForLargeItems(){
	
	Image_is_selected_for_HFshipments objimage = new Image_is_selected_for_HFshipments();
	objimage.verifyImages_ForHF("GeneralVansShipment");
	objimage.verifyImages_ForHF("Furniture");
	objimage.verifyImages_ForHF("BuildingMaterials");
	objimage.verifyImages_ForHF("GeneralTruckShipments");
	objimage.verifyImages_ForHF("Pallets");
	objimage.verifyImages_ForHF("Machinery");
	objimage.verifyImages_ForHF("Vehicles");
	}

public void Images_ForLargeContainerandFullTruckload(){
	Image_is_selected_for_HFshipments objimage = new Image_is_selected_for_HFshipments();
	objimage.verifyImages_ForHF("Container");
	objimage.verifyImages_ForHF("Fulltruckload");

	
}

public void Validation_ForDefaultMAB(){
	
	Validation_MAB_Page objValidation = new Validation_MAB_Page();
	
	objValidation.validation_of_MAB();
	
	}

public void Validation_ForHF(){
	Validation_check_HF objvalidHF = new Validation_check_HF();
	
	objvalidHF.validation_forhf();
}

public void Validation_ForShipmentsOverlimits(){
	
	validation_check_overlimits objoverlimits = new validation_check_overlimits();
	
	objoverlimits.validation_foroverlimitsshipments();
}
public void Createsuggestaprice() throws InterruptedException, ParseException{
	
	MAB18_CreateSAP objimage = new MAB18_CreateSAP();
	objimage.CreateSAPBid("Documents");
	objimage.CreateSAPBid("Satchel, laptops");
	/*objimage.CreateSAPBid("BuildingMaterials");
	objimage.CreateSAPBid("GeneralTruckShipments");
	objimage.CreateSAPBid("Pallets");
	objimage.CreateSAPBid("Machinery");
	objimage.CreateSAPBid("Vehicles");*/
	}



}
