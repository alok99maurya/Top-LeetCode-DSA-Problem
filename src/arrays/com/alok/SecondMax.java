package arrays.com.alok;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr = {6,3,2,8,7,5,1};
		int ans = secMax(arr);
		System.out.println(ans);

	}
	public static int secMax(int[] arr) {
		int max = findMax(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int sec = findMax(arr);
		return sec;
	}
	
	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		return max;
	}

}
