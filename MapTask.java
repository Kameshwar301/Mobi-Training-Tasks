package training.day1;

import java.util.HashMap;

public class MapTask {

	public static void main(String[] args) {
		HashMap<Integer, String> mapTest = new HashMap<Integer, String>();
		mapTest.put(1, "Cricket");
		mapTest.put(2, "Football");
		mapTest.put(3, "Volly Ball");
		mapTest.put(4, "Hockey");
		
		System.out.println(mapTest);
		
		boolean result = mapTest.isEmpty();
		
		System.out.println("Is hash map empty : " +result);
		mapTest.clear();
		System.out.println(mapTest);
		result = mapTest.isEmpty();
		System.out.println("Is hash map empty : " +result);

	}

}
