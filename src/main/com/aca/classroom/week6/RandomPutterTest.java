package com.aca.classroom.week6;

import java.util.Scanner;

public class RandomPutterTest {
    public static void main(String[] args) {
        Buffer buffer = null;
        getBuffer();

    }


    public static Buffer getBuffer(){
        int index = new Scanner(System.in).nextInt();

        return index==0 ? new MyBuffer():new ArrayBuffer();

    }
}
