package training.day1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
		try {
			String dt = "08/11/2023";
			Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dt);
			
			System.out.println(d);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
