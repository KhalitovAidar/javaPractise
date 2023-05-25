package org.example.kr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MatrixReader {
    public static int[][] read() {

        String csvFile = "kontr2_20.csv";
        BufferedReader br = null;
        String line = "";
        String delimiter = ";";

        try {

            br = new BufferedReader(new FileReader("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\kr\\kontr2_20.csv"));
            int n = 50;
            int[][] matrix = new int[n][n];

            int row = 0;
            while ((line = br.readLine()) != null && row < n) {

                String[] values = line.split(delimiter);

                for (int col = 0; col < n && col < values.length; col++) {
                    matrix[row][col] = Integer.parseInt(values[col]);
                }
                row++;
            }

            return matrix;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return new int[0][0];
    }
}

