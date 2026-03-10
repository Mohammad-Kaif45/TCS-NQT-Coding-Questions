package Arrays;

import java.util.*;

public class RepeatingElement {
    public static void solve(int[] nums) {
        int n = nums.length;
        int[] dup = new int[n];
        int cnt = 0;

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] == nums[j]) {
                    dup[cnt++] = nums[i];
                }
            }
        }
        System.out.print("The repeating elements are: ");
        for (int i = 0; i < cnt; i++) {
            if (i == 0 || dup[i] != dup[i - 1]) {  // Ensure duplicates are not printed twice
                System.out.print(dup[i] + " ");
            }
        }
    }

    // Better approach
    public static void findRepeatingElements(int[] arr) {
        Arrays.sort(arr);  // Sort the array to easily find duplicates

        System.out.print("The repeating elements are: ");
        for (int i = 0; i < arr.length - 1; i++) {
            // If current element is equal to next element, it's a repeating element
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Optimal

    public static List<Integer> RepeatingElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> duplicate = new ArrayList<>();

        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                duplicate.add(entry.getKey());
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4, 5, 2};
//        solve(nums);
//        findRepeatingElements(nums);

        System.out.println(RepeatingElements(nums));

    }
}
