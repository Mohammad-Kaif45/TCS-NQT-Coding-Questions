package BinarySearch;

public class BinarySearch {
    public static int BinarySearch(int[] nums,int target) {
        int n = nums.length;

int left = 0;
int right = n -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,7,8,11,16,18,24,28};
        int target = 18;
        int ans = BinarySearch(nums,target);
        System.out.println(ans);
    }
}
