package Sorting;

public class InsertionSort {
    public static void sort(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            int curr = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > curr) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = curr;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,6,7,1,2,8,4,5};
        sort(nums);
    }
}
