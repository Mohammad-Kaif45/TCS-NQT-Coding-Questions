package BinarySearch;

public class UpperBound {
    public static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;  // Default to length if not found

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                ans = mid;        // Store current index as potential answer
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;  // Return final answer
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};  // Sorted array
        int x = 9;

        int ans = upperBound(arr,x);
        System.out.println("The upper bound is the index: " + ans);
    }
}
