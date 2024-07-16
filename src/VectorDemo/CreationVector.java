package VectorDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class CreationVector {
	public static void main(String[] args) {
		
		Vector<Integer> number = new Vector<Integer>();
		number.add(45);
		number.add(12);
		number.add(32);
		number.add(65);
		number.add(89);
		number.add(75);
		
		System.out.println(" *************************** ");
		System.out.println(number);
		
		//Printing 2 index value
		System.out.println(" *************************** ");
		System.out.println(number.get(2));
		
		//removing 2 index value
		System.out.println(" *************************** ");
		System.out.println(number.remove(2));
		System.out.println(number);
		
		
		//Create new vector by exsiting vector
		System.out.println(" *************************** ");
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(0);
		vec.add(0);
		System.out.println(vec);
		vec.addAll(1,number);
		System.out.println(vec);
		
		
		//Iterating Vector
		System.out.println(" *************************** ");
		Iterator itr = vec.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Iterating using for each
		System.out.println(" *************************** ");
		for(Integer e : vec)
		{
			System.out.println(e);
		}
		
		//Iterating using for loop
		System.out.println(" *************************** ");
		for(int i=0;i<vec.size();i++)
		{
			System.out.println(vec.get(i));
		}
		
		//Sorting 
		System.out.println(" *************************** ");
		Collections.sort(vec);
		System.out.println(vec);
		
	}
}

