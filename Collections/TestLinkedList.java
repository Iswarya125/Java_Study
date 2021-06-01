package Collections;

import java.util.LinkedList;

public class TestLinkedList{
	public static void main(String[] args) {
		//If LHS is List then only interface related methods will be shown
		//addFirst addLast are not shown so LinkedList is used
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		System.out.println(linkedList.add(1));
		linkedList.addFirst(2);
		linkedList.addLast(3);
		
		//to print the elements one by one
		for(int element : linkedList)
		{
			System.out.println(element);
		}
		
		linkedList.removeLast();
		System.out.println(linkedList);
	}
				
	}