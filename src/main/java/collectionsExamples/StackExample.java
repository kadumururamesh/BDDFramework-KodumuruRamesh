package collectionsExamples;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		System.out.println(s.size());
		s.add("ramesh");
		s.add("swetha");
		s.add("pritam");
		s.add("nidish");
		System.out.println(s.size());
		
		for(String a:s) {
			System.out.println(a);
		}
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			if(itr.next().equalsIgnoreCase("ramesh"));
			itr.remove();
		}
		
		for(String a:s) {
			System.out.println(a);
		}
		
		System.out.println(s.size());
		
		}

}
