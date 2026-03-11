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
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0};
        System.out.println(maxproduct(nums));
    }
}
