package com.company.week2;

import java.util.Scanner;

public class UserPrint {
    public static void main(String[] args) {

        String[] userNames = new String[3];
        String[] lastName  = new String[3];
        int [] age  = new int[3];
        inputUsers(userNames,lastName,age);
        for (int i = 0; i < 3; i++) {
            printUserData(userNames,lastName,age,i);
            wait1Sec();

        }

        System.out.println("Please enter name");
        String search = new Scanner(System.in).nextLine();
        for (int i = 0; i < userNames.length ; i++) {
            if (search.contentEquals(userNames[i])){
                System.out.println("username = "+ userNames[i]);
                System.out.println("lastname = "+ lastName[i]);
                System.out.println("age = "+ age[i]);
                wait1Sec();
            }

        }

    }
    public static void inputUsers(String[]userNames,String[]lastName,int[]age){
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the user name");
            userNames[i] = new Scanner(System.in).nextLine();

            System.out.println("Please enter the lastname");
            lastName[i]= new Scanner(System.in).nextLine();

            System.out.println("Please enter the age");
            age[i]= new Scanner(System.in).nextInt();
        }
    }
    public static void wait1Sec(){
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis()-start<1000){
        }
    }
    public static void printUserData(String [] userNames, String []lastName, int[]age, int i){

    }
}
