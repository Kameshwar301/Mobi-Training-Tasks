package training.day1;

import java.util.Scanner;

public class AvgThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = sc.nextInt();
		System.out.println("Enter number2");
		int num2 = sc.nextInt();
		System.out.println("Enter number3");
		int num3 = sc.nextInt();
		
		double result = (double) (num1+num2+num3)/3;
		
		System.out.println("Avergae of Three number is: "+result);
	}

}
