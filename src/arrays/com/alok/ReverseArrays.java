package arrays.com.alok;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
//		int ans = reverse(arr);
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void reverse(int[] arr) {
		int start =0;
		int end= arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	public static void swap(int[] n1,int n2,int n3) {
		
		int temp = n1[n2];
		n1[n2]=n1[n3];
		n1[n3]=temp;
	}

}
