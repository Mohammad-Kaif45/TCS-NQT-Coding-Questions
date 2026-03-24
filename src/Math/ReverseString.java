package Math;

import java.util.Scanner;

public class ReverseString {
    public static StringBuilder reverse(String str) {
        StringBuilder rev = new StringBuilder(str);
        return rev.reverse();
    }


    public static void rev(String str) {
        int n = str.length();
        for(int i = n  - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
//        String result = String.valueOf(reverse(str));
//        System.out.println(result);
        rev(str);
    }
}
