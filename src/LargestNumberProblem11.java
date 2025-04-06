import java.util.Arrays;

public class LargestNumberProblem11 {
	public static int largestNumber(int[] arr , int n) {
		int lar = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>lar) {
				lar = arr[i];
			}
		}
		return lar;
	}

	public static void main(String[] args) {
		int[] arr = {2,1,3,2,4};
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		int ans = largestNumber(arr, n);
		System.out.println(ans);

	}

}
