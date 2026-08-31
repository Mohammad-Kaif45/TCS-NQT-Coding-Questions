package Recursion.Array;

public class Sort {
    public static boolean sortedOrNot(int[] nums,int index) {
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i] < nums[i - 1]) {
//                return false;
//            }
//        }
//        return true;
        if(index == nums.length - 1) {
            return true;
        }
        return nums[index] < nums[index + 1] && sortedOrNot(nums,index + 1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6};
        System.out.println(sortedOrNot(nums,0));
    }
}
