package BinarySearch;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(nums,target));
    }

    public static int ans(int[] nums,int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(nums,target,start,end);
    }

    public static int search(int[] nums,int target,int left,int right) {
        int n = nums.length;
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
}
