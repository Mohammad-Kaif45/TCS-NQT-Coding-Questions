package BitManupulation;

public class FindSinglePositiveNumber {
    public static int find(int[] nums) {
        int sum = 0;
        for (int num : nums){
            sum ^= Math.abs(num);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-1,4,1,-2,-4};
        System.out.println(find(nums));
    }
}
