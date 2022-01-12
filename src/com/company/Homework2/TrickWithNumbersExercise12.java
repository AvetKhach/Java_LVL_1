package com.company.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class TrickWithNumbersExercise12 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include number");
        int sizeValue = scanner.nextInt();
        int[] array = new int[sizeValue];
        System.out.println("Please include " + sizeValue + " number!!!");
        for (int i = 0; i < sizeValue; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        sumAndAverage(array);
    }
    public static void sumAndAverage(int []array) {
        double sum = 0;
        double average;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            }
        average = sum / array.length;
        System.out.println("Sum = "+ sum);
        System.out.println("Average = "+ average);


    }
}
