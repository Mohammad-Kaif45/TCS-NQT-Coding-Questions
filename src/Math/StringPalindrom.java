package Math;

import java.util.Scanner;

public class StringPalindrom {
    public static boolean check(String str) {
        int n = str.length();
        String rev = "";
        for(int i = n - 1; i >= 0;i--) {
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));
    }
}
