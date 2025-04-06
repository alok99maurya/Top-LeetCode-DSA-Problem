package numberProblem.com;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello Woeld");
//		int a=10;
//		int b =20;
//		int c = a+b;
//		System.out.println(c);
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a first number");
		int num1 = a.nextInt();
		System.out.println("Enter a second number ");
		int num2 = a.nextInt();
		int sum = num1 + num2;
		System.out.println("sum is" + sum);
	}

}