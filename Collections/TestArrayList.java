package Collections;

import java.util.List;
import java.util.ArrayList;

public class TestArrayList{
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>(5);
		
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		arrayList.add(10);
		arrayList.add(11);
		arrayList.remove(0);
		System.out.println(arrayList.get(0));
		
		System.out.println(arrayList);
		
		for(int number : arrayList) {
			System.out.println(number);
		}
				
	}
}