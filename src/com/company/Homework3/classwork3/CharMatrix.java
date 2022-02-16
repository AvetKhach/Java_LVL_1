package com.company.Homework3.classwork3;

import com.company.Homework1.Classwork1.ScannerTest;

import java.util.Scanner;

public class CharMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] fields = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                fields[i][j] = '0';
            }
        }
        printMatrix(fields);
        addShip(fields, 3, 1);
        System.out.println("After");
        printMatrix(fields);
    }

    public static char[][] addShip(char[][] fields, int i, int j) {
        for (int c = j; c < j + 4; c++) {
            fields[i][c] = '*';
        }
        return fields;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
