package Arrays;

import java.util.Arrays;

public class Median {
    public static double median (int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n % 2 != 0) {
            return nums[n/2];
        } else {
            int idx1 = (n/2) - 1;
            int idx2 = (n / 2);
            return  ((double) (nums[idx1] + nums[idx2]) / 2);
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,7};
        System.out.println("Median : " + median(nums));
    }
}
