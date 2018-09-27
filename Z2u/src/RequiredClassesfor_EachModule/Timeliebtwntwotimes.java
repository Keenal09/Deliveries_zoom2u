package RequiredClassesfor_EachModule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Timeliebtwntwotimes {
 
	
	public Date Eightam_12pm(String time) throws ParseException{
          
		 String string1 = "8:00am";
		    Date time1 = new SimpleDateFormat("h:mma").parse(string1);
		    Calendar calendar1 = Calendar.getInstance();
		    calendar1.setTime(time1);

		    String string2 = "12:00pm";
		    Date time2 = new SimpleDateFormat("h:mma").parse(string2);
		    Calendar calendar2 = Calendar.getInstance();
		    calendar2.setTime(time2);

		    Date d = new SimpleDateFormat("h:mma").parse(time);
		    Calendar calendar3 = Calendar.getInstance();
		    calendar3.setTime(d);

		    Date x = calendar3.getTime();
		    if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
		        //checkes whether the current time is between 14:49:00 and 20:11:13.
		        return x;
		    }
		    else
		    	return null;
		    
}
	public Date Twelvepm_2pm(String time) throws ParseException{
        
		 String string1 = "12:00pm";
		    Date time1 = new SimpleDateFormat("h:mma").parse(string1);
		    Calendar calendar1 = Calendar.getInstance();
		    calendar1.setTime(time1);

		    String string2 = "2:00pm";
		    Date time2 = new SimpleDateFormat("h:mma").parse(string2);
		    Calendar calendar2 = Calendar.getInstance();
		    calendar2.setTime(time2);

		    Date d = new SimpleDateFormat("h:mma").parse(time);
		    Calendar calendar3 = Calendar.getInstance();
		    calendar3.setTime(d);

		    Date x = calendar3.getTime();
		    if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
		        //checkes whether the current time is between 14:49:00 and 20:11:13.
		        return x;
		    }
		    else
		    	return null;
		    
}
	public Date Twopm_5pm(String time) throws ParseException{
        
		 String string1 = "2:00pm";
		    Date time1 = new SimpleDateFormat("h:mma").parse(string1);
		    Calendar calendar1 = Calendar.getInstance();
		    calendar1.setTime(time1);

		    String string2 = "5:00pm";
		    Date time2 = new SimpleDateFormat("h:mma").parse(string2);
		    Calendar calendar2 = Calendar.getInstance();
		    calendar2.setTime(time2);

		    Date d = new SimpleDateFormat("h:mma").parse(time);
		    Calendar calendar3 = Calendar.getInstance();
		    calendar3.setTime(d);

		    Date x = calendar3.getTime();
		    if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
		        //checkes whether the current time is between 14:49:00 and 20:11:13.
		        return x;
		    }
		    else
		    	return null;
		    
}
	
	public Date Fivepm_12am(String time) throws ParseException{
        
		 String string1 = "5:00pm";
		    Date time1 = new SimpleDateFormat("h:mma").parse(string1);
		    Calendar calendar1 = Calendar.getInstance();
		    calendar1.setTime(time1);

		    String string2 = "12:00am";
		    Date time2 = new SimpleDateFormat("h:mma").parse(string2);
		    Calendar calendar2 = Calendar.getInstance();
		    calendar2.setTime(time2);
		    calendar2.add(Calendar.DATE, 1);


		    Date d = new SimpleDateFormat("h:mma").parse(time);
		    Calendar calendar3 = Calendar.getInstance();
		    calendar3.setTime(d);

		    Date x = calendar3.getTime();
		    if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
		        //checkes whether the current time is between 14:49:00 and 20:11:13.
		        return x;
		    }
		    else
		    	return null;
		    
}
	public Date Twelveam_8am(String time) throws ParseException{
        
		 String string1 = "12:00am";
		    Date time1 = new SimpleDateFormat("h:mma").parse(string1);
		    Calendar calendar1 = Calendar.getInstance();
		    calendar1.setTime(time1);

		    String string2 = "8:00am";
		    Date time2 = new SimpleDateFormat("h:mma").parse(string2);
		    Calendar calendar2 = Calendar.getInstance();
		    calendar2.setTime(time2);
		    


		    Date d = new SimpleDateFormat("h:mma").parse(time);
		    Calendar calendar3 = Calendar.getInstance();
		    calendar3.setTime(d);

		    Date x = calendar3.getTime();
		    if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
		        //checkes whether the current time is between 14:49:00 and 20:11:13.
		        return x;
		    }
		    else
		    	return null;
		    
}

   
}