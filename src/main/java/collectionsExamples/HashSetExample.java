package collectionsExamples;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Iterable<String> st=new HashSet<>();
		
		//Collection st=new HashSet<>();
		
		//Set<String> st=new HashSet<>();
		//HashSet<String> st=new HashSet<>();
		System.out.println(((HashSet<String>) st).size());
		((HashSet<String>) st).add("ramesh");
		((HashSet<String>) st).add("swetha");
		((HashSet<String>) st).add("pritam");
		((HashSet<String>) st).add("nidish");
		System.out.println(((HashSet<String>) st).size());
		/*
		for(String a:st) {
			System.out.println(a);
		}
		*/
		
		Iterator<String> itr=st.iterator();
				
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
