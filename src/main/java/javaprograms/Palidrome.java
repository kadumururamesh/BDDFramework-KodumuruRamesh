package javaprograms;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String orgstr=scan.nextLine();
		System.out.println(orgstr);
		String revstr="";
		for(int i=orgstr.length()-1;i>=0;i--) {
			revstr=revstr+orgstr.charAt(i);
			
		}
		if(orgstr.equals(revstr)) {
			System.out.println("yes it is palidrome");
		}else {
			System.out.println("No it is not palidrome");
		}
	}

}
