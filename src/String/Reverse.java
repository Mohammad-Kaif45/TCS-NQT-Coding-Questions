package String;

public class Reverse {

    // Using StringBuilder
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Without inbuilt function
    public static String reverseString(String str) {
        int n = str.length();
        int left = 0;
        int right = n - 1;
        char[] ch = str.toCharArray();
        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
        System.out.println(reverseString(str));
    }
}
