package com.company.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class TrickWithNumbersExercise11 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include number");
        int number = scanner.nextInt();
        System.out.println("input number is " + number);
        System.out.println(Arrays.toString(firstNaturalNumber(number)));
    }
    public static int[] firstNaturalNumber(int number) {
        int [] array = new int[number];
        int sum=0;

        for (int i = 0; i <= number-1; i++) {
            array[i]=i+1;
            sum+=array[i];
            }
        System.out.println("The Sum of Natural Number up to "+ number+" terms");
        System.out.println(sum);
        System.out.println("The first " + number + " natural numbers are:");
        return array;
    }
}
