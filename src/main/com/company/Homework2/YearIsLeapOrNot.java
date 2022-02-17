package com.company.Homework2;

import java.util.Scanner;

public class YearIsLeapOrNot {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include year and I'll say it is leap or not!!");
        int year = scanner.nextInt();
        System.out.println(year+leapCheck(year));
    }
    public static String leapCheck(int year) {
        return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) ?" is a leap year":"isn't leap year";
    }
}
