package kow.simple;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		int value;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Value: ");
		value = input.nextInt();
		reverseUsingStringFunctions(value);
		reverseWithoutUsingStringFunctions(value);

	}

	public static void reverseUsingStringFunctions(int value) {
		String convertedNum = Integer.toString(value);
		System.out.println("Reversed Value: ");
		for (int i = convertedNum.length() - 1; i >= 0; i--) {
			System.out.print(convertedNum.charAt(i));
		}

	}

	public static void reverseWithoutUsingStringFunctions(int value) {
		int temp, rev = 0;
		while (value > 0) {
			temp = value % 10;
			rev = rev * 10 + temp;
			value = value / 10;
		}
		System.out.print("Reversed Value: " + rev);
	}

}
