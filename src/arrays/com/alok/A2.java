package arrays.com.alok;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {1,5,3,4,6,3,4};
		int ans = find(arr);
		System.out.println(ans );

	}
	public static int find(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
				
			}
		}
		return -1;
	}

}
