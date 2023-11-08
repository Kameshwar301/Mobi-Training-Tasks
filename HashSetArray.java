package training.day1;

import java.util.HashSet;

public class HashSetArray {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Leo");
		h.add("Cobra");
		h.add("PS");
		h.add("Sarkar");
		
		System.out.println(h);
		
		Object[] arr = h.toArray();
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(Object n : arr) {
			System.out.println(n);
		}
	}

}
