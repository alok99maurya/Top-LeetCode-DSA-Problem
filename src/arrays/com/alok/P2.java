package arrays.com.alok;

public class P2 {

	public static void main(String[] args) {
		int [] arr = {2,7,4,2,3,3};
		boolean ans = main(arr);
		System.out.println(ans);

	}
	public static boolean main(int[] arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			
		}
		int sum1 = 0;
		for(int j=0;j<=arr.length;j++) {
			sum1 = sum1+ j;
		}
		
		if(sum==sum1) {
			return true;
		}
		return false;
	}
	

}
