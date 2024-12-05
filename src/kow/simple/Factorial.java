package kow.simple;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int value, i, fact=1;
		System.out.print("Enter the number:");
		Scanner input = new Scanner(System.in);
		value = input.nextInt();
		for (i = 1; i <= value; i++) {
			fact = fact * i;
		}
System.out.print("Factorial of "+value+" is: "+fact);
	}

}
