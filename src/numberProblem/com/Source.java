package numberProblem.com;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(find(arr));
	}
	public static int find(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(isprime(i)) {
				sum = sum + i;
				
				
			}
		}
		return sum;
	}
	
	public static boolean isprime(int n) {
		if(n==1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
		      if (n % i == 0)
		        return false;
		    }
		return true;
		
	}

}
