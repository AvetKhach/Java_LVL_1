package com.company.Homework2;

import java.util.Objects;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner;
        scanner =   new Scanner(System.in);
        System.out.println("Please include a letter from alphabet");
        String symbol = scanner.next();
        System.out.println(vowelCheck(symbol));

    }
    public static String vowelCheck(String symbol){
        if (Objects.equals(symbol, "a") || Objects.equals(symbol, "e") || Objects.equals(symbol, "i") || Objects.equals(symbol, "o") || Objects.equals(symbol, "u") || Objects.equals(symbol, "A") || Objects.equals(symbol, "E")
                || Objects.equals(symbol, "I") || Objects.equals(symbol, "O") || Objects.equals(symbol, "U")){
            return  "Input letter is Vowel";
        }else if (Objects.equals(symbol, "q") || Objects.equals(symbol, "w") || Objects.equals(symbol, "r") || Objects.equals(symbol, "t") || Objects.equals(symbol, "y") || Objects.equals(symbol, "p")
                || Objects.equals(symbol, "s") || Objects.equals(symbol, "d") || Objects.equals(symbol, "f") || Objects.equals(symbol, "g") || Objects.equals(symbol, "h") || Objects.equals(symbol, "j")
                || Objects.equals(symbol, "k") || Objects.equals(symbol, "l") || Objects.equals(symbol, "z") || Objects.equals(symbol, "x") || Objects.equals(symbol, "c") || Objects.equals(symbol, "v")
                || Objects.equals(symbol, "b") || Objects.equals(symbol, "n") || Objects.equals(symbol, "m") || Objects.equals(symbol, "Q") || Objects.equals(symbol, "W") || Objects.equals(symbol, "R")
                || Objects.equals(symbol, "T") || Objects.equals(symbol, "Y") || Objects.equals(symbol, "P") || Objects.equals(symbol, "S") || Objects.equals(symbol, "D") || Objects.equals(symbol, "F")
                || Objects.equals(symbol, "G") || Objects.equals(symbol, "H") || Objects.equals(symbol, "J") || Objects.equals(symbol, "K") || Objects.equals(symbol, "L") || Objects.equals(symbol, "M")
                || Objects.equals(symbol, "N") || Objects.equals(symbol, "B") || Objects.equals(symbol, "V") || Objects.equals(symbol, "C") || Objects.equals(symbol, "X") || Objects.equals(symbol, "Z")){
            return "Input letter is Consonant";
        }else {
            System.out.println("Please include correct symbol");
        }
        return "";
    }
}
