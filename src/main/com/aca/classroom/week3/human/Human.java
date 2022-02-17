package com.aca.classroom.week3.human;

import javax.management.RuntimeErrorException;

public class Human {
    private String name;
    private double height;
    public  Human(){
        System.out.println("");
    }
    public Human(String nameValue,double heightValue){
        this.name= nameValue;
        this.height = heightValue;

    }


    public String getStringRepresentation() {
        return "name " + name + ", height " + height;
    }

    public void setHeight(double newValue) {
        if (newValue > 50) {
            this.height = newValue;
        }else {
            System.out.println("chka");
           // throw new RuntimeException("ssssssssssssssss");
        }

    }

    public String getName() {
        return this.name;

    }

    public void setName(String newValue) {
        this.name = newValue;
    }


}
