package collectionsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ArrayListExamples {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		al.add("ramesh");
		al.add("swetha");
		al.add("pritam");
		al.add("nidish");
		/*
		for(String a:al) {
			System.out.println(a);
		}
		*/
		System.out.println(al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			String a=itr.next();
			if(a.equalsIgnoreCase("ramesh")) 
				itr.remove();
			
		}
		System.out.println(al);

	}

}
