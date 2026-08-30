package Recursion;

public class ReverseDigit {
    static int rev = 0;
    public static void reverse(int num){
        if(num == 0) {
            return;
        }
        int digit = num % 10;

        rev = rev * 10 + digit;
        reverse(num / 10);
    }
    public static void main(String[] args) {
        int num = 1234;
        reverse(num);
        System.out.println(rev);
    }
}
