package HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConvertHashMapToArrayList {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"AAA");
		map.put(2,"BBB");
		map.put(3,"CCC");
		System.out.println("Map is : " + map);
		System.out.println("Map size is : " + map.size());
		
		//Iteration
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry pairs = (Map.Entry)itr.next();
			System.out.println(pairs.getKey()+ " = "+ pairs.getValue());
		}
		
		//Convert HashMap keys into ArrayList
		List<Integer> nameList = new ArrayList<Integer>(map.keySet());
		for(Integer t : nameList)
		{
			System.out.println(t);
		}
		
		//Convert HashMap Values into ArrayList
		List<String> values = new ArrayList<String>(map.values());
		for(String s : values)
		{
			System.out.println(s);
		}
		
		
		
	}
}
