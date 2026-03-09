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
    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
//        System.out.println(Arrays.toString(insertAtStart(nums,1)));
        System.out.println(Arrays.toString(insertAtEnd(nums,6)));
    }
}
