package training.day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EachWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_WEEK, 1);
		
		System.out.println();
		
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(df.format(c.getTime()));
		
		for(int i = 0;i<6;i++) {
			c.add(Calendar.DATE, 1);
			
		}
		System.out.println(df.format(c.getTime()));
		System.out.println();
	}

}
