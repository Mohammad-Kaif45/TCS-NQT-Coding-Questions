package Math;

import java.util.Scanner;

public class Palindrom {
    public static boolean check(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if(original == rev) {
            return true;
         } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(check(num));
    }
}
