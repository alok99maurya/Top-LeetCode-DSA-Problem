import java.util.Arrays;

public class CycleSort {
	public static void swap(int[] arr ,int s ,int e) {
		
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
		
	}
	
	public static void sortElements(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
				//System.out.println(i +   " "+correct);
			}
			else {
				i++;
			}
		}
		
	}

	public static void main(String[] args) {
		int[]arr = {1,3,2,5,4};
		sortElements(arr);
		System.out.println("alok2");
		System.out.println(Arrays.toString(arr));
		System.out.println("alok");


	}

}
