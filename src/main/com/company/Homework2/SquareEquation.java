package com.company.Homework2;

public class SquareEquation {


    public static void main(String[] args) {
        squareEquation(1, 5, 1);
    }

    public static void squareEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("input a can't be 0");
        } else {
            double d;
            d = (b * b) - (4 * a * c);
            if (d < 0) {
                System.out.println("zero roots");
            } else if (d == 0) {
                double x;
                x = -b / (2 * a);
                System.out.println("one roots = " + x);
            } else {
                double x1;
                double x2;
                x1 = ((-b + Math.sqrt(d)) / 2 * a);
                x2 = ((-b - Math.sqrt(d)) / 2 * a);
                System.out.println("roots are x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}

