package CommonLibraries;

public class ForgotPwdLocators {
    
	protected static String NotRegisteredEmailValidation1;
	protected static String NotRegisteredEmailValidation2;
	
	public String ForgotPwd_CancelLocator(){
		
		String Cancel_forgotpwd="//*[@id=\"forgotPasswordForm\"]/div[3]/div[1]/button";
		return Cancel_forgotpwd;
	}
	
	public String ForgotyourPwdlink(){
		
		String ForgotyourPwdlink="//*[@id=\"login\"]/div/div[3]/div/div[2]/div/a";
		
		return ForgotyourPwdlink;
	}
	
	public String Emailfield_ForgotPwdLocator(){
		
		String EmailfieldLocator="//*[@id=\"forgotPasswordForm\"]/div[1]/div/input";
	return EmailfieldLocator;
	}
	
	public String ResetBtnLocator_ForgotPwd(){
		
		String ResetbtnLocator="//*[@id=\"forgotPasswordForm\"]/div[3]/div[2]/button";
		return ResetbtnLocator;
	}
	
	public String Loginherelocator_ForgotPwd(){
		
		String LoginhereLocator="//*[@id=\"content\"]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div/button";
		return LoginhereLocator;
	}
	
	public String ResetMessage_Locator(){
		
		String ResetMessage="//*[@id=\"content\"]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div/span";
		return ResetMessage;
	}
	
	public String EmptyEmailfieldvalidLocator_ForgotPwd(){
		
		String EmptyEmailfield="//*[@id=\"forgotPasswordForm\"]/div[1]/div/span";
		return EmptyEmailfield;
	}
	
	public String NotRegisteredEmailValidLocator_ForgotPwd(){
		
		NotRegisteredEmailValidation1="//*[@id=\"content\"]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div/span";
		return NotRegisteredEmailValidation1;
	
		}
	
	public String NotRegisteredEmailValidotherLocator_ForgotPwd(){
		
		NotRegisteredEmailValidation2="//*[@id=\"content\"]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/span";
		return NotRegisteredEmailValidation2;
	}
	
	public String DefaultMessageDisplayedLocator_ForgotPassword(){
		String DefaultMessageDisplayedloc="//*[@id=\"content\"]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/span";
		return DefaultMessageDisplayedloc;
	}
	
	public String Zoom2uimgAvailable_ForgotPassword(){
		String Zoom2uimgLocator="//*[@id=\"content\"]/div[2]/div/div[1]/div/a/img";
		return Zoom2uimgLocator;
	}
}
