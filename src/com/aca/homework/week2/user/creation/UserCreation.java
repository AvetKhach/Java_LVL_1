package com.aca.homework.week2.user.creation;

import java.util.Scanner;

public class UserCreation {
    public static void main(String[] args) {

        User[] users = new User[3];
        inputUsers(users);
        printUsers(users,inputName());
    }

    public static void inputUsers(User[] users) {

        System.out.println("Please include users");
        for (int i = 0; i < users.length; i++) {
            User user = new User();
            System.out.println("Write name");
            user.name = new Scanner(System.in).nextLine();
            System.out.println("Write age");
            user.height = new Scanner(System.in).nextInt();
            users[i]= user;

        }
    }

    public static String inputName() {
        System.out.println("Please insert name");
        String name = new Scanner(System.in).nextLine();
        return name;
    }

    public static void printUsers(User[] users, String name) {
        for (int i = 0; i < users.length; i++) {
            if (name.contentEquals(users[i].name)) {
                System.out.println("The name is: " + users[i].name+ ", "+ users[i].name+"'s height is: "+ users[i].height);
            }
        }
    }
}
