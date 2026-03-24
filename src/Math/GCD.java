package Math;

import java.util.Scanner;

public class GCD {

    // Using Euclidean Algorithm
    public static void find(int a,int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD of " + a + " and " + b + " is : " + a);
    }

    // Using recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= Math.max(a,b); i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is : " + gcd);
        find(a,b);
    }
}
