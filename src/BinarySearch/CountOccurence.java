package BinarySearch;

public class CountOccurence {
    public int[] findRange(int[] nums,int target) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int[] result = {-1,-1};

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] >= target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            if (nums[mid] == target) {
                result[0] = mid;
            }
        }

        s = 0;
        e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            if (nums[mid] == target) {
                result[1] = mid;
            }
        }
        return result;
    }

    public int countOccurence(int[] nums,int target) {
        int[] ans = findRange(nums,target);
        return ans[1] - ans[0] + 1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int target = 3;
        FindFirstAndLast obj = new FindFirstAndLast();
//        int ans = obj.searchRange(nums,target);
//        int[] ans = obj.findRange(nums,target);
//        System.out.println(Arrays.toString(ans));

        int ans = obj.countOccurence(nums,target);
        System.out.println(ans);
    }
}
