package com.aca.homework.week5.car;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Car []cars = new Car[5];
        System.out.println("Please include brand, color, width, weight 5 time and press enter");
        for (int i = 0; i < cars.length; i++) {
            String includedBrand = new Scanner(System.in).nextLine();
            String includedColor = new Scanner(System.in).nextLine();
            double includedWidth = new Scanner(System.in).nextDouble();
            double includedWeight = new Scanner(System.in).nextDouble();
            if(includedBrand.equals("bmw") || includedBrand.equals("hyundai")){
                cars[i]= new Car(includedBrand,includedColor,includedWidth,includedWeight);
            }
            System.out.println(cars[i].toString());
        }

    }

    public String printCars(Car[] cars){
        return cars.toString();
    }
}
