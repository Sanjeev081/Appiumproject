package collectionsession;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashmapInitialization {
	public static Map<String,Integer>marksmap;
	
	static{
		marksmap=new HashMap<>();
		marksmap.put("A", 100);
		marksmap.put("B",200);
		
		
	}

	public static void main(String[] args) {
		//1.Using Hashmapclass
		HashMap<String,String> map1=new HashMap<>();
		Map<String,String> map2=new HashMap<>();
		//2.static way:static hasmap:
		System.out.println 	(HashmapInitialization.marksmap.get("A"));
		//3. immutable with only one single enetry
		Map<String,Integer> map3=Collections.singletonMap("test",100);
		System.out.println(map3.get("test"));
		map3.put("abc", 200);
		
		Map<String,String>map4=Stream.of(new String[][]{
			{"Tom","A Grade"},
			{"Naveen","A+Grade"},
		}).collect(Collectors.toMap(data->data[0],data->data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));
		//using simpleEntry:
		Stream.of(
				new AbstarctMap.SimpleEntry<>("Naveen","Java"),
				new AbstarctMap.SimpleEntry<>("Tom","Python")
				).collect
		
		
		
		
		
		
		

	}

}
