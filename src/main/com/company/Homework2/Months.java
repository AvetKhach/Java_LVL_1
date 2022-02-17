package com.company.Homework2;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include year");
        int year = scanner.nextInt();
        System.out.println("Please include required month (with number)");
        int month = scanner.nextInt();
        if(month<=12){
            System.out.println(monthCheck(month) + year + " has "+monthsDayCheckAndLeapOrNot(year,month)+" days!!");
        }else {
            System.out.println("Include correct months number 1-12 !");
        }
    }
    public static String monthCheck(int month) {
        switch (month) {
            case 1:
                return "January ";
            case 2:
                return "February ";
            case 3:
                return "March ";
            case 4:
                return "April ";
            case 5:
                return "May ";
            case 6:
                return "June ";
            case 7:
                return "July";
            case 8:
                return "August ";
            case 9:
                return "September ";
            case 10:
                return "October ";
            case 11:
                return "November ";
            case 12:
                return "December ";
        }
        return "";
    }
    public static int monthsDayCheckAndLeapOrNot(int year, int month) {
        if (month == 2) {
            if ((year % 400 == 0) || ((year % 100) != 0 && (year % 4 == 0))) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else  {
            return 30;
        }
    }
}
