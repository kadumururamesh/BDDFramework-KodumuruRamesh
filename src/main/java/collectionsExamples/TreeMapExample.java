package collectionsExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, String> map=new TreeMap<>();
		map.put("B", "swetha");
		map.put("A", "ramesh");
		map.put("D", "Nidish");
		map.put("C", "Pritam");
		
		for(Map.Entry a:map.entrySet()) {
			System.out.println(a.getKey() +" - "+a.getValue());
		}
		
	}

}
