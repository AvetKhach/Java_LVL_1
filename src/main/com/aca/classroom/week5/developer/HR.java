package com.aca.classroom.week5.developer;

import java.util.Objects;

public class HR {
    public static void main(String[] args) {
        Developer junior1 = new JuniorDeveloper("Eric",300000);
        Developer junior2 = new JuniorDeveloper("Jane", 350000);
        Developer junior3 = new JuniorDeveloper("Jane", 290000);



        Developer mid1 = new MidDeveloper("YAN");
        Developer mid2 = new MidDeveloper("James");
        Developer[] devs = {mid1,mid2,junior1,junior2,junior3};

        System.out.println(calculateSalary(devs));
        Printers.printDevelopers(devs);

    }


    public static void printSalary(Developer developer){
        System.out.println(developer.getSalary());

    }

    public static long calculateSalary(Developer[] devs){
        long sum = 0;
        for (int i = 0; i < devs.length ; i++) {
            sum+=devs[i].getSalary();
        }
        System.out.println(sum);
        return sum;
    }


}
