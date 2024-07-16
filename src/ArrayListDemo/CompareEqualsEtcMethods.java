package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareEqualsEtcMethods {

	public static void main(String[] args) {
		
		//1.Compare two list by equals method()
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","L","B","Z","C","D","E"));
		System.out.println("************* List 1 : "+ l1);
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("F","B","C","D","A"));
		System.out.println("*********** List 2 :"+ l2);
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","L","B","Z","C","D","E"));
		System.out.println("************ List 3 :"+ l3);
		
		Collections.sort(l1);
		System.out.println("************* List 1 After sorting : "+l1);
		
		Collections.sort(l2);
		System.out.println("***********************List 2 After sorting : "+l2);
		
		
		System.out.println("****************** Comparing List1 with List2:" + l1.equals(l2));  // it will returns false
		
		System.out.println("****************** Comparing List1 with List3 before sorting:" + l1.equals(l3)); // it will return false
		Collections.sort(l3);
		System.out.println("****************** Comparing List1 with List3 after sorting:" + l1.equals(l3)); 
		
		System.out.println("****************** Comparing List1 with List1 : "+ l1.equals(l1));
		
		//2.Compare two list - find out the additional elements:
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D", "E"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D", "F"));
		
		System.out.println("*************** Finding unique element from l4 and l5");
//		l4.removeAll(l5);
//		System.out.println(l4);
		
		//3.Find out missing element:
		System.out.println("*************** Finding missing element from l5 by comparing with l4");
		l5.removeAll(l4);
		System.out.println(l5);
		
		//4.Find out the common elements:
		System.out.println("*************** Finding common element from lang1");
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java","Python","C","C++", "Ruby"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java","Python","C","C++", "PHP"));
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		
		
		
		
		
	}

}
