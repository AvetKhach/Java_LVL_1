package com.aca.homework.week3.license.covid.test;

import java.util.Random;

public class CovidTest {
    private User user;
    private String defaultResult = "undefined";

    private final String [] possibleResults = {"positive", "negative"};






    public String test(){
        waiting3Sec();
        int randomIndex = new Random().nextInt(3);
        if(randomIndex==0){
            this.defaultResult=possibleResults[0];
            System.out.print(defaultResult);
        }else if(randomIndex==1){
            this.defaultResult=possibleResults[1];
            System.out.print(defaultResult);
        }else{
            System.out.print(defaultResult);
        }
        return defaultResult;
    }

    public void waiting3Sec(){
        long time = System.currentTimeMillis();
        while(System.currentTimeMillis()-time<3000){
        }
    }

}
