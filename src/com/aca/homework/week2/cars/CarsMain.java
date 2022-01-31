package com.aca.homework.week2.cars;

public class CarsMain {
    public static void main(String[] args) {

        Car []cars = new Car[41];
        for (int i = 0; i < cars.length ; i++) {
            cars[i]= new Car();
            cars[i].brand= "Porsche";
            cars[i].year= i+ 1980;
            if (cars[i].year>= 2010){
                System.out.println(cars[i].brand+""+cars[i].year);
            }

        }

    }
}
