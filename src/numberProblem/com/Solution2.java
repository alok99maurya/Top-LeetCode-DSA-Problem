package numberProblem.com;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = find(1,10);
		
		System.out.println(ans);

	}
	public static int find(int n , int e) {
		int sum=0;
		for(int i=n;i<=e;i++) {
			if(isprime(i)) {
				sum = sum + i;
				
				
			}
		}
		return sum;
	}
	public static boolean isprime(int n) {
		if(n==1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
		      if (n % i == 0)
		        return false;
		    }
		return true;
		
	}
	
	

}
