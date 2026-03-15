package Arrays;

public class MaximumSubarraySum {

    // Brute force approach
    public static int maximumSubarray(int[] nums) {
        int n = nums.length;

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int sum = 0;
                for(int k = i; k < j; k++) {
                    sum += nums[k];
                }
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(maximumSubarray(nums));
    }
}
