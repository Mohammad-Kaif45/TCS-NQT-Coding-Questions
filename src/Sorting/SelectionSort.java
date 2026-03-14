package Sorting;

public class SelectionSort {
    public static void sort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int min = i;

            for(int j = i + 1; j < n; j++) {
                if(nums[min] > nums[j]) {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
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
