package BinarySearchOn2DArray;

import java.util.Arrays;

public class Solution {
    public static int[] search(int[][] matrix,int target) {
        int[] result = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {{18,9,12},
                {36,-4,91},
                {44,33,16}};

        int target = 16;

        int[] ans = search(matrix,target);
        System.out.println(Arrays.toString(ans));
    }
}
