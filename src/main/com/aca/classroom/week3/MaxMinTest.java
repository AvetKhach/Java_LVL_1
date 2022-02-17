package com.aca.classroom.week3;

import com.aca.classroom.week3.MaxMin;
import com.aca.classroom.week3.Printers;

import java.util.Scanner;

public class MaxMinTest {
    public static void main(String[] args) {
       // MaxMin[] maxMin = get3MaxMin();
        //print(maxMin);
        MaxMin maxMin = new MaxMin();
        maxMin.min = 1;
        maxMin.max = 5;
        Printers.print(maxMin);



    }

    public static void  printMaxMins(MaxMin[] maxMinArray){
        for (int i = 0; i < maxMinArray.length; i++) {
            MaxMin maxMin = maxMinArray[i];

            //Second version for printing
            System.out.println("The max is :"+ maxMinArray[i].max+", min is: "+ maxMinArray[i].min);

        }


    }

    public static void print(MaxMin maxMin) {
        System.out.println("The max is :"+maxMin.max+", min is : "+ maxMin.min);

    }


    public static MaxMin[] get3MaxMin(){
        MaxMin [] maxMinarray = new MaxMin[1];
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a number");
            long number1 = new Scanner(System.in).nextLong();
            System.out.println("Please enter a number");
            long number2 = new Scanner(System.in).nextLong();

            MaxMin maxMin = createMaxMin(number1,number2);
        }
        return maxMinarray;
    }



    public static MaxMin createMaxMin(long i, long j){
        MaxMin maxMin = new MaxMin();
        if(i>j){
            maxMin.max=i;
            maxMin.min = j;
        }else {
            maxMin.max=j;
            maxMin.min = i;
        }
        return maxMin;
    }



}
