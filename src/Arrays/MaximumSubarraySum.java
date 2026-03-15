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
    public static int maxSubArray(int[] nums) {
        // Maximum sum
        long maxi = Long.MIN_VALUE;
        // Current sum of subarray
        long sum = 0;
        // Starting index of current subarray
        int start = 0;
        // Indices of the maximum sum subarray
        int ansStart = -1, ansEnd = -1;
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Update starting index if sum is reset
            if (sum == 0) {
                start = i;
            }
            // Add current element to the sum
            sum += nums[i];
            // Update maxi and subarray indices if current sum is greater
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }
        // Printing the subarray
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
        // Return the maximum subarray sum found
        return (int) maxi;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(maximumSubarray(nums));
        System.out.println(maximumSum(nums));
        System.out.println(kadanessAlgo(nums));
        System.out.println(maxSubArray(nums));
    }
}
