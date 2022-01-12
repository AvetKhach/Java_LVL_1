package com.company.Homework2;

import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Include your wanted number");
        int incNumber = scanner.nextInt();
        cubeCount(includingNumbers(incNumber,scanner));
    }
    public static int[] includingNumbers(int incNumber,Scanner scanner){
        int [] array= new int[incNumber];
        System.out.println("Please include "+incNumber+" number, I'll say cube of these numbers!!!");
        for (int i = 0; i < incNumber; i++) {
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public static void cubeCount(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number is: "+array[i]+" and cube of "+array[i]+ " is "+ (array[i]*array[i]*array[i]));
        }

    }
}
