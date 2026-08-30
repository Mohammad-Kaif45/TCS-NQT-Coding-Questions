package Recursion;

public class PrintNumbers {
    static void print(int n){
//        if(n>0){
//            System.out.println(n);
//            print(n-1);
//
//        }
        if(n == 0) return;
        System.out.println(n);
        print(n-1);

    }
    static void print2(int n){
        if(n <= 10){
            System.out.println(n);
            print2(n+1);
        }
    }
    public static void main(String[] args) {
        print(10);
        print2(1);
    }
}
