package RequiredClassesfor_EachModule;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ETADateandTime {
	
	
	public String ETADate(String date) throws ParseException{
		Calendar c;
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   	  c = Calendar.getInstance();
   	  Date da = new Date(date);
   	  c.setTime(da); 
   	int day = c.get(Calendar.DAY_OF_WEEK); // Now use today date.
   	  c.add(Calendar.DAY_OF_YEAR, 1); // Adding 5 days
   	  String output = sdf.format(c.getTime());
   	  //System.out.println("Date is =" + output);
   	  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
   	  Date dt1=format1.parse(output);
   	
    DateFormat format2=new SimpleDateFormat("EEEE"); 
 	  String finalDay=format2.format(dt1);
 	 // System.out.println("final Day is" + finalDay);
 	  Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
   	 return finalDay;
	}
	
	public String CurrentETADate(String date) throws ParseException{
		Calendar cal;
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	   	  cal = Calendar.getInstance();
	   	  Date da = new Date(date);
	   	  cal.setTime(da);
	   	  // Now use today date.
	   	 String output = sdf.format(cal.getTime());
	   	  //System.out.println(" current Date is =" + output);
	   	  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
	   	  Date dt1=format1.parse(output);
	   	  DateFormat format2=new SimpleDateFormat("EEEE"); 
	   	  String CurrentDay=format2.format(dt1);
	   	  //System.out.println("final Day is" + CurrentDay);
	      return output ;
	}
	
	public String ETATime(String pickupTime) throws ParseException{
		String output1;
		SimpleDateFormat sdf1 = new SimpleDateFormat("h:mma");
  	  Calendar cal1 = Calendar.getInstance();
  	  //sdf1.setTimeZone(TimeZone.getTimeZone("DST"));
  	//sdf1.setTimeZone(TimeZone.getTimeZone("North America"));
  	  cal1.setTime(sdf1.parse(pickupTime));
  	 
  	
  	 //cal1.setTime(new Date(pickupTime));// sets calendar time/date
  	  cal1.add(Calendar.HOUR_OF_DAY, 3);
  	  int minutes = cal1.get(Calendar.MINUTE);
  	  if(minutes>00 && minutes<15) {
  		SimpleDateFormat sdf2 = new SimpleDateFormat("h:15a");// adds one hour
  		//sdf1.setTimeZone(TimeZone.getTimeZone("North America"));
    	  output1 = sdf2.format(cal1.getTime());
    	  
  	  }
  	  else if(minutes>15 && minutes<30) {
  		SimpleDateFormat sdf2 = new SimpleDateFormat("h:30a");// adds one hour
  		//sdf2.setTimeZone(TimeZone.getTimeZone("CST"));
  	     output1 = sdf2.format(cal1.getTime());
  	  }else if(minutes>30 && minutes<45) {
  		SimpleDateFormat sdf2 = new SimpleDateFormat("h:45a");// adds one hour
  		//sdf2.setTimeZone(TimeZone.getTimeZone("CST"));
    	  output1 = sdf2.format(cal1.getTime());
  	  }
  	  else if(minutes>45 && minutes<60) {
  		SimpleDateFormat sdf2 = new SimpleDateFormat("h:00a");// adds one hour
  		//sdf2.setTimeZone(TimeZone.getTimeZone("CST"));
    	  output1 = sdf2.format(cal1.getTime());
  	  }
  	  else {
  		SimpleDateFormat sdf2 = new SimpleDateFormat("h:mma");// adds one hour
  		//sdf2.setTimeZone(TimeZone.getTimeZone("CST"));
  	    output1 = sdf2.format(cal1.getTime());
  	  } //System.out.println("Date is =" + output1); 
    	  return output1;
	}
	
	public String ETADateCurrent(String Date) throws ParseException{
		Calendar cal;
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	   	  cal = Calendar.getInstance();
	   	  Date da = new Date(Date);
	   	  cal.setTime(da);
	   	  // Now use today date.
	   	 String output = sdf.format(cal.getTime());
	   	 // System.out.println(" current Date is =" + output);
	   	  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
	   	  Date dt1=format1.parse(output);
	   	  DateFormat format2=new SimpleDateFormat("EEEE"); 
	   	  String CurrentDay=format2.format(dt1);
	   	  //System.out.println("final Day is" + CurrentDay);
		String days =cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
	   	  return days;
	}
	
	

}
