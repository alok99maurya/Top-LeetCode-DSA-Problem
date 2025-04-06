package arrays.com.alok;

public class SmallestNumber {

	public static void main(String[] args) {
		//int [] arr = {2,5,1,3,0};
		int arr[] = {8,10,5,7,9};
		int ans = small(arr);
		System.out.println(ans);
		
	}
		
		public static int small(int[] arr) {
			int min = arr[0];
			for(int i=1;i<arr.length;i++) {
				//int num1 = num[0];
				if(min>arr[i]) {
					min = arr[i];
				}
				
			}
			return min;
		
		

	}

}
