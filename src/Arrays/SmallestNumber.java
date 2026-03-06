package Arrays;

import java.util.Arrays;

public class SmallestNumber {

//    Time Complexity: O(N log N), where N is the size of the array, as we are sorting the array.
//    Space Complexity: O(1), as we are using a constant
    public static int sort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[0];
    }

    public static int smallest(int[] nums){
        int small = nums[0];
        for(int num : nums) {
            if(num < small) {
                small = num;
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,1,-1};
        System.out.println("Smallest number in an array is : " + sort(nums));
        System.out.println("Smallest number : " + smallest(nums));
    }
}
