package com.aca.homework.week2.symbolcouunt;

import java.util.Scanner;

public class SymbolCount {
    public static void main(String[] args) {
        System.out.println("Please write a text");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Please write a symbol");
        char symbol = new Scanner(System.in).next().charAt(0);
        int count =0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==symbol){
                count++;
            }
        }
        System.out.println(count);
    }
}
