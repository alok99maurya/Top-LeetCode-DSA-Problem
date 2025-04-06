
public class MissingNumber {
	
	    public static void swap(int[] arr , int s,int e){
	        int temp = arr[s];
	        arr[s] = arr[e];
	        arr[e] = temp;
	    }
	    public static int missingNumber2(int[] nums) {
	        int i=0;
	        while(i<nums.length){
	            int cor = nums[i];
	            if(nums[i]<nums.length &&nums[i]!=nums[cor]){
	                swap(nums,i,cor);
	            }
	            else {
	                i++;
	            }
	        }
	        for(int j=0;j<nums.length;j++){
	            if(nums[j]!=j){
	                return j;
	            }
	        }
	        return nums.length;
	        
	    }
	

	public static void main(String[] args) {
		int[] arr = {3,0,1};
		int ans = missingNumber2(arr);
		System.out.println(ans);
		
		

	}

}
