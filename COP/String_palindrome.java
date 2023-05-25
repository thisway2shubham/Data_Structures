package COP;

import java.util.Scanner;

public class String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*      Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sc.next();
		StringBuffer sb=new StringBuffer(str);
		
		sb.reverse();                                     //Right Method
        String finalStr=sb.toString();
        
        if(finalStr.equals(str)) {
        	System.out.println("Palindrome");
        	
        }
        else
        	System.out.println("not palindrome");       */ 
	
	
	// Another Method-----------------------------------------
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sc.next();
		String temp=str;
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
					
		}
		
		System.out.println("Reverse-->"+rev);
		if(temp.equals(rev)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	
	
	}
	

}
