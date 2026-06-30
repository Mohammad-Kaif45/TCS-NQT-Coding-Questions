package BinarySearch;

public class SearchRotate {

    static int search(int[] nums,int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            // just do the normal binary search because array is not rotated
            return BinarySearch(nums,target,0,nums.length - 1);
        }

        // if pivot is found, you have found two ascending array
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target > nums[0]) {
            return BinarySearch(nums,target,0,pivot - 1);
        }

        return BinarySearch(nums,target,pivot + 1,nums.length - 1);
    }

    public static int BinarySearch(int[] nums,int target,int left,int right) {
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
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5,6,7,1,2,3,4};
        int target = 3;
        System.out.println(search(nums,target));
    }
}
