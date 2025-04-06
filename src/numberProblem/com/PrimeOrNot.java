package numberProblem.com;

import java.util.Scanner;

public class PrimeOrNot {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int count =0;
		if(n==1) {
			System.out.println("Not Required:");
		}
		for(int i=2;i<10;i++) {
			if(n%i==0) {
				count ++;
				break;
			}
		}
		if(count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println(" Not a prime number ");
		}
		}

	

}
