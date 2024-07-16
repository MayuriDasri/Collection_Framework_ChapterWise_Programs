package HashMapDemo;

import java.util.Set;
import java.util.TreeMap;

public class CreationTreeMap {

	public static void main(String[] args) {
		
		//TreeMap is nothing but binary tree structure

		TreeMap<Integer,String> tMap = new TreeMap<Integer,String>();
		tMap.put(100, "ABC");
		tMap.put(82,"PQR");
		tMap.put(983,"LMN");
		tMap.put(7894,"XYZ");
		
		//Printing Tree Map
		System.out.println(tMap);
		
		//Iterating TreeMap
		tMap.forEach((k,v)->System.out.println(k+" = "+v));
		
		//Printing last and first key
		System.out.println(tMap.lastKey());
		System.out.println(tMap.firstKey());
		System.out.println(tMap.isEmpty());
		System.out.println(tMap.firstEntry());
		System.out.println(tMap.lastEntry());
		
		//Less Than and Greater than Values using HeadMap
		Set<Integer> keysLessThan9K = tMap.headMap(983).keySet();
		System.out.println(keysLessThan9K);
		
		Set<Integer> keysGreterThan9k = tMap.tailMap(983).keySet();
		System.out.println(keysGreterThan9k);
		
		
		
		
		
	}

}
