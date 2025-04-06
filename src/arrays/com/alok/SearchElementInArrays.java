package arrays.com.alok;

public class SearchElementInArrays {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = 3;
		int ans = search(arr,n);
		//System.out.println(ans);
		int[] ar = {6,7,9,5,3,10};
		int n1 = 10;
		int an = search(ar,n1);
		System.out.println(an);

	}
	public static int search(int[] arr , int search) {
		
		for(int i=0;i<arr.length;i++) {
			int element = arr[i];
			if(element==search) {
				return i;
			}
		}
		return -1;
	}

}
