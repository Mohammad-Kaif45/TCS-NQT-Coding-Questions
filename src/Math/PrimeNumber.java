package Math;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime(int n) {
        if(n <= 1) return false;
        else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return false;

                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(prime(num));
    }
}
