package Arrays;

public class BuyAndSell {
    public static int maxProfit(int[] nums) {
        int n = nums.length;
        int profit = 0;
        int buy = nums[0];
        for(int i = 0; i < n; i++) {
            if(nums[i] < buy) {
                buy = nums[i];
            } else if(nums[i] - buy > profit) {
                profit = nums[i] - buy;
            }
        }
        return profit; // return maximum profit you can get
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Maximum profit is : " + maxProfit(prices));
    }
}
