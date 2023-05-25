package COP;

import java.util.Scanner;

public class Recursive_Factorial {
	
	
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return (num*fact(num-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int fact1=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("ENTER NUMBER");
         int n=sc.nextInt();
         
         fact1=fact(n);
         System.out.println("Factorial is----->"+fact1);

	}

}
