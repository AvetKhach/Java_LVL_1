package com.aca.homework.week3.license.covid.test;

public class User {
    private String userName;
    private String name;

    public User(String name, String userName){
        this.name = name;
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
