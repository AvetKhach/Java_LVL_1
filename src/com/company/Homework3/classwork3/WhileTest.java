package com.company.Homework3.classwork3;

public class WhileTest {
    public static void main(String[] args) {
        long startMillis = System.currentTimeMillis();
        long second=0;
        long first =0;
        while (true) {
            first = (System.currentTimeMillis() - startMillis) / 1000;
            if (first - second == 1) {
                System.out.println(first);
                second = first;
            }
        }
    }
}
