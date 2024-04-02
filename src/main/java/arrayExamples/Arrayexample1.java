package arrayExamples;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arrayexample1 {

	public static void main(String[] args) {
		/*String s=new String("aabbbcccc");
		 for(int i=0;i<s.length();i++) {
			 System.out.println(s.charAt(i));
			 
			 
		 }*/
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<=10;i++) {
			al.add(i);
			
		}
		
		java.util.Iterator<Integer> itr=al.iterator();
		
		System.out.println(al);
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			if((itr.next())%2==0)
				itr.remove();
		}
		System.out.println(al);
		
	}

}
