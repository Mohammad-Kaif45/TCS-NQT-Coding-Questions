package Arrays;

import java.util.Arrays;

public class Rearrange {
    public static void rearrange(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length / 2,j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,4,1,3,6,2};
        rearrange(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
