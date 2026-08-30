package Recursion;

public class SumOfDigits {
//    public static int sum(int n){
//        int sum = 0;
//        while(n > 0){
//            int rem = n % 10;
//            n = n / 10;
//            sum = sum + rem;
//        }
//        return sum;
//    }

    public static int sum(int n) {

        if (n == 0) return 0;
        return (n % 10) + sum(n / 10);
    }
    public static void main(String[] args) {
        int num = 5555;
        System.out.println(sum(num));
    }
}
