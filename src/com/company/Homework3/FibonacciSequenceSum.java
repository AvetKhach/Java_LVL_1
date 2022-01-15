package com.company.Homework3;

import java.util.Scanner;

public class FibonacciSequenceSum {
    public static void main(String[] args) {
        System.out.println("Please include the number that will be the length of the sequence ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("I can add up numbers of Fibonacci sequence, \n" +
                "Please include up to which number?");
        int sumNumber = new Scanner(System.in).nextInt();
        int sum = 1;
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" "+num2);
        int num3;
        for (int i = 2; i <n ; ++i) {
            num3= num1+num2;
            if (num3<sumNumber){
                sum+=num3;
            }
            System.out.print(" "+num3);
            num1=num2;
            num2= num3;
        }
        System.out.println("\n Sum of sequence until "+sumNumber+" = "+sum);
    }

}
