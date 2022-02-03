package com.aca.homework.week2.maxmin;

import java.util.Scanner;

public class MainMaxMin {
    public static void main(String[] args) {
        System.out.println("Include 2 numbers");
        long first = new Scanner(System.in).nextLong();
        long second = new Scanner(System.in).nextLong();
        System.out.println("Max is "+ compareNumbers(first,second).max + "\nMin is "+ compareNumbers(first,second).min);
    }
    public static MaxMin compareNumbers(long a, long b) {
        MaxMin maxMin = new MaxMin();
        if (a > b) {
            maxMin.max = a;
            maxMin.min = b;
        } else {
            maxMin.max = b;
            maxMin.min = a;
        }
        return maxMin;
    }
}
