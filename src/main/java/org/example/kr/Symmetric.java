package org.example.kr;

public class Symmetric {
    public static int[][] makeSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                matrix[j][i] = matrix[i][j];
            }
        }

        return matrix;
    }
}
