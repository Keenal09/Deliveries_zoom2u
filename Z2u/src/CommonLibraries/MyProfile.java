package CommonLibraries;

public class MyProfile {

	
	public String FNamefieldLocator(){
		
		String FName=".//*[@id='content']/div/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div[1]/div/input";
		return FName;
	}
	
	public String LNamefieldLocator(){
		
		String LName=".//*[@id='content']/div/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div[2]/div/input";
		return LName;
	}
	
	public String PhonenumfieldLocator(){
		
		String Phonenum=".//*[@id='content']/div/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[3]/div[1]/div[2]/input";
		return Phonenum;
		
	}
	
	public String CompanyNamefieldLocator(){
		
		String CompanyName=".//*[@id='content']/div/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[3]/div[2]/div[2]/input";
		return CompanyName;
	}
	
	public String AddressfieldLocator(){
		String AddressField=".//*[@id='content']/div/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[4]/div/div/div[2]/input";
		return AddressField;
	}
	
	public String AccountEmailfieldLocator(){
		
		String AccountEmail=".//*[@id='content']/div/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[5]/div[1]/div[2]/input";
		return AccountEmail;
	}
	
	public String InvoiceEmailfieldLocator(){
		String InvoiceEmail=".//*[@id='content']/div/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[5]/div[2]/div[2]/input";
		return InvoiceEmail;
	}
	
	public String ChangePwdbtnLocator(){
		String ChangePwdbtnLocator=".//*[@id='content']/div/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[6]/div/button";
		return ChangePwdbtnLocator;
	}
	
}
