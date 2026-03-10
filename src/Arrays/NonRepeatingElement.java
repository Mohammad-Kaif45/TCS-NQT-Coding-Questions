package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatingElement {
    public static List<Integer> findNonRepeatingElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> non_Duplicate = new ArrayList<>();

        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                non_Duplicate.add(entry.getKey());
            }
        }
        return non_Duplicate;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,-1,1,3,1};
        System.out.println("Non Repeating elements are in array is : ");
        System.out.println(findNonRepeatingElement(nums));
    }
}
