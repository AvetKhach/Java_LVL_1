package com.company.Homework3;

import java.util.Scanner;

public class YourNumbersSum {
    public static void main(String[] args) {
        int s=0;
        int []array = readNumber();
        for (int i = 0; i <array.length ; i++) {
            s+=array[i];
        }
        System.out.println("Sum of included numbers are"+ s);
    }
    public static int[] readNumber(){
        int[]numbers=new int[20];
        System.out.println("Include 20 numbers from 0 to 100");
        for (int i = 0; i <20 ; i++) {
            numbers[i] = new Scanner(System.in).nextInt();
            if (checkNumber(numbers[i])){
                numbers[i] = new Scanner(System.in).nextInt();
            }
        }
    return numbers;
    }
    public static boolean checkNumber(int number){
        if(number<=0||number>=100){
            System.out.println("Please include correct number from0 to 100");
            return true;
        }return false;
    }
}
