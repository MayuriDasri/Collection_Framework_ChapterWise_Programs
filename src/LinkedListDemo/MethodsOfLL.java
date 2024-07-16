package LinkedListDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MethodsOfLL {

	public static void main(String[] args) {
		//LL is default class in java
		//it can be used as list , stack and queue
		//it allows the null entry
		//dynamic collection
		//hence insertion and deletion can be easily implemented
		//it is not synchronized(not thread safe)
		//In LL, Manipulation is fast bcoz we dont need any shifitin
		
		//LL Constructors :
		//LinkedList();
		//LinkedList(Collection C);
		
		
		LinkedList<String> names = new LinkedList<String>();
		
		//size of LL
		System.out.println("*******************");
		System.out.println("LL size : "+ names.size());
		
		names.add("Tom");
		names.add("Mayuri");
		names.add("Kirtana");
		names.add("Shyam");
		names.add("Uma");
		names.add("Harsha");
		
		System.out.println("LL size after adding element :" + names.size());
		
		//pritning LL directly
		System.out.println("*******************");
		System.out.println(names);
		
		//printing LL with index
		System.out.println("*******************");
		System.out.println(names.get(1));
		
		//printing with Iterator
		System.out.println("*******************");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
	 	}
		
		//Adding values by index 
		System.out.println("*******************");
		names.add(4,"Jyoti");
		System.out.println(names);
		names.add(2,"Shamala");
		System.out.println(names);
		
		
		//creating ll from exisiting LL
		System.out.println("*******************");
		LinkedList<String> users = new LinkedList<String>();
		users.add("Katkam");
		users.add("Botla");
		System.out.println(users);
		
		users.addAll(names);
		System.out.println(names);
		
		//To add at first position
		names.addFirst("Kaartik");
		System.out.println(names);
		
		//To add at last Position
		names.addLast("Dasri");
		System.out.println(names);
		
		System.out.println("*******************");
		System.out.println(names);

		//To remove element
		names.remove(); //remove head
		System.out.println(names);
		
		names.remove(2); // remove 2nd position element
		System.out.println(names);
		
		names.removeFirst();
		System.out.println(names);
		
		
		System.out.println("\n ******* New List ************ \n ");
		
		LinkedList<Integer> number = new LinkedList<Integer>();
		number.add(546);
		number.add(879);
		number.add(987);
		number.add(369);
		number.add(147);
		System.out.println(number.size());
		System.out.println(number);
		
		//Iterate in reverse order
		System.out.println("******* Reverse order ************");
		Iterator<Integer> itr1 = number.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		//Sort :
		System.out.println("******* Sorting order ************");
		Collections.sort(number);
		System.out.println(number);
		
		
		
		
		
	
		
	
	
	}
}
