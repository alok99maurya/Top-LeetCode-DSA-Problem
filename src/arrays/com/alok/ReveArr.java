package arrays.com.alok;

public class ReveArr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		// TODO Auto-generated method stub

	
		int n = arr.length;
		int[] ans=  new int[n];
		for(int i= n-1;i>=0;i--) {
			ans[n-i-1] = arr[i];
		}
		for(int j=0;j<n;j++) {
			System.out.print(ans[j] + " ,");
		}
	}

}
