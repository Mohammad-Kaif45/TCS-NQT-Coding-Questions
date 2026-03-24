package Math;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        int fact = 1;
        while(num > 0) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
