package Math;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
