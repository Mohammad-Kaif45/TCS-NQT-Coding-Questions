package BinarySearch;

public class LowerBound {
    public static int lowerBound(int[] nums,int x) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= x) return mid;
            if (nums[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        int x = 9;
        int ans = lowerBound(nums,x);
        System.out.println(ans);
    }
}
