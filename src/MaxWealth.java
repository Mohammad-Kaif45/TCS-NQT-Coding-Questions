public class MaxWealth {
    public static int maxWealth(int[][] nums) {


        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];

            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maxWealth(accounts));
    }
}