package com.aca.homework.week2.maxmin;

import java.util.Scanner;

public class MainMaxMin {


    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        System.out.println("Include 2 numbers");
        maxMin.max = new Scanner(System.in).nextLong();
        maxMin.min = new Scanner(System.in).nextLong();

        System.out.println("Max is " + createMaxMin(maxMin.max, maxMin.min).max + "\nMin is " + createMaxMin(maxMin.max, maxMin.min).min);
    }


    public static MaxMin createMaxMin(long a, long b) {
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
