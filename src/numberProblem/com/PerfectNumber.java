package numberProblem.com;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scn.nextInt();
		int sum =0;
		for(int i=1;i<=num-1;i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		if(sum==num) {
			System.out.println("Perfect number:");
		}
		else {
			System.out.println("not");
		}

	}

}
