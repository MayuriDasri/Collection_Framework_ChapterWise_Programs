package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ClearCloneRemoveRetainEtcMethods {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println("Original Array List :"+ar);
		System.out.println("************************************ \n ");
		
		
		//To clear the array List
		System.out.println("**************clear() use ***************");
		ar.clear();
		System.out.println("After clearing array List : "+ ar);
		
		
		ArrayList<Integer> arI = new ArrayList<Integer>();
		arI.add(10);
		arI.add(20);
		arI.add(30);
		arI.add(40);
		arI.add(50);
		
		//To Clone the array List
		System.out.println("\n ************** clone() use **********************  ");
		@SuppressWarnings("unchecked")
		ArrayList<Integer> arC = (ArrayList<Integer>)arI.clone();
		System.out.println("New Array List after cloning :" + arC);
		
		//To check given value is present in Arrya list or not
		System.out.println("\n ************** contains() use **********************  ");
		boolean b = arI.contains(50);
		System.out.println(b);
		
		//To check index of particular element from begining
		System.out.println("\n ************** indexOf() use **********************  ");
		int i = arI.indexOf(30);
		System.out.println("Index of 30 is "+i);
		
		//To check index of particular element from last
		System.out.println("\n ************** lastIndexOf use **********************  ");
		arI.add(30);
		arI.add(30);
		arI.add(30);
		System.out.println(arI);
		int j = arI.lastIndexOf(30);
		System.out.println("Last index of 30 is "+ j );
		//if elemenet is not present the it returns -1
		
		//To remove element by indexing
		System.out.println("\n ************** remove() use **********************  ");
		arI.remove(5);
		System.out.println("Array list after removing 5th index value : "+ arI);
		
		//To remove element by value , It remove only from last
		System.out.println("\n ************** remove() use **********************  ");
		arI.remove("30");
		System.out.println("Array list after removing 30 value : "+ arI);
		
		//To remove element with condition
		System.out.println("\n ************** removeIf() use **********************  ");
		ArrayList<Integer> numbers  = new ArrayList<Integer>(Arrays.asList(10,20,3,4,7,9,1,15));
		System.out.println("Numbers Array List : "+ numbers);
		numbers.removeIf(num -> num%2 == 0);
		System.out.println("Removing element which are %2 :"+numbers);
		
		//To keep only those elements which u r expected
		System.out.println("\n ************** retain() use **********************  ");
		ArrayList<Integer> numbersList  = new ArrayList<Integer>(Arrays.asList(10,20,3,4,7,9,1,15));
		System.out.println("Numbers Array List : "+ numbersList);
		System.out.println("Integer Array List : "+ arC);
		numbersList.retainAll(arC);
		System.out.println("Numbers Arrya List after retaing arC list values :"+numbersList);
		
		//To create sublist form exsiting array List, 2 is include and 5 is exclude
		System.out.println("\n ************** sublist() use **********************  ");
		ArrayList<Integer> num  = new ArrayList<Integer>(Arrays.asList(10,20,3,4,7,9,1,15));
		System.out.println("num Array List : "+ num);
		ArrayList<Integer> sub = new ArrayList<Integer>(num.subList(2, 5));
		System.out.println("Sub List from num List : "+ sub);
		
		
		//To Convert arrayList into noraml array
		System.out.println("\n ************** toArray() use **********************  ");
		ArrayList<Integer> roll  = new ArrayList<Integer>(Arrays.asList(10,20,3,4,7,9,1,15));
		System.out.println("num Array List : "+ roll);
		
		Object rollno[] = roll.toArray();
		System.out.println("New Object Array after converting roll list into rollno Object Array : ");
		for(Object o : rollno)
		{
			System.out.println(o);
		}
	
		}
}
