import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElements {
	public static HashSet<Integer> getDuplicateElement(int[] arr){
		HashSet<Integer>set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			
		}
		return set;
	}
	public static void duplicate(int[] arr ,int n){
		ArrayList<Integer> ls = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int key = arr[i];
			int count =0;
			for(int j = 0;j<n;j++) {
				if(arr[j] == key) {
					count++;
				}
			}
			if(count>1) {
				boolean s =true;
				for(int k=0;k<ls.size();k++) {
					if(ls.get(k)==key) {
						s = false;
						break;
					}
				}
				if(s==true) {
					System.out.println(key);
					ls.add(key);
				}
			}
		}
		
		
		//return ls;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,3};
		duplicate(arr, arr.length);
		HashSet<Integer>ans = getDuplicateElement(arr);
		System.out.println(ans);

	}

}
