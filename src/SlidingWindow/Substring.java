package SlidingWindow;

public class Substring {
    public static void print(String str) {
        int n = str.length();
        int maxLen = 0;
        for(int i = 0; i < n; i++) {
            int[] hash = new int[256]; // store frequency of character
            for(int j = i; j < n; j++) {
                if(hash[str.charAt(j)] == 1) break;
                int len = j - i + 1;
                maxLen = Math.max(len,maxLen);
                hash[str.charAt(j)] = 1;
            }
        }
        System.out.println(maxLen);
    }

    // driver method
    public static void main(String[] args) {
        String str = "abcabcbb";
        print(str);
    }
}
