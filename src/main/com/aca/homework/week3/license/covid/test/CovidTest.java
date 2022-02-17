package com.aca.homework.week3.license.covid.test;

import java.util.Random;

public class CovidTest {
    private User user;
    private String defaultResult = "undefined";

    private String [] possibleResults = {"positive", "negative"};






    public String test(){
        waiting3Sec();
        int randomIndex = new Random().nextInt(3);
        if(randomIndex==0){
            System.out.println(randomIndex);
            return this.defaultResult=possibleResults[0];
        }else if(randomIndex==1){
            System.out.println(randomIndex);
            return this.defaultResult=possibleResults[1];
        }else{
            System.out.println(randomIndex);
            return this.defaultResult;
        }
    }

    public void waiting3Sec(){
        long time = System.currentTimeMillis();
        while(System.currentTimeMillis()-time<3000){
        }
    }

}
