public class LongestSubarray {

    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static int longestSubarrayUsingSlidingWindow(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1};
        int k = 6;

        int ans = longestSubarray(nums, k);
        System.out.println(ans); // Output: 4
    }
}