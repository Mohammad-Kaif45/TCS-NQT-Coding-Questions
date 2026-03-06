import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestNumber {
    public static int sort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[0];
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,1,-1};
        System.out.println("Smallest number in an array is : " + sort(nums));
    }
}
