package com.company.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class OddNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include count of odd numbers.");
        int count = scanner.nextInt();
        oddChecker(count);

    }

    public static void oddChecker(int count) {
        int sum=0;
        int value =1;
        System.out.print("The odd numbers are: ");
        for (int i = 1; i <= count; i++) {

            System.out.print(value+ ",");
            sum+=value;
            value+=2;
        }
        System.out.println();
        System.out.println("The Sum of odd Natural Number up to "+count+" terms is: "+sum);
    }
}
