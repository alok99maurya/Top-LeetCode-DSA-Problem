package arrays.com.alok;

import java.util.Arrays;

public class A1 {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		int ans =max(arr);
		System.out.println(ans);

	}
	public static int max(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int tem = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tem;
				}
			}
		}
		int ans = arr[1] * arr[2];
		return ans;
	}

}
