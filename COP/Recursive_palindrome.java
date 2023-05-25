package COP;

import java.util.Scanner;

public class Recursive_palindrome {

	static int sum=0;
	static int rem;
	public static int recurPalin(int num) {
		if(num!=0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			recurPalin(num);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int ss=recurPalin(n);
		
		if(ss==temp) {
			System.out.println("Palindrome");
			
		}
		else
			System.out.println("not palindrome");

	}

}
