package arrays.com.alok;

public class ArrayManipulation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,4,5,2,1,3,7,7,5,5,1};
		int ans = find(arr);
		System.out.println(ans);

	}
	public static int find(int[] arr) {
		int ans=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>0) {
				ans= arr[k];
			}
		}
		return ans;
	}

}
