package collectionsExamples;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, String> map=new HashMap<>();
				
		map.put("Key1", "ramesh");
		map.put("Key2", "swetha");
		map.put("Key3", "pritam");
		
	for(Map.Entry a:map.entrySet()) {
		System.out.println(a.getKey()+" - "+a.getValue());
	}
		
		
	}

}
