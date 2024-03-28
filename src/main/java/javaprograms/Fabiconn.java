package javaprograms;

import java.util.Scanner;

public class Fabiconn {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int no;
		no=scan.nextInt();
		fab(no);
		
		
	}
	static void fab(int x) {
		int a=0,b=0,c=1,no=x;
		System.out.println(no); //15 
		for(int i=0;i<no;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
			
		}
	}

}
