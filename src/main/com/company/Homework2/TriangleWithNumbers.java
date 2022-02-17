package com.company.Homework2;

import java.util.Scanner;

public class TriangleWithNumbers {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include number");
        int number = scanner.nextInt();
        triangle(number);
    }
    public static void triangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
