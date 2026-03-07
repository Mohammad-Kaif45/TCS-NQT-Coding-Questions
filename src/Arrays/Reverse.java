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
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(nums)));
    }
}
