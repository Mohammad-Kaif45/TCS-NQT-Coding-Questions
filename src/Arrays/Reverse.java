package Arrays;

import java.util.Arrays;

public class Reverse {
    public static int[] reverse(int[] nums) {
        int[] rev = new int[nums.length];
        int idx = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            rev[idx++] = nums[i];
        }
        return rev;
    }

    public static void reverse_Better(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(nums)));
        reverse_Better(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
