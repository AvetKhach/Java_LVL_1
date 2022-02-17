package com.aca.classroom.week6;

public class ArrayBuffer extends Buffer{
    private String[] array = new String[1];

    @Override
    public void put(String value) {
        System.out.println("ArrayBuffer put"+ value);
        array[0]= value;
    }
    public String get(){
        System.out.println("ArrayBuffer get");
        return array[0];
    }

}
