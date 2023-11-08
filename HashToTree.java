package training.day1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashToTree {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("The");
		hashSet.add("Developer");
		hashSet.add("Build");
		hashSet.add("the");
		hashSet.add("Application");
		System.out.println("HashSet " + hashSet);
		
		Set<String> treeSet = new TreeSet<String>(hashSet);
		System.out.println("Tree Set "+ treeSet);
	}

}
