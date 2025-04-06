package numberProblem.com;

public class XorTwiceApprearance {

	public static void main(String[] args) {
		int[] arr = {2,3,3,4,2,6,4};
		int ans1 = ans(arr);
		System.out.println(ans1);

	}
	
	public static int ans(int[] arr) {
		int uni =0;
		for(int n =0;n<arr.length;n++) {
			uni^=arr[n];
		}
		return uni;
	}

}
