package numberProblem.com;

import java.util.Scanner;

public class Alok {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum=0;
		int sum1=0;
		for(int i=1;i<=m;i++) {
			if(i%n==0) {
				sum = sum + i;
			}
			else 
			{
				sum1 = sum1 + i;
			}
		}
		int d = sum -sum1;
		if(d<0) {
			d = d * -1;
		}
		System.out.println(d);
		

	}

}
