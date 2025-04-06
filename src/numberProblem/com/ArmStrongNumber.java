package numberProblem.com;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		arm(n);
		
		

	}
	public static void  arm(int n) {
		int sum =0;
		int num = digit(n);
		int temp = n;
		while(n!=0) {
			int prod = 1;
			int last = n % 10;
			for(int i=1;i<num;i++) {
				prod = prod * last;
			}
			sum = sum + prod;
			
			n = n/10;
			
		}
		if(sum==temp) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not");
		}
		
	}
	public static int digit(int n) {
		int count=0;
		while(n!=0) {
			n = n/10;
			count++;
		}
		return count;
	}

}
