package test.package1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class TestStreams{
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>();
		Set<Integer> resultSet = new HashSet<>();
		
		arrayList.add(1);
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add(20);
		
		//To find the square
		resultList = arrayList.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(resultList);
		
		//To filter out and convert to set
		resultSet = arrayList.stream().filter(x-> x > 10).collect(Collectors.toSet());
		System.out.println(resultSet);
		
		
		//To sort
		resultList = arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println(resultList);
		
		
		//For each
		arrayList.stream().forEach(x-> {
		x = x+2;
		System.out.println(x);
		});
		
		System.out.println(arrayList);
		
		
		
		//To reduce to a single number
		int sum = arrayList.stream().reduce(0,
								  (ans,i) -> ans + i);
		
		System.out.println(sum);
		
	}
	
	
}