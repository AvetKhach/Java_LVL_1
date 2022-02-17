package com.company.Homework3;

import java.time.LocalDate;
import java.util.Scanner;


public class PassportControl {
    public static void main(String[] args) {
        System.out.println("Name correspond with passport: " + checkName());
        System.out.println("Please include your age");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Age correspond with passport" + checkAge(age));
        System.out.println("Age is upper than 18 :"+checkAgeIsGt18(age));
    }
    public static boolean checkName() {
        System.out.println("Please include passport name");
        String passportName = new Scanner(System.in).next();
        System.out.println("Please include name");
        String name = new Scanner(System.in).next();
        return passportName.contentEquals(name);
    }
    public static boolean checkAge(int age) {
        System.out.println("Please include your born year");
        int year = new Scanner(System.in).nextInt();
        LocalDate currentYear = LocalDate.now();
        return currentYear.getYear() - year == age;
    }
    public static boolean checkAgeIsGt18(int age) {
        return age >= 18;
    }
}
