package arrays.com.alok;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,-2,-2,5,5,5};
		int ans = find(arr);
		System.out.println(ans);

	}
	public static int find(int[] arr) {
		int count =0;
		 int n =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					n++;
				}
			}
		}if(n!=0) {
			return count-1;
			
		}
		return count;
	
	}

}
