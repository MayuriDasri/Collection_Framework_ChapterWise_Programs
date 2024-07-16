package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CreationIterationOfHashMap {

	public static void main(String[] args) {
		
		//HashMap does not store element by indexing , no ordering 
		//HashMap stores elements by (key , value) pair
		//Key can not be duplicate
		//can store number of null values but only one null key
		//HashMap is not synchronized or ThreadSafe
		
		
		//Creating Hash Map <String ,String> <Key , Value>
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India","New Delhi");
		capitalMap.put("USA","Washington DC");
		capitalMap.put("UK","London");
	
		//Printing values by key
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get("Germany"));//null
		
		capitalMap.put("UK","London11");
		System.out.println(capitalMap.get("UK")); // as values get overrides 
		
		//adding null key
		capitalMap.put(null,"Pune");
		
		//trying to add another null key
		capitalMap.put(null,"Mumbai");
		System.out.println(capitalMap.get(null)); // it will print latest null value
		System.out.println(capitalMap.get(null));
		
		
		//Adding null values 
		capitalMap.put("Russia",null);
		capitalMap.put("France", null);
		
		System.out.println(capitalMap.get("France"));
		System.out.println(capitalMap.get("Russia"));
		
		//Remove element by key
		capitalMap.remove("India");
		System.out.println(capitalMap);
		
		
		//1. Traversing HashMap Iterator
		System.out.println("\n **************** Normal Iteration  ******");
		Iterator<String> itr = capitalMap.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//2. Iteration over key Set
		System.out.println("\n **************** Iteration over key set ******");
		Iterator<String> itr1 = capitalMap.keySet().iterator();
		while(itr1.hasNext())
		{
			String key = itr1.next();
			String value = capitalMap.get(key);
			System.out.println("Key : "+ key +"\t  Value : "+value);
		}
			
		//3.Iteration Over Key and Value Set using entrySet()
		System.out.println("\n **************** Iteration over key and value using Entry set ******");
		Iterator<Entry<String,String>> itr3 = capitalMap.entrySet().iterator();
		while(itr3.hasNext())
		{
			Entry<String , String> entry = itr3.next();
			System.out.println("Key = "+ entry.getKey() +"\t Value = " + entry.getValue());
		}
		
		//4.Iteration hashMap using java 8 forEach and lambda
		System.out.println("\n **************** Iteration using for each and lambda ******");
		capitalMap.forEach((k,v) -> System.out.println("Key = " +k+ "\t Value = "+ v));
		
		
		
	}

}
