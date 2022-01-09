package com.company.Homework2;

import java.util.Scanner;

public class MultiplicationTableWithCycle {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include number");
        int N = scanner.nextInt();
        System.out.println("N = " + N);
        multiples(N);
    }
    public static int multiples( int N){
        for (int i = 1; i <=10; i++) {
            System.out.println(N + " X " +  i + " = " + N*i);
        }
    return 1;
    }

}
