package training.day1;

import java.util.Scanner;

public class Calculator {

	static char operator;
	static Double num1, num2, result;

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Operator");
		operator = sc.next().charAt(0);
		
		System.out.println("Enter the num1 value");
		num1 = sc.nextDouble();
		
		System.out.println("Enter the num2 value");
		num2 = sc.nextDouble();
		
		if(operator == '+') {
			result = num1 + num2;
			System.out.println("The Addition value of "+ num1 +" + "+ num2+ " is :" + result);
		}
		else if(operator == '-') {
			result = num1-num2;
			System.out.println("The Subtraction value of "+ num1 + " - " + num2 + " is :"+ result);
		}
		else if(operator == '*') {
			result = num1 * num2;
			System.out.println("The Multiplication value of "+ num1 + " * " + num2 + " is :"+ result);
		}
		else if(operator == '/') {
			result = num1 / num2;
			System.out.println("The Divition value of "+ num1 + " / " + num2 + " is :"+ result);
		}
		else if(operator == '%') {
			result = (num1 + num2)/2;
			System.out.println("The Average value of "+ num1 + " % " + num2 + " is :"+ result);
		}
		else {
			System.out.println("Invalid Operator " + operator);
		}
	}
}
