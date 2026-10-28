import java.util.HashMap;

public class LongestString {
    public static int longestSubString(String str) {
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right ++) {
            char ch = str.charAt(right);
            if (map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch,right);
            maxLen = Math.max(maxLen,right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        int ans = longestSubString(str);
        System.out.println("Length of longest substring is : " + ans);
    }
}
