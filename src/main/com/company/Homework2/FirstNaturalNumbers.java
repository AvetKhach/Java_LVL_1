package com.company.Homework2;

import java.util.Arrays;

public class FirstNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("The first 10 natural numbers are:");
        System.out.println(Arrays.toString(naturalNumbers()));
    }
    public static int[] naturalNumbers(){
        int [] array = new int[10];
        for (int i = 0; i <10 ; i++) {
            array[i]=i+1;
        }
       return array;

    }
}
