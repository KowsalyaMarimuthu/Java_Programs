package kow.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class FindNoOfOccurances_Word {
	static final int MAX_CHAR = 256;

	public static void main(String[] args) {
		String str = "";

		Scanner inputString = new Scanner(System.in);
		System.out.println("Enter the String to count the occurances: ");
		str = inputString.next();
		//getOccuringCharNaiveMethod(str);
		getOccuringCharUsingArray(str);
		//getOccuringCharUsingHashMap(str);

	}

//	private static void getOccuringCharUsingHashMap(String str) {
//		HashMap<Character, Integer> countOccurrences = new HashMap<Character, Integer>();
//		char[] ch = str.toCharArray();
//		for (char c : ch) {
//			if (countOccurrences.containsKey(c)) {
//				countOccurrences.put(c, countOccurrences.get(c) + 1);
//			} else {
//				countOccurrences.put(c, 1);
//			}
//		}
//		for (Map.Entry m : countOccurrences.entrySet()) {
//			System.out.println(m.getKey() + "--" + m.getValue());
//		}
//	}

	private static void getOccuringCharUsingArray(String str) {
		int counter[] = new int[MAX_CHAR];
		for (int i = 0; i < str.length(); i++) {
			counter[(int) str.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (counter[i] != 0) {
				// prints frequency of characters
				System.out.println("The occurrence of " + (char) i + " - " + counter[i]);
			}
		}
	}

//	public static void getOccuringCharNaiveMethod(String str) {
//
//		int count[] = new int[MAX_CHAR];
//		int len = str.length();
//		for (int i = 0; i < len; i++)
//			count[str.charAt(i)]++;
//
//		char ch[] = str.toCharArray();
//		for (int i = 0; i < len; i++) {
//			ch[i] = str.charAt(i);
//			int find = 0;
//			for (int j = 0; j <= i; j++) {
//
//				if (ch[i] == ch[j])
//					find++;
//			}
//			if (find == 1)
//
//				System.out.println("The occurrence of " + str.charAt(i) + " - " + count[str.charAt(i)]);
//		}
//	}
}
