package com.company.week2;

public class TimerTest {
    public static void main(String[] args) {
        long startMillis= System.currentTimeMillis();
        long secondThatIPrinted =0;
        while(true){

            long currentMillis = System.currentTimeMillis();
            long secondThatIWantToPrint = (currentMillis-startMillis)/1000;
            if(secondThatIPrinted!=secondThatIWantToPrint){
                System.out.println(secondThatIWantToPrint);
                secondThatIPrinted = secondThatIWantToPrint;
            }

        }
    }
}
