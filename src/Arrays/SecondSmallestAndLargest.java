package Arrays;

public class SecondSmallestAndLargest {
    public static int secondSmall(int[] nums) {
        int n = nums.length;
        int small = Integer.MAX_VALUE;
        int s_small = Integer.MAX_VALUE;
        for(int num : nums) {
            small = Math.min(num,small);
        }
        for(int num : nums) {
            if(num < s_small && num != small) {
                s_small = num;
            }
        }
        return s_small;
    }

    public static int secondLargest(int[] nums) {
        int n = nums.length;
        int large = Integer.MIN_VALUE;
        int s_large = Integer.MIN_VALUE;
        for(int num : nums) {
            large = Math.max(num,large);
        }
        for(int num : nums) {
            if(num > s_large && num != large) {
                s_large = num;
            }
        }
        return s_large;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,7,8,6,11};
        int second_small = secondSmall(nums);
        System.out.println("Second Smallest : " + second_small);
        int second_large = secondLargest(nums);
        System.out.println("Second Largest : " + second_large);
    }
}
