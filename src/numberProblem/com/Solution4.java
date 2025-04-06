package numberProblem.com;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {
	public static void main(String[] args) {
		int[] arr = {3,3,1,3,3};
		int ans = weirdSubarray(arr);
		System.out.println(ans);
	}
    public static int weirdSubarray(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        int weirdNum = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                weirdNum = entry.getKey();
            }
        }

        if (maxCount == 1) {
            return 0;
        }

        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == weirdNum) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        return last - first + 1;
    }
}