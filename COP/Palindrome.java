package COP;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		
		if(temp==sum) {
			System.out.println("Palindrome");
			
		}
		
		else
			System.out.println("not palindrome");

	}

}
