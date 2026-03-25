package Math;

import java.util.Scanner;

public class GCD {

    // Using recursion
    public static int gcd(int a,int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b,a % b);
    }

    // Using math
    public static void calculate(int a ,int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.max(a,b); i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is : " + gcd);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        calculate(a,b);
        System.out.println("GCD of " + a + " and " + b + " is : " + gcd(a,b));
    }
}
