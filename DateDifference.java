package training.day1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {

	static void find(String doj, String dol) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date1 = sdf.parse(doj);
			Date date2 = sdf.parse(dol);
			
			long timediff = date2.getTime() - date1.getTime();
			
			long daydiff = (timediff/(1000*60*60*24))%365;
			
			long yearsdiff = (timediff/(1000l*60*60*24*365));
			
			System.out.println("Difference between two dates");
			
			System.out.println(daydiff+" days "+yearsdiff+ " years");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
			String doj = "31/05/1995";
			String dol = "09/11/2023";
			
			find(doj,dol);
	}

}
