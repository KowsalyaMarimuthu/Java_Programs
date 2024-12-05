package kow.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {
		System.out.println("Array List: ");
		arrayList();

	}

	public static void arrayList() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("kow");
		arrayList.add("Kav");
		arrayList.add("malar");
		arrayList.add("mari");
		arrayList.add("Harshiv");
		arrayList.add("kow");
		arrayList.add(5, "ll");
		Iterator itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Size of array: " + arrayList.size());
		System.out.println("Get the item 3: " + arrayList.get(2));
		System.out.println("Remove index 5 value:" + arrayList.remove(5));
		System.out.println("Sort the arrayList: ");
		Collections.sort(arrayList);
		for (String str : arrayList) {
			System.out.println(str);
		}
		System.out.println("Clear all values");
		arrayList.clear();

	}

}
