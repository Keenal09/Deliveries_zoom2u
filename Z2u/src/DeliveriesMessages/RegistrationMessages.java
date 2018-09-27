package DeliveriesMessages;

public class RegistrationMessages {

	public String FirstnameValidation(){
		
		String FirstnameValidationMsg="Please enter your first name";
		return FirstnameValidationMsg;
	}
	
public String LastnameValidation(){
		
		String LastnameValidationMsg="Please enter your last name.";
		return LastnameValidationMsg;
	}

public String PhonenumberValidation(){
	
	String PhonenumberValidationMsg = "Please enter a valid phone number.";
	return PhonenumberValidationMsg;
}

public String ValidEmailValidation(){
	
	String ValidEmailValidationMsg = "Please enter a valid email.";
	return ValidEmailValidationMsg;
}

public String PasswordValidation(){
	
	String PasswordValidation = "The password must be at least 6 characters long.";
	return PasswordValidation;
}

public String ConfirmPasswordValidation(){
	
	String ConfirmPasswordValidation = "Please enter confirm password.";
	return ConfirmPasswordValidation;
}

public String TermsandConditionsMessage(){
	String TermsandConditionsMessage = "Please accept the customer terms and conditions.";
	return TermsandConditionsMessage;
}

public String AlreadyRegisteredValidationMsg(){
	String AlreadyRegisteredmsg="Oops, looks like you have already registered with Zoom2u. You can login here, if you have forgotten your password you can reset it here. If you are still stuck feel free to give our office a call on 1300 766 628.";
	return AlreadyRegisteredmsg;
}

public String PartiallinktextinAlreadyRegisteredContentPart1(){
	String PartiallinktextinAlreadyRegisteredPart1 = "login here";
	return PartiallinktextinAlreadyRegisteredPart1;
}

public String PartiallinktextinAlreadyRegisteredContentPart2(){
	String PartiallinktextinAlreadyRegisteredPart2 = "here";
	return PartiallinktextinAlreadyRegisteredPart2;
}

public String PwdandConfirmPwdMismatchMessage(){
	
	String PwdandConfirmPwdMismatchmsg = "The password and confirm password does not match.";
	return PwdandConfirmPwdMismatchmsg;
}

public String FirstNamePlaceholder_Registration(){
	
	String FirstNameplaceholder="Name*";
	return FirstNameplaceholder;
}
public String LastNamePlaceholder_Registration(){
	
	String LastNameplaceholder="Last name*";
	return LastNameplaceholder;
}
public String CompanyNamePlaceholder_Registration(){
	
	String CompanyNameplaceholder="Company name";
	return CompanyNameplaceholder;
}
public String PhoneNumberPlaceholder_Registration(){
	
	String PhoneNumberplaceholder="Phone number*";
	return PhoneNumberplaceholder;
}
public String EmailPlaceholder_Registration(){
	
	String Emailplaceholder="Email*";
	return Emailplaceholder;
}
public String PasswordPlaceholder_Registration(){
	
	String Passwordplaceholder="Password*";
	return Passwordplaceholder;
}
public String ConfirmPasswordPlaceholder_Registration(){
	
	String ConfirmPasswordplaceholder="Confirm Password*";
	return ConfirmPasswordplaceholder;
}
}
