package com.company.Homework2.classwork2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckUser {
    public static void main(String[] args) {
        boolean heightLowerThan180 = isHeightLoverThen180();
        boolean wightEq50 = isWightEq50();
        boolean ageGt59 = isAgeGt59();
    }
    public static String getConditionText(boolean wightEq50, boolean heightLowerThan180, boolean ageGt59) {
        if (((heightLowerThan180 && wightEq50) || (!heightLowerThan180 && !ageGt59 && wightEq50))) {
            return  "Payman@ bavararum e";
        }
        return "Payman@ chi bavararum;";
    }
    public static boolean isHeightLoverThen180() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք հասակը");
        int height = scanner.nextInt();
        return height > 180;
    }
    public static boolean isAgeGt59() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք տարիքը");
        int age = scanner.nextInt();
        return age > 59;
    }
    public static boolean isWightEq50() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք քաշը");
        int wight = scanner.nextInt();
        return wight == 50;
    }
}
