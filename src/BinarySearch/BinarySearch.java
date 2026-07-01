package BinarySearch;

public class BinarySearch {
    public static int BinarySearch(int[] nums,int target) {
        int n = nums.length;

int left = 0;
int right = n -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {

                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {10,7,5,4,3,1};
        int target = 1;
        int ans = BinarySearch(nums,target);
        System.out.println(ans);
    }
}
