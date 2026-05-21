import java.util.*;
public class Prefix {
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefix = new HashSet<>();
        for (int num : arr1) {
            while (num > 0) {
                prefix.add(num);
                num = num / 10;
            }
        }
        int maxLen = 0;
        for (int num : arr2) {
            while (num > 0) {
                if (prefix.contains(num)) {
                    int len = String.valueOf(num).length();
                    maxLen = Math.max(maxLen,len);
                }
                num = num / 10;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,10,100};
        int[] arr2 = {1000};
        System.out.println(longestCommonPrefix(arr1,arr2));
    }
}
