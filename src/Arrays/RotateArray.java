package Arrays;

public class RotateArray {
    public static void reverse(int[] nums,int left,int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void leftRotate(int[] nums,int d) {
        d = d % nums.length;
        if(d == 0) return;
        reverse(nums,0,d - 1);
        reverse(nums,d,nums.length - 1);
        reverse(nums,0,nums.length - 1);
    }

    public static void rightRotate(int[] nums,int d) {
        leftRotate(nums,nums.length - (d % nums.length));
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        leftRotate(nums,2);
        System.out.println("Left Rotation : ");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        nums = new int[]{1,2,3,4,5};
        rightRotate(nums,2);
        System.out.println("Right Rotation");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
