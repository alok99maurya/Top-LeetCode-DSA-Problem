
public class SortedOrNotSorted {
	
	public boolean sorted(int[] arr ,int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]>=arr[i-1]) {
				
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		SortedOrNotSorted sor = new SortedOrNotSorted();
		int[] arr = {1,2,3,4,5};
		boolean ans =sor.sorted(arr, arr.length);
		System.out.println(ans);
		

	}

}
