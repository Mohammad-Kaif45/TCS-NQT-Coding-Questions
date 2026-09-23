import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];   // ✅ swap array elements
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 2, 0, 1, 0, 2, 0, 1, 2, 2, 0, 2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        // Output: [0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2]
    }
}
