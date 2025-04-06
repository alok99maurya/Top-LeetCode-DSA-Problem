package numberProblem.com;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a starting number:");
		int st = scn.nextInt();
		System.out.println("Enter a End Point:");
		int end = scn.nextInt();
		int pro = 0;
		int last;
		int sum=0;
		for(int i = st;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ,");
				last = i % 10;
				if(last==7) {
					sum = sum + i;
					
				}
				
				
			}
		}
		
		System.out.println();
		System.out.println(sum);
		
		

	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		int c = 2;
		while(c*c<=n) {
			if(n % c ==0) {
				return false;
			}
			c++;
		}
		return true;
	}

}
