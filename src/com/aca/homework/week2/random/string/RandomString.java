package com.aca.homework.week2.random.string;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            returnRandomString();
        }

    }
    public static void returnRandomString(){
        String randomString = "";
        Random r = new Random();
        while(randomString.length()<=5){

            int randomInt = new Random().nextInt(10);
            char randomChar = (char) (r.nextInt(26)+'a');
            if(randomInt<5){
                randomString+=randomChar;
            } else {
                randomString+=randomInt;
            }
        }
        System.out.println(randomString);

    }
}
