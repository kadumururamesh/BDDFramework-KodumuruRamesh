package collectionsExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
		map.put(1, "ramesh");
		map.put(2, "swetha");
		map.put(3, "pritam");
		
		System.out.println(map.get(2));
		for(Map.Entry a:map.entrySet()) {
			System.out.println(a.getKey() +" - "+a.getValue());
		}
	}

}
