package DeliveriesMessages;

public class LoginMessages {

	public String NotRegisteredEmailValidation(){
		
		String NotRegisteredEmailValidationmessage="Email address does not exist. Please try again, or contact us on 1300 ZOOM2U(1300 966 628).";
		return NotRegisteredEmailValidationmessage;
	}
	
	public String PasswordLengthMessage(){
		
		String PasswordLengthMessage = "The password must be at least 6 characters long.";
		return PasswordLengthMessage;
	}
	
	public String IncorrectUsernameorPwdMessage(){
		
		String IncorrectUsernameorPwdmsg="Username/password combination is incorrect. Check for spelling errors, spaces in email/password, or automatic capitalisation.";
		return IncorrectUsernameorPwdmsg;
	}
	
	public String Disableaccountvalidation()
	{
		String IncorrectUsernameorPwdmsg="Your account has been disabled due to unpaid invoices. Please check your inbox for outstanding invoices, or contact us for more information.";
		return IncorrectUsernameorPwdmsg;
	}
}
