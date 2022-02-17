package com.aca.classroom.week5.developer;

public class Printers {

    public static void main(String[] args) {
        System.out.println();


//        print("hjfjhfhjf");
//        print(564);
//        print(new Developer("sfsfsf"));
//        int i = 456;
//        Integer i1 = 456;

    }
    public static void printDevelopers(Object[] devs){
        for (int i = 0; i < devs.length; i++) {
            System.out.println(devs[i].toString());
        }
    }

    public static void print(Object o ){
        System.out.println("----"+ o.toString());
    }
}
