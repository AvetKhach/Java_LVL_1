package com.company.Homework2.classwork2;

import java.util.Arrays;
import java.util.Scanner;

public class MIneTest {
    public static void main(String[] args) {
        putMine();

    }
    public static void putMine(){
        char [] mines = new char[6];
        for (int i = 0; i < mines.length ; i++) {
            System.out.println("Please Include mines!!!");
            System.out.println("is there a mine at "+ mines[i]);
            Scanner scanner;
            scanner = new Scanner(System.in);
            if (scanner.nextInt() == 1){
                 mines[i]='*';
            }
        }
        System.out.println("Where do you want to stand");
        Scanner scanner;
        scanner = new Scanner(System.in);
        int standIndex = scanner.nextInt();
        if(mines[standIndex]=='*'){
            System.out.println("Booom!!");
        }else{
            System.out.println("iLive");
        }
    }
}
