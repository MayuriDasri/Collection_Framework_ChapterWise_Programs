package HashMapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedAndConcurrentHashMap {

	public static void main(String[] args) {

		//Synchronized Method in collections class :
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("A","ABC");
		map1.put("B","PQR");
		map1.put("C","XYZ");
		//create synchronizedMap
		Map<String , String> syncMap = Collections.synchronizedMap(map1);
		System.out.println("Synchronized HashMap : "+syncMap);
		
		
		//Create ConcurrentHashMap
		ConcurrentHashMap<Integer,String> conMap  = new ConcurrentHashMap<>();
		conMap.put(1,"AAA");
		conMap.put(2,"BBB");
		conMap.put(3,"CCC");
		System.out.println("ConcurrentHashMap : "+conMap);
	}

}
