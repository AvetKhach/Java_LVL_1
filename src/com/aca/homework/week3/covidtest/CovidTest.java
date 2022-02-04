package com.aca.homework.week3.covidtest;

public class CovidTest {
    User user;
    boolean positive;

    public void print() {
        String print = this.user.print();
        if (this.positive) {
            System.out.println("Covid test result of " + user.name + " is positive " + print);
        } else {
            System.out.println("Covid test result of " + user.name + " is negative " + print);
        }
    }
}
