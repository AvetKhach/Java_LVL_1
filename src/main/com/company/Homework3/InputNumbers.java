package com.company.Homework3;

import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        numberCheck();
    }
    public static void numberCheck() {
        int k = 0;
        for (int i = 0; i < 6; i++) {
            int num = new Scanner(System.in).nextInt();
            if(num==10){
                k++;
            }
        }
        System.out.println(k==0?"No":"YES");
    }

}
