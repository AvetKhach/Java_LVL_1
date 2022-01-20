package com.company.Homework1.Classwork1;

public class numbersPrint {
    public static void main(String[] args) {
        int size    = 1000;
        int [] array = new int[size];

        for (int i = 0; i < size ; i++) {
            array[i]=i;
        }
        printArray(array);
    }
    public static int printArray(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array [" + i + "]" + " = " + array[i]);
        }
        return 1;
    }
}
