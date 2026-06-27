package BinarySearch;

public class Cieling {
    public static int search(int[] nums,int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        int[] nums = {2,4,7,8,11,16,18,24,28};
        int target = 19;
        int ans = search(nums,target);
        System.out.println(ans);
    }
}
