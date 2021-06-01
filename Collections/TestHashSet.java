package Collections;

import java.util.HashSet;
import java.util.Set;


public class TestHashSet {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>(2);
		
		// single quotes are considered as char not as String type
		hashSet.add("A");
		hashSet.add("B");
		System.out.println(hashSet.add("C"));
		System.out.println(hashSet.add("C"));
		hashSet.add("D");
		
		System.out.println(hashSet.contains("A"));
		
		System.out.println(hashSet);
		
	}
}
