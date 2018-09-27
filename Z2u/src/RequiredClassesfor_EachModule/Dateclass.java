package RequiredClassesfor_EachModule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Dateclass {

	
	public String ETACurrentDate() {
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		//dateFormat = new SimpleDateFormat("AEST");
		// default system timezone if passed null or empty
		Calendar cal = Calendar.getInstance();
		
	    
		//TimeZone obj = TimeZone.getTimeZone("CST");
		//dateFormat.setTimeZone(obj);

	
	

		//String	timeZone = Calendar.getInstance().getTimeZone().getID();
		
		// set timezone to SimpleDateFormat
		//dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		//cal.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
		//System.out.println("Timezone is="+cal.getTimeZone());
		String date1 = dateFormat.format(cal.getTime());
		//System.out.println("Currrrent Ddddate is =" + date1);
		return date1;
	}
	
	public String ETANextdate() {
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		//dateFormat = new SimpleDateFormat("AEST");
		// default system timezone if passed null or empty
		
		//String	timeZone = Calendar.getInstance().getTimeZone().getID();
		
		// set timezone to SimpleDateFormat
		//dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_WEEK, 1);
		DateFormat format24=new SimpleDateFormat("dd-MMM-yyyy");
		 //cal.setTimeZone(TimeZone.getTimeZone("CST"));
	   	  String Nextday=format24.format(cal.getTime());
		return Nextday;
	}
	
	public String ETANext5Date() {
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		//dateFormat = new SimpleDateFormat("AEST");
		// default system timezone if passed null or empty
		
		//String	timeZone = Calendar.getInstance().getTimeZone().getID();
		
		// set timezone to SimpleDateFormat
		//dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_WEEK, 5);
		DateFormat format24=new SimpleDateFormat("dd-MMM-yyyy");
		//cal.setTimeZone(TimeZone.getTimeZone("CST"));
	   	  String Nextfifthday=format24.format(cal.getTime());
		return Nextfifthday;
		
	}
	
	public String ETASaturday(){
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		//dateFormat = new SimpleDateFormat("AEST");
		// default system timezone if passed null or empty
		
		//String	timeZone = Calendar.getInstance().getTimeZone().getID();
		
		// set timezone to SimpleDateFormat
		//dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		DateFormat format24=new SimpleDateFormat("dd-MMM-yyyy");
		//cal.setTimeZone(TimeZone.getTimeZone("CST"));
		cal.add(Calendar.DATE, 7);
	   	  String Saturday=format24.format(cal.getTime());
		return Saturday;
		
	}
	
	public String ETASunday(){
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		//dateFormat = new SimpleDateFormat("AEST");
		// default system timezone if passed null or empty
		
		//String	timeZone = Calendar.getInstance().getTimeZone().getID();
		
		// set timezone to SimpleDateFormat
		//dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		DateFormat format24=new SimpleDateFormat("dd-MMM-yyyy");
		//cal.setTimeZone(TimeZone.getTimeZone("CST"));
		cal.add(Calendar.DATE, 7);
		String Sunday=format24.format(cal.getTime());
		return Sunday;
		
	}
}
