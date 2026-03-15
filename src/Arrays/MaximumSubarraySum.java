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

    // Better

    public static int maximumSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    // Optimal
    public static int kadanessAlgo(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(maximumSubarray(nums));
        System.out.println(maximumSum(nums));
        System.out.println(kadanessAlgo(nums));
    }
}
