package Collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


public class TestTreeMap{
	public static void main(String[] args) {
		Map<String,Integer> treeMap = new TreeMap<>();

		treeMap.put("b", 2);
		treeMap.put("c", 3);
		treeMap.put("a", 1);
		treeMap.put("d", 4);

		
		if(treeMap.containsKey("a")) {
			System.out.println(treeMap.get("a"));
		}
		
		for(String key : treeMap.keySet()) {
			//Below way of accessing does not work use get method to fetch the values
			// It does not work out for <Integer,Integer> pair as well
			//System.out.println(treeMap1[key]);
			System.out.println(treeMap.get(key));
		}
		
		for(Entry<String,Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
	}
}