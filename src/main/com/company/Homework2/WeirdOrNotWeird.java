package com.company.Homework2;

public class WeirdOrNotWeird {
    public static void main(String[] args) {
        int value1  = wOrNotW(6);
        int value2  = wOrNotW(24);
    }

    public static int wOrNotW(int value) {
        if ((value % 2 !=0) || (value % 2 == 0 && value >= 6 && value <= 20)){
            System.out.println("Weird");
            return 1;
        }
        else if ((value % 2 == 0) && (value >= 2 || value <= 5 || value >20)){
            System.out.println("Not Weird");
            return -1;
        }
    return 0;
    }
}
