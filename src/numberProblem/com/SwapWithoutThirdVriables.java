package numberProblem.com;

import java.util.Scanner;

public class SwapWithoutThirdVriables {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a 1st Number :");
		int a = scn.nextInt();
		System.out.println("Enter a Second Number:");
		int b = scn.nextInt();
		a = a+b;
		b= a-b;
		a=a-b;
		System.out.println(a + " "+ b);

	}

}
