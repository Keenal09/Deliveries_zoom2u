package DeliveriesMessages;

public class ForgotPassword {

	
	public String SuccessMessagepart1(){
		
		String Messagepart1="We've sent an email to";
		return Messagepart1;
		
	}
	
	public String SuccessMessagepart2(){
		
		String Messagepart2="to reset your password so check your inbox and follow the link.";
		return Messagepart2;
	}
	
	public String ErrorMessageforNotRegisteredEmail(){
		
		String ErrorMessagefornotRegistered="No account found with the entered email address. Enter your email and we'll send you a link to reset your password.";
		return ErrorMessagefornotRegistered;
	}
	
	public String ErrorMessageforInvalidorEmptyString(){
		
		String ErrorMessageforInvalidorEmptyString="Please enter registered email.";
		return ErrorMessageforInvalidorEmptyString;
	}
	
	public String ForgotPasswordLinkText(){
		
		String ForgotPasswordTextLink="Forgot Password?";
		return ForgotPasswordTextLink;
	}
	
	public String DefaultMessageDisplayed(){
		String DefaultMessageDisplayed="Enter your email and we'll send you a link to reset your password.";
		return DefaultMessageDisplayed;
	}
	
	public String PlaceholderValue_ForgotPassword(){
		
		String Placeholdervalue="Email";
		return Placeholdervalue;
	}
	
	
}
