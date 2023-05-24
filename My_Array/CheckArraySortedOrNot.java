package My_Array;

import java.util.Scanner;

public class CheckArraySortedOrNot {
	
	public static boolean isSorted(int [] arr) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=arr[i-1]) {
				System.out.println(arr[i]);
			}
			else {
				System.out.println("Arrays is not sorted");
				return false;
			}
			
		}
		System.out.println("Arrays is sorted");
		return true;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements in array");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(isSorted(arr));
		
	}

}
