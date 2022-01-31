package com.aca.homework.week2.random.string;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            returnRandomString();
        }
    }
    public static void returnRandomString(){
        String [] array= {"a","b","w","7","8","9","u"};
        String newArray = "";
        for (int i = 0; i <5 ; i++) {

            newArray += array[new Random().nextInt(7)];
        }
        System.out.println(newArray);

    }
}
