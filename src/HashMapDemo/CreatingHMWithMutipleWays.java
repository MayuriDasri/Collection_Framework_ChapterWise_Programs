package HashMapDemo;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CreatingHMWithMutipleWays {
	
	public static Map<String,Integer>hMap1;
	static {
				hMap1 = new HashMap<>();
				hMap1.put("A",100);
				hMap1.put("B", 200);
	}
	
	public static void main(String args[])
	{
		
		//1.Using HashMap Class
		HashMap<Integer, String> hMap = new HashMap<Integer,String>();
		hMap.put(1,"Mayuri");
		hMap.put(2,"Kirtana");
		
		System.out.println(hMap.get(1));
		System.out.println(hMap.get(2));
		
		
		//2.Using Static way : Static HashMap
		Map<String,Integer> map2 = new HashMap<String,Integer>();
		System.out.println(CreatingHMWithMutipleWays.hMap1.get("A"));
	
		//3.ImutableMap with Only One single entry
		//In Singleton = we can save only one value
		Map<String,Integer> map3 = Collections.singletonMap("Test",300);
		System.out.println(map3.get("Test"));
		//map3.put("QA",500); // Unsuppoted Operational Exception Occured 
		//bcoz we are adding one more value and we declared this as singletonMap
		
		//JDK 8:
		//ToMap Method
		Map<String,String> map4 = Stream.of(new String[][] {
			{"Tom","A Grade"}, {"Jerry","A+"}
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("kit","B Grade");
		System.out.println(map4.get("kit"));
		
		//4.Using simpleEntry :
		Map<Integer,String> map5 = Stream.of(
				new AbstractMap.SimpleEntry<>(1,"ABC"),
				new AbstractMap.SimpleEntry<>(2,"PQR")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
			System.out.println(map5.get(1));
			map5.put(5,"XYZ");
			System.out.println(map5.get(5));
			
			
		//5.Using MultiValues Map : Max 10 Pairs can be stored
			Map<Integer,String> multiMap = Map.of(1,"aaa",2,"bbb");
			System.out.println(multiMap.get(1));
			
		//6.OfEntried Method : no limitation on paris (Key Values)
			//these are immutable
			Map<Integer,String> map6 = Map.ofEntries(
					new AbstractMap.SimpleEntry<>(1,"ABC"),
					new AbstractMap.SimpleEntry<>(2,"PQR")
					);
			System.out.println(map6.get(2));
			map6.put(3,"Xyz");
			System.out.println(map6.get(3)); //cant add new values 
			
			
			}
	}
