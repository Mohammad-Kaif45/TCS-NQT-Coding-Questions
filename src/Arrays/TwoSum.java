package Arrays;
import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums,int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j< n; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public int[] twoSumIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // If complement found, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store current element and index
            map.put(arr[i], i);
        }
        // No pair found
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        int[] nums = {-1,1,3,4,6};
        System.out.println(Arrays.toString(twoSum(nums,0)));
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSumIndices(nums,5)));
    }
}
