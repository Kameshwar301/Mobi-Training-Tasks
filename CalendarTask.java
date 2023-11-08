package training.day1;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;

public class CalendarTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(Calendar.getInstance().getTime().getTime());
		
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Year, Month, day, hour, minute " + cal.get(Calendar.YEAR) +" : " +cal.get(Calendar.MONTH) + 
			" : "	+cal.get(Calendar.DATE)+" : "+cal.get(Calendar.HOUR)+" : "+cal.get(Calendar.MINUTE));
	
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			Date dt = new Date();
			System.out.println(sdf.format(dt));
			
			System.out.println("Last day of current month "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
