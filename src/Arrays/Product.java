package Arrays;

import java.util.Arrays;

public class Product {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int product = 1;
        for(int num : nums) {
            product = product * num;
        }
        for(int i = 0; i < n; i++) {
            ans[i] = product / nums[i];
        }
        return ans; // return ans
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Product obj = new Product();
        int[] result = obj.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
