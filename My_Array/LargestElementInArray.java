package My_Array;

import java.util.Arrays;

public class LargestElementInArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]=new int[]{4,6,2,9,8,3,2,1};

//------------Using arrays.sort method{T.C=> O(nlogn}-----------------
		
//		Arrays.sort(arr);
//		System.out.println("Largest element is:"+" "+arr[arr.length-1]);
		
//----------------Using Iteration {T.C.=> O(n)} ------------------
		
		int a=arr[0];
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i]>a) {
				a=arr[i];
			}
		}
		System.out.println("Largest element is:"+a);
//----------------------------------------------		

	}

}
