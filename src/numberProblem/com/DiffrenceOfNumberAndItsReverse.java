package numberProblem.com;

import java.util.Scanner;

public class DiffrenceOfNumberAndItsReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st number");
		int a = sc.nextInt();
		System.out.println("Enter a 2nd Number");
		int b = sc.nextInt();
		int diff = ((10*a)+b) -((10*b)+a);
		System.out.println(diff);

	}

}
