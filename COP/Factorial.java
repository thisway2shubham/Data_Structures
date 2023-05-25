package COP;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n=1;
		
		for(int i=num;i>0;i--) {
			n=n*i;
		}
		System.out.println("Factorial is-->"+ n);
		

	}

}
