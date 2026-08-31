package Recursion.Array;

public class LinearSearch {
    public static int search(int[] nums,int target,int idx) {
        if(idx == nums.length) {
            return -1;
        }
        if (nums[idx] == target) {
            return idx;
        }
        return search(nums,target,idx + 1);
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,18,9};
        int target = 90;
        System.out.println(search(nums,target,0));
    }
}
