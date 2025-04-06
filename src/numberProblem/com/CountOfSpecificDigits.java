package numberProblem.com;

import java.util.Scanner;

public class CountOfSpecificDigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scn.nextInt();
		//System.out.println("Enter Find digit");
		//int n = scn.nextInt();
		int count = 0;
		while(num>0) {
			int last = num % 10;
			if(last>count) {
				count = last;
			}
			num = num / 10;
		}
		System.out.println(count);

	}

}
