package String;

import java.util.Scanner;

public class Palindrom {


    public static boolean check(String str) {
        String original = str;
        StringBuilder sb = new StringBuilder(str);
        String rvs = sb.reverse().toString();
        return rvs.equals(original);
    }

    public static boolean isPalindrom(String str) {
        int n = str.length();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();
        System.out.println(isPalindrom(str));
    }
}
