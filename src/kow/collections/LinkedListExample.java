package kow.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("Linked List: ");
		linkedList();
	}

	public static void linkedList() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Kow");
		linkedList.add("kav");
		linkedList.add("harshiv");
		linkedList.add("Kow");
		Iterator itr = linkedList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
