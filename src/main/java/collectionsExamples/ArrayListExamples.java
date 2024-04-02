package collectionsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ArrayListExamples {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		al.add("ramesh");
		al.add("swetha");
		al.add("pritam");
		al.add("nidish");
		al.add("ramesh1");
		al.add("swetha1");
		al.add("pritam1");
		al.add("nidish1");
		/*
		for(String a:al) {
			System.out.println(a);
		}
		*/
		System.out.println(al);
		/*
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			String a=itr.next();
			if(a.equalsIgnoreCase("ramesh")) 
				itr.remove();
			
		}
		System.out.println(al);
		*/
		System.out.println(al);
		ListIterator<String> litr=al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next() +" - "+litr.nextIndex());
			if(litr.nextIndex()==3) {
				litr.set("kutty");
			}else if(litr.next().equalsIgnoreCase("pritam")){
				litr.add("pritam kodumuru");
				
			}else{
				litr.remove();
			}
		}
		System.out.println(al);
		

	}

}
