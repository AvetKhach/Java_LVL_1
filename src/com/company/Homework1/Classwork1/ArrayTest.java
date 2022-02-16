package com.company.Homework1.Classwork1;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {23, 45, 98};
        System.out.println(max(max(array[0], array[1]), array[2]));
    }

    public static int max(int i, int j) {
        return i > j ? i : j;

    }

}
