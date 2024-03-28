package collectionsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionExamples {

	public static void main(String[] args) {
		/*
		Collection<String> cl=new ArrayList<>();
		Collection<String> cl=new LinkedList<>();
		Collection<String> cl=new Vector<>();
		Collection<String> cl=new Stack<>();
		 */
		
		Collection<String> cl=new Collection<String>() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(Collection<? extends String> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean add(String e) {
				// TODO Auto-generated method stub
				return false;
			}
		};

	}

}
