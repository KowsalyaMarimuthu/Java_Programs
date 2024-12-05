package kow.simple;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int value, i = 0;
		System.out.print("Enter the number to verify:");
		Scanner input = new Scanner(System.in);
		value = input.nextInt();
		if(value%2!=0) {
			System.out.print("Prime");
		}
		else {
			System.out.print("Not a Prime");
		}

	}

}
