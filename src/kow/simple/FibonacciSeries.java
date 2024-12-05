package kow.simple;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int value,i,temp=0,first=0,second=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		value = input.nextInt();
		System.out.print(first +" "+ second+" ");
		for(i=1;i<=value;i++) {
			temp =first+second;
			first = second;
			second=temp;
			System.out.println(temp);
		}
	}

}
