package Recursion;

public class Product {
    public static int product(int n) {

        if (n % 10 == n) return n;
        return (n % 10) * product(n / 10);
    }
    public static void main(String[] args) {
        int num = 202;
        System.out.println(product(num));
    }
}
