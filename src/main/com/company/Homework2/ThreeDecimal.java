package com.company.Homework2;
import java.text.DecimalFormat;
import java.util.Objects;

public class ThreeDecimal {
    public static void main(String[] args) {
        sameFloatPointNumbers(25.584559f, 25.9f);
    }

    public static void sameFloatPointNumbers(float a, float b) {
        String formatFloat1 = new DecimalFormat("#0.000").format(a);
        String formatFloat2 = new DecimalFormat("#0.000").format(b);

        if(Objects.equals(formatFloat1, formatFloat2)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}
