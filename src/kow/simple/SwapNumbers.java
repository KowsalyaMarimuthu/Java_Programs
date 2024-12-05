package kow.simple;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1 = input.nextInt();
		System.out.println("Enter number 2: ");
		num2 = input.nextInt();
		swapWithoutTemp(num1,num2);
		swapWithTemp(num1,num2);
	

	}

	private static void swapWithTemp(int num1, int num2) {
		int temp=0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Swapped Numbers: "+num1 + " " + num2);
	}

	private static void swapWithoutTemp(int num1, int num2) {
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;
		System.out.println("Swapped Numbers: "+num1 + " " + num2);
		
	}

}
