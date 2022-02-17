package com.company.Homework2;

import java.util.Scanner;

public class VowelOrConsonantSmartWay {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include a symbol from alphabet");
        String symbol = scanner.next();
        System.out.println(symbolCheck(symbol));
    }
    public static String symbolCheck(String symbol) {
        String vowel = "auioeAEUIO";
        String consonant = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
        if (symbol.length() == 1 && vowel.contains(symbol)) {
            return "Input letter is Vowel";
        } else if (symbol.length() == 1 && consonant.contains(symbol)) {
            return "Input letter is Consonant";
        } else {
            return "Please include correct symbol";
        }
    }
}
