package com.aca.homework.week3.classroom;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainACA {
    public static void main(String[] args) throws ParseException {
        String startDate = "01-01-2022 00:00";
        String endDate = "01-05-2022 00:00";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm");

        Date start = format.parse(startDate);
        Date end = format.parse(endDate);


        ACAClass acaClass = new ACAClass();
        acaClass.name = "java level 1";
        acaClass.startMillis = start.getTime();
        acaClass.endMillis = end.getTime();
        acaClass.fee = 500000;
        acaClass.student = new Student[10];

        System.out.println(acaClass.name +" "+ acaClass.startMillis+" "+acaClass.endMillis+" "+acaClass.fee);
        System.out.println(start+"      "+ end);

    }
}
