package com.aca.homework.week2.user.creation;


public class UserCreation {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Marry";
        user1.height = 170;
        printUser(user1);

        User user2 = new User();
        user2.name = "Grace";
        user2.height = 169;
        printUser(user2);

        User user3 = new User();
        user3.name = "Nicolas";
        user3.height = 175;
        printUser(user3);
    }
    public static void printUser(User user) {
        System.out.println("The name is: " + user.name + ", " + user.name + "'s height is: " + user.height);
    }

}
