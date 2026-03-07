package Arrays;

import java.util.Arrays;

public class ArraySum {
    public static int sum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;

        // using build in method
//        return Arrays.stream(nums).sum();
    }
    public static void main(String[] args) {
        int[] nums = {-1,4,6,3,0};
        System.out.println(sum(nums));
    }
}
