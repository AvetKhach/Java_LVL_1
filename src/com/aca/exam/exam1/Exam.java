package com.aca.exam.exam1;

import java.util.Scanner;

public class Exam {


    public int[] include5Numbers() {
        int[] array = new int[5];
        System.out.println("Include number and press enter button,5 time");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        return array;
    }

    public void includeOptionNumber(int[] array) {

        for (int i = 0; i < 100; i++) {
            System.out.println("Insert option number 1-8");
            int num = new Scanner(System.in).nextInt();
            if (num >= 1 && num < 8) {
                doOptions(array, num);
            } else if (num == 8) {
                System.out.println("The project is over");
                break;
            } else {
                System.out.println("Please include correct number 1-8");
            }
        }
    }


    public void doOptions(int[] array, int num) {



        switch (num) {
            case 1:
                int max1 = max(array[0], array[1]);
                int max2 = max(max1, array[2]);
                int max3 = max(max2, array[3]);
                int max4 = max(max3, array[4]);
                System.out.println("Max value is: " + max4);
                break;
            case 2:
                int min1 = min(array[0], array[1]);
                int min2 = min(min1, array[2]);
                int min3 = min(min2, array[3]);
                int min4 = min(min3, array[4]);
                System.out.println("Min value is: " + min4);
                break;
            case 3:
                for (int i = 0; i < array.length; i++) {
                    array[i] *= array[i];
                    System.out.print(array[i] + " ");
                }
                break;
            case 4:
                int sum = 0;
                for (int i = 0; i <array.length ; i++) {
                    sum+=array[i];
                }
                System.out.println("Average is: " + (sum/5));
                break;
            case 5:
                System.out.println("Please include N index, I'll return value");
                returnNIndex(array);
                break;
            case 6:
                int max5 = max(array[0], array[1]);
                int max6 = max(max5, array[2]);
                int max7 = max(max6, array[3]);
                int max8 = max(max7, array[4]);
                int min5 = min(array[0], array[1]);
                int min6 = min(min5, array[2]);
                int min7 = min(min6, array[3]);
                int min8 = min(min7, array[4]);
                System.out.println("Max -  Min = "+ (max8-min8));
                break;
            case 7:
                String arr = "";
                int count = 0;
                for (int i = 0; i < array.length ; i++) {
                    arr+=array[i];
                }
                for (int i = 0; i <arr.length() ; i++) {
                    if (arr.charAt(i)=='0'){
                        count++;
                    }
                }
                System.out.println("Zero symbol value = "+ count);
        }
    }

    public int max(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public int min(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
    public void returnNIndex(int[]array){
        for (int i = 0; i < 100; i++) {
            System.out.println("Let's");
            int value = new Scanner(System.in).nextInt();
            if (value>=1&& value<=5){
                System.out.println(array[i+1]);
                break;
            }else {
                System.out.println("N number is not right, please include in required range 1-5");
            }
        }
    }


}
