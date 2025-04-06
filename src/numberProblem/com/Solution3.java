package numberProblem.com;

public class Solution3 {

	public static void main(String[] args) {
		int[] nums1 = {1,2,5,3,4};
		int[] nums = {1,2};
		int ans = main(nums);
		System.out.println(ans);
		int ans1 = main(nums1);
		System.out.println(ans1);
		

	}
	public static int main(int[] arr) {
		if(arr.length==1) {
			return 1;
		}
		if(arr.length==2) {
			if(arr[1]-arr[0]-1==0) {
				return 2;
			}
			else {
				return 1;
			}
		}
		int[] arr2 = new int[arr.length];
		int i=0;
		int count = 0;
		while(i<arr.length-1) {
			int j=i+1;
			if(arr[j]-arr[i]==1) {
				arr2[count]=arr[j];
				count++;
				i++;
			}
			else if(arr[j+1]-arr[i]==1) {
				arr2[count]=arr[j];
				count++;
				i += 2;
			}
			else {
				i++;
			}
			
		}
		return count+1;
	}

}
