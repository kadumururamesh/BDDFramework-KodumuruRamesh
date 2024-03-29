package collectionsExamples;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//Vector<String> v=new Vector<>();
		List<String> v=new Vector<>();
		System.out.println(((Vector<String>) v).capacity());
		v.add("ramesh");
		v.add("swetha");
		v.add("pritam");
		v.add("nidish");
		v.add(4, "MBRS");
		
		System.out.println(v);
		
		System.out.println("for loop");
		/*
		for(int i=1;i<=v.capacity()-1;i++) {
			System.out.println(v.get(i));
		}
		
		*/
		
		System.out.println("for-each loop");
		
		for(String a:v) {
			System.out.println(a);
		}
		
		System.out.println("whileloop");
		
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
