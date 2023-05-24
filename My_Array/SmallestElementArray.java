package My_Array;

public class SmallestElementArray {

	public static void main(String[] args) {
		
		int arr[]=new int[]{4,6,2,9,8,3,2,1};

		int a=arr[0];
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i]<a) {
				a=arr[i];
			}
		}
		System.out.println("Smallest element is:"+" "+a);
	}

}
