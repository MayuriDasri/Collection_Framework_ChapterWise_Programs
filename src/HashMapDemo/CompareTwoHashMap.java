package HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareTwoHashMap {

	public static void main(String[] args) {
	
		//Comparing two HashMap
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");
		System.out.println("******************* Map1 *********** \n" + map1);
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(3,"C");
		map2.put(2,"B");
		map2.put(1,"A");
		System.out.println("\n******************* Map2 *********** \n" + map2);
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(1,"A");
		map3.put(2,"B");
		map3.put(3,"C");
		map3.put(3,"D"); // recent value will be stored on same key
		System.out.println("\n ******************* Map3 ***********\n " + map3);
		
		
		//1.Compare on the basis of key-value : use equals methods
		//compare on the basis of key and value. if key and value both are equal then returns true else false
		System.out.println("\n ********** Compare Two String : using Key-Value ***********");
		System.out.println("Compare map1 with map2 : "+ map1.equals(map2)); //true
		System.out.println("Compare map1 with map3 : "+map1.equals(map3)); //false
	
		//2.Compare on the basis of keySet : use equals method
		//compare on the basis of key. if keys are equal then returns true else false 
		System.out.println("\n ********** Compare Two String : Using Key-Set ***********");
		System.out.println("Compare map1 with map2 :" + map1.keySet().equals(map2.keySet())); //true
		System.out.println("Compare map1 with map3 :" + map1.keySet().equals(map3.keySet()));//true
	
		//3.To find out extra key 
		HashMap<Integer,String> map4 = new HashMap<Integer,String>();
		map4.put(1,"A");
		map4.put(2,"B");
		map4.put(3,"C");
		map4.put(4,"D"); // recent value will be stored on same key
		System.out.println("\n ******************* Map4 ***********\n " + map4);

		//3.1 first combine the keys from both the maps : using HashSet
		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
		System.out.println("Map1 added to  CombineKeys HashSet : " + combineKeys);
		//add the keySet from map4
		
		combineKeys.addAll(map4.keySet());
		System.out.println(" Map4 added to CombineKeys HashSet : " + combineKeys);
		combineKeys.removeAll(map1.keySet());
		System.out.println("Map1 remove from combineKeys HashSet : "+ combineKeys);
		
		//OR 
		
		HashSet<Integer> combineKeys1 = new HashSet<>(map4.keySet());
		System.out.println("Map4 added to CombineKeys HashSet : " + combineKeys1);
		combineKeys1.removeAll(map1.keySet());
		System.out.println("Map1 remove from combineKeys HashSet : "+ combineKeys);
		
		
		HashMap<Integer,String> map5 = new HashMap<Integer,String>();
		map5.put(1,"A");
		map5.put(2,"B");
		map5.put(3,"C");
		
		HashMap<Integer,String> map6 = new HashMap<Integer,String>();
		map6.put(1,"A");
		map6.put(2,"B");
		map6.put(3,"C");
		
		HashMap<Integer,String> map7 = new HashMap<Integer,String>();
		map7.put(1,"A");
		map7.put(2,"B");
		map7.put(3,"C");
		map7.put(4,"C");
		
		
		//4.1 Duplicates are not allowed : using ArrayList
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); //true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); //false
	
		
		//4.2 Duplicates are not allowed : using HashSet
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); //true
		
	}

}
