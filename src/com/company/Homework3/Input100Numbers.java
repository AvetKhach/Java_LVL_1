package com.company.Homework3;

public class Input100Numbers {
    public static void main(String[] args) {
        int[]array = new int[100];
        int sum =0;
        for (int i = 0; i < 100; i++) {
            array[i]=i;
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
