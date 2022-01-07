package com.company.Homework2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include number");
        int N = scanner.nextInt();
        System.out.println("N = " + N);

        int one  = multiples(1,N);
        int two  = multiples(one+1,N);
        int three  = multiples(two+1,N);
        int four  = multiples(three+1,N);
        int five  = multiples(four+1,N);
        int six  = multiples(five+1,N);
        int seven  = multiples(six+1,N);
        int eight  = multiples(seven+1,N);
        int nine  = multiples(eight+1,N);
        int ten  = multiples(nine+1,N);
    }
    public static int multiples(int number, int N) {
        System.out.println(N + " x " + number + " = " + number * N);
        return number;
        }
}
