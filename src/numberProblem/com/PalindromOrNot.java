package numberProblem.com;

import java.util.Scanner;

public class PalindromOrNot {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scn.nextInt();
		int ans = 0;
		int temp = num;
		
		while(num!=0) {
			int last = num % 10 ;
			ans = ans *10 + last;
			num = num/10;
			
		}
		if(temp==ans) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}

	}

}
