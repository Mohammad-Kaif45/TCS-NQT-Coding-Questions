package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    // BRUTE FORCE APPROACH -> O(n^2) time complexity and space complexity is -> O(n)
    public static void countFrequency(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) continue;
            int count = 1;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(nums[i] + " -> " + count);
        }
    }

    // Optimal Approach

    public static void frequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] nums = {10,5,10,2,10,5};
        countFrequency(nums);
        frequency(nums);
    }
}
