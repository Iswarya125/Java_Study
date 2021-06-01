package Collections;

import java.util.AbstractSet;
import java.util.TreeSet;


public class TestTreeSet{
	public static void main(String[] args) {
		//Below statement also works out
		//Set<String> treeSet = new TreeSet<>();
		AbstractSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("B");
		
		System.out.println(treeSet);
	}
}