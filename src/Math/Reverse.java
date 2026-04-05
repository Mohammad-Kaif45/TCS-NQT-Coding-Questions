package Math;

public class Reverse {
    public static int solve(int x) {
        int result = 0;
        while(x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }
    public static void main(String[] args) {
        int x = 120;
        System.out.println(solve(x));
    }
}
