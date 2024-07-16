package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterationArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> number  = new ArrayList<Integer>();
		number.add(1);
		number.add(25);
		number.add(387);
		number.add(4581);
		number.add(1879);
		number.add(16985);
		
		//1.Using forEach with lambda
		System.out.println("****** Print using forEach with lambda********");
		number.forEach(num-> {
			System.out.println(num);
		});
		
		//2.Using Iterator
		System.out.println("****** Print using Iterator********");
		Iterator<Integer> itr = number.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//3.
		System.out.println("****** Print using forEachRemaining with lambda ********");
		itr = number.iterator();
		itr.forEachRemaining(num -> {
			System.out.println(num);
		});
		
		//4.Using for each loop
		System.out.println("****** Print using simple forEach ********");
		for(Integer num : number)
		{
			System.out.println(num);
		}
		
		//5.Using simple for loop
		System.out.println("****** Print using simple forLoop ********");
		for(int i =0;i<number.size();i++)
		{
			System.out.println(number.get(i));
		}
		
		//6.Using List Iterator forword direction 
		System.out.println("****** Print using List Iterator********");
		ListIterator<Integer> li = number.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		//7.Using List Iterator backword direction
		System.out.println("****** Print using List Iterator********");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}
