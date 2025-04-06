package numberProblem.com;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Size Of Array:");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scn.nextInt();
			
		}
		int ans = bubble(arr);
		System.out.println(ans);

	}
	public static int bubble(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=1;j<nums.length-i;j++) {
				if(nums[j]<nums[j-1]) {
					int temp = nums[j-1];
					nums[j-1]=nums[j];
					nums[j]= temp;
				}
			}
		}
		int ans = nums[1];
		return ans;
	}

}
