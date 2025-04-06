package numberProblem.com;

import java.util.Arrays;

public class Wired {

	public static void main(String[] args) {
		//int[] b = {3,3,1,3,3};
		int[] b = {5};
		int ans = main(b);
		System.out.println(ans);

	}
	public static int main(int[] a) {
		if(a.length<2) {
			return 0;
		}
		int[] li = new int[a.length];
		int count =0;
		int maximum = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				else {
					li[i]=count;
					count =0;
					break;
				}
			}
		}
		maximum= Arrays.stream(li).max().getAsInt();
		return maximum;
	}

}
