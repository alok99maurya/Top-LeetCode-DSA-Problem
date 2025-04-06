import java.util.Arrays;

public class SecondLargest {
	
	public static int secondType2(int[] arr,int n) {
		int max = arr[0];
		int secMax = 0;
		for(int i = 1;i<n;i++) {
			if(arr[i]>max) {
				secMax = max;
				max = arr[i];
			}
			else if(arr[i]>secMax && arr[i]<max) {
				secMax = arr[i];
			}
		}
		return secMax;
	}
	public static int secondLargest(int[]nums,int n) {
		int lar = nums[0];
		int sec = nums[0];
		for(int i=1;i<n;i++) {
			if(nums[i]>lar) {
				lar = nums[i];
			}
		}
		for(int i=1;i<n;i++) {
			if(nums[i]>sec && nums[i]<lar) {
				sec = nums[i];
			}
		}
		return sec;
	}

	public static void main(String[] args) {
		int[] arr = {10, 10, 10};
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		int ans = secondType2(arr, n);
		System.out.println(ans);

	}

}
