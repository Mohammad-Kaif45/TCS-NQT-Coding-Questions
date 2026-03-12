package String;

import java.util.*;

public class FrequencyCount {
    public static void count(String text) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        System.out.println(map);
    }

    public static void Flatt2DArray(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        for(int[] arr : nums) {
            for(int num : arr) {
                list.add(num);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4},{5,6}};
        String text = "hello";
        count(text);
        Flatt2DArray(nums);
    }
}
