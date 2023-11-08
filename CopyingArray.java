package training.day1;

import java.util.ArrayList;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Computer");
		list.add("Mobile");
		list.add("Taplet");
		
		ArrayList<String> mylist = new ArrayList<String>();
		mylist = list;
		
		System.out.println(mylist);
	}

}
