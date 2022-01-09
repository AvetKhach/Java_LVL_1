package com.company.Homework2;

public class FloatingPointNumber {
    public static void main(String[] args) {
        floatChecker(0.8f);
    }
    public static float floatChecker(float value) {
        if (value == 0) {
            System.out.println("zero");
        } else if (value < 0) {
            System.out.println("negative");
        } else if (Math.abs(value) < 1) {
            System.out.println("small");
        } else if (Math.abs(value) > 1000000) {
            System.out.println("large");
        }
        return 1;
    }
}
