package com.company.Homework1;

public class H_W_Max {
    public static void main(String[] args) {
        long max1 = max(15,98);
        long max2 = max(max1,34);
        long max3 = max(max2,45);
    }

    public static long max(long i1, long i2) {
        if (i1 > i2){
            return i1;
        }
        else {
            return i2;
        }
    }
}
