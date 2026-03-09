package Arrays;

import java.util.Arrays;

public class AddElementAtBeginning {
    public static int[] insertAtStart(int[] nums,int ele) {
        int[] newArr = new int[nums.length + 1];
        newArr[0] = ele;
        for(int i = 0; i < nums.length; i++) {
            newArr[i + 1] = nums[i];
        }
        return newArr;
    }
    public static int[] insertAtEnd(int[] nums,int ele) {
        int[] newArr = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }
        newArr[nums.length] = ele;
        return newArr;
    }

    public static int[] insertAtPosition(int[] arr, int pos, int x) {
        // Create new array of +1 size
        int[] newArr = new int[arr.length + 1];

        // Copy elements before position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert new element at pos
        newArr[pos] = x;

        // Copy remaining elements
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
//        System.out.println(Arrays.toString(insertAtStart(nums,1)));
//        System.out.println(Arrays.toString(insertAtEnd(nums,6)));

        System.out.println(Arrays.toString(insertAtPosition(nums,2,3)));
    }
}
