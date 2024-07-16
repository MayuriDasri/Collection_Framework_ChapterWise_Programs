package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeSynchronization {

	public static void main(String[] args) {
		
		//1.Collections.synchronizedList
		System.out.println("\n ****************** Collections.Synchronized() **************************");

		List<String> nameList = 	Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Java");
		nameList.add("Ruby");
		nameList.add("Python");
		
		//add , remove - we dont need explicit synchronization
		
		//To fetch , traverse the values from this list -we have to use explicit synchronization
		
		synchronized(nameList){
			
			Iterator<String> itr = nameList.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		//2.copyOnWriteArrayList -- its a class
		System.out.println("\n ****************** copyOnWriteArrayList -- Thread Saftey **************************");
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("BBA");
		empList.add("BCA");
		empList.add("BSC");
		
		Iterator<String> itr = empList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
