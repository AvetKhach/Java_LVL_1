package com.company.Homework2.classwork2;

import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args) {


        String string = new Scanner(System.in).nextLine();
        System.out.println(string.charAt(0));
        System.out.println(returnIndex(string));



    }

    public static int returnIndex(String string) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 0; i < arr.length; i++) {
            if (string.charAt(0) == arr[i]) {
                return (i);
            }
        }
        return 1;

    }
}
