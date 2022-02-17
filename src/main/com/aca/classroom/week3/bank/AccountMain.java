package com.aca.classroom.week3.bank;

public class AccountMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.name = "HSBC";
        Account[] accounts = new Account[10];


        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();

        }
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].money = (i + 1) * 15000;
        }
        for (int i = 0; i < accounts.length ; i++) {
            for (int j = 0; j < 365; j++) {
                accounts[i].increase1Percent();
            }
            //System.out.println(accounts[i].money);

        }
        System.out.println("bankName = "+bank.name+ "accounts"+ bank.accounts[2]);



    }
}
