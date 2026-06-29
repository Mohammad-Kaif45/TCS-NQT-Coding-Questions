package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLast {

    // Brute force approach -> O(n)
    // n = length of the array
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        FindFirstAndLast obj = new FindFirstAndLast();
        int[] ans = obj.searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
