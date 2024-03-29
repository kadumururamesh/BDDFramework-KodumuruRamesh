package collectionsExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedArrayListExample {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		System.out.println(ll.size());
		ll.add("ramesh");
		ll.add("swetha");
		ll.add("pritam");
		ll.add("nidish");
		System.out.println(ll.size());
		System.out.println(ll);
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String a:ll) {
			System.out.println(a);
		
		}
		
	}

}
