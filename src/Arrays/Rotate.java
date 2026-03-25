package Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;
        System.out.println("Before rotataion : ");
        for(int i  =0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = nums[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        System.out.println("After rotation : ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
