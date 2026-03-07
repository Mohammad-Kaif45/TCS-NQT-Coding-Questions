package Arrays;

public class Average {
    public static int avergae (int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum/n;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("Average : " + avergae(nums));
    }
}
