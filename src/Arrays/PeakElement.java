package Arrays;

public class PeakElement {
    public static int findIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            // left check && right check - > true
            if((i == 0 || nums[i - 1] < nums[i]) && (n - 1 == 0 || nums[i] > nums[i + 1])) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int result = findIndex(nums);
        System.out.println("Index of peak element is : " + result);
    }
}
