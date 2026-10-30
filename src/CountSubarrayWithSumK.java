import java.util.*;
public class CountSubarrayWithSumK {
    public int subarraySum(int[] nums, int k) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);

        long sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        CountSubarrayWithSumK obj = new CountSubarrayWithSumK();
        int ans = obj.subarraySum(nums,k);
        System.out.println(ans);
    }
}
