package com.aca.classroom.week6;

public class MyBuffer extends Buffer {
    private String value;


    @Override
    public void put(String value) {
        this.value = value;
    }

    @Override
    public String get() {
        return value;
    }
}
