package Arrays;
// Brute Force Approach : Sort the array and return the last element

// Optimal :
// Time Complexity : O(N)
public class LargestNumber {
    public static int largest(int[] nums) {
        int large = nums[0];
        for(int num : nums) {
            if(num > large) {
                large = num;
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int[] nums = {4,7,1,9,10,6};
        System.out.println("Largest Number : " + largest(nums));
    }
}
