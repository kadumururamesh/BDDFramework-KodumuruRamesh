package collectionsExamples;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> tt=new TreeSet<>();
		
		System.out.println(tt.size());
		tt.add("ramesh");
		tt.add("swetha");
		tt.add("pritam");
		tt.add("nidish");
		System.out.println(tt);
		System.out.println(tt.size());
		 for (String a:tt) {
			 System.out.println(a);
		 }
		 System.out.println(tt.size());
		 Iterator<String> itr=tt.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}

}
