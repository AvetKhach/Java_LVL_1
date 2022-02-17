package com.company.week2.user;

import java.util.Scanner;

public class UserTest {

    public static void main(String[] args) {

        User[] users = new User[3];
        inputUserParam(users);
        printUsers(users);
        returnStringFromArray(mapUsersToNames(users));



    }
    public static void inputUserParam(User [] users){
        for (int i = 0; i < users.length; i++) {
            System.out.println("Please enter name");
            User user = new User();
            user.name =  new Scanner(System.in).nextLine();
            user.lastName =  new Scanner(System.in).nextLine();
            user.age= new Scanner(System.in).nextInt();
            users[i]=user;
        }
    }
    public static void wait1Sec(){
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis()-start<1000){
        }
    }
    public static void printUsers(User [] users){
        for (int i = 0; i <users.length ; i++) {

            printUser(users[i]);
        }
    }
    public static void printUser(User user){
        System.out.println(user.name + " name "+ user.lastName+" lastname "+user.age+" age ");

    }
    public static String [] mapUsersToNames(User [] users){
        String [] nameArray = new String[3];
        for (int i = 0; i < users.length; i++) {
            nameArray[i]= users[i].name;
        }
        return nameArray;
    }

    public static void sumAges(User [] users){
        int sum =0;
        for (int i = 0; i <users.length ; i++) {
            sum+=users[i].age;
        }
    }
    public static String returnStringFromArray(String [] array){
        String string = "";
        for (int i = 0; i < array.length ; i++) {
            string= string+(array[i]);
            System.out.println(string);


        }
        return string;

    }


}
