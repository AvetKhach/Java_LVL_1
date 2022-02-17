package com.company.Homework2.classwork2;

public class Stringtest {
    public static void main(String[] args) {
        String s = "1|2|3|4|5|6";
        String newSt="";
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)!='|'){
                newSt=newSt+ s.charAt(i);


            }

        }System.out.println(newSt);


    }
}
