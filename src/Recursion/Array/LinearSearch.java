package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
//    public static int search(int[] nums,int target,int idx) {
//        if(idx == nums.length) {
//            return -1;
//        }
//        if (nums[idx] == target) {
//            return idx;
//        }
//        return search(nums,target,idx + 1);
//    }
    public static ArrayList<Integer> linearSearch(int[] nums, int target, int index,
                                    ArrayList<Integer> ans) {

        if (index == nums.length) {
            return ans;
        }

        if (nums[index] == target) {
            ans.add(index);
        }

        return linearSearch(nums, target, index + 1, ans);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,2,4,2,5,2,6};
        int target = 2;
//        System.out.println(search(nums,target,0));
//        ArrayList<Integer> ans = new ArrayList<>();
//        linearSearch(nums,target,0,ans);
//        System.out.println(ans)
//      ;
        System.out.println(linearSearch(nums,target,0,new ArrayList<>()));
    }
}
