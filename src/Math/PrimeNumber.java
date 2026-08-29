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
    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        int c = 2;
        while(c*c<=n){
            if(n%c==0)return false;
            c++;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1;i <= n; i++) {
            System.out.println(i + " " + checkPrime(i));
        }
    }
}
