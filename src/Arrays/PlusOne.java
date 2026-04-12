package Arrays;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] nums) {
        int n = nums.length;
        for(int i = n - 1; i >= 0; i--) {
            if(nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;

        }
        int[] result = new int[n + 1];
        nums[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,0};
        PlusOne obj = new PlusOne();
        int[] ans = obj.plusOne(nums);
        System.out.println(Arrays.toString(ans));
    }
}
