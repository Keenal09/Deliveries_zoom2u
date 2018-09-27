package RequiredClassesfor_EachModule;

import org.apache.commons.lang3.RandomStringUtils;

public class Emailgeneration {
 
	
	public String genText() {
	    String randomText = "Zoom2u1abcdefghiuvwxy";
	    int length = 4;
	    String temp = RandomStringUtils.random(length, randomText);
	    return temp;
	}
	
	public String gen1Text() {
	    String randomText = "Zoom2u2jklmnopqrstz";
	    int length = 4;
	    String temp = RandomStringUtils.random(length, randomText);
	    return temp;
	}
}
