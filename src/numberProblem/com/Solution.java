package numberProblem.com;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,2,3,4,5,6,7,8};
		int[] arr = {2,10,8,12,6,7};
		int n = arr.length;
		int target = 16;
		int ans = f(arr,n,target);
		System.out.println(ans);

	}
	public static int f(int[] arr,int n,int target) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[j]+ arr[i]==target) {
					sum = i + j;
				}
			}
		}
		return sum;
	}

}
