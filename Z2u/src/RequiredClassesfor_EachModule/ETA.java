package RequiredClassesfor_EachModule;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ETA {
	
	public String ETACurrentDate(){
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
Calendar cal = Calendar.getInstance();
		
	    
		//TimeZone obj = TimeZone.getTimeZone("CST");
		//dateFormat.setTimeZone(obj);

		String date1 = dateFormat.format(cal.getTime());
		//System.out.println("Currrrent Ddddate is =" + date1);
		return date1;
		
		}
	
	public String ETANextDate(){
		/*
		 Calendar currentDate=new GregorianCalendar();
   	  String dayOfWeek = currentDate.getDisplayName( Calendar.DAY_OF_WEEK ,Calendar.LONG, Locale.getDefault());
   	  currentDate.add(Calendar.DAY_OF_WEEK, 1);
   	  DateFormat format24=new SimpleDateFormat("EEEE");
   	  String Nextday=format24.format(currentDate.getTime());
   	  System.out.println("Current dddate is = "+ dayOfWeek);
   	  System.out.println("Next day is = "+ Nextday);
   	  
   	  */
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
Calendar cal = Calendar.getInstance();
		
	    
		//TimeZone obj = TimeZone.getTimeZone("CST");
		//dateFormat.setTimeZone(obj);

		cal.add(Calendar.DAY_OF_WEEK, 1);
		DateFormat format24=new SimpleDateFormat("dd-MMM-yyyy");
	   	  String Nextday=format24.format(cal.getTime());
		return Nextday;
	}
	
	public String ETADay(String date) throws ParseException{
		
		Calendar c;
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar cal = Calendar.getInstance();
			
		    
			//TimeZone obj = TimeZone.getTimeZone("CST");
			//sdf.setTimeZone(obj);

  	  Date da = new Date(date);
  	  cal.setTime(da); 
  	 DateFormat format2=new SimpleDateFormat("EEEE"); 
	  String finalDay=format2.format(da);
	  //System.out.println("final Day is" + finalDay);
	  Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
  	 return finalDay;
	}
	
public String ETANextDay(String date) throws ParseException{
		
		Calendar c;
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
  	  c = Calendar.getInstance();
  	  Date myDate = sdf.parse(date);
	c.setTime(myDate);
  	  c.add(Calendar.DAY_OF_MONTH, 1);
  	  
  	 DateFormat format2=new SimpleDateFormat("EEEE"); 
	  String NextfinalDay=format2.format(c.getTime());
	  //System.out.println("Next Day is" + NextfinalDay);
	  //Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
       return NextfinalDay;
}
public String ETAMorethanNextDay(String date){
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DAY_OF_WEEK, 2);
	DateFormat format24=new SimpleDateFormat("dd-MMM-yyyy");
   	  String Next2Nextday=format24.format(cal.getTime());
   	  return Next2Nextday;
	
}

public String ETAnext2nextDay(String date) throws ParseException{
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	Calendar cal = Calendar.getInstance();
	Date myDate = dateFormat.parse(date);
	cal.setTime(myDate);
	cal.add(cal.DAY_OF_MONTH, 1);
	DateFormat format24=new SimpleDateFormat("EEEE");
   	  String Next2nextday=format24.format(cal.getTime());
	return Next2nextday;
	
}

public String ETA2DaysfromtheDate(String date) throws ParseException{
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	Calendar cal = Calendar.getInstance();
	Date myDate = dateFormat.parse(date);
	cal.setTime(myDate);
	cal.add(Calendar.DAY_OF_WEEK, 2);
	DateFormat format24=new SimpleDateFormat("EEEE");
   	  String Days2fromDate=format24.format(cal.getTime());
   	  return Days2fromDate;
	
}

public String ETA3DaysfromtheDate(String date) throws ParseException{
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	Calendar cal = Calendar.getInstance();
	Date myDate = dateFormat.parse(date);
	cal.setTime(myDate);
	cal.add(Calendar.DAY_OF_WEEK, 3);
	DateFormat format24=new SimpleDateFormat("EEEE");
   	  String Days3fromDate=format24.format(cal.getTime());
   	  return Days3fromDate;
	
}

public String CurrentDateETAheavyfreight(){
	
	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	Calendar cal = Calendar.getInstance();
	String date1 = dateFormat.format(cal.getTime());
	//System.out.println("Currrrent Ddddate is =" + date1);
	return date1;
}


}