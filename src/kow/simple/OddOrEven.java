package kow.simple;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int value;
		System.out.print("Enter the number to verify:");
		Scanner input = new Scanner(System.in);
		value = input.nextInt();
		if (value % 2 == 0) {
			System.out.print("The Value " + value + " is Even");
		}

	}

}
