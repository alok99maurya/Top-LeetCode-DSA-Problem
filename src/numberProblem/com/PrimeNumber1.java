package numberProblem.com;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner  scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scn.nextInt();
		int count =0;
		for(int i=2;i<=number-1;i++) {
			if(number % i==0) {
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("NOT PRIME :");
		}

	}

}
