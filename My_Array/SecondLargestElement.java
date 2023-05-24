package My_Array;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]=new int[]{4,6,2,9,8,3,2,1,8};
		int len=arr.length;

//-------------Using Brute Force Algo{T.C.=O(nlogn)---O(n)}---------------------
//		Arrays.sort(arr);
//				
//		int largest=arr[arr.length-1];
//		System.out.println("Largest element of array is:"+" "+largest);
//		int secLarg=arr[arr.length-2];
//		
//		
//		for(int i=len-2;i>=0;i--) {
//			if(arr[i]!=largest) {
//				secLarg=arr[i];
//				break;
//			}
//		}
//
//		System.out.println("2nd Largest element in array 2nd iteration:"+" "+secLarg);
	
//---------------------Using Iteration{T.C.=> O(2n)}----------------------
//		int larg=arr[0];
//		int seclarg=-1;
//		for(int i=0;i<len;i++) {
//			if(arr[i]>larg) {
//				larg=arr[i];
//				
//			}
//			if(arr[i]>seclarg && arr[i]!=larg) {
//				seclarg=arr[i];
//			}
//		}
//		System.out.println("2nd Largest element in array:"+" "+seclarg);
	
//-----------------------------------------------------------
		
		int larg=arr[0];
		int seclarg=-1;
		for(int i=0;i<len;i++) {
			if(arr[i]>larg) {
				seclarg=larg;
				larg=arr[i];
				
			}
		}
		System.out.println("2nd Largest element in array:"+" "+seclarg);
		
	}

}
