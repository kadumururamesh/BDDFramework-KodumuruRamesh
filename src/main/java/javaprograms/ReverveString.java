package javaprograms;

import java.util.Scanner;

public class ReverveString {
	
	public static void main(String[] args) {
		
		String s="ramesh";
		
		String rev="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println("i -"+i);
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}
	}

}
