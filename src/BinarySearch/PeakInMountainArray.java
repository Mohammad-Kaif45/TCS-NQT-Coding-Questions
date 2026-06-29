package BinarySearch;

public class PeakInMountainArray {


    public static int find(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,0};
        int ans = find(nums);
        System.out.println("Peak Index of element in mountain array is : " + ans);
    }
}
