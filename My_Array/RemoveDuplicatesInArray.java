package My_Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int sz=sc.nextInt();
		System.out.println("Enter elements in array");
		int arr[]=new int[sz];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Set st=new HashSet();
		
		for(int i=0;i<arr.length;i++) {
			st.add(arr[i]);
		}
		System.out.println(st);
	
		int index=0;
		for(Object it:st) {
			arr[index]=(int) it;
			index++;
			
		}
	
	}

}
