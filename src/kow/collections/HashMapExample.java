package kow.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// simpleHashMap();
		hashMapKeyValue();
	}

	private static void hashMapKeyValue() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(11, "ram");
		hashMap.put(12, "som");
		hashMap.put(12, "tom"); // override
		hashMap.put(22, "jom");
		hashMap.put(32, "pom");
		hashMap.remove(32);
		// System.out.println(hashMap);
		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println("key: " + m.getKey() + " " + "Value: " + m.getValue());
		}

		// --clone the map--
		HashMap<Integer, String> clone = new HashMap<Integer, String>();
		clone.putAll(hashMap);
		// System.out.println(clone);

		// --Fetch Keys--
		System.out.println("Keys: " + hashMap.keySet());
		// --Fetching value--
		System.out.println("Values: " + hashMap.values());
		// --Fetching key-value pair[Collection view]--
		System.out.println("Key-Value pairs: " + hashMap.entrySet());

	}

	private static void simpleHashMap() {
		Map map = new HashMap();
		map.put(1, "Amit");
		map.put(2, "arun");
		System.out.println(map);
		// --converting map to set for iterating--
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
