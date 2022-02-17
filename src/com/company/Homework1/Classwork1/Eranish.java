package com.company.Homework1.Classwork1;

public class Eranish {
    public static void main(String[] args) {
        int i = 978;

        firstPart(i);
        secondPart(i);
        threePart(i);
        System.out.println(firstPart(i) + " "+ secondPart(i)+ " "+ threePart(i));
    }

    public static int firstPart(int i) {
        return i / 100;
    }
    public static int secondPart(int i) {
        return  (i-100*firstPart(i))/10;
    }

    public static int threePart(int i) {
        return i-100*firstPart(i)-10 * secondPart(i);
    }
}
