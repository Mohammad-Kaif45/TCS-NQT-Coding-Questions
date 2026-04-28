package SlidingWindow;

public class Substring {
    public static void print(String str) {
        int n = str.length();

        for(int i = 0; i < n; i++) {
            String sub = "";
            for(int j = i; j < n; j++) {
                sub += str.charAt(j);
                System.out.println(sub);
            }

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        print(str);
    }
}
