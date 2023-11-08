package training.day1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Black");
		color.add("Yellow");
		color.add("Orange");
		color.add("Blue");
		color.add("Green");
		
		Iterator itr = color.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using Stream");
		color.stream().forEach(i ->{System.out.println(i);});
	}

}
