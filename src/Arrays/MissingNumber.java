package Arrays;

public class MissingNumber {
    public static int find(int[] nums){
        int n = nums.length + 1;
        int totalSum = n*(n+1)/2;
        int currSum = 0;
        for(int num : nums) {
            currSum += num;
        }
        return totalSum - currSum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6};
        System.out.println(find(nums));
    }
}
