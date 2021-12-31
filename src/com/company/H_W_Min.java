package com.company;
public class H_W_Min {
    public static void main(String[] args) {
        long min1 = min(15,98);
        long min2 = min(min1,34);
        long min3 = min(min2,45);
    }
    public static long min(long i1, long i2) {
        if (i1 < i2){
            return i1;
        }
        else {
            return i2;
        }
    }
}
