package training.day1;

import java.util.Scanner;

public class PalindromeTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test, revstr="";
		System.out.println("Enter the String ");
		test = sc.nextLine();
		for(int i=(test.length()-1);i>=0;i--) {
			revstr = revstr + test.charAt(i);
		}
		System.out.println(revstr);
		if(revstr.equals(test)) {
			System.out.println("The given String "+test+ " is palindrome");
		}
		else {
			System.out.println("The given String "+test+" is not palindrome");
		}
	}

}
