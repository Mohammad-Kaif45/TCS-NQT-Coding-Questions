package Math;

public class Patterns {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 5; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int N = 5;
        for (int i = 0; i < N; i++) {
            // Inner loop for columns
            // Prints numbers from 1 up to (N - i)
            for (int j = N; j > i; j--) {
                System.out.print((N - j + 1) + " ");
            }
            // Move to next line
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < N-i+1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < N-i+1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 4; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        int num = 1;
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}

