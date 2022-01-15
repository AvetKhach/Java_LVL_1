package com.company.Homework3;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" "+num2);
        int num3;
        for (int i = 2; i <n ; ++i) {
            num3= num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2= num3;
        }
    }
}
