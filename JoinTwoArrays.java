package training.day1;

import java.util.ArrayList;

public class JoinTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> rayOne = new ArrayList<String>();
		rayOne.add("Testing");
		rayOne.add("Developing");
		rayOne.add("Deploy");
		
		ArrayList<String> rayTwo = new ArrayList<String>();
		
		rayTwo.add("12");
		rayTwo.add("22");
		rayTwo.add("32");
		
		System.out.println("RayTwo before join" + rayTwo);
		
		rayTwo.addAll(rayOne);
		
		System.out.println("RayTwo after join" + rayTwo);
		
		//Array list isempty or not
		
		if(rayOne.isEmpty()) {
			System.out.println(rayOne.isEmpty());
		}
		else {
			System.out.println("is Not empty");
		}
	}
	
}
