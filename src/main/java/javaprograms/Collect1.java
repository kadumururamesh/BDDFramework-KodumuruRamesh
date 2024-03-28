package javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.mongodb.client.model.Collation;

public class Collect1 {

	public static void main(String[] args) {
		
		//ArrayList<String> al=new ArrayList<String>();
		//List<String> al=new ArrayList<String>();
		//Collection<String> al=new ArrayList<String>();
		//Iterable<String> al=new ArrayList<>();
		
		/*
		Iterable<String> al=new ArrayList<String>();
		System.out.println("Size-"+((ArrayList<String>) al).size());
		((ArrayList<String>) al).add("ramesh");
		((ArrayList<String>) al).add(0, "swetha");
		
		System.out.println(((ArrayList<String>) al).get(1));
		*/
		ArrayList<String> al=new ArrayList<>();
		al.add("ramesh");
		al.add("swetha");
		al.add("pritam");
		al.add(3,"nidish");
		System.out.println(al);
		for(String values:al) {
			System.out.println(values);
		}
		
		
	}

}
