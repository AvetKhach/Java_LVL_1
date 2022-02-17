package com.company.Homework2.classwork2;

import java.util.Arrays;

public class MatrixTest {
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        matrix[0][1]=5;

        if (true){
            return;
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}
