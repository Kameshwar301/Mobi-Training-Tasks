package training.day1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTask {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Nokia");
		list.add("Samsung");
		list.add("Apple");
		list.add("Blueberry");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
