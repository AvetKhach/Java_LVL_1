package com.company.Homework1.Classwork1;

public class Strings {
    public static void main(String[] args) {
        int i1 = 23;
        int i2 = 65;
        System.out.println(minAndMax(i1,i2));

    }

    public static String minAndMax(int i1, int i2) {
        return i1 > i2 ? i1+"|"+i2 : i2+"|"+i1;

    }

}
