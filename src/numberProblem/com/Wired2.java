package numberProblem.com;

import java.util.Arrays;

public class Wired2 {
    public static void main(String[] args) {
        int[] b = {3,3,1,3,3};
        int ans = main(b);
        System.out.println(ans);
    }
    public static int main(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        int count = 1;
        int maximum = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                maximum = Math.max(maximum, count);
                count = 1;
            }
        }
        return Math.max(maximum, count);
    }
}

