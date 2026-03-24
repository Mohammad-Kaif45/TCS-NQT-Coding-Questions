package Math;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean check(int num) {
        int original = num;
        int sum = 0;
        int digit = String.valueOf(num).length();
        while (num > 0) {
            int last_digit = num % 10;
            sum = (int) (sum + Math.pow(last_digit,digit));
            num = num / 10;
        }
        if(sum == original) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wan't to check : ");
        int num = sc.nextInt();
        System.out.println(check(num));
    }
}
