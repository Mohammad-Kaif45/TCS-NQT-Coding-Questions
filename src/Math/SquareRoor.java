package Math;

public class SquareRoor {
    public static int binary(int n){
        int left = 0;
        int right = n;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid * mid > n){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
    public static int squareRoot(int n){
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(i*i == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(squareRoot(n));
        System.out.println(binary(n));
    }
}
