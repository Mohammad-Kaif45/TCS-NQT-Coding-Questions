package Arrays;

public class MaximumProduct {

    // Brute Force
    public static int maxproduct(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            int prod = 1;
            for(int j = i; j < nums.length; j++) {
                prod = prod * nums[j];
                max = Math.max(prod,max);
            }
        }
        return max;
    }
    public int maxProductSubArray(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Initialize prefix and suffix product
        int pre = 1, suff = 1;

        // Initialize answer with smallest integer
        int ans = Integer.MIN_VALUE;

        // Traverse from both left and right
        for (int i = 0; i < n; i++) {
            // Reset prefix if zero
            if (pre == 0) pre = 1;

            // Reset suffix if zero
            if (suff == 0) suff = 1;

            // Multiply prefix with current element from front
            pre *= arr[i];

            // Multiply suffix with current element from back
            suff *= arr[n - i - 1];

            // Update maximum value so far
            ans = Math.max(ans, Math.max(pre, suff));
        }

        // Return the final result
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0};
        System.out.println(maxproduct(nums));
    }
}
