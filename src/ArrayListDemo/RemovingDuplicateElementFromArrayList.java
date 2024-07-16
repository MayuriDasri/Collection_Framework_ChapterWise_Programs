package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateElementFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(10,20,30,40,40,50,50,6,60,70,70));
		System.out.println("Original Array List "+ ar);
		
		//As Set family does not have duplicate values 
		//1.LinkedHashSet
		System.out.println("\n ***************** 1. To remove duplicates - LinkedHashSet **********************");
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(ar);
		ArrayList<Integer> numberListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		System.out.println("ArrayList Without Duplicates : "+ numberListWithoutDuplicates);
		
		//2.JDK 8 - Stream:
		System.out.println("\n ***************** 2. stream().distinct().collect(Collectors.toList()) **********************");
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,3,3,3,4,4,5,6,7,8,8,8,8,9,9,9,9));
		System.out.println("Original Number List : "+ number);
		List<Integer> uniqueNumberList = number.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique number list : "+ uniqueNumberList);
		
		
	}

}
