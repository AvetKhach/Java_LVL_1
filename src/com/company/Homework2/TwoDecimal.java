package com.company.Homework2;

import java.text.DecimalFormat;
import java.util.Objects;

public class TwoDecimal {
    public static void main(String[] args) {
        sameOrNot(12.2f,12.24);

    }
    public static void sameOrNot(double a, double b){
        String floatCheck1 = new DecimalFormat("#0.00").format(a);
        String floatCheck2 = new DecimalFormat("#0.00").format(b);

        if (Objects.equals(floatCheck1,floatCheck2)){
            System.out.println("same");
        }else {
            System.out.println("different");
        }

    }
}
