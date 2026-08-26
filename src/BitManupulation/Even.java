package BitManupulation;

import java.util.Scanner;

public class Even {
    public static boolean checkEven(int n){
        if((n & 1) == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(checkEven(n));
    }
}
