import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
//    public static int[] find(int[] nums) {
//        int[] result = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            result[i] = -1;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] > nums[i]) {
//                    result[i] = nums[j];
//                    break;
//                }
//            }
//        }
//
//        return result;
//    }

    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums)));
    }
}