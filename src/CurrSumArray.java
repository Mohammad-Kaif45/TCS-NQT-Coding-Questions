import java.util.Arrays;
public class CurrSumArray {
    public static int[] solve(int[] nums) {
        int n = nums.length;
        int curr = 0;
        int[] ans = new int[n];
        int idx = 0; // index of ans array
        for (int num : nums) {
            curr = curr + num;
            ans[idx++] = curr;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2}; // input array nums
        System.out.println(Arrays.toString(solve(nums)));
    }
}
