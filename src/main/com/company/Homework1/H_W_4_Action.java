package com.company.Homework1;

import java.util.Scanner;

public class H_W_4_Action {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include action number 1-4");
        int array = array(15,98,scanner.nextInt());
    }
    public static int array(int i1, int i2, int i3) {
        if (i3==1){
            System.out.println("sum = " + (i1+i2));
            return i1+i2;
        }
        else if(i3==2){
            if (i1>i2){
                System.out.println("sub = " + (i1-i2));
                return i1-i2;
            }
            else{
                System.out.println("sub = " + (i2-i1));
                return i2-i1;
            }
        }
        else if (i3==3){
            System.out.println("mul = " + (i1*i2));
            return i1*i2;
        }
        else if (i3==4){
            if (i1>i2){
                System.out.println("div = " + (i1/i2));
                return i1/i2;
            }
            else{
                System.out.println("div = " + (i2/i1));
                return i2/i1;
            }
        }
        else {
            System.out.println("Please include correct number(1-4)");
            return -1;
        }
    }
}
