package Collections;

import java.util.Stack;

public class TestStack{
	public static void main(String[] args) {
		Stack<String> stackStructure = new Stack<>();
		
		stackStructure.push("Africa");
		stackStructure.push("America");
		stackStructure.push("Italy");
		stackStructure.push("India");
		
		System.out.println(stackStructure);
		
		System.out.println(stackStructure.pop());
		
		System.out.println(stackStructure);
		
		//return top most element but it does not remove the element
		System.out.println(stackStructure.peek());
		
		System.out.println(stackStructure);
		
	}
}