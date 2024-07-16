package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Tom");
		map.put(2, "PQR");
		map.put(3,"Liza");
		map.put(3, "Mayuri");
		
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry pair =(Map.Entry)itr.next();
			System.out.println("Key = "+pair.getKey()+" Values = "+pair.getValue());
		}
		
		map.remove(2);
		map.put(2,"ASD");
		System.out.println(map);
		
		map.forEach((k,v)->System.out.println(k+" = "+v));
		
		
	}
	
	

}
