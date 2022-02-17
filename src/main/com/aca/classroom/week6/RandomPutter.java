package com.aca.classroom.week6;

import java.util.Random;

public class RandomPutter {

    private Buffer buffer;
    public  RandomPutter(){
        this.buffer = new MyBuffer();

    }



    public void start(){
        Buffer buffer = new MyBuffer();
        for (int i = 0; ; i+=2) {
            buffer.put("text"+i);
            wait1Sec();
            System.out.println(buffer.get());
            wait1Sec();
        }





    }
    public static void wait1Sec(){
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start <1000){
        }
    }


}
