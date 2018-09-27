package CommonLibraries;

public class MenuLocators {

	
	public String LiveMapLocator(){
		String Livemap=".//*[@id='nav']/li[1]/ul/li[1]/a/span";
		return Livemap;
	}
	
	public String MakeABookingLocator(){
		String MakeaBooking=".//*[@id='nav']/li[1]/ul/li[2]/a/span";
		return MakeaBooking;
	}
	
	public String GetQuoteLocator(){
		String GetQuoteLocator=".//*[@id='nav']/li[1]/ul/li[3]/a/span";
		return GetQuoteLocator;
	}
	
	public String BidrequestsLocator(){
		String BidrequestsLocator=".//*[@id='nav']/li[1]/ul/li[4]/a/span";
		return BidrequestsLocator;
	}
	
	public String DeliveryHistoryLocator(){
		String DeliveryHistoryLocator=".//*[@id='nav']/li[1]/ul/li[5]/a/span";
		return DeliveryHistoryLocator;
	}
	
	public String MessageCourierLocator(){
		String MessageCourierLocator=".//*[@id='nav']/li[1]/ul/li[6]/a/span";
		return MessageCourierLocator;
	}
	
	public String MyLocationsLocator(){
		String MyLocationsLocator=".//*[@id='nav']/li[2]/ul/li[1]/a/span";
		return MyLocationsLocator;
	}
	
	public String MyinvoicesLocator(){
		String MyInvoicesLocator=".//*[@id='nav']/li[2]/ul/li[2]/a/span";
		return MyInvoicesLocator;
	}
	
	public String MyProfileLocator(){
		String MyProfileLocator=".//*[@id='nav']/li[2]/ul/li[3]/a/span";
		return MyProfileLocator;
	}
}
