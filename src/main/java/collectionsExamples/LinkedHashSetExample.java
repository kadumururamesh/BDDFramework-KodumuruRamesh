package collectionsExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		System.out.println(ls.size());
		ls.add("ramesh");
		ls.add("swetha");
		ls.add("pritam");
		ls.add("nidish");
		System.out.println(ls.size());
		/*
		for(String a:ls) {
			System.out.println(a);
		}
		*/
		
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
