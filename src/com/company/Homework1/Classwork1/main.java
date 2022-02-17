package com.company.Homework1.Classwork1;

public class main {
    public static void main(String[] args) {
        int i = 97;

        int k = firstPart(i);
        int h = secondPart(i, k);
        System.out.println(k + " "+ h);
    }

    public static int firstPart(int i) {
        return i / 10;
    }

    public static int secondPart(int i, int j) {
        return i - ((j) * 10);

    }


}
