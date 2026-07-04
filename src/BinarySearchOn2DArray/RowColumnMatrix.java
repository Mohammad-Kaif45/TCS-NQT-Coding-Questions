package BinarySearchOn2DArray;

import java.util.Arrays;

public class RowColumnMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {-4,  9, 12},
                {16, 18, 33},
                {36, 44, 91}
        };

        int target = 36; //

        RowColumnMatrix obj = new RowColumnMatrix();
        int[] ans = obj.searchElement(matrix,target);
        System.out.println(Arrays.toString(ans));
    }
    public int[] searchElement(int[][] matrix,int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row,col};
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
