package arrays.com.alok;

public class LargestInArrays {

	public static void main(String[] args) {
		//int arr[] = {2,5,1,3,0};
		int arr[] = {8,10,5,7,9};
		int ans = find(arr);
		System.out.println(ans);

	}
	public static int find(int[] num) {
		int max = num[0];
		for(int b:num) {
			if(max<b) {
				max = b;
			}
		}
		return max;
		
	}

}
