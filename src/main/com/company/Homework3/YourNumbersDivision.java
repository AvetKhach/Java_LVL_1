package com.company.Homework3;

import java.util.Scanner;

public class YourNumbersDivision {
    public static void main(String[] args) {
        double[]array = new double[10];
        System.out.println("Please include 10 number for division");
        for (int i = 0; i <10 ; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]!=0){
                System.out.println(array[i]+" / "+array[i+1]+" = "+array[i] / array[i + 1]);
            }else {
                System.out.println("divisible should not be 0");
            }
        }
    }
}
