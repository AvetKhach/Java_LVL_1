package com.company.Homework3.classwork3;

public class ReferenceTest {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        swap(a, b);
        System.out.println(a + " " + b);

    }
    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println();
    }
    public static void testSwapArray() {
        int[] array1 = {1, 2, 3, 0};
        int[] array2 = {72, 333, 0, 77};

    }

    public static void deleteReference(int[] i) {
        i = null;
    }

    public static void changArray(int[] i) {
        i[1] = 897897897;
    }


    public static void testInt() {
        int i = 5;
        int j = increment(i);
        System.out.println(i);
    }

    public static int increment(int i) {
        i = i + 5;
        return i;
    }
}
