package javaprograms;

public class Occurance {

	public static void main(String[] args) {
		String s="aabbbbbcccc",str="";
		//System.out.println(s.length());
		char a,b;
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			//System.out.println("i-"+i);
			count=count+1;
			str=str+s.charAt(i);
			int counter=0;
			for(int j=i;j>=0;j--) {
				//System.out.println("j-"+j);
				a=s.charAt(i);
				b=s.charAt(j);
				//int z=Character.compare(a, b);
				if(Character.compare(a, b)==0) {
					counter=counter+1;
				
				//counter=counter+i;
				
			}
				System.out.println(a +" - "+b);
			
			
		}
			System.out.println(s.charAt(i) +"-"+counter);
			count=0;
		//System.out.println(count);
		System.out.println(str);
	}

}
}
