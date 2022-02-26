package com.aca.homework.week3.license.covid.test;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vova","vova_gasparyan");
        System.out.print("The policeman stopped "+user.getName() + " before taking the covid test, "+ user.getName()+
                " shows her ");
        DrivingLicense drivingLicense = new DrivingLicense("BC",user);
        System.out.print(" driver's license, after which he received a test result, which: ");
        CovidTest covidTest = new CovidTest();
        covidTest.test();
    }
}
