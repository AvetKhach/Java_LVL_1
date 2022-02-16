package com.company.Homework2.classwork2;

import java.util.Scanner;

public class TrickArrays {
    public static void main(String[] args) {
        int [] numbers = new int[3];


        for (int i = 0; i <3 ; i++) {
            numbers[i]= new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]==75){
                System.out.println(i);
            }

        }

    }
}
