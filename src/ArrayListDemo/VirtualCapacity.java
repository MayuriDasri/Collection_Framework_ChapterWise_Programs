package ArrayListDemo;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		//When we write this line of code then in memory jdk creates a virtual capacity of 10 blocks
		//but in this the physical capacity is 0
		
		System.out.println("Size of ArrayList at inital :" + ar.size());
		ar.add(100);ar.add(200);
		System.out.println("Size of Array List after adding 2 elements : "+ar.size());
		ar.add("ABC");ar.add("ABC");ar.add("ABC");ar.add("ABC");
		System.out.println("Size of Array List of Object : "+ ar.size());
		
		
		
		System.out.println("********************");
		ArrayList<Integer> arI = new ArrayList<Integer>(12);
		//When we pass value in constructor then that value will be consider as a virtual capacity of that particular list.
		
		arI.add(1);arI.add(1);arI.add(1);arI.add(1);arI.add(1);arI.add(1);arI.add(1);
		arI.add(1);arI.add(1);arI.add(1);arI.add(1);arI.add(1);arI.add(1);arI.add(1);
		System.out.println("Size Array List of integer : "+arI.size());
		
		
		
		
		

	}

}
