package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		//Waring message will be given by jdk : 
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList<Object> ar = new ArrayList<Object>();	
		ar.add(100);
		ar.add(200);
		ar.add("Testing");
		ar.add("Mayuri");
		ar.add(12.53);
		ar.add(true);
		
		System.out.println(ar); //printing whole arrayList
		System.out.println(ar.get(2)); //printing 2nd index value
		System.out.println(ar.get(5)); //printing 5th index value
		System.out.println(ar.size());//printing arrayList Size
		//System.out.println(ar.get(7)); //printing 7th index value. 
		//It gives arrayoutofboundindexexception bcoz 7th index in not available 
		//System.out.println(ar.get(-1));
		//It gives arrayoutofboundindexexception bcoz 7th index in not available 
		
		
		//ArryaList with Object Data type
		ArrayList<Object> arO = new ArrayList<Object>();	
		arO.add(100);
		arO.add(200);
		arO.add("Testing");
		arO.add("Mayuri");
		arO.add(12.53);
		arO.add(true);
		System.out.println(arO); //printing whole arrayList
		System.out.println(arO.get(2)); //printing 2nd index value
		System.out.println(arO.get(5)); //printing 5th index value
		System.out.println(arO.size());//printing arrayList Size
		arO.add(8975);
		arO.add("Hi");
		System.out.println(ar.size());//printing arrayList Size. Size got increased by adding 2 element
		
		//ArrayList with String data type 
		//It is also called generic type  in array list because we are adding only one type of data
		//other type data adding is strickly restricated
		ArrayList<String> arS = new ArrayList<String>();
		arS.add("Mayuri");
		arS.add("Dasri");
		System.out.println(arS);
	}

}
