package My_Array;

import java.util.Arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[]{4,6,2,9,8,3,2,1,4};
		int len=arr.length;

//		int small=arr[0];
//		int secSmall=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length;i++) {
//		
//			if(arr[i]<small) {
//				small=arr[i];
//			}
//			if(arr[i]<small && arr[i]!=small) {
//				secSmall=arr[i];
//				break;
//			}
//		}
//		System.out.println("Smallest element is:"+" "+small);
//		System.out.println("2nd Smallest element is:"+" "+secSmall);
		
//------------------------------------------------
		
		Arrays.sort(arr);
		int small=arr[0];
		int secsmall=arr[1];
		System.out.println("Smallest element is:"+" "+small);
		
		for(int i=1;i<len;i++) {
			if(arr[i]!=small) {
				secsmall=arr[i];
				break;
			}
		}
		System.out.println("2nd Smallest element is:"+" "+secsmall);
	}

}
