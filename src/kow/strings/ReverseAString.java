package kow.strings;

import java.util.Scanner;

public class ReverseAString {
	static String str, concatenatedString;
	static char ch;

	public static void main(String[] args) {

		Scanner inputString = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		str = inputString.next();
		reverse(str);
		reverseUsingStringBuilder(str);

	}

	private static void reverseUsingStringBuilder(String str2) {
		StringBuilder stringBuilderInput = new StringBuilder();
		stringBuilderInput.append(str);

		System.out.println("Using Inbuilt Function: " + stringBuilderInput.reverse());

	}

	private static void reverse(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(i);
			concatenatedString = ch + concatenatedString;
			System.out.println("Using Loop: " + concatenatedString);
		}

	}

}
