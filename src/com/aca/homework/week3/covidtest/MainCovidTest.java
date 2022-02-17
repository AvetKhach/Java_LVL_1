package com.aca.homework.week3.covidtest;

public class MainCovidTest {
    public static void main(String[] args) {
        CovidTest[] covidTest = new CovidTest[3];
        for (int i = 0; i < covidTest.length; i++) {
            covidTest[i] = new CovidTest();
            covidTest[i].user= new User();
        }
        covidTest[0].positive = true;
        covidTest[0].user.name = "Mark";
        covidTest[0].user.code = "mark789";
        covidTest[0].print();

        covidTest[1].positive = true;
        covidTest[1].user.name = "Jane";
        covidTest[1].user.code = "jabe45";
        covidTest[1].print();

        covidTest[2].positive = false;
        covidTest[2].user.name = "Kate";
        covidTest[2].user.code = "kate876&";
        covidTest[2].print();

        printCovidTest(covidTest[0]);
        printCovidTest(covidTest[1]);
        printCovidTest(covidTest[2]);
    }

    public static void printCovidTest(CovidTest covidTest) {
        if(covidTest.positive){
            System.out.println("The covid test result of "+ covidTest.user.name+" is positive "+ covidTest.user.name+"'s code is "+covidTest.user.code);
        }else{
            System.out.println("The covid test result of "+ covidTest.user.name+" is negative "+ covidTest.user.name+"'s code is "+covidTest.user.code);
        }
    }
}
