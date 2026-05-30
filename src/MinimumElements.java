public class MinimumElements {

        public static int minElement(int[] nums) {
            int minElement = Integer.MAX_VALUE;

            for (int num : nums) {
                int digitSum = 0;
                int temp = num;

                // Calculate the sum of digits for the current number
                while (temp > 0) {
                    digitSum += temp % 10;
                    temp /= 10;
                }

                // Update the minimum element found so far
                if (digitSum < minElement) {
                    minElement = digitSum;
                }
            }

            return minElement;
        }

        // Driver method
    public static void main(String[] args) {
        int[] nums = {10,11,13,14,15};
        int ans = minElement(nums);
        System.out.println(ans);
    }
}
