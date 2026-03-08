package Arrays;

import java.util.HashSet;

public class RemoveDuplicate {
    public static int remove(int[] nums) {
        int n = nums.length;
//        HashSet<Integer> seen = new HashSet<>();
//        int idx = 0;
//        for(int num : nums) {
//            if(!seen.contains(num)) {
//                seen.add(num);
//                nums[idx] = num;
//                idx++;
//            }
//        }
//        return idx;

        int idx = 0;
        if(n == 0) return 0;
        for(int i = 1; i < n; i++) {
            if(nums[i] != nums[idx]) {
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx + 1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3};
        int res = remove(nums);
        System.out.println("Array after removing duplicate : ");
        for(int i = 0; i < res; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
