package Collections;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;


public class TestHashMap{
	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<>(2);
		
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 3);
		hashMap.put("d", 4);
		
		if(hashMap.containsKey("a")) {
			System.out.println(hashMap.get("a"));
		}
		
		for(String key : hashMap.keySet()) {
			//Below way of accessing does not work use get method to fetch the values
			// It does not work out for <Integer,Integer> pair as well
			//System.out.println(hashMap1[key]);
			System.out.println(hashMap.get(key));
		}
		
		for(Entry<String,Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
	}
}