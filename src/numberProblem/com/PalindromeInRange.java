package numberProblem.com;

public class PalindromeInRange {

	public static void main(String[] args) {
		count(10,50);

	}
	public static void count(int min,int max) {
		for(int i=min;i<=max;i++) {
			if(isPalindrome(i)==1) {
				System.out.print(i + " , ");
			}
		}
	}
	public static int isPalindrome(int n) {
		int ans = 0;
		int s = n;
		for(int i=n;i>0;i=i/10) {
			int last = i%10;
			ans = ans * 10 + last;
		}
		return (s==ans)?1:0;
	}

}
